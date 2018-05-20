package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.ResultWrapper;
import Com.Elektra.Uniformes.map.ConfiguracionMap;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ConfiguracionDao {

    private final ConfiguracionMap map;

    @Autowired
    public ConfiguracionDao(ConfiguracionMap map) {
        this.map = map;
    }


    public Map<String, String> obtenerConfiguracion(Integer idSucursal, Integer idCanal, Integer idPais) {
        ResultWrapper<Pair<String, String>> result = new ResultWrapper<Pair<String, String>>();
        map.consultaConfiguracion(idSucursal, idCanal, idPais, result);
        Map<String, String> resultMap = new HashMap<String, String>();
        for (Pair<String, String> entry : result.getList()) {
            resultMap.put(entry.getLeft(), entry.getRight());
        }
        return resultMap;
    }
}
