package Com.Elektra.Uniformes.Dto;

import java.math.BigDecimal;

public class ReposicionDto {
    private Integer folioReposicion;
    private Integer idEmpleado;
    private String nombreEmpleado;
    private String correo;
    private String telefono;
    private String motivo;
    private String mensaje;
    private String observaciones;
    private Integer pedido;
    private Integer sucursal;
    private BigDecimal precio;
    private Integer idSubkit;
    private Integer estatus;
    private String descripcionCorta;

    public Integer getFolioReposicion() {
        return folioReposicion;
    }

    public void setFolioReposicion(Integer folioReposicion) {
        this.folioReposicion = folioReposicion;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getPedido() {
        return pedido;
    }

    public void setPedido(Integer pedido) {
        this.pedido = pedido;
    }

    public Integer getSucursal() {
        return sucursal;
    }

    public void setSucursal(Integer sucursal) {
        this.sucursal = sucursal;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getIdSubkit() {
        return idSubkit;
    }

    public void setIdSubkit(Integer idSubkit) {
        this.idSubkit = idSubkit;
    }

    public Integer getEstatus() {
        return estatus;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    @Override
    public String toString() {
        return "ReposicionDto{" +
                "folioReposicion=" + folioReposicion +
                ", idEmpleado=" + idEmpleado +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", motivo='" + motivo + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", pedido=" + pedido +
                ", sucursal=" + sucursal +
                ", precio=" + precio +
                ", idSubkit=" + idSubkit +
                ", estatus=" + estatus +
                ", descripcionCorta='" + descripcionCorta + '\'' +
                '}';
    }
}