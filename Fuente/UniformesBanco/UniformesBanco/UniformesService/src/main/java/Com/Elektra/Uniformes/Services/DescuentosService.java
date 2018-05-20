package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Dao.EmpleadoDesctoDao;
import Com.Elektra.Uniformes.Dto.DetallePedidoEnDesctoDto;
import Com.Elektra.Uniformes.Dto.EmpleadoDesctoDto;
import Com.Elektra.Uniformes.Dto.PedidoEnDescuentoDto;
import Com.Elektra.Uniformes.Services.resp.DescuentosResp;
import Com.Elektra.Uniformes.Services.resp.FoliosResp;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service("descuentoEmpleado")
public class DescuentosService {

    private static final Logger LOGGER = Logger.getLogger(DescuentosService.class);

    private final EmpleadoDesctoDao dao;

    @Autowired
    public DescuentosService(EmpleadoDesctoDao dao) {
        this.dao = dao;
    }

    public FoliosResp consultaFolio(Integer idEmp) {
        FoliosResp resp = new FoliosResp();
        try {
            resp.setFolios(dao.getFolios(idEmp));
            resp.setCodigo(0);
        } catch (Exception e) {
            LOGGER.error("Error al consultar los folios del empleado " + idEmp, e);
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("Se presentó un error al consultar los folios. Favor de contactar a Soporte Técnico.");
            resp.setDetalleTecnico(e.toString());
        }
        return resp;

    }

    public DescuentosResp consDescEmp(Integer idEmp, String folioPed) {
        DescuentosResp descEmp = new DescuentosResp();
        try {
            descEmp.setEmpleadoDesctos(getPedidosEnDescuento(idEmp, folioPed));
            descEmp.setCodigo(0);
            return descEmp;

        } catch (Exception e) {
            LOGGER.error("Error al consultar los descuentos del folio " + folioPed, e);
            descEmp.setCodigo(-1);
            descEmp.setDescripcionOperacion("Se presentó un error al consultar los descuentos. Favor de contactar a Soporte Técnico.");
            descEmp.setDetalleTecnico(e.toString());
            return descEmp;
        }
    }

    private List<PedidoEnDescuentoDto> getPedidosEnDescuento(Integer idEmp, String folioPed) throws SQLException {
        List<EmpleadoDesctoDto> descuentos = dao.consultaEmpleadoDescto(idEmp, folioPed);
        Map<String, List<EmpleadoDesctoDto>> mapDesctos = buildMapDescuentos(descuentos);
        List<PedidoEnDescuentoDto> pedidosEnDescuento = buildPedidosEnDescuento(mapDesctos);
        return pedidosEnDescuento;
    }

    private Map<String, List<EmpleadoDesctoDto>> buildMapDescuentos(
            List<EmpleadoDesctoDto> descuentos) {
        Map<String, List<EmpleadoDesctoDto>> mapDesctos = new LinkedHashMap<String, List<EmpleadoDesctoDto>>();

        for (EmpleadoDesctoDto current : descuentos) {
            Pattern pattern = Pattern.compile("([A-Z]{3}[0-9]{5}(-[0-9]+-[0-9]+)?).*");
            Matcher matcher = pattern.matcher(current.getRefe());
            String ref;
            if (matcher.matches()) {
                ref = matcher.group(1);
            } else {
                throw new RuntimeException("Referencia no valida. REFE:" + current.getRefe());
            }

            if (!mapDesctos.containsKey(ref)) {
                mapDesctos.put(ref,
                        new ArrayList<EmpleadoDesctoDto>());
            }
            mapDesctos.get(ref).add(current);
        }
        return mapDesctos;
    }

    private List<PedidoEnDescuentoDto> buildPedidosEnDescuento(
            Map<String, List<EmpleadoDesctoDto>> mapDesctos) {
        List<PedidoEnDescuentoDto> pedidos = new ArrayList<PedidoEnDescuentoDto>();
        for (String key : mapDesctos.keySet()) {
            List<EmpleadoDesctoDto> descuentos = mapDesctos.get(key);
            PedidoEnDescuentoDto pedido = new PedidoEnDescuentoDto();
            List<DetallePedidoEnDesctoDto> lsDetPedDesc = new ArrayList<DetallePedidoEnDesctoDto>();
            pedido.setTotal(descuentos.get(0).getTotdesc());
            if (key.contains("-")) {
                pedido.setRefPedido(key.split("-")[1]);
            } else {
                pedido.setRefPedido(key.substring(0, 8));
            }
            Integer periodos;
            if (descuentos.get(descuentos.size() - 1).getSaldo().equals(BigDecimal.ZERO)) {
                periodos = descuentos.size();
            } else {
                periodos = Math.max(descuentos.get(0).getPeriodos(), descuentos.size());
            }
            Integer numPago = 1;
            BigDecimal ultimoSaldo = descuentos.get(0).getTotdesc();
            for (EmpleadoDesctoDto desctoSap : descuentos) {
                DetallePedidoEnDesctoDto detalle = new DetallePedidoEnDesctoDto();
                detalle.setAnio(desctoSap.getAniodescto());
                detalle.setSemana(desctoSap.getSemdescto());
                detalle.setFecha(desctoSap.getFecpago());
                BigDecimal pago = desctoSap.getPago().equals(BigDecimal.ZERO) ? calculaPago(descuentos, desctoSap, ultimoSaldo) : desctoSap.getPago();
                if (pago.equals(BigDecimal.ZERO)) {
                    continue;
                }
                detalle.setDescuento(pago);
                detalle.setPeriodos(periodos);
                detalle.setNumPago(numPago++);
                ultimoSaldo = desctoSap.getSaldo();
                lsDetPedDesc.add(detalle);
            }
            pedido.setDescGral(descuentos.get(0).getDescGral());
            pedido.setDetalle(lsDetPedDesc
                    .toArray(new DetallePedidoEnDesctoDto[lsDetPedDesc.size()]));
            pedido.setPagado(pedido.getTotal().subtract(ultimoSaldo));
            pedido.setPorPagar(ultimoSaldo);
            pedidos.add(pedido);
        }

        return pedidos;
    }

    private BigDecimal calculaPago(List<EmpleadoDesctoDto> descuentos, EmpleadoDesctoDto desctoSap, BigDecimal ultimoSaldo) {
        if (desctoSap.getSaldo().equals(BigDecimal.ZERO)
                && !esUltimoDescuento(descuentos, desctoSap)) {
            return BigDecimal.ZERO;
        } else {
            return ultimoSaldo.subtract(desctoSap.getSaldo());
        }
    }

    boolean esUltimoDescuento(List<EmpleadoDesctoDto> descuentos,
                              EmpleadoDesctoDto desctoSap) {
        Integer index = descuentos.indexOf(desctoSap);
        return index == descuentos.size() - 1;
    }


}
