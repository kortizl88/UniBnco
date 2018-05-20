package Com.Elektra.Uniformes.map;

import Com.Elektra.Uniformes.Dto.TiendaDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TiendaMapper implements RowMapper<TiendaDto> {
    public TiendaDto mapRow(ResultSet rs, int i) throws SQLException {
        TiendaDto tienda = new TiendaDto();
        tienda.setNum(rs.getInt("NUMECO"));
        tienda.setNombre(rs.getString("NOMBRE"));
        return tienda;
    }
}
