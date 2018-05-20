package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.CargaActivaDto;
import Com.Elektra.Uniformes.Dto.DatosEmpleadoDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.*;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/dao-context.xml")
public class DatosEmpleadoDaoTest {

    @Autowired
    DatosEmpleadoDao dao;

    @Test
    public void testConsultaDatosEmpleado() {
        Integer idEmpleado = 212064;
        DatosEmpleadoDto result = dao.consultaDatosEmpleado(idEmpleado);
        assertNotNull(result);
        assertEquals(1, result.getCanal().size());
        assertNotNull(result.getFcEmpleadoNombre());
        assertNotNull(result.getFcPosicionDesc());
        assertNotNull(result.getFiEmpleadoNum());
        assertNotNull(result.getFnFuncionNum());
        assertNotNull(result.getPais());
        assertNotNull(result.getSexo());
        assertNotNull(result.getManualDeImagen());
        assertFalse(result.getFlagEntrega());
        assertEquals("manualDeImagen/Diapositiva01.jpg", result.getManualDeImagen().get(0));
        assertEquals("manualDeImagen/Diapositiva20.jpg", result.getManualDeImagen().get(19));
        assertNotNull(result.getFlagTracking());
        if (result.getMensajesInicio() != null) {
            assertTrue(result.getMensajesInicio().size() >= 1);
            for (String msg : result.getMensajesInicio()) {
                assertTrue(msg.contains("MSG"));
            }
        }
    }

    @Test
    public void testConsultaDatosEmpleadoMAZenCredito() {
        Integer idEmpleado = 278275;
        DatosEmpleadoDto result = dao.consultaDatosEmpleado(idEmpleado);
        assertNotNull(result);
        assertEquals(1, result.getCanal().size());
        assertEquals(15, result.getCanal().get(0).getId());
        assertNotNull(result.getFcEmpleadoNombre());
        assertNotNull(result.getFcPosicionDesc());
        assertNotNull(result.getFiEmpleadoNum());
        assertNotNull(result.getFnFuncionNum());
        assertNotNull(result.getPais());
        assertNotNull(result.getSexo());
        assertFalse(result.getFlagEntrega());
        assertNotNull(result.getFlagTracking());
    }

    @Test
    public void testConsultaDatosEmpleadEntrega() {
        Integer idEmpleado = 652515;
        DatosEmpleadoDto result = dao.consultaDatosEmpleado(idEmpleado);
        assertNotNull(result);
        assertEquals(1, result.getCanal().size());
        assertNotNull(result.getFcEmpleadoNombre());
        assertNotNull(result.getFcPosicionDesc());
        assertNotNull(result.getFiEmpleadoNum());
        assertNotNull(result.getFnFuncionNum());
        assertNotNull(result.getPais());
        assertNotNull(result.getSexo());
        assertTrue(result.getFlagEntrega());
        assertNotNull(result.getFlagTracking());
    }

    @Test
    public void testConsultaCargaActiva() {
        Integer idEmpleado = 883274;
        Integer idFuncion = 8037;
        Integer idNegocio = 16;
        CargaActivaDto result = dao.consultaCargaActiva(idEmpleado, idNegocio, idFuncion);
        assertNotNull(result);
        assertNotNull(result.getIdCarga());
        assertNotNull(result.getBandMedidasCapturadas());
        assertNotNull(result.getModificaciones());
    }

}
