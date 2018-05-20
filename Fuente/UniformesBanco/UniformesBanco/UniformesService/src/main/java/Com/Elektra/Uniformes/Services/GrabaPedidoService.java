package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Dao.GrabaPedidoDao;
import Com.Elektra.Uniformes.Dto.SolicitudDto;
import Com.Elektra.Uniformes.Services.resp.GrabaPedidoResp;
import com.elektra.uniformes.wsabasto.IWsVtaMayoreoServiceStub;
import com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceStub;
import com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub;
import com.elektra.uniformes.wstienda.IWSUniformesStub;
import com.elektra.uniformes.wstienda.TiendaCrypt;
import com.elektra.uniformes.wstienda.WSUniformesFactory;
import com.elektra.uniformes.wstienda.WSUniformesStub;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service("grabaPedido")
public class GrabaPedidoService {

    private static final Logger LOGGER = Logger.getLogger(GrabaPedidoService.class);

    private static final int MAX = 3;
    private final GrabaPedidoDao dao;
    private final IWsVtaMayoreoServiceStub stub;
    private final WSUniformesFactory factory;
    private final IntfPED_CENT_CANCELAServiceStub wsCancelacionStub;

    @Autowired
    public GrabaPedidoService(GrabaPedidoDao dao, WSUniformesFactory wsUniformesFactory, IWsVtaMayoreoServiceStub wsVtaMayoreoServiceStub, IntfPED_CENT_CANCELAServiceStub wsCancelacionStub) {
        this.dao = dao;
        this.factory = wsUniformesFactory;
        this.stub = wsVtaMayoreoServiceStub;
        this.wsCancelacionStub = wsCancelacionStub;
    }

    public GrabaPedidoResp grabaPedido(List<SolicitudDto> itemsSolicitud) {
        GrabaPedidoResp resp = new GrabaPedidoResp();
        try {
            if (itemsSolicitud.size() == 0) {
                resp.setCodigo(-1);
                resp.setDescripcionOperacion("Solicitud vacía. Favor de verificar.");
                return resp;
            }
            if (!dao.validaPrendas(itemsSolicitud)) {
                resp.setCodigo(-1);
                resp.setDescripcionOperacion("Se detectó una solicitud duplicada, favor de verificar en \"Estatus de mi Uniforme\".");
                return resp;
            }
            Integer tienda;
            LinkedList<SolicitudDto> pendientes = new LinkedList<SolicitudDto>(itemsSolicitud);
            List<SolicitudDto> procesados = new LinkedList<SolicitudDto>();
            int reintentos = 0;
            String msg;
            do {
                tienda = grabaPedidoTienda(pendientes);
                msg = grabaPedidoAbasto(pendientes, procesados);
                reintentos++;
            } while (!pendientes.isEmpty() && reintentos < MAX);

            if (procesados.isEmpty()) {
                resp.setCodigo(-1);
                resp.setDescripcionOperacion("Error al grabar el pedido en Abasto");
                resp.setDetalleTecnico("Respuesta de WebService: " + msg);
                return resp;
            }
            String folio = grabaPedidoCentral(procesados);
            List<Integer> pedidosGenerados = new ArrayList<Integer>();
            for (SolicitudDto pedido : procesados) {
                pedidosGenerados.add(pedido.getPedido());
            }
            resp.setTienda(tienda);
            resp.setFolio(folio);
            resp.setPedidos(pedidosGenerados);
            resp.setCodigo(0);
        } catch (Exception e) {
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("Error al grabar pedido");
            resp.setDetalleTecnico(e.toString());
            LOGGER.error("Error al grabar pedido", e);
        }
        return resp;
    }

    private String grabaPedidoCentral(List<SolicitudDto> procesados) throws Exception {
        String folio;
        try {
            folio = grabaPedidoBD(procesados);
        } catch (Exception e) {
            for (SolicitudDto pedido : procesados) {
                cancelaPedidoAbasto(pedido);
            }
            throw e;
        }
        return folio;
    }

    @Transactional(rollbackFor = Exception.class)
    private String grabaPedidoBD(List<SolicitudDto> procesados) throws SQLException {
        String folioPedido = dao.obtieneNuevoFolio();
        dao.grabaSolicitud(folioPedido, procesados);
        return folioPedido;
    }

    private void cancelaPedidoAbasto(SolicitudDto pedido) {
        try {
            IntfPED_CENT_CANCELAServiceStub.Parametros_Entrada param = new IntfPED_CENT_CANCELAServiceStub.Parametros_Entrada();
            param.setCanal(pedido.getCia());
            param.setPais(pedido.getPais());
            param.setPedido(pedido.getPedido());
            param.setTienda(pedido.getTienda().toString());
            wsCancelacionStub.pED__CENT__CANCELAOp(param);
        } catch (RemoteException e) {
            LOGGER.error("Error al cancelar el pedido en abasto " + pedido.toString(), e);
        }

    }

    private Integer grabaPedidoTienda(LinkedList<SolicitudDto> itemsSolicitud) throws Exception {
        WSUniformesStub.GeneraPedido generaPedido = new WSUniformesStub.GeneraPedido();
        WSUniformesStub.ReciveDatos parametros = new WSUniformesStub.ReciveDatos();
        Integer tienda = itemsSolicitud.get(0).getTienda();
        String ipTienda = dao.consultaIpTienda(tienda);
        Integer empleado = itemsSolicitud.get(0).getEmpleado();
        String keyWs = TiendaCrypt.encriptaLlaveWsTienda(
                tienda.toString(),
                ipTienda,
                empleado.toString(),
                "1");
        parametros.setKeyWs(keyWs);
        parametros.setEmpleado(empleado.toString());
        parametros.setTipoUsuario(3);
        parametros.setNoEmpIngreso(empleado.toString());
        parametros.setTipoSistema(1);
        parametros.setTipoUniforme(0);
        parametros.setEmpNvo(0);
        parametros.setNumTienda(tienda.toString());
        parametros.setNegocio(3);
        List<Integer> skus = new ArrayList<Integer>();
        for (SolicitudDto item : itemsSolicitud) {
            for (int i = 0; i < item.getCantidad(); i++) {
                skus.add(item.getSku());
            }
        }
        WSUniformesStub.ArrayOfint arrayOfInt = new WSUniformesStub.ArrayOfint();
        arrayOfInt.set_int(ArrayUtils.toPrimitive(skus.toArray(new Integer[skus.size()])));
        parametros.setSku(arrayOfInt);
        generaPedido.setRecive(parametros);
        String url = String.format("http://%s/WebServicioTienda/Elektra.Servicios.Datos.AdmonUniformes.WSUniformes.svc", ipTienda);
        IWSUniformesStub tiendaStub = factory.createWsUniformesStub(url);
        WSUniformesStub.GeneraPedidoResponse wsTiendaResp = tiendaStub.generaPedido(generaPedido);
        if (wsTiendaResp.getGeneraPedidoResult().getBanderaError() == 0) {
            WSUniformesStub.AltasPedidos[] altasPedidos = wsTiendaResp.getGeneraPedidoResult().getAltaPed().getAltasPedidos();
            for (WSUniformesStub.AltasPedidos pedido : altasPedidos) {
                actualizaNumPedido(itemsSolicitud, pedido.getSKU().get_int(), pedido.getNumPedido());
            }
        } else {
            throw new RuntimeException("No se pudo grabar el pedido en tienda. " +
                    "\nMensaje: " + wsTiendaResp.getGeneraPedidoResult().getMsjSalida());

        }
        return tienda;

    }

    private void actualizaNumPedido(List<SolicitudDto> itemsSolicitud, int[] arrSku, int numPedido) {
        Integer sku = arrSku[0];
        for (SolicitudDto item : itemsSolicitud) {
            if (item.getSku().equals(sku)) {
                item.setPedido(numPedido);
                break;
            }
        }
    }

    private String grabaPedidoAbasto(LinkedList<SolicitudDto> pendientes, List<SolicitudDto> procesados) {
        Integer size = pendientes.size();
        String msg = null;
        for (int i = 0; i < size; i++) {
            SolicitudDto item = pendientes.removeFirst();
            try {
                IntfWS_VTA_MAYOREOServiceStub.Parametros parametros = new IntfWS_VTA_MAYOREOServiceStub.Parametros();
                parametros.setTpo_Operacion(4);
                parametros.setPais(new BigDecimal(item.getPais()));
                parametros.setCanal(new BigDecimal(item.getCia()));
                parametros.setCd("");
                parametros.setStore_nbr(item.getTienda().toString());
                parametros.setPedido(new BigDecimal(item.getPedido()));
                parametros.setTipped("UNIFORMES");
                parametros.setFecentr(BigDecimal.ZERO);
                parametros.setNombre("");
                parametros.setApepcl("");
                parametros.setApemcl("");
                parametros.setEstado("");
                parametros.setDelegac("");
                parametros.setCp("");
                parametros.setColonia("");
                parametros.setCalle("");
                parametros.setNumero("");
                parametros.setNumerint("");
                parametros.setTelefono("");
                parametros.setTelcel("");
                parametros.setPedidoobs("");
                parametros.setLugentobs("");
                parametros.setAdicional1(item.getEmpleado().toString());
                parametros.setAdicional2("");

                IntfWS_VTA_MAYOREOServiceStub.DETALLE_type0 DET = new IntfWS_VTA_MAYOREOServiceStub.DETALLE_type0();
                DET.setSkuequ("");
                DET.setPreuni("");
                DET.setTotventa("");
                DET.setDescuen("");
                DET.setFlete("");
                DET.setSku(item.getSku().toString());
                DET.setQty(item.getCantidad().toString());
                parametros.setDETALLE(new IntfWS_VTA_MAYOREOServiceStub.DETALLE_type0[]{DET});
                IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida resp = stub.wS__VTA__MAYOREOOp(parametros);
                if (resp.getEstatus().compareTo(BigDecimal.ZERO) == 0) {
                    dao.actualizaMensajeAbasto(item, "");
                } else {
                    msg = resp.getMensaje1();
                    pendientes.addLast(item);
                    continue;
                }
            } catch (RemoteException e) {
                LOGGER.error("No se pudo enviar el pedido " + item.getPedido()
                        + " del empleado " + item.getEmpleado()
                        + "\nTienda: " + item.getTienda()
                        + "\nSku: " + item.getSku()
                        + "\nCantidad: " + item.getCantidad(), e);
            }
            procesados.add(item);
        }
        return msg;
    }


}