package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.DetallePedidoDto;
import Com.Elektra.Uniformes.Dto.EstatusPedidoDto;
import Com.Elektra.Uniformes.Dto.FolioDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/dao-context.xml")
public class EstatusPedidoDaoTest {

    @Autowired
    private EstatusPedidoDao dao;

    @Test
    public void testConsultaFolio() {
        Integer idEmpleado = 881845;
        String folio = "AAI38918";
        EstatusPedidoDto result = dao.consultaFolio(idEmpleado, folio);
        assertNotNull(result);
        assertNotNull(result.getFolioPedido());
        assertNotNull(result.getNoTienda());
        assertNotNull(result.getNombreTienda());
        assertNotNull(result.getFecha());
        assertNotNull(result.getIdEstatus());
        assertNotNull(result.getDescripcionEstatus());
        assertNotNull(result.getDetalle());
        assertFalse(result.getDetalle().isEmpty());
        for (DetallePedidoDto det : result.getDetalle()) {
            assertNotNull(det.getNoPedido());
            assertNotNull(det.getSku());
            assertNotNull(det.getDescripcion());
            assertNotNull(det.getTalla());
            assertNotNull(det.getTotalSku());
            assertNotNull(det.getNumRemision());
            assertNotNull(det.getEstatusDesc());
            assertNotNull(det.getFechaEstatus());
        }
    }

    @Test
    public void testHistorialFolios() {
        Integer idEmp = 881845;
        List<FolioDto> result = dao.historialFolios(idEmp);
        assertNotNull(result);
        assertFalse(result.isEmpty());
        for (FolioDto folio : result) {
            assertNotNull(folio.getFecha());
            assertNotNull(folio.getFolio());
        }
    }
}