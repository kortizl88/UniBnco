package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Dao.GrabaPedidoDao;
import Com.Elektra.Uniformes.Dto.SolicitudDto;
import Com.Elektra.Uniformes.Services.resp.GrabaPedidoResp;
import com.elektra.uniformes.wsabasto.IWsVtaMayoreoServiceStub;
import com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceStub;
import com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub;
import com.elektra.uniformes.wstienda.IWSUniformesStub;
import com.elektra.uniformes.wstienda.WSUniformesFactory;
import com.elektra.uniformes.wstienda.WSUniformesStub;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.*;
import static org.easymock.EasyMock.*;

@SuppressWarnings("unchecked")
public class GrabaPedidoServiceTest {

    private static final Logger log = Logger.getLogger(GrabaPedidoServiceTest.class);

    private GrabaPedidoService service;

    private GrabaPedidoDao mockDao;
    private IWsVtaMayoreoServiceStub mockWsAbasto;
    private IWSUniformesStub mockWsUniformes;
    private IntfPED_CENT_CANCELAServiceStub wsCancelacionStub;

    @Before
    public void setUp() {
        mockDao = createMock(GrabaPedidoDao.class);
        mockWsAbasto = createMock(IWsVtaMayoreoServiceStub.class);
        mockWsUniformes = createMock(IWSUniformesStub.class);
        wsCancelacionStub = createMock(IntfPED_CENT_CANCELAServiceStub.class);
        WSUniformesFactory factory = new WSUniformesFactory() {
            @Override
            public IWSUniformesStub createWsUniformesStub(String url) {
                return mockWsUniformes;
            }
        };
        service = new GrabaPedidoService(mockDao, factory, mockWsAbasto, wsCancelacionStub);
    }

    @Test
    public void testGeneraPedido() throws RemoteException, SQLException {
        List<SolicitudDto> solicitud = createSolicitud();

        String folioPedido = "AAA00000";

        WSUniformesStub.GeneraPedidoResponse generaPedidoResponse = createGeneraPedidoResponse();

        IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida salidaWsAbasto = new IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida();
        salidaWsAbasto.setEstatus(BigDecimal.ZERO);
        salidaWsAbasto.setMensaje1("EL PEDIDO SE REGISTRO CORRECTAMENTE!");

        expect(mockDao.validaPrendas(solicitud)).andReturn(true);
        expect(mockDao.consultaIpTienda(1)).andReturn("255.255.255.255");
        expect(mockWsUniformes.generaPedido(anyObject(WSUniformesStub.GeneraPedido.class)))
                .andReturn(generaPedidoResponse);

        expect(mockDao.obtieneNuevoFolio()).andReturn(folioPedido);
        expect(mockDao.grabaSolicitud(folioPedido, solicitud)).andReturn(8);

        expect(mockWsAbasto.wS__VTA__MAYOREOOp(anyObject(IntfWS_VTA_MAYOREOServiceStub.Parametros.class))).andReturn(salidaWsAbasto).times(2);
        expect(mockDao.actualizaMensajeAbasto(solicitud.get(0), "")).andReturn(4);
        expect(mockDao.actualizaMensajeAbasto(solicitud.get(1), "")).andReturn(4);
        replay(mockDao, mockWsUniformes, mockWsAbasto);

        GrabaPedidoResp result = service.grabaPedido(solicitud);

        verify(mockDao, mockWsUniformes, mockWsAbasto);

        assertNotNull(result);

        assertEquals(0, result.getCodigo().intValue());
        assertTrue(result.getPedidos().contains(1));
        assertTrue(result.getPedidos().contains(2));
        assertEquals(folioPedido, result.getFolio());
        assertEquals((Integer) 1, result.getTienda());

    }

    private WSUniformesStub.GeneraPedidoResponse createGeneraPedidoResponse() {
        WSUniformesStub.GeneraPedidoResponse generaPedidoResponse = new WSUniformesStub.GeneraPedidoResponse();
        WSUniformesStub.CreaPedido generaPedidoResult = new WSUniformesStub.CreaPedido();
        generaPedidoResult.setBanderaError(0);
        WSUniformesStub.ArrayOfAltasPedidos arrayOfAltas = new WSUniformesStub.ArrayOfAltasPedidos();
        WSUniformesStub.AltasPedidos[] altasPedidos = new WSUniformesStub.AltasPedidos[2];
        altasPedidos[0] = new WSUniformesStub.AltasPedidos();
        altasPedidos[0].setNumPedido(1);
        WSUniformesStub.ArrayOfint skusPedido1 = new WSUniformesStub.ArrayOfint();
        skusPedido1.set_int(ArrayUtils.toPrimitive(ArrayUtils.toArray(510689, 510689, 510689)));
        altasPedidos[0].setSKU(skusPedido1);
        altasPedidos[1] = new WSUniformesStub.AltasPedidos();
        altasPedidos[1].setNumPedido(2);
        WSUniformesStub.ArrayOfint skusPedido2 = new WSUniformesStub.ArrayOfint();
        skusPedido2.set_int(ArrayUtils.toPrimitive(ArrayUtils.toArray(510700, 510700, 510700)));
        altasPedidos[1].setSKU(skusPedido2);
        arrayOfAltas.setAltasPedidos(altasPedidos);
        generaPedidoResult.setAltaPed(arrayOfAltas);
        generaPedidoResponse.setGeneraPedidoResult(generaPedidoResult);
        return generaPedidoResponse;
    }

    private List<SolicitudDto> createSolicitud() {
        List<SolicitudDto> solicitud = new ArrayList<SolicitudDto>();
        SolicitudDto dto = new SolicitudDto();
        solicitud.add(dto);
        dto.setCantidad(4);
        dto.setCia(1);
        dto.setEmpleado(111111);
        dto.setFuncion(1772);
        dto.setGenero(1);
        dto.setPais(1);
        dto.setSku(510689);
        dto.setTienda(1);
        dto = new SolicitudDto();
        solicitud.add(dto);
        dto.setCantidad(4);
        dto.setCia(1);
        dto.setEmpleado(111111);
        dto.setFuncion(1772);
        dto.setGenero(1);
        dto.setPais(1);
        dto.setSku(510700);
        dto.setTienda(1);
        return solicitud;
    }

    @Test
    public void testGeneraPedidoExcepcionTienda() throws RemoteException, SQLException {
        List<SolicitudDto> solicitud = createSolicitud();

        expect(mockDao.validaPrendas(solicitud)).andReturn(true);
        expect(mockDao.consultaIpTienda(1)).andReturn("255.255.255.255");
        expect(mockWsUniformes.generaPedido(anyObject(WSUniformesStub.GeneraPedido.class)))
                .andThrow(new RemoteException("Excepcion de prueba"));

        replay(mockDao, mockWsUniformes, mockWsAbasto);

        GrabaPedidoResp result = service.grabaPedido(solicitud);

        verify(mockDao, mockWsUniformes, mockWsAbasto);

        assertNotNull(result);

        assertEquals(-1, result.getCodigo().intValue());

        log.info(result.getDescripcionOperacion());

    }

    @Test
    public void testGeneraPedidoErrorTienda() throws RemoteException, SQLException {
        List<SolicitudDto> solicitud = createSolicitud();

        WSUniformesStub.GeneraPedidoResponse generaPedidoResponse = new WSUniformesStub.GeneraPedidoResponse();
        WSUniformesStub.CreaPedido generaPedidoResult = new WSUniformesStub.CreaPedido();
        generaPedidoResult.setBanderaError(-1);
        generaPedidoResult.setMsjSalida("Mensaje de error");

        generaPedidoResponse.setGeneraPedidoResult(generaPedidoResult);

        expect(mockDao.validaPrendas(solicitud)).andReturn(true);
        expect(mockDao.consultaIpTienda(1)).andReturn("255.255.255.255");
        expect(mockWsUniformes.generaPedido(anyObject(WSUniformesStub.GeneraPedido.class)))
                .andReturn(generaPedidoResponse);


        replay(mockDao, mockWsUniformes);

        GrabaPedidoResp result = service.grabaPedido(solicitud);

        verify(mockDao, mockWsUniformes);

        assertNotNull(result);

        assertEquals(-1, result.getCodigo().intValue());

        log.info(result.getDescripcionOperacion());
    }

    @Test
    public void testGeneraPedidoErrorAbasto() throws RemoteException, SQLException {
        List<SolicitudDto> solicitud = createSolicitud();

        String folioPedido = "AAA00000";

        WSUniformesStub.GeneraPedidoResponse generaPedidoResponse = createGeneraPedidoResponse();

        IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida salidaWsAbastoError = new IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida();
        salidaWsAbastoError.setEstatus(BigDecimal.ONE);
        salidaWsAbastoError.setMensaje1("EL PEDIDO QUE DESEA INGRESAR YA EXISTE");

        IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida salidaWsAbastoOK = new IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida();
        salidaWsAbastoOK.setEstatus(BigDecimal.ZERO);

        expect(mockDao.validaPrendas(solicitud)).andReturn(true);
        expect(mockDao.consultaIpTienda(1)).andReturn("255.255.255.255").atLeastOnce();
        expect(mockWsUniformes.generaPedido(anyObject(WSUniformesStub.GeneraPedido.class)))
                .andReturn(generaPedidoResponse).times(3);

        expect(mockWsAbasto.wS__VTA__MAYOREOOp(anyObject(IntfWS_VTA_MAYOREOServiceStub.Parametros.class))).andReturn(salidaWsAbastoOK).once();
        expect(mockDao.actualizaMensajeAbasto(anyObject(SolicitudDto.class), anyString())).andReturn(1).once();

        expect(mockWsAbasto.wS__VTA__MAYOREOOp(anyObject(IntfWS_VTA_MAYOREOServiceStub.Parametros.class))).andReturn(salidaWsAbastoError).times(3);

        expect(mockDao.obtieneNuevoFolio()).andReturn(folioPedido);

        expect(mockDao.grabaSolicitud(anyString(), anyObject(List.class))).andReturn(4);

        replay(mockDao, mockWsUniformes, mockWsAbasto);

        GrabaPedidoResp result = service.grabaPedido(solicitud);

        verify(mockDao, mockWsUniformes, mockWsAbasto);

        assertNotNull(result);

        assertEquals(0, result.getCodigo().intValue());
        assertTrue(result.getPedidos().contains(1));
        assertEquals(folioPedido, result.getFolio());
        assertEquals((Integer) 1, result.getTienda());

    }

    @Test
    public void testGeneraPedidoExcepcionAbasto() throws RemoteException, SQLException {
        List<SolicitudDto> solicitud = createSolicitud();

        String folioPedido = "AAA00000";

        WSUniformesStub.GeneraPedidoResponse generaPedidoResponse = createGeneraPedidoResponse();

        expect(mockDao.validaPrendas(solicitud)).andReturn(true);
        expect(mockDao.consultaIpTienda(1)).andReturn("255.255.255.255");
        expect(mockWsUniformes.generaPedido(anyObject(WSUniformesStub.GeneraPedido.class)))
                .andReturn(generaPedidoResponse);
        expect(mockDao.obtieneNuevoFolio()).andReturn(folioPedido);
        expect(mockDao.grabaSolicitud(folioPedido, solicitud)).andReturn(8);
        expect(mockWsAbasto.wS__VTA__MAYOREOOp(anyObject(IntfWS_VTA_MAYOREOServiceStub.Parametros.class)))
                .andThrow(new RemoteException("Excepcion de prueba")).times(2);

        replay(mockDao, mockWsUniformes, mockWsAbasto);

        GrabaPedidoResp result = service.grabaPedido(solicitud);

        verify(mockDao, mockWsUniformes, mockWsAbasto);

        assertNotNull(result);

        assertEquals(0, result.getCodigo().intValue());
        assertTrue(result.getPedidos().contains(1));
        assertTrue(result.getPedidos().contains(2));
        assertEquals(folioPedido, result.getFolio());
        assertEquals((Integer) 1, result.getTienda());

    }

    @Test
    public void testGeneraPedidoErrorPedidoDuplicado() throws RemoteException, SQLException {
        List<SolicitudDto> solicitud = createSolicitud();

        expect(mockDao.validaPrendas(solicitud)).andReturn(false);

        replay(mockDao);

        GrabaPedidoResp result = service.grabaPedido(solicitud);

        verify(mockDao);

        assertNotNull(result);

        assertEquals(-1, result.getCodigo().intValue());

        log.info(result.getDescripcionOperacion());

    }

    @Test
    public void testGeneraPedidoTiendaNoExiste() throws RemoteException, SQLException {
        List<SolicitudDto> solicitud = createSolicitud();

        expect(mockDao.validaPrendas(solicitud)).andReturn(true);
        expect(mockDao.consultaIpTienda(1)).andThrow(new SQLException("No data found"));

        replay(mockDao);

        GrabaPedidoResp result = service.grabaPedido(solicitud);

        verify(mockDao);

        assertNotNull(result);

        assertEquals(-1, result.getCodigo().intValue());

        log.info(result.getDescripcionOperacion());

    }

    @Test
    public void testGeneraPedidoErroresAbasto() throws RemoteException, SQLException {
        List<SolicitudDto> solicitud = createSolicitud();

        WSUniformesStub.GeneraPedidoResponse generaPedidoResponse = createGeneraPedidoResponse();

        IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida salidaWsAbastoError = new IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida();
        salidaWsAbastoError.setEstatus(BigDecimal.ONE);
        salidaWsAbastoError.setMensaje1("NO EXISTE EL SKU");

        expect(mockDao.validaPrendas(solicitud)).andReturn(true);
        expect(mockDao.consultaIpTienda(1)).andReturn("255.255.255.255").atLeastOnce();
        expect(mockWsUniformes.generaPedido(anyObject(WSUniformesStub.GeneraPedido.class)))
                .andReturn(generaPedidoResponse).times(3);

        expect(mockWsAbasto.wS__VTA__MAYOREOOp(anyObject(IntfWS_VTA_MAYOREOServiceStub.Parametros.class))).andReturn(salidaWsAbastoError).times(6);

        replay(mockDao, mockWsUniformes, mockWsAbasto);

        GrabaPedidoResp result = service.grabaPedido(solicitud);

        verify(mockDao, mockWsUniformes, mockWsAbasto);

        assertNotNull(result);

        assertEquals(-1, result.getCodigo().intValue());
        log.info(result.getDescripcionOperacion());
        log.info(result.getDetalleTecnico());

    }

    @Test
    public void testGeneraPedidoExcepcionBD() throws RemoteException, SQLException {
        List<SolicitudDto> solicitud = createSolicitud();


        String folioPedido = "AAA00000";

        WSUniformesStub.GeneraPedidoResponse generaPedidoResponse = createGeneraPedidoResponse();

        IntfPED_CENT_CANCELAServiceStub.Parametros salidaWsCancelacion = new IntfPED_CENT_CANCELAServiceStub.Parametros();
        salidaWsCancelacion.setESTATUS(BigDecimal.ONE);

        IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida salidaWsAbasto = new IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida();
        salidaWsAbasto.setEstatus(BigDecimal.ZERO);
        salidaWsAbasto.setMensaje1("EL PEDIDO SE REGISTRO CORRECTAMENTE!");

        expect(mockDao.validaPrendas(solicitud)).andReturn(true);
        expect(mockDao.consultaIpTienda(1)).andReturn("255.255.255.255");
        expect(mockWsUniformes.generaPedido(anyObject(WSUniformesStub.GeneraPedido.class)))
                .andReturn(generaPedidoResponse);

        expect(mockDao.obtieneNuevoFolio()).andReturn(folioPedido);
        expect(mockDao.grabaSolicitud(folioPedido, solicitud)).andThrow(new SQLException("Test exception"));

        expect(mockWsAbasto.wS__VTA__MAYOREOOp(anyObject(IntfWS_VTA_MAYOREOServiceStub.Parametros.class))).andReturn(salidaWsAbasto).times(2);
        expect(mockDao.actualizaMensajeAbasto(solicitud.get(0), "")).andReturn(4);
        expect(mockDao.actualizaMensajeAbasto(solicitud.get(1), "")).andReturn(4);

        expect(wsCancelacionStub.pED__CENT__CANCELAOp(anyObject(IntfPED_CENT_CANCELAServiceStub.Parametros_Entrada.class)))
                .andReturn(salidaWsCancelacion)
                .times(2);

        replay(mockDao, mockWsUniformes, mockWsAbasto, wsCancelacionStub);

        GrabaPedidoResp result = service.grabaPedido(solicitud);

        verify(mockDao, mockWsUniformes, mockWsAbasto, wsCancelacionStub);

        assertNotNull(result);

        assertEquals(-1, result.getCodigo().intValue());
        log.info(result.getDescripcionOperacion());
        log.info(result.getDetalleTecnico());

    }
}
