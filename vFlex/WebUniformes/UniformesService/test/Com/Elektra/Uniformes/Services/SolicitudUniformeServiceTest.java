package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Dao.ReposicionesDao;
import Com.Elektra.Uniformes.Dao.SolicitudUniformeDao;
import Com.Elektra.Uniformes.Dto.ItemUniformeDto;
import Com.Elektra.Uniformes.Services.resp.ItemsSolicitudResp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

import static junit.framework.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/service-context.xml")
public class SolicitudUniformeServiceTest {


    private SolicitudUniformeService service;

    @Autowired
    private ReposicionesDao reposicionesDao;

    @Autowired
    private SolicitudUniformeDao dao;

    @Before
    public void setUp() {
        service = new SolicitudUniformeService(dao, reposicionesDao);
    }

    @Test
    public void testConsultaUniformesPorTienda() {
        ItemsSolicitudResp resp = service.consultaUniformes(843264, 16, 8037, 2, 673);
        assertNotNull(resp);
        assertEquals(0, resp.getCodigo().intValue());
    }

    @Test
    public void testExcepcionNoSolicitado() {
        Integer idEmpleado = 707884;
        Integer negocio = 7;
        Integer funcion = 2054;
        Integer genero = 2;
        Integer tienda = 195;
        ItemsSolicitudResp resp = service.consultaUniformes(idEmpleado, negocio, funcion, genero, tienda);

        assertNotNull(resp);
        assertTrue(resp.getKitUniforme().getItems() != null && resp.getKitUniforme().getItems().size() > 0);
        for (ItemUniformeDto item : resp.getKitUniforme().getItems()) {
            assertEquals(true, (boolean) item.getFlagValido());
            assertEquals(ItemUniformeDto.TIPO_ORDINARIA, item.getTipoSolicitud());
        }
    }

    @Test
    public void testExcepcionSolicitado() {
        Integer idEmpleado = 224098;
        Integer negocio = 3;
        Integer funcion = 1778;
        Integer genero = 1;
        Integer tienda = 2244;
        ItemsSolicitudResp resp = service.consultaUniformes(idEmpleado, negocio, funcion, genero, tienda);

        assertNotNull(resp);
        assertTrue(resp.getKitUniforme().getItems() != null && resp.getKitUniforme().getItems().size() > 0);
        for (ItemUniformeDto item : resp.getKitUniforme().getItems()) {
            if (item.getDescripcion().contains("Pantalones")) {
                assertEquals(false, (boolean) item.getFlagValido());
            } else {
                assertEquals(true, (boolean) item.getFlagValido());
                assertEquals(ItemUniformeDto.TIPO_ORDINARIA, item.getTipoSolicitud());
            }

        }
    }

    @Test
    public void testNvoUnifMenosDe6Meses() {
        Integer idEmpleado = 616607;
        Integer negocio = 1;
        Integer funcion = 1987;
        Integer genero = 2;
        Integer tienda = 673;
        ItemsSolicitudResp resp = service.consultaUniformes(idEmpleado, negocio, funcion, genero, tienda);

        assertNotNull(resp);
        assertTrue(resp.getKitUniforme().getItems() != null && resp.getKitUniforme().getItems().size() > 0);
        for (ItemUniformeDto item : resp.getKitUniforme().getItems()) {
            assertEquals(true, (boolean) item.getFlagValido());
            assertEquals(ItemUniformeDto.TIPO_ORDINARIA, item.getTipoSolicitud());
        }
    }

    @Test
    public void testReposicionSolicitada() {
        Integer idEmpleado = 271007;
        Integer negocio = 6;
        Integer funcion = 215;
        Integer genero = 1;
        Integer tienda = 2244;
        ItemsSolicitudResp resp = service.consultaUniformes(idEmpleado, negocio, funcion, genero, tienda);

        assertNotNull(resp);
        assertTrue(resp.getKitUniforme().getItems() != null && resp.getKitUniforme().getItems().size() > 0);
        for (ItemUniformeDto item : resp.getKitUniforme().getItems()) {
            if (item.getSubkitsIds().contains(85)) {
                assertEquals(false, (boolean) item.getFlagValido());
                assertEquals((Integer) 10, item.getEstatusReposicion());
                assertNotNull(item.getFolioReposicion());
                assertNotNull(item.getObservacionesReposicion());
            }

        }

    }

    @Test
    public void testReposicionAutorizadaConCosto() {
        Integer idEmpleado = 904543;
        Integer negocio = 6;
        Integer funcion = 8342;
        Integer genero = 1;
        Integer tienda = 2244;
        ItemsSolicitudResp resp = service.consultaUniformes(idEmpleado, negocio, funcion, genero, tienda);

        assertNotNull(resp);
        assertTrue(resp.getKitUniforme().getItems() != null && resp.getKitUniforme().getItems().size() > 0);
        for (ItemUniformeDto item : resp.getKitUniforme().getItems()) {
            if (item.getSubkitsIds().contains(54)) {
                assertEquals(true, (boolean) item.getFlagValido());
                assertEquals((Integer) 20, item.getEstatusReposicion());
                assertNotNull(item.getFolioReposicion());
                assertNotNull(item.getObservacionesReposicion());
                assertEquals(new BigDecimal("250"), item.getPrecioSubkit());
                assertEquals(ItemUniformeDto.TIPO_EXT_CON_COSTO, item.getTipoSolicitud());
            }
        }
    }

    @Test
    public void testReposicionAutorizadaSinCosto() {
        Integer idEmpleado = 254915;
        Integer negocio = 6;
        Integer funcion = 8312;
        Integer genero = 1;
        Integer tienda = 2244;
        ItemsSolicitudResp resp = service.consultaUniformes(idEmpleado, negocio, funcion, genero, tienda);

        assertNotNull(resp);
        assertTrue(resp.getKitUniforme().getItems() != null && resp.getKitUniforme().getItems().size() > 0);
        for (ItemUniformeDto item : resp.getKitUniforme().getItems()) {
            if (item.getSubkitsIds().contains(85)) {
                assertEquals(true, (boolean) item.getFlagValido());
                assertEquals((Integer) 30, item.getEstatusReposicion());
                assertNotNull(item.getFolioReposicion());
                assertNotNull(item.getObservacionesReposicion());
                assertEquals(BigDecimal.ZERO, item.getPrecioSubkit());
                assertEquals(ItemUniformeDto.TIPO_EXT_SIN_COSTO, item.getTipoSolicitud());
            }

        }

    }

    @Test
    public void testReposicionEsquemaXExcepcion() {
        Integer idEmpleado = 898557;
        Integer negocio = 3;
        Integer funcion = 1544;
        Integer genero = 2;
        Integer tienda = 5254;

        ItemsSolicitudResp resp = service.consultaUniformes(idEmpleado, negocio, funcion, genero, tienda);

        assertNotNull(resp);
        assertTrue(resp.getKitUniforme().getItems() != null && resp.getKitUniforme().getItems().size() > 0);
        for (ItemUniformeDto item : resp.getKitUniforme().getItems()) {
            if (item.getSubkitsIds().contains(69) || item.getSubkitsIds().contains(70)) {
                assertEquals(Boolean.TRUE, item.getFlagValido());
                assertEquals(new BigDecimal("234"), item.getPrecioSubkit());
                assertEquals(ItemUniformeDto.TIPO_EXT_CON_COSTO, item.getTipoSolicitud());
            } else if (item.getSubkitsIds().contains(73)) {
                assertEquals(Boolean.TRUE, item.getFlagValido());
                assertEquals(new BigDecimal("278"), item.getPrecioSubkit());
                assertEquals(ItemUniformeDto.TIPO_EXT_CON_COSTO, item.getTipoSolicitud());
            } else if (item.getSubkitsIds().contains(71)) {
                assertEquals(Boolean.FALSE, item.getFlagValido());
            } else {
                assertEquals(BigDecimal.ZERO, item.getPrecioSubkit());
                assertEquals(ItemUniformeDto.TIPO_ORDINARIA, item.getTipoSolicitud());
            }
        }
    }

    @Test
    public void testEnsambleDinamico() {
        Integer idEmpleado = 269643;
        Integer negocio = 6;
        Integer funcion = 377;
        Integer genero = 2;
        Integer tienda = 673;

        ItemsSolicitudResp resp = service.consultaUniformes(idEmpleado, negocio, funcion, genero, tienda);

        assertNotNull(resp);
        assertTrue(resp.getKitUniforme().getItems() != null && resp.getKitUniforme().getItems().size() > 0);
        for (ItemUniformeDto item : resp.getKitUniforme().getItems()) {
            if (item.getSubkitsIds().contains(85)) {
                assertFalse(item.getFlagValido());
            }
        }
    }
}
