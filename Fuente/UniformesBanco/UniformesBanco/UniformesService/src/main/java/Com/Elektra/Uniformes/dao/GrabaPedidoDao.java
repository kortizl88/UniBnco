package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Config.ConfiguraAccesos;
import Com.Elektra.Uniformes.Dto.SolicitudDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.sql.Types;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class GrabaPedidoDao {

    private final SimpleJdbcCall spActualizaMsgAbasto;
    private final SimpleJdbcCall spConsultaIpTienda;
    private final SimpleJdbcCall spGrabaSolicitud;
    private final SimpleJdbcCall spValidaPrendas;
    private final SimpleJdbcCall fnObtieneFolio;

    @Autowired
    public GrabaPedidoDao(DataSource dataSource) {
        spActualizaMsgAbasto = new SimpleJdbcCall(dataSource)
                .withSchemaName(ConfiguraAccesos.SCHEMA)
                .withCatalogName(ConfiguraAccesos.PACKAGE)
                .withProcedureName(ConfiguraAccesos.SPACTUALIZAMSGABASTO)
                .declareParameters(
                        new SqlParameter("paIdEmpleado", Types.INTEGER),
                        new SqlParameter("paNoTienda", Types.INTEGER),
                        new SqlParameter("paNoPedido", Types.INTEGER),
                        new SqlParameter("paSKU", Types.INTEGER),
                        new SqlParameter("paMensajeAbasto", Types.VARCHAR),
                        new SqlOutParameter("paCount", Types.INTEGER));
        spConsultaIpTienda = new SimpleJdbcCall(dataSource)
                .withSchemaName(ConfiguraAccesos.SCHEMA)
                .withCatalogName(ConfiguraAccesos.PACKAGE)
                .withProcedureName(ConfiguraAccesos.SPCONSULTAIPTIENDA)
                .declareParameters(
                        new SqlParameter("paSucursal", Types.INTEGER),
                        new SqlOutParameter("paIpTienda", Types.VARCHAR));
        spGrabaSolicitud = new SimpleJdbcCall(dataSource)
                .withSchemaName(ConfiguraAccesos.SCHEMA)
                .withCatalogName(ConfiguraAccesos.PACKAGE)
                .withProcedureName(ConfiguraAccesos.SPSOLINSPED)
                .declareParameters(
                        new SqlParameter("paIdEmpleado", Types.INTEGER),
                        new SqlParameter("paSKU", Types.INTEGER),
                        new SqlParameter("paNoPedido", Types.INTEGER),
                        new SqlParameter("paNoTienda", Types.INTEGER),
                        new SqlParameter("paNegocio", Types.INTEGER),
                        new SqlParameter("paPais", Types.INTEGER),
                        new SqlParameter("paFnFuncionNum", Types.INTEGER),
                        new SqlParameter("paFolioPedido", Types.VARCHAR),
                        new SqlParameter("paTipoSolicitud", Types.INTEGER),
                        new SqlOutParameter("paCount", Types.INTEGER));
        spValidaPrendas = new SimpleJdbcCall(dataSource)
                .withSchemaName(ConfiguraAccesos.SCHEMA)
                .withCatalogName(ConfiguraAccesos.PACKAGE)
                .withProcedureName(ConfiguraAccesos.SPSOLVALPED)
                .declareParameters(
                        new SqlParameter("paArraySKU", Types.VARCHAR),
                        new SqlParameter("paEmp", Types.INTEGER),
                        new SqlParameter("paIdTienda", Types.INTEGER),
                        new SqlOutParameter("paCantidad", Types.INTEGER));
        fnObtieneFolio = new SimpleJdbcCall(dataSource)
                .withSchemaName(ConfiguraAccesos.SCHEMA)
                .withCatalogName(ConfiguraAccesos.PACKAGE)
                .withFunctionName(ConfiguraAccesos.FNSOLFOLIOENTREGA)
                .withoutProcedureColumnMetaDataAccess()
                .declareParameters(new SqlOutParameter("folio", Types.VARCHAR));
    }

    public Boolean validaPrendas(List<SolicitudDto> solicitud) throws SQLException {
        StringBuilder skus = new StringBuilder();
        for (SolicitudDto item : solicitud) {
            skus.append(item.getSku().toString());
            skus.append(',');
        }
        skus.deleteCharAt(skus.lastIndexOf(","));
        Integer empleado = solicitud.get(0).getEmpleado();
        Integer tienda = solicitud.get(0).getTienda();

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("paArraySKU", skus.toString());
        params.addValue("paEmp", empleado);
        params.addValue("paIdTienda", tienda);

        Map<String, Object> result = spValidaPrendas.execute(params);
        Integer cant = (Integer) result.get("paCantidad");
        return cant.equals(0);
    }

    public Integer grabaSolicitud(String folioPedido, List<SolicitudDto> items) throws SQLException {
        Integer result = 0;
        for (SolicitudDto item : items) {
            result += insertaPedido(folioPedido, item);
        }
        return result;
    }

    private Integer insertaPedido(String folioPedido, SolicitudDto item) throws SQLException {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("paIdEmpleado", item.getEmpleado());
        params.addValue("paSKU", item.getSku());
        params.addValue("paNoPedido", item.getPedido());
        params.addValue("paNoTienda", item.getTienda());
        params.addValue("paNegocio", item.getCia());
        params.addValue("paPais", item.getPais());
        params.addValue("paFnFuncionNum", item.getFuncion());
        params.addValue("paFolioPedido", folioPedido);
        params.addValue("paTipoSolicitud", item.getTipoSolicitud());
        Map<String, Object> result = spGrabaSolicitud.execute(params);
        return (Integer) result.get("paCount");

    }

    public String consultaIpTienda(Integer tienda) throws SQLException {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("paSucursal", tienda);
        Map<String, Object> result = spConsultaIpTienda.execute(params);
        String ipTienda = (String) result.get("paIpTienda");
        return ipTienda.trim();

    }

    public String obtieneNuevoFolio() {
        return fnObtieneFolio.executeFunction(String.class, new HashMap<String, Object>());
    }

    public Integer actualizaMensajeAbasto(SolicitudDto item, String mensaje) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("paIdEmpleado", item.getEmpleado());
        params.addValue("paNoTienda", item.getTienda());
        params.addValue("paNoPedido", item.getPedido());
        params.addValue("paSKU", item.getSku());
        params.addValue("paMensajeAbasto", mensaje);
        Map<String, Object> result = spActualizaMsgAbasto.execute(params);
        return (Integer) result.get("paCount");
    }

}
