package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Dao.EstatusPedidoDao;
import Com.Elektra.Uniformes.Services.resp.EstatusPedidoResp;
import Com.Elektra.Uniformes.Services.resp.FoliosResp;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("estatusPedido")
public class EstatusPedidoService {

    private static final Logger LOGGER = Logger.getLogger(EstatusPedidoService.class);

    private final EstatusPedidoDao dao;

    @Autowired
    public EstatusPedidoService(EstatusPedidoDao dao) {
        this.dao = dao;
    }

    public EstatusPedidoResp consultaEstatus(String folio, Integer idEmp) {
        EstatusPedidoResp resp = new EstatusPedidoResp();
        try {
            resp.setInformacionPedido(dao.consultaFolio(idEmp, folio));
            resp.setCodigo(0);
        } catch (Exception e) {

            LOGGER.error("Error al consultar el estatus del folio " + folio, e);
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("No se pudo consultar la información del folio " + folio);
            resp.setDetalleTecnico(e.toString());
        }
        return resp;
    }

    public FoliosResp consultaFolios(Integer idEmp) {
        FoliosResp resp = new FoliosResp();
        try {
            resp.setFolios(dao.historialFolios(idEmp));
            resp.setCodigo(0);
        } catch (Exception e) {
            LOGGER.error("Error al consultar los folios para estatus del empleado " + idEmp, e);
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("No se pudieron consultar los folios. Favor de contactar a Soporte Técnico");
            resp.setDetalleTecnico(e.toString());
        }
        return resp;
    }

}
