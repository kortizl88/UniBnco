package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Config.ConfiguraAccesos;
import Com.Elektra.Uniformes.Dao.ReposicionesDao;
import Com.Elektra.Uniformes.Dto.AutorizanteDto;
import Com.Elektra.Uniformes.Dto.ReposicionDto;
import Com.Elektra.Uniformes.Services.resp.ReposicionResponse;
import org.apache.commons.lang3.text.WordUtils;
import org.apache.commons.mail.HtmlEmail;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.activation.DataSource;
import javax.mail.Part;
import javax.mail.util.ByteArrayDataSource;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service("reposicionesService")
public class ReposicionesService {

    private static final Logger LOGGER = Logger.getLogger(ReposicionesService.class);

    private final ReposicionesDao dao;

    @Autowired
    public ReposicionesService(ReposicionesDao dao) {
        this.dao = dao;
    }

    public ReposicionResponse solicitaReposicion(ReposicionDto dto, byte[] byteArray, String nombreArchivo, String type) {
        ReposicionResponse response = new ReposicionResponse();
        try {
            response.setFolioReposicon(dao.insertaReposicion(dto));
            String link = String.format(ConfiguraAccesos.URL_AUTORIZA, response.getFolioReposicon());
            StringBuilder buffer = new StringBuilder();
            agregaDato(buffer, "Nombre", dto.getNombreEmpleado());
            agregaDato(buffer, "Email", dto.getCorreo());
            agregaDato(buffer, "Telefono", dto.getTelefono());
            agregaDato(buffer, "Mensaje", dto.getMensaje());
            agregaDato(buffer, "URL para Autorizar", String.format("<a href='%s'>%s</a>", link, link));
            agregaDato(buffer, "Evidencia", byteArray != null ? "<br/>" : "N/A");

            HtmlEmail htmlEmail = new HtmlEmail();
            htmlEmail.setHostName(ConfiguraAccesos.IPSERVERMAIL);

            List<AutorizanteDto> autorizantes = dao.consultaCorreoAutorizantes(dto.getIdEmpleado());

            for (AutorizanteDto autorizante : autorizantes) {
                if (autorizante.getNombre() != null) {
                    autorizante.setNombre(WordUtils.capitalizeFully(autorizante.getNombre().toLowerCase()));
                }
                if (autorizante.getPuesto() != null) {
                    autorizante.setPuesto(WordUtils.capitalizeFully(autorizante.getPuesto().toLowerCase()));
                }
                htmlEmail.addTo(autorizante.getEmail());
                response.setAutorizante(autorizante);
            }

            for (String ccMail : ConfiguraAccesos.MAILRESPONSABLE.split(",")) {
                htmlEmail.addCc(ccMail);
            }

            htmlEmail.setFrom("SistemaUniformes@tr-cons2elektra.com.mx", "Sistema de Uniformes");
            htmlEmail.addReplyTo(dto.getCorreo());
            htmlEmail.setSubject(String.format(ConfiguraAccesos.ASUNTO_REPOSICION, dto.getDescripcionCorta(), dto.getMotivo(), dto.getIdEmpleado()));
            htmlEmail.setCharset("UTF-8");
            htmlEmail.setHtmlMsg(buffer.toString());

            if (byteArray != null) {
                String mimeType;
                if (type == null) {
                    mimeType = "image/" + obtieneExtension(nombreArchivo);
                } else {
                    mimeType = type.contains("/") ? type : "image/" + type;
                }
                DataSource ds = new ByteArrayDataSource(byteArray, mimeType);
                htmlEmail.attach(
                        ds,
                        nombreArchivo,
                        "Evidencia",
                        Part.ATTACHMENT);
            }
            htmlEmail.setSSLCheckServerIdentity(true);
            htmlEmail.send();
            response.setCodigo(0);
        } catch (Exception e) {
            LOGGER.error("Error al solicitar reposicion, datos: " + dto.toString(), e);
            response.setCodigo(-1);
            response.setDescripcionOperacion("No se pudo solicitar la reposicion, favor de contactar a Soporte Técnico.");
            response.setDetalleTecnico(e.toString());
        }
        return response;
    }

    private String obtieneExtension(String nombreArchivo) {
        String extension = null;
        Pattern pattern = Pattern.compile("(.+)\\.(.+)");
        Matcher matcher = pattern.matcher(nombreArchivo);
        if (matcher.matches()) {
            extension = matcher.group(2);
            extension = extension.equalsIgnoreCase("jpg") ? "jpeg" : extension;
        }

        return extension;
    }

    private void agregaDato(StringBuilder buffer, String etiqueta, String dato) {
        buffer.append(String.format("<b>%s:</b>%s<br/>", etiqueta, dato));
    }
}
