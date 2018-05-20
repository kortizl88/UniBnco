package Com.Elektra.Uniformes.map;

import Com.Elektra.Uniformes.Dto.AutorizanteDto;
import Com.Elektra.Uniformes.Dto.ReposicionDto;
import Com.Elektra.Uniformes.Dto.ResultWrapper;
import org.apache.ibatis.annotations.Param;

public interface ReposicionesMap {
    void consultaCorreoAutorizantes(
            @Param("idEmpleado") Integer idEmpleado,
            @Param("result") ResultWrapper<AutorizanteDto> result);

    void consultaReposicion(
            @Param("idEmpleado") Integer idEmpleado,
            @Param("idSubkit") Integer idSubkit,
            @Param("result") ResultWrapper<ReposicionDto> result);

    void consultaReposiciones(
            @Param("idEmpleado") Integer idEmpleado,
            @Param("result") ResultWrapper<ReposicionDto> result
    );

    void insertaReposicion(ReposicionDto reposicion);

    Integer confirmaReposicion(@Param("idReposicion") Integer idReposicion);
}
