package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Config.ConfiguraAccesos;
import Com.Elektra.Uniformes.Dto.DatosPedidoDto;
import Com.Elektra.Uniformes.Dto.UniInventarioCSku;
import Com.Elektra.Uniformes.map.SkuMapper;
import oracle.jdbc.OracleTypes;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;
import java.util.Map;

@Repository
public class DescargaPedidoDao {

    private final SimpleJdbcCall spObtieneSku;
    private final SimpleJdbcCall spRecogePedido;

    @Autowired
    public DescargaPedidoDao(DataSource dataSource) {
        spObtieneSku = new SimpleJdbcCall(dataSource)
                .withSchemaName(ConfiguraAccesos.SCHEMA)
                .withCatalogName(ConfiguraAccesos.PACKAGE)
                .withProcedureName(ConfiguraAccesos.SPOBTIENESKU)
                .declareParameters(
                        new SqlParameter("paNumEmpleado", Types.INTEGER),
                        new SqlParameter("paFolioPedido", Types.VARCHAR),
                        new SqlParameter("paNoPedido", Types.INTEGER),
                        new SqlParameter("paNoTienda", Types.INTEGER),
                        new SqlOutParameter("paCurDatos", OracleTypes.CURSOR, new SkuMapper()),
                        new SqlOutParameter("paIPTienda", Types.VARCHAR)
                );
        spRecogePedido = new SimpleJdbcCall(dataSource)
                .withSchemaName(ConfiguraAccesos.SCHEMA)
                .withCatalogName(ConfiguraAccesos.PACKAGE)
                .withProcedureName(ConfiguraAccesos.SPRECOGEPEDIDO)
                .declareParameters(
                        new SqlParameter("paNumEmpleado", Types.INTEGER),
                        new SqlParameter("paIdEmpCaptura", Types.INTEGER),
                        new SqlParameter("paFolioPedido", Types.VARCHAR),
                        new SqlParameter("paNoPedido", Types.INTEGER),
                        new SqlParameter("paNoTienda", Types.INTEGER),
                        new SqlParameter("paDistrital", Types.INTEGER)
                );
    }

    public UniInventarioCSku selectSKUPedido(DatosPedidoDto datosPedido) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("paNumEmpleado", datosPedido.getNumEmpleado());
        params.addValue("paFolioPedido", datosPedido.getFolioPedido());
        params.addValue("paNoPedido", datosPedido.getNoPedido());
        params.addValue("paNoTienda", datosPedido.getNoTienda());

        Map<String, Object> resultMap = spObtieneSku.execute(params);
        List<Integer> skus = (List<Integer>) resultMap.get("paCurDatos");
        String ipTienda = StringUtils.trim((String) resultMap.get("paIPTienda"));
        return new UniInventarioCSku(skus, ipTienda);

    }

    public void updatePrimeraHuella(DatosPedidoDto datosPedido, Integer idEmpGerente, Integer idDist) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("paNumEmpleado", datosPedido.getNumEmpleado());
        params.addValue("paIdEmpCaptura", idEmpGerente);
        params.addValue("paFolioPedido", datosPedido.getFolioPedido());
        params.addValue("paNoPedido", datosPedido.getNoPedido());
        params.addValue("paNoTienda", datosPedido.getNoTienda());
        params.addValue("paDistrital", idDist);

        spRecogePedido.execute(params);

    }

}
