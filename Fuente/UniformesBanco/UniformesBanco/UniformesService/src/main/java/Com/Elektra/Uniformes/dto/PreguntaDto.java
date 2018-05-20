package Com.Elektra.Uniformes.Dto;

import java.util.Date;
import java.util.List;

public class PreguntaDto {
    private Integer idPregunta;
    private Integer orden;
    private String texto;
    private Date registro;
    private List<RespuestaDto> respuestas;
    private Integer idRespuestaSeleccionada;

    public Integer getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Integer idPregunta) {
        this.idPregunta = idPregunta;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getRegistro() {
        return registro;
    }

    public void setRegistro(Date registro) {
        this.registro = registro;
    }

    public List<RespuestaDto> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<RespuestaDto> respuestas) {
        this.respuestas = respuestas;
    }

    public Integer getIdRespuestaSeleccionada() {
        return idRespuestaSeleccionada;
    }

    public void setIdRespuestaSeleccionada(Integer idRespuestaSeleccionada) {
        this.idRespuestaSeleccionada = idRespuestaSeleccionada;
    }
}