package Com.Elektra.Uniformes.Dto;

import java.math.BigDecimal;
import java.util.List;

public class ItemUniformeDto {

    public static final Integer TIPO_ORDINARIA = 1;
    public static final Integer TIPO_EXT_CON_COSTO = 2;
    public static final Integer TIPO_EXT_SIN_COSTO = 3;

    private String descripcion;
    private List<Integer> idCategorias;
    private List<String> imagenes;
    private List<TallaDto> tallas;
    private BigDecimal precioSubkit;
    private Integer cantidad;
    private Boolean flagValido;
    private String motivo;
    private Boolean flagObligatorio;
    private Integer mesesRenovacion;
    private List<Integer> subkitsIds;
    private Boolean aplicaReposicion;
    private Integer folioReposicion;
    private Integer estatusReposicion;
    private String observacionesReposicion;
    private Integer grupo;
    private BigDecimal precioExtraordinario;
    private Integer tipoSolicitud;
    private String guiaTallas;

    public void setImagenes(List<String> imagenes) {
        this.imagenes = imagenes;
    }

    public List<String> getImagenes() {
        return imagenes;
    }

    public void setTallas(List<TallaDto> tallas) {
        this.tallas = tallas;
    }

    public List<TallaDto> getTallas() {
        return tallas;
    }

    public void setPrecioSubkit(BigDecimal precioSubkit) {
        this.precioSubkit = precioSubkit;
    }

    public BigDecimal getPrecioSubkit() {
        return precioSubkit;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setFlagValido(Boolean flagValido) {
        this.flagValido = flagValido;
    }

    public Boolean getFlagValido() {
        return flagValido;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Boolean getFlagObligatorio() {
        return flagObligatorio;
    }

    public void setFlagObligatorio(Boolean flagObligatorio) {
        this.flagObligatorio = flagObligatorio;
    }

    public List<Integer> getIdCategorias() {
        return idCategorias;
    }

    public void setIdCategorias(List<Integer> idCategorias) {
        this.idCategorias = idCategorias;
    }

    public Integer getMesesRenovacion() {
        return mesesRenovacion;
    }

    public void setMesesRenovacion(Integer mesesRenovacion) {
        this.mesesRenovacion = mesesRenovacion;
    }

    public List<Integer> getSubkitsIds() {
        return subkitsIds;
    }

    public void setSubkitsIds(List<Integer> subkitsIds) {
        this.subkitsIds = subkitsIds;
    }

    public Boolean getAplicaReposicion() {
        return aplicaReposicion;
    }

    public void setAplicaReposicion(Boolean aplicaReposicion) {
        this.aplicaReposicion = aplicaReposicion;
    }

    public Integer getFolioReposicion() {
        return folioReposicion;
    }

    public void setFolioReposicion(Integer folioReposicion) {
        this.folioReposicion = folioReposicion;
    }

    public Integer getEstatusReposicion() {
        return estatusReposicion;
    }

    public void setEstatusReposicion(Integer estatusReposicion) {
        this.estatusReposicion = estatusReposicion;
    }

    public String getObservacionesReposicion() {
        return observacionesReposicion;
    }

    public void setObservacionesReposicion(String observacionesReposicion) {
        this.observacionesReposicion = observacionesReposicion;
    }

    public Integer getGrupo() {
        return grupo;
    }

    public void setGrupo(Integer grupo) {
        this.grupo = grupo;
    }

    public BigDecimal getPrecioExtraordinario() {
        return precioExtraordinario;
    }

    public void setPrecioExtraordinario(BigDecimal precioExtraordinario) {
        this.precioExtraordinario = precioExtraordinario;
    }

    public Integer getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(Integer tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    public String getGuiaTallas() {
        return guiaTallas;
    }

    public void setGuiaTallas(String guiaTallas) {
        this.guiaTallas = guiaTallas;
    }
}
