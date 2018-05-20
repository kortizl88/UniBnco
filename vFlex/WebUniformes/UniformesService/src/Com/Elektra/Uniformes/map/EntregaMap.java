package Com.Elektra.Uniformes.map;

import Com.Elektra.Uniformes.Dto.PedidosPendientesDto;
import Com.Elektra.Uniformes.Dto.PendienteRegionalDto;
import Com.Elektra.Uniformes.Dto.ResultWrapper;
import org.apache.ibatis.annotations.Param;

public interface EntregaMap {
    void consultaPendientesEntrega(
            @Param("numEmpGerente") Integer numEmpGerente,
            @Param("result") ResultWrapper<PedidosPendientesDto> resultWrapper);

    void consultaPendientesEntregaRegional(
            @Param("numEmpGerente") Integer numEmpGerente,
            @Param("result") ResultWrapper<PendienteRegionalDto> resultWrapper);

}
