package Com.Elektra.Uniformes.Dto;

public class ValidacionResult {
    private String estatus;
    private Boolean tieneRemision;
    private String descripcionMotivo;
    private String datosMotivo;
    private Boolean aplicaExcepcion;

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Boolean getTieneRemision() {
        return tieneRemision;
    }

    public void setTieneRemision(Boolean tieneRemision) {
        this.tieneRemision = tieneRemision;
    }

    public String getDescripcionMotivo() {
        return descripcionMotivo;
    }

    public void setDescripcionMotivo(String descripcionMotivo) {
        this.descripcionMotivo = descripcionMotivo;
    }

    public String getDatosMotivo() {
        return datosMotivo;
    }

    public void setDatosMotivo(String datosMotivo) {
        this.datosMotivo = datosMotivo;
    }

    public Boolean getAplicaExcepcion() {
        return aplicaExcepcion;
    }

    public void setAplicaExcepcion(Boolean aplicaExcepcion) {
        this.aplicaExcepcion = aplicaExcepcion;
    }
}
