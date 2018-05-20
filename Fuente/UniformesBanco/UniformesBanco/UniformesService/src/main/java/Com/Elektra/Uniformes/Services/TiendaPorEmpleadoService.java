package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Dao.SucursalesDao;
import Com.Elektra.Uniformes.Dto.SucursalesDto;
import Com.Elektra.Uniformes.Services.resp.TiendasResp;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("tiendaPorEmpleado")
public class TiendaPorEmpleadoService {

    private static final Logger LOGGER = Logger.getLogger(TiendaPorEmpleadoService.class);

    private final SucursalesDao dao;

    @Autowired
    public TiendaPorEmpleadoService(SucursalesDao dao) {
        this.dao = dao;
    }

    public TiendasResp getTiendasPorEmpleado(Integer idEmp, Integer idCia) {
        TiendasResp resp = new TiendasResp();
        try {
            SucursalesDto sucursalesDto = dao.consultaSucursales(idEmp, idCia);
            resp.setSucursales(sucursalesDto);
            resp.setCodigo(0);
        } catch (Exception e) {
            LOGGER.error("Error al consultar las sucursales del empleado " + idEmp, e);
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("Se presentó un error al consultar las sucursales del empleado. Favor de contactar a Soporte Técnico");
            resp.setDetalleTecnico(e.toString());
        }
        return resp;
    }
}
