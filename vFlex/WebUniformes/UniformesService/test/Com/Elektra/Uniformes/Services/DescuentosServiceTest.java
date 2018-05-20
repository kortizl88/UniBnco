package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Dao.EmpleadoDesctoDao;
import Com.Elektra.Uniformes.Dto.DetallePedidoEnDesctoDto;
import Com.Elektra.Uniformes.Dto.EmpleadoDesctoDto;
import Com.Elektra.Uniformes.Dto.PedidoEnDescuentoDto;
import Com.Elektra.Uniformes.Services.resp.DescuentosResp;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.easymock.EasyMock.*;

public class DescuentosServiceTest {

    private static final Logger log = Logger.getLogger(DescuentosServiceTest.class);

    private static final String DATA_PEDIDOXSKU =
            "222717|0082|A03K|AAF94061-355-1    ~A|199|05/05/14|19|2014|174.12|0|8|" +
                    "222717|0082|A03K|AAF94061-355-1    ~A|199|12/05/14|20|2014|149.24|0|8|" +
                    "222717|0082|A03K|AAF94061-355-1    ~A|199|26/05/14|22|2014|99.48|0|8|" +
                    "222717|0082|A03K|AAF94061-355-1    ~A|199|19/05/14|21|2014|124.36|0|8|" +
                    "222717|0082|A03K|AAF94061-355-1    ~A|199|02/06/14|23|2014|74.6|0|8|" +
                    "222717|0082|A03K|AAF94061-355-1    ~A|199|09/06/14|24|2014|49.72|0|8|" +
                    "222717|0082|A03K|AAF94061-355-1    ~A|199|16/06/14|25|2014|24.84|0|8|" +
                    "222717|0082|A03K|AAF94061-355-1    ~A|199|23/06/14|26|2014|0|0|8|" +
                    "222717|0013|945K|AAF94061-356-1    ~A|100|15/06/15|25|2015|50|12.5|8|" +
                    "222717|0013|945K|AAF94061-357-1    ~A|100|01/06/15|23|2015|75|0|8|" +
                    "222717|0013|945K|AAF94061-357-1    ~A|100|25/05/15|22|2015|87.5|0|8|" +
                    "222717|0013|945K|AAF94061-356-1    ~A|100|01/06/15|23|2015|75|0|8|" +
                    "222717|0013|945K|AAF94061-356-1    ~A|100|29/06/15|27|2015|25|12.5|8|" +
                    "222717|0013|945K|AAF94061-356-1    ~A|100|22/06/15|26|2015|37.5|12.5|8|" +
                    "222717|0013|945K|AAF94061-356-1    ~A|100|25/05/15|22|2015|87.5|0|8|" +
                    "222717|0013|945K|AAF94061-356-1    ~A|100|08/06/15|24|2015|62.5|12.5|8|" +
                    "222717|0013|945K|AAF94061-357-1    ~A|100|15/06/15|25|2015|50|12.5|8|" +
                    "222717|0013|945K|AAF94061-357-1    ~A|100|08/06/15|24|2015|62.5|12.5|8|" +
                    "222717|0013|945K|AAF94061-357-1    ~A|100|29/06/15|27|2015|25|12.5|8|" +
                    "222717|0013|945K|AAF94061-356-1    ~A|100|06/07/15|28|2015|12.5|12.5|8|" +
                    "222717|0013|945K|AAF94061-357-1    ~A|100|06/07/15|28|2015|12.5|12.5|8|" +
                    "222717|0013|945K|AAF94061-357-1    ~A|100|22/06/15|26|2015|37.5|12.5|8";

    private static final String DATA_PEDIDOUNICO =
            "711384|0099|945K|AAB27747          ~A|399|01/05/15|9|2015|299.2|0|8|" +
                    "711384|0099|945K|AAB27747          ~A|399|16/05/15|10|2015|199.4|0|8|" +
                    "711384|0099|945K|AAB27747          ~A|399|01/06/15|11|2015|99.6|99.8|8|" +
                    "711384|0099|945K|AAB27747          ~A|399|16/06/15|12|2015|0|99.6|8";

    private static final String DATA_PEDIDODUPLICADO =
            "270720|0014|945K|AAH55129-1021-1|158|14/12/15|51|2015|145.85|12.15|13|" +
                    "270720|0014|945K|AAH55129-1021-1|158|21/12/15|52|2015|133.7|12.15|13|" +
                    "270720|0751|945K|AAH55129-1021-1   ~A|121.55|05/01/16|1|2016|109.4|12.15|13|" +
                    "270720|0751|945K|AAH55129-1021-1   ~A|121.55|12/01/16|2|2016|97.25|12.15|13|" +
                    "270720|0014|945K|AAH55129-1022-1|188|14/12/15|51|2015|173.54|14.46|13|" +
                    "270720|0014|945K|AAH55129-1022-1|188|21/12/15|52|2015|159.08|14.46|13|" +
                    "270720|0751|945K|AAH55129-1022-1   ~A|144.62|05/01/16|1|2016|130.16|14.46|13|" +
                    "270720|0751|945K|AAH55129-1022-1   ~A|144.62|12/01/16|2|2016|115.7|14.46|13";

    private static final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
    private static final DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance(Locale.ENGLISH);

    private static List<EmpleadoDesctoDto> descuentosPedidoXSku;
    private static List<EmpleadoDesctoDto> descuentosPedidoUnico;
    private static List<EmpleadoDesctoDto> descuentosPedidoDuplicado;

    static {
        decimalFormat.setParseBigDecimal(true);
        try {
            descuentosPedidoXSku = buildEmpleadoDescto(DATA_PEDIDOXSKU);
            descuentosPedidoUnico = buildEmpleadoDescto(DATA_PEDIDOUNICO);
            descuentosPedidoDuplicado = buildEmpleadoDescto(DATA_PEDIDODUPLICADO);
        } catch (ParseException e) {
            log.error("Error al parsear la información", e);
        }
    }

    private static List<EmpleadoDesctoDto> buildEmpleadoDescto(String data) throws ParseException {
        List<EmpleadoDesctoDto> dtoList = new ArrayList<EmpleadoDesctoDto>();
        int i = 0;
        EmpleadoDesctoDto dto = new EmpleadoDesctoDto();
        for (String value : data.split("\\|")) {
            switch (i % 11) {
                case 0:
                    dto.setEmplid(Integer.parseInt(value));

                    break;
                case 1:
                    dto.setSoc(value);
                    break;
                case 2:
                    dto.setCcnom(value);
                    break;
                case 3:
                    dto.setRefe(value);
                    break;
                case 4:
                    dto.setTotdesc((BigDecimal) decimalFormat.parse(value));
                    break;
                case 5:
                    dto.setFecpago(dateFormat.parse(value));
                    break;
                case 6:
                    dto.setSemdescto(Integer.parseInt(value));
                    break;
                case 7:
                    dto.setAniodescto(Integer.parseInt(value));
                    break;
                case 8:
                    dto.setSaldo((BigDecimal) decimalFormat.parse(value));
                    break;
                case 9:
                    dto.setPago((BigDecimal) decimalFormat.parse(value));
                    break;
                case 10:
                    dto.setPeriodos(Integer.parseInt(value));
                    dtoList.add(dto);
                    dto = new EmpleadoDesctoDto();

            }
            i++;
        }
        return dtoList;
    }

    private DescuentosService service;

    private EmpleadoDesctoDao mockDao;

    @Before
    public void setUp() {
        mockDao = createMock(EmpleadoDesctoDao.class);
        service = new DescuentosService(mockDao);
    }

    @Test
    public void testConsDescEmpPedidoXSku() {
        Integer idEmpleado = 222717;
        String folioPedido = "AAF94061";


        expect(mockDao.consultaEmpleadoDescto(idEmpleado, folioPedido)).andReturn(descuentosPedidoXSku).once();

        replay(mockDao);
        DescuentosResp result = service.consDescEmp(idEmpleado, folioPedido);
        verify(mockDao);

        assertNotNull(result);
        assertEquals((Integer) 0, result.getCodigo());
        for (PedidoEnDescuentoDto pedido : result.getEmpleadoDesctos()) {

            for (DetallePedidoEnDesctoDto detalle : pedido.getDetalle()) {
                assertNotNull(detalle.getNumPago());
                assertEquals((Integer) 8, detalle.getPeriodos());
            }
        }


    }

    @Test
    public void testConsDescEmpPedidoUnico() {
        Integer idEmpleado = 711384;
        String folioPedido = "AAB27747";

        expect(mockDao.consultaEmpleadoDescto(idEmpleado, folioPedido)).andReturn(descuentosPedidoUnico).once();

        replay(mockDao);
        DescuentosResp result = service.consDescEmp(idEmpleado, folioPedido);
        verify(mockDao);

        assertNotNull(result);
        assertEquals((Integer) 0, result.getCodigo());
        for (PedidoEnDescuentoDto pedido : result.getEmpleadoDesctos()) {
            for (DetallePedidoEnDesctoDto detalle : pedido.getDetalle()) {
                assertNotNull(detalle.getNumPago());
                assertEquals((Integer) 4, detalle.getPeriodos());
            }
        }
    }

    @Test
    public void testConsDescEmpDuplicado() {
        Integer idEmpleado = 270720;
        String folioPedido = "AAH55129";

        expect(mockDao.consultaEmpleadoDescto(idEmpleado, folioPedido)).andReturn(descuentosPedidoDuplicado).once();

        replay(mockDao);
        DescuentosResp result = service.consDescEmp(idEmpleado, folioPedido);
        verify(mockDao);

        assertNotNull(result);
        assertEquals((Integer) 0, result.getCodigo());
        assertEquals(2, result.getEmpleadoDesctos().size());
        for (PedidoEnDescuentoDto pedido : result.getEmpleadoDesctos()) {
            for (DetallePedidoEnDesctoDto detalle : pedido.getDetalle()) {
                assertNotNull(detalle.getNumPago());
                assertEquals((Integer) 13, detalle.getPeriodos());
            }
        }
    }
}
