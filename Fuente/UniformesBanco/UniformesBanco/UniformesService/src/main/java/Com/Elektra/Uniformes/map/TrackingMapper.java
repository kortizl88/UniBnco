package Com.Elektra.Uniformes.map;

import Com.Elektra.Uniformes.Dto.DatosTrackingDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TrackingMapper implements RowMapper<DatosTrackingDto> {
    public DatosTrackingDto mapRow(ResultSet resultSet, int i) throws SQLException {
        DatosTrackingDto dto = new DatosTrackingDto();
        dto.setIdEmpleado(resultSet.getInt("ID_EMPLEADO"));
        dto.setNombreEmpleado(resultSet.getString("FCEMPLEADONOMBRE"));
        dto.setIdFuncion(resultSet.getInt("FIFUNCIONNUM"));
        dto.setDescripcionPuesto(resultSet.getString("FCPOSICIONDESC"));
        dto.setCentroDeCostos(resultSet.getInt("FICENCOSNUM"));
        dto.setNombreCC(resultSet.getString("NOMBRE"));
        dto.setPedido(resultSet.getInt("NO_PEDIDO"));
        dto.setEstatus(resultSet.getString("ESTATUS"));
        dto.setIdTienda(resultSet.getInt("NO_TIENDA"));
        dto.setNombreTienda(resultSet.getString("NOMBRETIENDA"));
        dto.setSku(resultSet.getInt("SKU"));
        dto.setDescripcionSku(resultSet.getString("DESC_SKU"));
        dto.setCantidad(resultSet.getInt("PIEZAS"));
        dto.setFechaSolicitud(resultSet.getDate("FECHASOLICITUD"));
        dto.setRemision(resultSet.getInt("NO_REMISION"));
        dto.setFechaRemision(resultSet.getDate("FECHAREMISION"));
        dto.setFechaEntrega(resultSet.getDate("FECHAENTREGA"));
        return dto;
    }
}