package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.DatosPedidoDto;
import Com.Elektra.Uniformes.Dto.UniInventarioCSku;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/dao-context.xml")
public class DescargaPedidoDaoTest {

    @Autowired
    DescargaPedidoDao dao;

    @Test
    public void testSelectSKUPedido() throws SQLException {
        Integer expectedSku = 510886;
        DatosPedidoDto datosPedido = new DatosPedidoDto();
        datosPedido.setFolioPedido("AAF60236");
        datosPedido.setNoPedido(943);
        datosPedido.setNoTienda(2244);
        datosPedido.setNumEmpleado(937843);
        UniInventarioCSku result = dao.selectSKUPedido(datosPedido);
        assertNotNull(result);
        assertNotNull(result.getIpTienda());
        assertEquals(4, result.getSku().length);
        for (Integer sku : result.getSku()) {
            assertEquals(expectedSku, sku);
        }

    }

    @Test
    @Transactional
    @Rollback(true)
    public void testUpdatePrimeraHuella() throws SQLException {
        DatosPedidoDto datosPedido = new DatosPedidoDto();
        datosPedido.setFolioPedido("AAF60236");
        datosPedido.setNoPedido(943);
        datosPedido.setNoTienda(2244);
        datosPedido.setNumEmpleado(937843);
        Integer idEmpGerente = 810358;
        dao.updatePrimeraHuella(datosPedido, idEmpGerente, 0);
    }

    @Test
    @Transactional
    @Rollback(true)
    public void testUpdatePrimeraHuellaDistrital() throws SQLException {
        DatosPedidoDto datosPedido = new DatosPedidoDto();
        datosPedido.setFolioPedido("AAF60236");
        datosPedido.setNoPedido(943);
        datosPedido.setNoTienda(2244);
        datosPedido.setNumEmpleado(937843);
        Integer idEmpGerente = 810358;
        Integer idEmpDistrital = 530802;
        dao.updatePrimeraHuella(datosPedido, idEmpGerente, idEmpDistrital);
    }
}
