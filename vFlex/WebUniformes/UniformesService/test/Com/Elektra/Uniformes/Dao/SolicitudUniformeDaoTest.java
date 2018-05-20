package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

import static junit.framework.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/dao-context.xml")
@Transactional
public class SolicitudUniformeDaoTest {

    @Autowired
    SolicitudUniformeDao dao;

    @Test
    public void testGuardaSolicitudSinInventario() {
        SolicitudSinInventarioDto dto = new SolicitudSinInventarioDto();
        dto.setIdEmpleado(123456);
        dto.setIdSubkit(1);
        dto.setPeriodo(201534);
        dto.setSku(510689);
        dto.setSucursal(2244);
        dao.guardaSolicitudSinInventario(dto);
    }

    @Test
    public void testConsultaEsPrimerKit() {
        Boolean result = dao.consultaEsPrimerKit(926887, 29);
        assertTrue(result);
        result = dao.consultaEsPrimerKit(256447, 43);
        assertFalse(result);
    }

    @Test
    public void testValidaSolicitud() {
        Integer idEmplead = 913127;
        Integer idFuncion = 1544;
        Integer idGenero = 1;
        Integer idSubkit = 69;
        Integer mesesRenov = 36;
        List<ValidacionResult> result = dao.validaSolicitud(idEmplead, idFuncion, idGenero, idSubkit, mesesRenov);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testValidaRemisionExterna() {
        Integer idEmpleado = 149663;
        Integer idFuncion = 1984;
        Integer idGenero = 2;
        Integer idSubkit = 86;
        Integer mesesRenov = 15;
        List<ValidacionResult> result = dao.validaSolicitud(idEmpleado, idFuncion, idGenero, idSubkit, mesesRenov);
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    @Test
    public void testConsultaUniformes() throws Exception {
        int empleado = 881845;
        int idCia = 1;
        int idFuncion = 1412;
        int idGenero = 1;
        int idTienda = 144;
        KitUniformeDto result = dao.consultaUniformes(empleado, idCia, idFuncion, idGenero, idTienda);
        assertNotNull(result);
        assertNotNull(result.getItems());
        assertTrue(result.getFlagMostrarGuia());
        assertNotNull(result.getSemanasDescto());
        assertEquals("comoElegirTalla{0}.jpg", result.getArchivoGuia());
        assertTrue(result.getItems().size() > 0);
        for (ItemUniformeDto item : result.getItems()) {
            assertNotNull(item.getCantidad());
            assertNotNull(item.getDescripcion());
            assertNotNull(item.getImagenes());
            assertNotNull(item.getPrecioSubkit());
            assertNotNull(item.getTallas());
            assertNotNull(item.getFlagObligatorio());
            assertTrue(item.getImagenes().size() > 0);
            for (String img : item.getImagenes()) {
                assertNotNull(img);
            }

            validaTallas(item);
            assertNotNull(item.getMesesRenovacion());
            assertNotNull(item.getSubkitsIds());
            assertFalse(item.getSubkitsIds().isEmpty());
        }
    }

    private void validaTallas(ItemUniformeDto item) {
        for (TallaDto talla : item.getTallas()) {
            assertNotNull(talla.getIdTalla());
            assertNotNull(talla.getTallaClave());
            assertNotNull(talla.getPiezas());
            assertTrue(talla.getPiezas().size() > 0);
            for (PiezaDto sku : talla.getPiezas()) {
                assertNotNull(sku);
                assertNotNull(sku.getSku());
                assertNotNull(sku.getCantidad());
                assertNotNull(sku.getInventario());
            }
        }
    }

    @Test
    public void testConsultaUniformesParcial() throws Exception {
        int empleado = 926887;
        int idCia = 1;
        int idFuncion = 75;
        int idGenero = 2;
        int idTienda = 673;
        KitUniformeDto result = dao.consultaUniformes(empleado, idCia, idFuncion, idGenero, idTienda);
        assertNotNull(result);
        assertNotNull(result.getItems());
        assertNotNull(result.getFlagMostrarGuia());
        assertNotNull(result.getSemanasDescto());
        assertTrue(result.getItems().size() > 0);
        for (ItemUniformeDto item : result.getItems()) {
            assertNotNull(item.getCantidad());
            assertNotNull(item.getDescripcion());
            assertNotNull(item.getImagenes());
            assertNotNull(item.getPrecioSubkit());
            assertNotNull(item.getTallas());
            assertTrue(item.getImagenes().size() > 0);
            for (String img : item.getImagenes()) {
                assertNotNull(img);
            }

            validaTallas(item);
            assertNotNull(item.getMesesRenovacion());
            assertNotNull(item.getSubkitsIds());
            assertFalse(item.getSubkitsIds().isEmpty());
        }
    }

    @Test
    public void testConsultaUniformeCamisaML() throws Exception {
        int empleado = 992851;
        int idCia = 6;
        int idFuncion = 215;
        int idGenero = 2;
        int idTienda = 673;
        KitUniformeDto result = dao.consultaUniformes(empleado, idCia, idFuncion, idGenero, idTienda);
        assertNotNull(result);
        assertNotNull(result.getItems());
        assertNotNull(result.getFlagMostrarGuia());
        assertNotNull(result.getSemanasDescto());
        assertTrue(result.getItems().size() > 0);
        for (ItemUniformeDto item : result.getItems()) {
            assertNotNull(item.getCantidad());
            assertNotNull(item.getDescripcion());
            assertNotNull(item.getImagenes());
            assertNotNull(item.getPrecioSubkit());
            assertNotNull(item.getTallas());
            assertNotNull(item.getFlagObligatorio());
            if (item.getDescripcion().contains("Camisas")) {
                assertEquals(new BigDecimal("200"), item.getPrecioSubkit());
                assertEquals(4, (int) item.getCantidad());
            }
            assertTrue(item.getImagenes().size() > 0);
            for (String img : item.getImagenes()) {
                assertNotNull(img);
            }

            validaTallas(item);
            assertNotNull(item.getMesesRenovacion());
            assertNotNull(item.getSubkitsIds());
            assertFalse(item.getSubkitsIds().isEmpty());
            if (item.getDescripcion().contains("Casco")) {
                assertNotNull(item.getGuiaTallas());
            }
        }
    }

    @Test
    public void testObtenerEnsamble() {
        int idTienda = 673;
        int sku = 1004593;
        EnsambleDto ensamble = dao.obtenerEnsamble(sku, idTienda);
        assertEquals(1004593, ensamble.getSku().intValue());
        assertTrue(ensamble.getInventario() > 0);
        assertEquals(new BigDecimal("117"), ensamble.getCosto());
    }

    @Test
    public void testConsultaMedidasParaCaptura() {
        Integer idEmpleado = 810358;
        Integer idCarga = 1;
        List<CapturaMedidaDto> result = dao.consultaMedidasParaCaptura(idEmpleado, idCarga);
        assertNotNull(result);
        assertFalse(result.isEmpty());
        Integer orden = 1;
        for (CapturaMedidaDto cap : result) {
            assertNotNull(cap.getIdTipoPrenda());
            assertNotNull(cap.getDescripcion());
            assertNotNull(cap.getMedidas());
            assertFalse(cap.getMedidas().isEmpty());
            for (MedidaDto medida : cap.getMedidas()) {
                assertNotNull(medida.getIdMedida());
                assertNotNull(medida.getDescripcion());
                assertTrue(medida.getOrden().equals(orden));
                orden++;
            }
        }
    }

    @Test
    public void testGuardaCapturaDeMedida() {
        GuardaCapturaMedidaDto captura = new GuardaCapturaMedidaDto();
        captura.setIdCarga(1);
        captura.setIdEmpleado(810358);
        captura.setIdNegocio(16);
        captura.setFuncionSap(8037);
        captura.setIdGenero(2);
        dao.guardaCapturaDeMedida(captura);
        assertNotNull(captura.getIdCaptura());
        assertTrue(captura.getIdCaptura() > 0);
        CapturaDetalleDto detalle = new CapturaDetalleDto();
        detalle.setIdMedida(6);
        detalle.setValor(new BigDecimal("35"));
        Integer result = dao.guardaCapturaDetalle(captura.getIdCaptura(), detalle);
        assertNotNull(result);
        assertTrue(result > 0);
    }

}
