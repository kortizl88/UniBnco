package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.ItemUniformeDto;
import Com.Elektra.Uniformes.Dto.SolicitudDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static junit.framework.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/dao-context.xml")
public class GrabaPedidoDaoTest {

    @Autowired
    GrabaPedidoDao dao;

    private static final Pattern PATTERN = Pattern.compile(
            "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    @Test
    public void testActualizaEnviadoAbasto() {
        String mensaje = "Mensaje de prueba";
        SolicitudDto item = new SolicitudDto();
        item.setEmpleado(931509);
        item.setTienda(2244);
        item.setPedido(903);
        item.setSku(510885);
        Integer rows = dao.actualizaMensajeAbasto(item, mensaje);
        assertNotNull(rows);
        assertTrue(rows > 0);
    }

    @Test
    public void testConsultaIpTienda() throws SQLException {
        String result = dao.consultaIpTienda(2244);
        Matcher matcher = PATTERN.matcher(result);
        assertTrue(matcher.matches());
    }

    @Test
    @Transactional
    @Rollback(true)
    public void testGrabaSolicitud() throws SQLException {
        List<SolicitudDto> solicitud = new ArrayList<SolicitudDto>();
        SolicitudDto dto = new SolicitudDto();
        solicitud.add(dto);
        dto.setPedido(1);
        dto.setCantidad(1);
        dto.setCia(1);
        dto.setEmpleado(111111);
        dto.setFuncion(1772);
        dto.setGenero(1);
        dto.setPais(1);
        dto.setSku(1004593);
        dto.setTienda(1);
        dto.setTipoSolicitud(ItemUniformeDto.TIPO_ORDINARIA);
        Integer result = dao.grabaSolicitud("AAA00000", solicitud);
        assertNotNull(result);
        assertTrue(result > 0);
    }

    @Test
    public void testValidaPrendas() throws SQLException {
        List<SolicitudDto> solicitud = new ArrayList<SolicitudDto>();
        SolicitudDto dto = new SolicitudDto();
        solicitud.add(dto);
        dto.setPedido(1);
        dto.setCantidad(1);
        dto.setCia(1);
        dto.setEmpleado(111111);
        dto.setFuncion(1772);
        dto.setGenero(1);
        dto.setPais(1);
        dto.setSku(1003004);
        dto.setTienda(1);
        Boolean result = dao.validaPrendas(solicitud);
        assertNotNull(result);
        assertTrue(result);
    }

    @Test
    public void testObtieneNuevoFolio() {
        String folio = dao.obtieneNuevoFolio();
        Pattern pat = Pattern.compile("[A-Z]{3}[0-9]{5}");
        Matcher matcher = pat.matcher(folio);
        assertTrue(matcher.matches());
    }

    @Test
    @Transactional
    @Rollback(true)
    public void testGrabaSolicitudReposicionConCosto() throws SQLException {
        List<SolicitudDto> solicitud = new ArrayList<SolicitudDto>();
        SolicitudDto dto = new SolicitudDto();
        solicitud.add(dto);
        dto.setPedido(1);
        dto.setCantidad(1);
        dto.setCia(6);
        dto.setEmpleado(904543);
        dto.setFuncion(8342);
        dto.setGenero(1);
        dto.setPais(1);
        dto.setSku(1003808);
        dto.setTienda(673);
        dto.setTipoSolicitud(ItemUniformeDto.TIPO_EXT_CON_COSTO);
        Integer result = dao.grabaSolicitud("AAA00000", solicitud);
        assertNotNull(result);
        assertEquals((Integer) 1, result);
    }

    @Test
    @Transactional
    @Rollback(true)
    public void testGrabaSolicitudReposicionSinCosto() throws SQLException {
        List<SolicitudDto> solicitud = new ArrayList<SolicitudDto>();
        SolicitudDto dto = new SolicitudDto();
        solicitud.add(dto);
        dto.setPedido(1);
        dto.setCantidad(1);
        dto.setCia(6);
        dto.setEmpleado(904543);
        dto.setFuncion(276);
        dto.setGenero(1);
        dto.setPais(1);
        dto.setSku(1005439);
        dto.setTienda(673);
        dto.setTipoSolicitud(ItemUniformeDto.TIPO_EXT_SIN_COSTO);
        Integer result = dao.grabaSolicitud("AAA00000", solicitud);
        assertNotNull(result);
        assertEquals((Integer) 1, result);
    }
}
