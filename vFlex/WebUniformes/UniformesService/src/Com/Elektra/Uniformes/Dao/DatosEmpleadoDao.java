package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Config.ConfiguraAccesos;
import Com.Elektra.Uniformes.Dto.CanalDto;
import Com.Elektra.Uniformes.Dto.CargaActivaDto;
import Com.Elektra.Uniformes.Dto.DatosEmpleadoDto;
import Com.Elektra.Uniformes.map.CanalMapper;
import Com.Elektra.Uniformes.map.DatosEmpleadoMap;
import oracle.jdbc.OracleTypes;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Repository
public class DatosEmpleadoDao {

    private final SimpleJdbcCall fnConsultaEmpleado;

    private DatosEmpleadoMap map;

    @Autowired
    public void setMap(DatosEmpleadoMap map) {
        this.map = map;
    }

    @Autowired
    public DatosEmpleadoDao(DataSource dataSource) {
        fnConsultaEmpleado = new SimpleJdbcCall(dataSource)
                .withSchemaName(ConfiguraAccesos.SCHEMA)
                .withCatalogName(ConfiguraAccesos.PACKAGE)
                .withProcedureName(ConfiguraAccesos.SPOBTIENEDATOSEMPLEADO)
                .declareParameters(
                        new SqlParameter("paEmpleadoNum", Types.INTEGER),
                        new SqlOutParameter("paFuncionNum", Types.INTEGER),
                        new SqlOutParameter("paSexo", Types.INTEGER),
                        new SqlOutParameter("paEmpleadoNombre", Types.VARCHAR),
                        new SqlOutParameter("paFcPosicionDesc", Types.VARCHAR),
                        new SqlOutParameter("paCount", Types.INTEGER),
                        new SqlOutParameter("paCanal", OracleTypes.CURSOR, new CanalMapper()),
                        new SqlOutParameter("paIdPais", Types.INTEGER),
                        new SqlOutParameter("paManualDeImagen", Types.VARCHAR),
                        new SqlOutParameter("paMensajes", Types.VARCHAR)
                );
    }

    public DatosEmpleadoDto consultaDatosEmpleado(Integer empleadoNum) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("paEmpleadoNum", empleadoNum);
        Map<String, Object> resultMap = fnConsultaEmpleado.execute(params);
        DatosEmpleadoDto datosEmpleado = new DatosEmpleadoDto();
        datosEmpleado.setFiEmpleadoNum(empleadoNum);
        datosEmpleado.setFnFuncionNum((Integer) resultMap.get("paFuncionNum"));
        datosEmpleado.setSexo((Integer) resultMap.get("paSexo"));
        datosEmpleado.setFcEmpleadoNombre(StringUtils.trim((String) resultMap.get("paEmpleadoNombre")));
        datosEmpleado.setFcPosicionDesc(StringUtils.trim((String) resultMap.get("paFcPosicionDesc")));
        datosEmpleado.setCanal((List<CanalDto>) resultMap.get("paCanal"));
        datosEmpleado.setPais((Integer) resultMap.get("paIdPais"));
        List<String> manualDeImagen = parsearManualImagen((String) resultMap.get("paManualDeImagen"));
        datosEmpleado.setManualDeImagen(manualDeImagen);
        datosEmpleado.setFlagEntrega(validaFuncionEntrega(datosEmpleado.getFnFuncionNum()));
        datosEmpleado.setFlagTracking(validaTracking(datosEmpleado.getFnFuncionNum()));
        datosEmpleado.setMensajesInicio(parsearMensajes((String) resultMap.get("paMensajes")));
        return datosEmpleado;
    }


    private List<String> parsearMensajes(String paMensajes) {
        if (paMensajes == null) {
            return null;
        } else {
            return Arrays.asList(paMensajes.split(","));
        }

    }

    private Boolean validaFuncionEntrega(Integer fnFuncionNum) {
        return ArrayUtils.indexOf(ConfiguraAccesos.FUNCIONES_ENTREGA.split(","), fnFuncionNum.toString()) != -1;
    }

    private Boolean validaTracking(Integer fnFuncionNum) {
        return ArrayUtils.indexOf(ConfiguraAccesos.FUNCIONES_TRACKING.split(","), fnFuncionNum.toString()) != -1;
    }
    private List<String> parsearManualImagen(String paManualDeImagen) {
        if (paManualDeImagen == null) {
            return null;
        }
        List<String> diapositivas = new ArrayList<String>();
        String[] splited = paManualDeImagen.split("\\|");
        String nombreArchivo = splited[0];
        Integer cant = Integer.parseInt(splited[1]);
        for (int i = 1; i <= cant; i++) {
            diapositivas.add(String.format(nombreArchivo, i));
        }
        return diapositivas;
    }

    public CargaActivaDto consultaCargaActiva(Integer idEmpleado, Integer idCia, Integer idFuncion) {
        CargaActivaDto result = new CargaActivaDto();
        map.consultaCargaActiva(idEmpleado, idCia, idFuncion, result);
        return result;
    }

}
