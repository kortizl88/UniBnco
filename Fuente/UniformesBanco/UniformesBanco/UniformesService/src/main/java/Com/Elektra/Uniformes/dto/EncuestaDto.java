package Com.Elektra.Uniformes.Dto;

import java.util.Date;
import java.util.List;

public class EncuestaDto {
    private Integer idEmpleado;
    private Integer idEncuesta;
    private String titulo;
    private String descripcion;
    private Date vigencia;
    private Date registro;
    private List<PreguntaDto> preguntas;
    private Integer idSucursal;
    private String sucursal;
    private String region;
    private String comentarios;

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(Integer idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    public Date getRegistro() {
        return registro;
    }

    public void setRegistro(Date registro) {
        this.registro = registro;
    }

    public List<PreguntaDto> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<PreguntaDto> preguntas) {
        this.preguntas = preguntas;
    }

    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}