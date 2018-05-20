package Com.Elektra.Uniformes.map;

import Com.Elektra.Uniformes.Dto.DetallePedidoPorEntregarDto;
import Com.Elektra.Uniformes.Dto.PedidosPendientesDto;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PedidosPendientesRSE implements ResultSetExtractor<List<PedidosPendientesDto>> {

    public List<PedidosPendientesDto> extractData(ResultSet rs) throws SQLException, DataAccessException {
        List<PedidosPendientesDto> listPedidos = new ArrayList<PedidosPendientesDto>();
        Map<String, PedidosPendientesDto> pedidosMap = new HashMap<String, PedidosPendientesDto>();
        while (rs.next()) {
            String folioPedido = rs.getString("FOLIO_PEDIDO");
            if (!pedidosMap.containsKey(folioPedido)) {
                PedidosPendientesDto dto = new PedidosPendientesDto();
                dto.setFolioPedido(folioPedido);
                dto.setCencosNum(rs.getInt("FCCENCOS_NUM"));
                dto.setClave(rs.getString("CLAVE"));
                dto.setDescFuncion(rs.getString("DESCRIPCION"));
                dto.setEmpleadoNombre(rs.getString("NOMBRE_EMP"));
                dto.setIdEmpelado(rs.getInt("ID_EMPLEADO"));
                dto.setNumEmpDistrital(rs.getInt("NUM_EMP_DISTRITAL"));
                dto.setFcEmpleadoNombre(rs.getString("NOMBRE_DIST"));
                dto.setDetalle(new ArrayList<DetallePedidoPorEntregarDto>());
                pedidosMap.put(folioPedido, dto);
            }
            DetallePedidoPorEntregarDto detalle = new DetallePedidoPorEntregarDto();
            detalle.setFolioPedido(rs.getString("FOLIO_PEDIDO"));
            detalle.setDescSKU(rs.getString("DESC_SKU"));
            detalle.setFechaRemision(rs.getDate("FECHA_REMISION"));
            detalle.setNoPedido(rs.getInt("NO_PEDIDO"));
            detalle.setNoTienda(rs.getInt("NO_TIENDA"));
            detalle.setNoRemision(rs.getInt("NO_REMISION"));
            detalle.setSKU(rs.getString("SKU"));
            detalle.setTotSKU(rs.getInt("TOTSKU"));
            pedidosMap.get(folioPedido).getDetalle().add(detalle);
        }
        listPedidos.addAll(pedidosMap.values());
        return listPedidos;
    }
}
