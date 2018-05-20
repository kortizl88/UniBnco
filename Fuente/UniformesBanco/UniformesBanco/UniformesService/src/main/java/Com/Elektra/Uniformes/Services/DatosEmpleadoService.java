package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Dao.DatosEmpleadoDao;
import Com.Elektra.Uniformes.Dao.EncuestaDao;
import Com.Elektra.Uniformes.Dao.ReposicionesDao;
import Com.Elektra.Uniformes.Dto.CargaActivaDto;
import Com.Elektra.Uniformes.Dto.DatosEmpleadoDto;
import Com.Elektra.Uniformes.Services.resp.DatosEmpleadoResp;
import Com.Elektra.Uniformes.Services.resp.ServiceResponse;
import Com.Elektra.Uniformes.Services.resp.ValueResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("consultaEmpleado")
public class DatosEmpleadoService {

    private static final Logger LOGGER = Logger.getLogger(DatosEmpleadoService.class);

    private final DatosEmpleadoDao dao;
    private final ReposicionesDao reposicionesDao;
    private final EncuestaDao encuestaDao;

    @Autowired
    public DatosEmpleadoService(DatosEmpleadoDao dao, ReposicionesDao reposicionesDao, EncuestaDao encuestaDao) {
        this.dao = dao;
        this.reposicionesDao = reposicionesDao;
        this.encuestaDao = encuestaDao;
    }

    public DatosEmpleadoResp consultaEmpleadoDatos(Integer idEmp) {
        DatosEmpleadoResp respConsulta = new DatosEmpleadoResp();
        try {
            DatosEmpleadoDto datosEmpleado = dao.consultaDatosEmpleado(idEmp);
            respConsulta.setDatosEmpleado(datosEmpleado);
            respConsulta.setReposiciones(reposicionesDao.consultaReposiciones(idEmp));
            respConsulta.setEncuesta(encuestaDao.consultaEncuestaPendiente(idEmp));
            respConsulta.setCodigo(0);
        } catch (Exception e) {
            LOGGER.error("Se presentó un error al Procesar los datos. Contacte a Soporte:", e);
            respConsulta.setCodigo(-1);
            respConsulta.setDescripcionOperacion("No se pudo obtener la información del empleado. Favor de contactar a Soporte Técnico");
            respConsulta.setDetalleTecnico(e.toString());
        }
        return respConsulta;
    }

    public ServiceResponse confirmaNotificacion(Integer idReposicion) {
        ServiceResponse resp = new ServiceResponse();
        try {
            reposicionesDao.confirmaNotificacion(idReposicion);
            resp.setCodigo(0);
        } catch (Exception e) {
            LOGGER.error("Se presentó un error actualizar los datos.", e);
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("No se pudo actualizar la bandera de notificación de la reposicion. Favor de contactar a Soporte Técnico");
            resp.setDetalleTecnico(e.toString());
        }
        return resp;
    }

    public ValueResponse<CargaActivaDto> consultaCargaActiva(Integer idEmpleado, Integer idNegocio, Integer idFuncion) {
        ValueResponse<CargaActivaDto> resp = new ValueResponse<CargaActivaDto>();
        try {
            CargaActivaDto cargaActiva = dao.consultaCargaActiva(idEmpleado, idNegocio, idFuncion);
            resp.setValue(cargaActiva);
            resp.setCodigo(0);
        } catch (Exception e) {
            LOGGER.error(String.format("Error al consultar carga activa. idNegocio: %d, idFuncion: %d", idNegocio, idFuncion), e);
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("Error al consultar carga activa. Favor de contactar a Soporte Técnico");
            resp.setDetalleTecnico(e.toString());
        }
        return resp;
    }

}
