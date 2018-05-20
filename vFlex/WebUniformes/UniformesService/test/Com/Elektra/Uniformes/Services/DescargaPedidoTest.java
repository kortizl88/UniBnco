package Com.Elektra.Uniformes.Services;


import Com.Elektra.Uniformes.Dao.DescargaPedidoDao;
import Com.Elektra.Uniformes.Dto.DatosPedidoDto;
import Com.Elektra.Uniformes.Dto.UniInventarioCSku;
import Com.Elektra.Uniformes.Services.resp.ServiceResponse;
import com.elektra.uniformes.wstienda.IWSUniformesStub;
import com.elektra.uniformes.wstienda.WSUniformesFactory;
import com.elektra.uniformes.wstienda.WSUniformesStub;
import org.apache.axis2.AxisFault;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.easymock.EasyMock.*;

public class DescargaPedidoTest {

    private DescargaPedidoService service;

    private DescargaPedidoDao daoMock;
    private IWSUniformesStub stubMock;

    @Before
    public void setUp() {
        daoMock = createMock(DescargaPedidoDao.class);
        stubMock = createMock(IWSUniformesStub.class);
        WSUniformesFactory factory = new WSUniformesFactory() {
            @Override
            public IWSUniformesStub createWsUniformesStub(String url) throws AxisFault {
                return stubMock;
            }
        };
        service = new DescargaPedidoService(daoMock, factory);
    }

    @Test
    public void testGrabaPedido() throws Exception {
        Integer idEmpGerente = 999999;
        Integer idEmpDistrital = null;
        DatosPedidoDto datosPedido = new DatosPedidoDto();
        datosPedido.setFolioPedido("AAF60236");
        datosPedido.setNoPedido(943);
        datosPedido.setNoTienda(2244);
        datosPedido.setNumEmpleado(937843);

        String ipTienda = "255.255.255.255";
        UniInventarioCSku sku = new UniInventarioCSku(Arrays.asList(510886, 510886, 510886, 510886), ipTienda);

        WSUniformesStub.ActualizaPedidoResponse response = new WSUniformesStub.ActualizaPedidoResponse();
        WSUniformesStub.SalidaDatos salidaParam = new WSUniformesStub.SalidaDatos();
        salidaParam.setBanderaError(0);
        salidaParam.setMsjSalida("OK");
        response.setActualizaPedidoResult(salidaParam);

        //Expectations
        expect(daoMock.selectSKUPedido(datosPedido)).andReturn(sku);
        expect(stubMock.actualizaPedido(anyObject(WSUniformesStub.ActualizaPedido.class))).andReturn(response);
        daoMock.updatePrimeraHuella(datosPedido, idEmpGerente, idEmpDistrital);
        expectLastCall().once();

        replay(daoMock, stubMock);

        ServiceResponse resp = service.grabaPedido(idEmpGerente, idEmpDistrital, datosPedido);
        verify(daoMock, stubMock);

        assertNotNull(resp);
        assertEquals((Integer) 0, resp.getCodigo());

    }
}
