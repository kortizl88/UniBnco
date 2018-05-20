package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Dao.ConfiguracionDao;
import Com.Elektra.Uniformes.Services.resp.ConfiguracionResp;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("configuracionService")
public class ConfiguracionService {

    private static final Logger LOGGER = Logger.getLogger(ConfiguracionService.class);

    private final ConfiguracionDao dao;

    @Autowired
    public ConfiguracionService(ConfiguracionDao dao) {
        this.dao = dao;
    }

    public ConfiguracionResp obtenerConfiguracion(Integer idSucursal, Integer idCanal, Integer idPais) {
        ConfiguracionResp resp = new ConfiguracionResp();
        try {
            resp.setConfig(dao.obtenerConfiguracion(idSucursal, idCanal, idPais));
            resp.setCodigo(0);
        } catch (Exception e) {
            LOGGER.error("Error al consultar la configuracion. Sucursal: " + idSucursal + " Canal: " + idCanal + " Pais: " + idPais, e);
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("No se pudo consultar la configuracion. Favor de contactar a Soporte Técnico");
            resp.setDetalleTecnico(e.toString());
        }
        return resp;
    }
}
