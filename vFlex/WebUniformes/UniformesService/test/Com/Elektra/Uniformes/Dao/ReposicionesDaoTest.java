package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.AutorizanteDto;
import Com.Elektra.Uniformes.Dto.ReposicionDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static junit.framework.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/dao-context.xml")
public class ReposicionesDaoTest {

    @Autowired
    ReposicionesDao dao;

    @Test
    @Transactional
    @Rollback
    public void testInsertaReposicion() {
        ReposicionDto reposicion = new ReposicionDto();
        reposicion.setIdEmpleado(Integer.MAX_VALUE);
        reposicion.setCorreo("test@elektra.com.mx");
        reposicion.setTelefono("1720-7000");
        reposicion.setMotivo("Motivo prueba");
        reposicion.setMensaje("Mensaje prueba");
        reposicion.setIdSubkit(51);
        Integer result = dao.insertaReposicion(reposicion);
        assertNotNull(result);
    }

    @Test
    public void testConsultaReposicion() {
        Integer idEmpleado = 271007;
        Integer idSubkit = 85;
        ReposicionDto reposicion = dao.consultaReposicion(idEmpleado, idSubkit);
        assertNotNull(reposicion);
        assertNotNull(reposicion.getFolioReposicion());
        assertNotNull(reposicion.getIdEmpleado());
        assertNotNull(reposicion.getCorreo());
        assertNotNull(reposicion.getTelefono());
        assertNotNull(reposicion.getMotivo());
        assertNotNull(reposicion.getMensaje());
        assertNotNull(reposicion.getObservaciones());
        assertNotNull(reposicion.getPedido());
        assertNotNull(reposicion.getSucursal());
        assertNotNull(reposicion.getPrecio());
        assertNotNull(reposicion.getIdSubkit());
        assertNotNull(reposicion.getEstatus());
    }

    @Test
    public void testConsultaReposiciones() {
        Integer idEmpleado = 904543;
        List<ReposicionDto> reposiciones = dao.consultaReposiciones(idEmpleado);
        assertNotNull(reposiciones);
        assertFalse(reposiciones.isEmpty());
        for (ReposicionDto reposicion : reposiciones) {
            assertNotNull(reposicion.getFolioReposicion());
            assertNotNull(reposicion.getIdEmpleado());
            assertNotNull(reposicion.getCorreo());
            assertNotNull(reposicion.getTelefono());
            assertNotNull(reposicion.getMotivo());
            assertNotNull(reposicion.getMensaje());
            assertNotNull(reposicion.getObservaciones());
            assertNotNull(reposicion.getPedido());
            assertNotNull(reposicion.getSucursal());
            assertNotNull(reposicion.getPrecio());
            assertNotNull(reposicion.getIdSubkit());
            assertNotNull(reposicion.getEstatus());
            assertNotNull(reposicion.getDescripcionCorta());
        }
    }

    @Test
    public void testConsultaCorreoAutorizante() {
        Integer idEmpleado = 876501;
        List<AutorizanteDto> result = dao.consultaCorreoAutorizantes(idEmpleado);
        assertNotNull(result);
        assertFalse(result.isEmpty());
        for (AutorizanteDto current : result) {
            assertNotNull(current.getNombre());
            assertNotNull(current.getPuesto());
            assertTrue(current.getEmail().contains("@elektra.com.mx"));
        }

    }

    @Test
    public void testConsultaCorreoAutorizantVacio() {
        Integer idEmpleado = 756658;
        List<AutorizanteDto> result = dao.consultaCorreoAutorizantes(idEmpleado);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    @Transactional
    @Rollback
    public void testConfirmaNotificacion() {
        Integer idReposicion = 159;
        Integer result = dao.confirmaNotificacion(idReposicion);
        assertNotNull(result);
    }

    @Test
    public void testConsultaCorreoAutorizanteXFuncion() {
        Integer idEmpleado = 585665;
        List<AutorizanteDto> result = dao.consultaCorreoAutorizantes(idEmpleado);
        assertNotNull(result);
        assertFalse(result.isEmpty());
        for (AutorizanteDto current : result) {
            assertNotNull(current.getNombre());
            assertNotNull(current.getPuesto());
            assertTrue(current.getEmail().contains("@elektra.com.mx"));
        }
    }
}