package Com.Elektra.Uniformes.map;

import Com.Elektra.Uniformes.Dto.CargaActivaDto;
import org.apache.ibatis.annotations.Param;

public interface DatosEmpleadoMap {
    void consultaCargaActiva(
            @Param("idEmpleado") Integer idEmpleado,
            @Param("idNegocio") Integer idNegocio,
            @Param("idFuncion") Integer idFuncion,
            @Param("result") CargaActivaDto result);
}
