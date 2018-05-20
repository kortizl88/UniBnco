package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Config.ConfiguraAccesos;
import Com.Elektra.Uniformes.Dto.SucursalesDto;
import Com.Elektra.Uniformes.Dto.TiendaDto;
import Com.Elektra.Uniformes.map.TiendaMapper;
import oracle.jdbc.OracleTypes;
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
public class SucursalesDao {

    private final SimpleJdbcCall spObtieneTiendas;

    @Autowired
    public SucursalesDao(DataSource dataSource) {
        spObtieneTiendas = new SimpleJdbcCall(dataSource)
                .withSchemaName(ConfiguraAccesos.SCHEMA)
                .withCatalogName(ConfiguraAccesos.PACKAGE)
                .withProcedureName(ConfiguraAccesos.SPOBTIENETIENDAS)
                .declareParameters(
                        new SqlParameter("paIdEmpleado", Types.INTEGER),
                        new SqlParameter("paNegocio", Types.INTEGER),
                        new SqlOutParameter("paTodasLasSucur", OracleTypes.CURSOR, new TiendaMapper()),
                        new SqlOutParameter("paSucurPorEmp", OracleTypes.CURSOR, new TiendaMapper())
                );
    }


    public SucursalesDto consultaSucursales(Integer idEmpleado, Integer idCia) throws Exception {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("paIdEmpleado", idEmpleado);
        params.addValue("paNegocio", idCia);

        Map<String, Object> resultMap = spObtieneTiendas.execute(params);
        List<TiendaDto> todasLasSucursales = (List<TiendaDto>) resultMap.get("paTodasLasSucur");
        List<TiendaDto> sucursalPorEmpleado = (List<TiendaDto>) resultMap.get("paSucurPorEmp");

        SucursalesDto sucursales = new SucursalesDto();
        sucursales.setSucursalPorEmpleado(sucursalPorEmpleado);
        sucursales.setTodasLasSucursales(todasLasSucursales);

        return sucursales;

    }

}
