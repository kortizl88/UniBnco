package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Dao.PosicionAyudaDao;
import Com.Elektra.Uniformes.Services.resp.PosicionAyudaResp;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("posicionAyuda")
public class PosicionAyudaService {

    private static final Logger LOGGER = Logger.getLogger(PosicionAyudaService.class);

    private final PosicionAyudaDao dao;

    @Autowired
    public PosicionAyudaService(PosicionAyudaDao dao) {
        this.dao = dao;
    }

    public PosicionAyudaResp consultaPosicionAyuda(Integer idEmp) {
        PosicionAyudaResp resp = new PosicionAyudaResp();
        try {
            resp.setPosicion(dao.consultaPosicionAyuda(idEmp));
            resp.setCodigo(0);
        } catch (Exception e) {
            LOGGER.error("Se presentó un error al consultar la posición", e);
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("No se pudo consultar la posición del indicador de ayuda.");
            resp.setDetalleTecnico(e.toString());
        }
        return resp;

    }

}
