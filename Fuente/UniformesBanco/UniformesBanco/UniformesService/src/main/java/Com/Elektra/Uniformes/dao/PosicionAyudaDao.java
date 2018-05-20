package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Config.ConfiguraAccesos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.Map;

@Repository
public class PosicionAyudaDao {

    private final SimpleJdbcCall spObtienePosicionAyuda;

    @Autowired
    public PosicionAyudaDao(DataSource dataSource) {
        spObtienePosicionAyuda = new SimpleJdbcCall(dataSource)
                .withSchemaName(ConfiguraAccesos.SCHEMA)
                .withCatalogName(ConfiguraAccesos.PACKAGE)
                .withProcedureName(ConfiguraAccesos.SP_OBTIENE_POSICION_AYUDA)
                .declareParameters(
                        new SqlParameter("paIdEmp", Types.INTEGER),
                        new SqlOutParameter("paRet", Types.VARCHAR)
                );
    }


    public String consultaPosicionAyuda(Integer empleadoNum) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("paIdEmp", empleadoNum);

        Map<String, Object> resultMap = spObtienePosicionAyuda.execute(params);
        return (String) resultMap.get("paRet");
    }
}
