package Com.Elektra.Uniformes.Dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

import static junit.framework.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/dao-context.xml")
public class ConfiguracionDaoTest {

    @Autowired
    ConfiguracionDao dao;

    @Test
    public void testObtenerConfiguracion() {
        Map<String, String> config = dao.obtenerConfiguracion(9588, 3, 1);
        assertNotNull(config);
        assertTrue(config.containsKey("componenteHuella"));
        assertEquals("UareU", config.get("componenteHuella"));
    }

    @Test
    public void testObtenerConfiguracionPARCIAL() {
        Map<String, String> config = dao.obtenerConfiguracion(4624, 1, 1);
        assertNotNull(config);
        assertTrue(config.containsKey("componenteHuella"));
        assertEquals("TestParcial", config.get("componenteHuella"));
    }
}
