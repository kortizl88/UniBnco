package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Dao.SolicitudesExternasDao;
import Com.Elektra.Uniformes.Dto.SolicitudesExternasDto;
import Com.Elektra.Uniformes.Services.resp.ServiceResponse;
import com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub;
import org.junit.Before;
import org.junit.Test;

import java.rmi.RemoteException;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.easymock.EasyMock.*;

public class SolicitudesExternasServiceTest {

    SolicitudesExternasService service;

    SolicitudesExternasDao mockDao;

    WS_JSA_ITALIKAStub mockWsItalikaStub;

    @Before
    public void setUp() {
        mockDao = createMock(SolicitudesExternasDao.class);
        mockWsItalikaStub = createMock(WS_JSA_ITALIKAStub.class);
        service = new SolicitudesExternasService(mockDao, mockWsItalikaStub);
    }

    @Test
    public void testRetreiveSolicitudesExternas() throws RemoteException {
        Integer idEmpleado = 141224;

        WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse wsResponse = new WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse();
        WS_JSA_ITALIKAStub.InfoFechaAsignacion infoFechaAsignacion = new WS_JSA_ITALIKAStub.InfoFechaAsignacion();
        infoFechaAsignacion.setEmpleadoConsultado(idEmpleado);
        infoFechaAsignacion.setFechaUltimaAsignacionMotoItalikaNueva("1900/01/01");
        wsResponse.setObtenerUltimaFechaAsignacionMotoItalikaNuevaResult(infoFechaAsignacion);

        expect(mockWsItalikaStub.obtenerUltimaFechaAsignacionMotoItalikaNueva(anyObject(WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNueva.class)))
                .andReturn(wsResponse)
                .once();

        mockDao.guardarSolicitudExterna(anyObject(SolicitudesExternasDto.class));
        expectLastCall().once();

        replay(mockDao, mockWsItalikaStub);
        ServiceResponse resp = service.retreiveSolicitudesExternas(idEmpleado);
        verify(mockDao, mockWsItalikaStub);

        assertNotNull(resp);
        assertEquals((Integer) 0, resp.getCodigo());
    }

    @Test
    public void testRetreiveSolicitudesExternasVacio() throws RemoteException {
        Integer idEmpleado = 141224;

        WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse wsResponse = new WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse();
        WS_JSA_ITALIKAStub.InfoFechaAsignacion infoFechaAsignacion = new WS_JSA_ITALIKAStub.InfoFechaAsignacion();
        infoFechaAsignacion.setEmpleadoConsultado(idEmpleado);
        wsResponse.setObtenerUltimaFechaAsignacionMotoItalikaNuevaResult(infoFechaAsignacion);

        expect(mockWsItalikaStub.obtenerUltimaFechaAsignacionMotoItalikaNueva(anyObject(WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNueva.class)))
                .andReturn(wsResponse)
                .once();

        replay(mockDao, mockWsItalikaStub);
        ServiceResponse resp = service.retreiveSolicitudesExternas(idEmpleado);
        verify(mockDao, mockWsItalikaStub);

        assertNotNull(resp);
        assertEquals((Integer) 0, resp.getCodigo());
    }
}
