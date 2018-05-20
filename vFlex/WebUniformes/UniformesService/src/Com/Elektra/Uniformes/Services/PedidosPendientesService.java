package Com.Elektra.Uniformes.Services;


import Com.Elektra.Uniformes.Config.ConfiguraAccesos;
import Com.Elektra.Uniformes.Dao.PedidosPendientesDao;
import Com.Elektra.Uniformes.Services.resp.PedidosPendientesResp;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pedidosPendientes")
public class PedidosPendientesService {

    private static final Logger LOGGER = Logger.getLogger(PedidosPendientesService.class);

    private final PedidosPendientesDao dao;

    public PedidosPendientesResp consPedPend(Integer idEmp, String estatus) {
        PedidosPendientesResp resp = new PedidosPendientesResp();
        try {
            resp.setLsPedPends(dao.consPedPend(idEmp, estatus));
            resp.setIp(ConfiguraAccesos.IP_SERV_HUELLAS);
            resp.setCodigo(0);
        } catch (Exception e) {
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("Se presentó un error al consultar los pedidos pendientes de entregar. Contacte a Soporte");
            resp.setDetalleTecnico(e.toString());
            LOGGER.error("Error al consultar los pedidos pendientes de entregar", e);
        }
        return resp;
    }

    @Autowired
    public PedidosPendientesService(PedidosPendientesDao dao) {
        this.dao = dao;
    }

    public PedidosPendientesResp consultaPendientes(Integer numEmpGerente) {
        PedidosPendientesResp resp = new PedidosPendientesResp();
        try {
            resp.setLsPedPends(dao.consultaPendientesEntrega(numEmpGerente));
            resp.setIp(ConfiguraAccesos.IP_SERV_HUELLAS);
            resp.setCodigo(0);
        } catch (Exception e) {
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("Se presentó un error al consultar los pedidos pendientes de entregar. Contacte a Soporte");
            resp.setDetalleTecnico(e.toString());
            LOGGER.error("Error al consultar los pedidos pendientes de entregar. numEmpGerente: " + numEmpGerente, e);
        }
        return resp;
    }

    public PedidosPendientesResp consultaPendientesRegional(Integer numEmpGerente) {
        PedidosPendientesResp resp = new PedidosPendientesResp();
        try {
            resp.setLsPedPends(dao.consultaPendientesEntregaRegional(numEmpGerente));
            resp.setIp(ConfiguraAccesos.IP_SERV_HUELLAS);
            resp.setCodigo(0);
        } catch (Exception e) {
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("Se presentó un error al consultar los pedidos pendientes de entregar al regional. Contacte a Soporte");
            resp.setDetalleTecnico(e.toString());
            LOGGER.error("Error al consultar los pedidos pendientes de entregar al regional. numEmpGerente: " + numEmpGerente, e);
        }
        return resp;
    }
}
