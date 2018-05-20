package Com.Elektra.Uniformes.map;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@MappedJdbcTypes(JdbcType.VARCHAR)
public class DescrCortaTypeHandler extends BaseTypeHandler<String> {

    private static final Pattern pattern = Pattern.compile("(\\w+).*");

    private static String getDescripcionCorta(String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, String s, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, s);
    }

    @Override
    public String getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return getDescripcionCorta(resultSet.getString(s));
    }

    @Override
    public String getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return getDescripcionCorta(resultSet.getString(i));
    }

    @Override
    public String getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return getDescripcionCorta(callableStatement.getString(i));
    }
}
