package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.AutorizanteDto;
import Com.Elektra.Uniformes.Dto.ReposicionDto;
import Com.Elektra.Uniformes.Dto.ResultWrapper;
import Com.Elektra.Uniformes.map.ReposicionesMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReposicionesDao {

    private ReposicionesMap map;

    @Autowired
    public void setMap(ReposicionesMap map) {
        this.map = map;
    }

    public Integer insertaReposicion(ReposicionDto reposicion) {
        map.insertaReposicion(reposicion);
        return reposicion.getFolioReposicion();
    }

    public ReposicionDto consultaReposicion(Integer idEmpleado, Integer idSubkit) {
        ResultWrapper<ReposicionDto> result = new ResultWrapper<ReposicionDto>();
        map.consultaReposicion(idEmpleado, idSubkit, result);
        if (result.getList().isEmpty()) {
            return null;
        }
        return result.getList().get(0);
    }

    public List<ReposicionDto> consultaReposiciones(Integer idEmpleado) {
        ResultWrapper<ReposicionDto> result = new ResultWrapper<ReposicionDto>();
        map.consultaReposiciones(idEmpleado, result);
        return result.getList();
    }

    public List<AutorizanteDto> consultaCorreoAutorizantes(Integer idEmpleado) {
        ResultWrapper<AutorizanteDto> result = new ResultWrapper<AutorizanteDto>();
        map.consultaCorreoAutorizantes(idEmpleado, result);
        return result.getList();
    }

    public Integer confirmaNotificacion(Integer idReposicion) {
        return map.confirmaReposicion(idReposicion);
    }
}