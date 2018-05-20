package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.EncuestaDto;
import Com.Elektra.Uniformes.Dto.PreguntaDto;
import Com.Elektra.Uniformes.Dto.ResultWrapper;
import Com.Elektra.Uniformes.map.EncuestaMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EncuestaDao {

    private EncuestaMap encuestaMap;

    @Autowired
    public void setEncuestaMap(EncuestaMap encuestaMap) {
        this.encuestaMap = encuestaMap;
    }

    public EncuestaDto consultaEncuestaPendiente(Integer idEmpleado) {
        ResultWrapper<EncuestaDto> resultWrapper = new ResultWrapper<EncuestaDto>();
        EncuestaDto result = null;
        encuestaMap.consultaEncuestaPendiente(resultWrapper, idEmpleado);
        if (resultWrapper.getList() != null && !resultWrapper.getList().isEmpty()) {
            result = resultWrapper.getList().get(0);
        }
        return result;
    }

    public Integer guardarRespuestas(EncuestaDto encuesta) {
        Integer result = 0;
        for (PreguntaDto preg : encuesta.getPreguntas()) {
            result += encuestaMap.guardaRespuesta(
                    encuesta.getIdEmpleado(),
                    encuesta.getIdEncuesta(),
                    preg.getIdPregunta(),
                    preg.getIdRespuestaSeleccionada()
            );
        }
        result += encuestaMap.finalizaEncuesta(encuesta);
        return result;
    }
}
