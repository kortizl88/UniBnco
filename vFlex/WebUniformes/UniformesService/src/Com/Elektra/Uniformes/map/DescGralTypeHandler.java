package Com.Elektra.Uniformes.map;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;

@MappedJdbcTypes(JdbcType.VARCHAR)
public class DescGralTypeHandler extends BaseTypeHandler<String> {

    private static String getDescripcion(String descripcion) {
        descripcion = descripcion.trim();
        descripcion = descripcion.toUpperCase();
        StringTokenizer descPlural = new StringTokenizer(descripcion);
        String desc = descPlural.nextToken();
        int longDescPlural = desc.length();
        if (desc.charAt(longDescPlural - 1) == 'A' ||
                desc.charAt(longDescPlural - 1) == 'E' ||
                desc.charAt(longDescPlural - 1) == 'I' ||
                desc.charAt(longDescPlural - 1) == 'O' ||
                desc.charAt(longDescPlural - 1) == 'U') {
            desc += "S";
        } else {
            if (desc.charAt(longDescPlural - 1) == 'N') {
                desc += "ES";
            }
        }
        return desc;
    }

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, String s, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, s);
    }

    @Override
    public String getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return getDescripcion(resultSet.getString(s));
    }

    @Override
    public String getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return getDescripcion(resultSet.getString(i));
    }

    @Override
    public String getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return getDescripcion(callableStatement.getString(i));
    }
}
