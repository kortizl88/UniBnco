package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Config.ConfiguraAccesos;
import Com.Elektra.Uniformes.Services.resp.ServiceResponse;
import org.apache.commons.mail.HtmlEmail;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service("enviaCorreoAction")
public class EnviaCorreoService {

    private static final Logger LOGGER = Logger.getLogger(EnviaCorreoService.class);

    public ServiceResponse enviaCorreo(Integer idEmp, String nombre,
                                       String email, String telefono, String mensaje, String asunto) {

        ServiceResponse resp = new ServiceResponse();
        try {
            StringBuilder buffer = new StringBuilder();
            agregaDato(buffer, "Nombre", nombre);
            agregaDato(buffer, "Email", email);
            agregaDato(buffer, "Telefono", telefono);
            buffer.append(mensaje);

            HtmlEmail htmlEmail = new HtmlEmail();
            htmlEmail.setHostName(ConfiguraAccesos.IPSERVERMAIL);
            String[] emails = ConfiguraAccesos.MAILRESPONSABLE.split(",");
            for (String toMail : emails) {
                htmlEmail.addTo(toMail);
            }
            String subject = asunto + ", Empleado: " + idEmp;

            htmlEmail.setFrom("SistemaUniformes@tr-cons2elektra.com.mx", "Sistema de Uniformes");
            htmlEmail.addReplyTo(email);
            htmlEmail.setSubject(validaAsunto(subject));
            htmlEmail.setCharset("UTF-8");
            htmlEmail.setHtmlMsg(buffer.toString());
            htmlEmail.setSSLCheckServerIdentity(true);
            htmlEmail.send();
            resp.setCodigo(0);
        } catch (Exception e) {
            LOGGER.error("Error al enviar correo electronico", e);
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("No se pudo enviar el correo electrónico. Favor de contactar a Soporte Técnico");
            resp.setDetalleTecnico(e.toString());
        }
        return resp;
    }

    private String validaAsunto(String subject) {
        return subject
                .replaceAll("(?i)CC:", "")
                .replaceAll("(?i)BCC:", "")
                .replaceAll("(\\r|\\n)", "");
    }

    private void agregaDato(StringBuilder buffer, String etiqueta, String dato) {
        buffer.append("<b>");
        buffer.append(etiqueta);
        buffer.append(": ");
        buffer.append("</b>");
        buffer.append(dato);
        buffer.append("<br/>");
    }

}
