package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.SucursalesDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/dao-context.xml")
public class TiendaDaoTest {

    @Autowired
    private SucursalesDao dao;

    @Test
    public void testTiendaUnica() throws Exception {
        SucursalesDto resp = dao.consultaSucursales(642934, 1);
        assertNotNull(resp);
        assertNotNull(resp.getSucursalPorEmpleado());
        assertEquals(1, resp.getSucursalPorEmpleado().size());
        assertEquals(0, resp.getTodasLasSucursales().size());
    }

    @Test
    public void testTiendaSeleccionar() throws Exception {
        Integer idEmpleado = 751489;
        Integer idNegocio = 6;
        SucursalesDto resp = dao.consultaSucursales(idEmpleado, idNegocio);
        assertNotNull(resp);
        assertNotNull(resp);
        assertNotNull(resp.getSucursalPorEmpleado());
        assertTrue(resp.getSucursalPorEmpleado().size() > 0);
        assertTrue(resp.getTodasLasSucursales().size() > 0);
    }

}
