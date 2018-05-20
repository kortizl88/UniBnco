package Com.Elektra.Uniformes.map;

import Com.Elektra.Uniformes.Dto.CanalDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CanalMapper implements RowMapper<CanalDto> {
    public CanalDto mapRow(ResultSet rs, int i) throws SQLException {
        return new CanalDto(
                rs.getInt("ID"),
                rs.getString("CLAVE"),
                rs.getString("DESCRIPCION"));
    }
}
