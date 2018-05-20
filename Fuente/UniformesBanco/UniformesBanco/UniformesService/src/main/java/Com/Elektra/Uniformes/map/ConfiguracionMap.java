package Com.Elektra.Uniformes.map;

import Com.Elektra.Uniformes.Dto.ResultWrapper;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.ibatis.annotations.Param;

public interface ConfiguracionMap {

    void consultaConfiguracion(
            @Param("idSucursal") Integer idSucursal,
            @Param("idCanal") Integer idCanal,
            @Param("idPais") Integer idPais,
            @Param("result") ResultWrapper<Pair<String, String>> result
    );
}
