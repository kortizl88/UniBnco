package Com.Elektra.Uniformes.map;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SkuMapper implements RowMapper<Integer> {
    public Integer mapRow(ResultSet resultSet, int i) throws SQLException {
        return resultSet.getInt("SKU");
    }
}
