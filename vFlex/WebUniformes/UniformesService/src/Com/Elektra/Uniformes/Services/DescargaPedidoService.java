package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Dao.DescargaPedidoDao;
import Com.Elektra.Uniformes.Dto.DatosPedidoDto;
import Com.Elektra.Uniformes.Dto.UniInventarioCSku;
import Com.Elektra.Uniformes.Services.resp.ServiceResponse;
import com.elektra.uniformes.wstienda.IWSUniformesStub;
import com.elektra.uniformes.wstienda.TiendaCrypt;
import com.elektra.uniformes.wstienda.WSUniformesFactory;
import com.elektra.uniformes.wstienda.WSUniformesStub;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("descargaPedido")
public class DescargaPedidoService {

    private static final Logger LOGGER = Logger.getLogger(DescargaPedidoService.class);

    private static final String ENTREGADO = "Entregado";
    private static final String ENTREGADO_DISTRITAL = "Entregado Distrital ";
    public static final Integer WS_TIENDA_ESTATUS_ENTREGADO = 3;
    public static final Integer TIPO_USUARIO_RH = 3;
    public static final Integer TIPO_SIST_PEDIDO_UNIFICADO = 1;
    public static final Integer TIPO_NEGOCIO_RH = 3;

    private final DescargaPedidoDao dao;
    private final WSUniformesFactory factory;

    @Autowired
    public DescargaPedidoService(DescargaPedidoDao dao, WSUniformesFactory factory) {
        this.dao = dao;
        this.factory = factory;
    }

    public ServiceResponse grabaPedido(Integer idemp, Integer idDist,
                                       DatosPedidoDto datosPedido) {
        ServiceResponse resp = new ServiceResponse();
        try {
            descargaPedidoTienda(datosPedido,
                    idDist != null ? ENTREGADO_DISTRITAL + idDist : ENTREGADO);
            grabaPrimeraHuella(datosPedido, idemp, idDist);
            resp.setCodigo(0);
        } catch (Exception e) {
            LOGGER.error("Error al descargar el pedido del empleado " + idemp, e);
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("No se pudo descargar el pedido. Favor de contactar a Soporte Técnico");
            resp.setDetalleTecnico(e.toString());
        }
        return resp;

    }

    private void descargaPedidoTienda(DatosPedidoDto datosPedido,
                                      String observaciones) throws Exception {

        WSUniformesStub.ActualizaPedido datosP = new WSUniformesStub.ActualizaPedido();
        WSUniformesStub.AtualizaPedidos param = new WSUniformesStub.AtualizaPedidos();

        UniInventarioCSku resultSet = dao.selectSKUPedido(datosPedido);

        String keyWs = TiendaCrypt.encriptaLlaveWsTienda(
                datosPedido.getNoTienda().toString(),
                resultSet.getIpTienda(),
                datosPedido.getNumEmpleado().toString(),
                "1");

        int[] skus = new int[resultSet.getSku().length];
        int i = 0;
        for (Integer reg : resultSet.getSku()) {
            skus[i++] = reg;
        }

        List<WSUniformesStub.ActPedidos> modifPed = new ArrayList<WSUniformesStub.ActPedidos>();

        WSUniformesStub.ActPedidos actPedidos = new WSUniformesStub.ActPedidos();
        actPedidos.setNumEmpleado(datosPedido.getNumEmpleado().toString());
        actPedidos.setNumPedido(datosPedido.getNoPedido());
        actPedidos.setObservaciones(observaciones);
        actPedidos.setStatus(WS_TIENDA_ESTATUS_ENTREGADO);
        WSUniformesStub.ArrayOfint arrayint = new WSUniformesStub.ArrayOfint();
        arrayint.set_int(skus);
        actPedidos.setSKU(arrayint);
        modifPed.add(actPedidos);

        param.setKeyWs(keyWs);
        param.setTipoUsuario(TIPO_USUARIO_RH);
        param.setTipoSistema(TIPO_SIST_PEDIDO_UNIFICADO);
        param.setTipoNegocio(TIPO_NEGOCIO_RH);
        WSUniformesStub.ArrayOfActPedidos arrayPedidos = new WSUniformesStub.ArrayOfActPedidos();
        arrayPedidos.setActPedidos(modifPed.toArray(new WSUniformesStub.ActPedidos[modifPed.size()]));
        param.setModifPed(arrayPedidos);

        datosP.setDatosP(param);

        String url = String.format("http://%s/WebServicioTienda/Elektra.Servicios.Datos.AdmonUniformes.WSUniformes.svc", resultSet.getIpTienda());
        IWSUniformesStub stub = factory.createWsUniformesStub(url);
        WSUniformesStub.ActualizaPedidoResponse result = stub.actualizaPedido(datosP);
        if (result.getActualizaPedidoResult().getBanderaError() != 0) {
            LOGGER.error(datosPedido
                    + " Ocurrio un error al realizar la descarga de inventario en tienda "
                    + result.getActualizaPedidoResult()
                    .getMsjSalida() + " Cadena = " + keyWs + " Tienda = " + datosPedido
                    .getNoTienda().toString() + " Ip Tienda = " + resultSet.getIpTienda());
            throw new Exception("Error al ejecutar WSUniformes en tienda: "
                    + result.getActualizaPedidoResult().getMsjSalida());

        }

    }

    @Transactional(rollbackFor = {Exception.class})
    private void grabaPrimeraHuella(DatosPedidoDto datosPedido,
                                    Integer idEmpGerente, Integer idDist) throws Exception {
        dao.updatePrimeraHuella(datosPedido, idEmpGerente, idDist);

    }

}
