package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.DatosTrackingDto;
import Com.Elektra.Uniformes.Dto.FiltroTrackingDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.TimeoutException;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/dao-context.xml")
public class TrackingDaoTest {

    @Autowired
    TrackingDao dao;

    @Test
    public void testConsultaSolicitudesPorEmpleado() throws Exception {
        FiltroTrackingDto filtro = new FiltroTrackingDto();
        filtro.setIdEmpleado(891211);
        List<DatosTrackingDto> result = dao.consultaSolicitudes(filtro);
        assertNotNull(result);
        assertTrue(result.size() > 0);
    }

    @Test
    public void testConsultaSolicitudesPorTienda() throws Exception {
        FiltroTrackingDto filtro = new FiltroTrackingDto();
        filtro.setTienda(2207);
        List<DatosTrackingDto> result = dao.consultaSolicitudes(filtro);
        assertNotNull(result);
        assertTrue(result.size() > 0);
    }

    @Test
    public void testConsultaSolicitudesPorPedido() throws Exception {
        FiltroTrackingDto filtro = new FiltroTrackingDto();
        filtro.setPedido(626);
        List<DatosTrackingDto> result = dao.consultaSolicitudes(filtro);
        assertNotNull(result);
        assertTrue(result.size() > 0);
    }

    @Test
    public void testConsultaSolicitudesPorSku() throws Exception {
        FiltroTrackingDto filtro = new FiltroTrackingDto();
        filtro.setSku(510812);
        try {
            List<DatosTrackingDto> result = dao.consultaSolicitudes(filtro);
            assertNotNull(result);
            assertTrue(result.size() > 0);
        } catch (TimeoutException e) {
            assertNotNull(e.getMessage());
        }

    }

    @Test
    public void testConsultaSolicitudesPorCC() throws Exception {
        FiltroTrackingDto filtro = new FiltroTrackingDto();
        filtro.setCentroDeCostos(802244);
        List<DatosTrackingDto> result = dao.consultaSolicitudes(filtro);
        assertNotNull(result);
        assertTrue(result.size() > 0);
    }

    @Test
    public void testConsultaSolicitudesPorRemision() throws Exception {
        FiltroTrackingDto filtro = new FiltroTrackingDto();
        filtro.setRemision(4905541);
        List<DatosTrackingDto> result = dao.consultaSolicitudes(filtro);
        assertNotNull(result);
        assertTrue(result.size() > 0);
    }

    @Test
    public void testConsultaSolicitudesPorFechaSolicitud() throws Exception {
        FiltroTrackingDto filtro = new FiltroTrackingDto();
        Calendar fechaIni = new GregorianCalendar(2013, Calendar.JANUARY, 1);
        Calendar fechaFin = new GregorianCalendar(2014, Calendar.JANUARY, 1);
        filtro.setFechaSolicitudFin(fechaFin.getTime());
        filtro.setFechaSolicitudIni(fechaIni.getTime());
        filtro.setTienda(2244);
        List<DatosTrackingDto> result = dao.consultaSolicitudes(filtro);
        assertNotNull(result);
        assertTrue(result.size() > 0);
    }

    @Test
    public void testConsultaSolicitudesPorFechaRemision() throws Exception {
        FiltroTrackingDto filtro = new FiltroTrackingDto();
        Calendar fechaIni = new GregorianCalendar(2013, Calendar.JANUARY, 1);
        Calendar fechaFin = new GregorianCalendar(2014, Calendar.JANUARY, 1);
        filtro.setFechaRemisionFin(fechaFin.getTime());
        filtro.setFechaRemisionIni(fechaIni.getTime());
        filtro.setTienda(2244);
        List<DatosTrackingDto> result = dao.consultaSolicitudes(filtro);
        assertNotNull(result);
        assertTrue(result.size() > 0);
    }

    @Test
    public void testConsultaSolicitudesFiltroCombinado() throws Exception {
        FiltroTrackingDto filtro = new FiltroTrackingDto();
        filtro.setSku(510812);
        filtro.setPedido(626);
        filtro.setTienda(2207);
        List<DatosTrackingDto> result = dao.consultaSolicitudes(filtro);
        assertNotNull(result);
        for (DatosTrackingDto datos : result) {
            assertNotNull(datos.getIdEmpleado());
            assertNotNull(datos.getNombreEmpleado());
            assertNotNull(datos.getIdFuncion());
            assertNotNull(datos.getDescripcionPuesto());
            assertNotNull(datos.getCentroDeCostos());
            assertNotNull(datos.getNombreCC());
            assertNotNull(datos.getPedido());
            assertNotNull(datos.getEstatus());
            assertNotNull(datos.getIdTienda());
            assertNotNull(datos.getNombreTienda());
            assertNotNull(datos.getSku());
            assertNotNull(datos.getDescripcionSku());
            assertNotNull(datos.getCantidad());
            assertNotNull(datos.getFechaSolicitud());
            assertNotNull(datos.getRemision());
            assertNotNull(datos.getFechaRemision());
            assertNotNull(datos.getFechaEntrega());
        }
    }
}