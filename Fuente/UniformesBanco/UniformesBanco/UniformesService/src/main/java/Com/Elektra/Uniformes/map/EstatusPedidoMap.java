package Com.Elektra.Uniformes.map;

import Com.Elektra.Uniformes.Dto.EstatusPedidoDto;
import Com.Elektra.Uniformes.Dto.FolioDto;
import Com.Elektra.Uniformes.Dto.ResultWrapper;
import org.apache.ibatis.annotations.Param;

public interface EstatusPedidoMap {
    void consultaFolio(EstatusPedidoDto dto);

    void historialFolios(
            @Param("idEmpleado") Integer idEmpleado,
            @Param("result") ResultWrapper<FolioDto> resultWrapper);
}
