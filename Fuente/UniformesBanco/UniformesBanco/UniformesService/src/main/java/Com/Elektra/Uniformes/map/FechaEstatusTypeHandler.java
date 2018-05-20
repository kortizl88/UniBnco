package Com.Elektra.Uniformes.map;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;


public class FechaEstatusTypeHandler extends BaseTypeHandler<Date> {

    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Date date, JdbcType jdbcType) throws SQLException {
        throw new UnsupportedOperationException("Type handler creado para mapear resultado. No para enviar parámetros");
    }

    public Date getNullableResult(ResultSet resultSet, String s) throws SQLException {
        Integer idEstatus = resultSet.getInt("ID_ESTATUS");
        return getEstatusDate(resultSet, idEstatus);
    }

    public Date getNullableResult(ResultSet resultSet, int i) throws SQLException {
        Integer idEstatus = resultSet.getInt("ID_ESTATUS");
        return getEstatusDate(resultSet, idEstatus);
    }

    public Date getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        Integer idEstatus = callableStatement.getInt("ID_ESTATUS");
        return getEstatusDate(callableStatement.getResultSet(), idEstatus);
    }

    private Date getEstatusDate(ResultSet resultSet, Integer idEstatus) throws SQLException {
        Date result;
        switch (idEstatus) {
            case 1:
                result = resultSet.getDate("FECHA");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                result = resultSet.getDate("FDFECMOV");
                break;
            case 7:
            case 8:
                result = resultSet.getDate("FECHA_REMISION");
                break;

            case 9:
                result = resultSet.getDate("FECHA_PHUELLA");
                break;

            default:
                result = resultSet.getDate("FECHA_CANCELACION");
                break;
        }
        return result;
    }
}
