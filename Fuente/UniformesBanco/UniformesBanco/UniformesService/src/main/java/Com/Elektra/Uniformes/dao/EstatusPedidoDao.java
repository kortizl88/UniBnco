package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.EstatusPedidoDto;
import Com.Elektra.Uniformes.Dto.FolioDto;
import Com.Elektra.Uniformes.Dto.ResultWrapper;
import Com.Elektra.Uniformes.map.EstatusPedidoMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EstatusPedidoDao {

    private EstatusPedidoMap map;

    @Autowired
    public void setMap(EstatusPedidoMap map) {
        this.map = map;
    }

    public EstatusPedidoDto consultaFolio(Integer idEmp, String folio) {
        EstatusPedidoDto estatusPedido = new EstatusPedidoDto();
        estatusPedido.setFolioPedido(folio);
        estatusPedido.setIdEmpleado(idEmp);
        map.consultaFolio(estatusPedido);
        return estatusPedido;
    }

    public List<FolioDto> historialFolios(Integer idEmp) {
        ResultWrapper<FolioDto> resultWrapper = new ResultWrapper<FolioDto>();
        map.historialFolios(idEmp, resultWrapper);
        return resultWrapper.getList();
    }


}
