package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Dao.SolicitudesExternasDao;
import Com.Elektra.Uniformes.Dto.SolicitudesExternasDto;
import Com.Elektra.Uniformes.Services.resp.ServiceResponse;
import com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Service("solicitudesExternas")
public class SolicitudesExternasService {

    private static final Logger LOGGER = Logger.getLogger(SolicitudesExternasService.class);

    private static final Integer CATEGORIA_CASCO = 21;
    private static final Integer ORIGEN_MOTO_ITALIKA_NUEVA = 1;
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    private final SolicitudesExternasDao dao;
    private final WS_JSA_ITALIKAStub wsJsaItalikaStub;

    @Autowired
    public SolicitudesExternasService(SolicitudesExternasDao dao, WS_JSA_ITALIKAStub wsJsaItalikaStub) {
        this.dao = dao;
        this.wsJsaItalikaStub = wsJsaItalikaStub;
    }

    public ServiceResponse retreiveSolicitudesExternas(Integer idEmpleado) {
        ServiceResponse response = new ServiceResponse();
        try {
            WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNueva wsParam = new WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNueva();
            wsParam.setEmpleadoConsultado(idEmpleado);
            WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse wsResp = wsJsaItalikaStub.obtenerUltimaFechaAsignacionMotoItalikaNueva(wsParam);
            String strFecha = wsResp.getObtenerUltimaFechaAsignacionMotoItalikaNuevaResult().getFechaUltimaAsignacionMotoItalikaNueva();
            if (!(strFecha == null || StringUtils.isEmpty(strFecha))) {
                SolicitudesExternasDto dto = new SolicitudesExternasDto();
                dto.setIdEmpleado(idEmpleado);
                dto.setIdCategoria(CATEGORIA_CASCO);
                dto.setUltimaRemision(dateFormat.parse(strFecha));
                dto.setOrigen(ORIGEN_MOTO_ITALIKA_NUEVA);
                dao.guardarSolicitudExterna(dto);
            }
            response.setCodigo(0);
        } catch (Throwable t) {
            LOGGER.error("Error al consultar la ultima fecha de asignación externa", t);
            response.setCodigo(-1);
            response.setDescripcionOperacion("Error al consultar la ultima fecha de asignacion de moto italika nueva");
            response.setDetalleTecnico(t.toString());
        }
        return response;
    }
}
