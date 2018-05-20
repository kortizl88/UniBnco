package Com.Elektra.Uniformes.Services.resp;

import Com.Elektra.Uniformes.Dto.DatosEmpleadoDto;
import Com.Elektra.Uniformes.Dto.EncuestaDto;
import Com.Elektra.Uniformes.Dto.ReposicionDto;

import java.util.List;

public class DatosEmpleadoResp extends ServiceResponse {
    private DatosEmpleadoDto datosEmpleado;
    private List<ReposicionDto> reposiciones;
    private EncuestaDto encuesta;

    public DatosEmpleadoDto getDatosEmpleado() {
        return datosEmpleado;
    }

    public void setDatosEmpleado(DatosEmpleadoDto datosEmpleado) {
        this.datosEmpleado = datosEmpleado;
    }

    public List<ReposicionDto> getReposiciones() {
        return reposiciones;
    }

    public void setReposiciones(List<ReposicionDto> reposiciones) {
        this.reposiciones = reposiciones;
    }

    public EncuestaDto getEncuesta() {
        return encuesta;
    }

    public void setEncuesta(EncuestaDto encuesta) {
        this.encuesta = encuesta;
    }
}
