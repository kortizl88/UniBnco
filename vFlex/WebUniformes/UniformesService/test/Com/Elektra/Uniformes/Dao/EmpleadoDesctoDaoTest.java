package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.EmpleadoDesctoDto;
import Com.Elektra.Uniformes.Dto.FolioDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static junit.framework.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/dao-context.xml")
public class EmpleadoDesctoDaoTest {

    @Autowired
    EmpleadoDesctoDao dao;

    @Test
    public void testGetFolios() {
        Integer idEmpleado = 728899;
        List<FolioDto> result = dao.getFolios(idEmpleado);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testConsultaEmpleadoDescto() {
        Integer idEmpleado = 728899;
        String folioPedido = "AAG09951";
        List<EmpleadoDesctoDto> result = dao.consultaEmpleadoDescto(idEmpleado, folioPedido);
        assertNotNull(result);
        assertFalse(result.isEmpty());
        for (EmpleadoDesctoDto descto : result) {
            assertNotNull(descto.getPeriodos());
        }
    }

    @Test
    public void testGetFoliosErrorDuplicados() {
        Integer idEmpleado = 913616;
        List<FolioDto> result = dao.getFolios(idEmpleado);
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(2, result.size());
    }
}
