package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.DetallePedidoPorEntregarDto;
import Com.Elektra.Uniformes.Dto.PedidosPendientesDto;
import Com.Elektra.Uniformes.Dto.PendienteRegionalDto;
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
public class PedidosPendientesDaoTest {

    @Autowired
    private PedidosPendientesDao dao;

    @Test
    public void testConsultaPendientesEntrega() {
        Integer numEmpGerente = 723637;
        List<PedidosPendientesDto> result = dao.consultaPendientesEntrega(numEmpGerente);
        assertNotNull(result);
        assertFalse(result.isEmpty());
        for (PedidosPendientesDto dto : result) {
            assertNotNull(dto.getCencosNum());
            assertNotNull(dto.getClave());
            assertNotNull(dto.getDescFuncion());
            assertNotNull(dto.getDetalle());
            assertNotNull(dto.getEmpleadoNombre());
            assertNotNull(dto.getFolioPedido());
            assertNotNull(dto.getIdEmpelado());
            assertFalse(dto.getDetalle().isEmpty());
            for (DetallePedidoPorEntregarDto det : dto.getDetalle()) {
                assertNotNull(det.getDescSKU());
                assertNotNull(det.getFechaRemision());
                assertNotNull(det.getFolioPedido());
                assertNotNull(det.getNoPedido());
                assertNotNull(det.getNoRemision());
                assertNotNull(det.getNoTienda());
                assertNotNull(det.getSKU());
                assertNotNull(det.getTotSKU());
            }
        }
    }

    @Test
    public void testConsultaPendientesEntregaRegional() {
        Integer numEmpGerente = 723637;
        List<PendienteRegionalDto> result = dao.consultaPendientesEntregaRegional(numEmpGerente);
        for (PendienteRegionalDto dto : result) {
            assertNotNull(dto.getCencosNum());
            assertNotNull(dto.getClave());
            assertNotNull(dto.getDescFuncion());
            assertNotNull(dto.getDetalle());
            assertNotNull(dto.getEmpleadoNombre());
            assertNotNull(dto.getIdEmpelado());
            assertNotNull(dto.getNumEmpRegional());
            assertNotNull(dto.getNombreRegional());
            assertFalse(dto.getDetalle().isEmpty());
            for (DetallePedidoPorEntregarDto det : dto.getDetalle()) {
                assertNotNull(det.getDescSKU());
                assertNotNull(det.getFechaRemision());
                assertNotNull(det.getNoPedido());
                assertNotNull(det.getNoRemision());
                assertNotNull(det.getNoTienda());
                assertNotNull(det.getSKU());
                assertNotNull(det.getTotSKU());
            }
        }
    }

}
