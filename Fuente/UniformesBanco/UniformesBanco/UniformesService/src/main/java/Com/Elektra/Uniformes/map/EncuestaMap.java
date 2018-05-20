package Com.Elektra.Uniformes.map;

import Com.Elektra.Uniformes.Dto.EncuestaDto;
import Com.Elektra.Uniformes.Dto.ResultWrapper;
import org.apache.ibatis.annotations.Param;

public interface EncuestaMap {
    void consultaEncuestaPendiente(
            @Param("result") ResultWrapper<EncuestaDto> result,
            @Param("idEmpleado") Integer idEmpleado
    );

    Integer guardaRespuesta(
            @Param("idEmpleado") Integer idEmpleado,
            @Param("idEncuesta") Integer idEncuesta,
            @Param("idPregunta") Integer idPregunta,
            @Param("idRespuesta") Integer idRespuesta
    );

    Integer finalizaEncuesta(EncuestaDto encuesta);
}
