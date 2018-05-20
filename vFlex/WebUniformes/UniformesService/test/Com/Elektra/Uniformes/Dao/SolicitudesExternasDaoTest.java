package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.SolicitudesExternasDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/dao-context.xml")
public class SolicitudesExternasDaoTest {

    @Autowired
    SolicitudesExternasDao dao;

    @Test
    @Transactional
    @Rollback
    public void testGuardarSolicitudExterna() {
        SolicitudesExternasDto dto = new SolicitudesExternasDto();
        dto.setIdEmpleado(Integer.MAX_VALUE);
        dto.setIdCategoria(21);
        dto.setUltimaRemision(new Date());
        dto.setOrigen(1);
        dao.guardarSolicitudExterna(dto);
    }
}
