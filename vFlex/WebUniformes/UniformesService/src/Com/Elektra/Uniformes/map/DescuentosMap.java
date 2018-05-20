package Com.Elektra.Uniformes.map;

import Com.Elektra.Uniformes.Dto.EmpleadoDesctoDto;
import Com.Elektra.Uniformes.Dto.FolioDto;
import Com.Elektra.Uniformes.Dto.ResultWrapper;
import org.apache.ibatis.annotations.Param;

public interface DescuentosMap {
    void consultaEmpleadoDescto(
            @Param("result") ResultWrapper<EmpleadoDesctoDto> result,
            @Param("idEmpleado") Integer idEmpleado,
            @Param("folioPedido") String folioPedido
    );

    void getFolios(
            @Param("result") ResultWrapper<FolioDto> result,
            @Param("idEmpleado") Integer idEmpleado
    );
}
