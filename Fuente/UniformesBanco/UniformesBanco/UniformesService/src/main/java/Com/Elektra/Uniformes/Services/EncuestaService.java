package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Dao.EncuestaDao;
import Com.Elektra.Uniformes.Dto.EncuestaDto;
import Com.Elektra.Uniformes.Services.resp.ServiceResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("encuestaService")
public class EncuestaService {

    private static final Logger LOG = Logger.getLogger(EncuestaService.class);

    private final EncuestaDao dao;

    @Autowired
    public EncuestaService(EncuestaDao dao) {
        this.dao = dao;
    }

    public ServiceResponse guardarEncuesta(EncuestaDto encuesta) {
        ServiceResponse resp = new ServiceResponse();
        try {
            dao.guardarRespuestas(encuesta);
            resp.setCodigo(0);
        } catch (Exception e) {
            LOG.error("Error al guardar encuesta", e);
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("Error al guardar encuesta");
            resp.setDetalleTecnico(e.toString());
        }
        return resp;
    }
}
