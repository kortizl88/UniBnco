package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.EmpleadoDesctoDto;
import Com.Elektra.Uniformes.Dto.FolioDto;
import Com.Elektra.Uniformes.Dto.ResultWrapper;
import Com.Elektra.Uniformes.map.DescuentosMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpleadoDesctoDao {

    private final DescuentosMap map;

    @Autowired
    public EmpleadoDesctoDao(DescuentosMap map) {
        this.map = map;
    }

    public List<FolioDto> getFolios(Integer idEmpleado) {
        ResultWrapper<FolioDto> wrapper = new ResultWrapper<FolioDto>();
        map.getFolios(wrapper, idEmpleado);
        return wrapper.getList();
    }

    public List<EmpleadoDesctoDto> consultaEmpleadoDescto(Integer empleadoNum, String folioPed) {
        ResultWrapper<EmpleadoDesctoDto> wrapper = new ResultWrapper<EmpleadoDesctoDto>();
        map.consultaEmpleadoDescto(wrapper, empleadoNum, folioPed);
        return wrapper.getList();
    }


}
