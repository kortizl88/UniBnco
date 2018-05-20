package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Config.ConfiguraAccesos;
import Com.Elektra.Uniformes.Dto.PedidosPendientesDto;
import Com.Elektra.Uniformes.Dto.PendienteRegionalDto;
import Com.Elektra.Uniformes.Dto.ResultWrapper;
import Com.Elektra.Uniformes.map.EntregaMap;
import Com.Elektra.Uniformes.map.PedidosPendientesRSE;
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

@Repository
public class PedidosPendientesDao {

    private EntregaMap map;

    private final SimpleJdbcCall fnObtienePedidosPendientes;

    @Autowired
    public PedidosPendientesDao(DataSource dataSource) {
        fnObtienePedidosPendientes = new SimpleJdbcCall(dataSource)
                .withSchemaName(ConfiguraAccesos.SCHEMA)
                .withCatalogName(ConfiguraAccesos.PACKAGE)
                .withFunctionName(ConfiguraAccesos.FNOBTIENEPEDIDOSPENDIENTES)
                .withoutProcedureColumnMetaDataAccess()
                .declareParameters(
                        new SqlOutParameter("curDatos", OracleTypes.CURSOR, new PedidosPendientesRSE()),
                        new SqlParameter("paIdEmp", Types.INTEGER),
                        new SqlParameter("paEstatus", Types.VARCHAR)
                );
    }

    @Deprecated
    public List<PedidosPendientesDto> consPedPend(Integer idEmp, String estatus) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("paIdEmp", idEmp);
        params.addValue("paEstatus", estatus);

        return fnObtienePedidosPendientes.executeFunction(List.class, params);
    }

    @Autowired
    public void setMap(EntregaMap map) {
        this.map = map;
    }

    public List<PedidosPendientesDto> consultaPendientesEntrega(Integer numEmpGerente) {
        ResultWrapper<PedidosPendientesDto> resultWrapper = new ResultWrapper<PedidosPendientesDto>();
        map.consultaPendientesEntrega(numEmpGerente, resultWrapper);
        return resultWrapper.getList();
    }

    public List<PendienteRegionalDto> consultaPendientesEntregaRegional(Integer numEmpGerente) {
        ResultWrapper<PendienteRegionalDto> resultWrapper = new ResultWrapper<PendienteRegionalDto>();
        map.consultaPendientesEntregaRegional(numEmpGerente, resultWrapper);
        return resultWrapper.getList();
    }
}
