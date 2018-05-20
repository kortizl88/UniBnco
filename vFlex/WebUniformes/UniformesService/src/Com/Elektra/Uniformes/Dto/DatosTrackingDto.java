package Com.Elektra.Uniformes.Dto;

import java.util.Date;

public class DatosTrackingDto {
    private Integer idEmpleado;
    private String nombreEmpleado;
    private Integer idFuncion;
    private String descripcionPuesto;
    private Integer centroDeCostos;
    private String nombreCC;
    private Integer pedido;
    private String estatus;
    private Integer idTienda;
    private String nombreTienda;
    private Integer sku;
    private String descripcionSku;
    private Integer cantidad;
    private Date fechaSolicitud;
    private Integer remision;
    private Date fechaRemision;
    private Date fechaEntrega;

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

    public Integer getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(Integer idFuncion) {
        this.idFuncion = idFuncion;
    }

    public String getDescripcionPuesto() {
        return descripcionPuesto;
    }

    public void setDescripcionPuesto(String descripcionPuesto) {
        this.descripcionPuesto = descripcionPuesto;
    }

    public Integer getCentroDeCostos() {
        return centroDeCostos;
    }

    public void setCentroDeCostos(Integer centroDeCostos) {
        this.centroDeCostos = centroDeCostos;
    }

    public String getNombreCC() {
        return nombreCC;
    }

    public void setNombreCC(String nombreCC) {
        this.nombreCC = nombreCC;
    }

    public Integer getPedido() {
        return pedido;
    }

    public void setPedido(Integer pedido) {
        this.pedido = pedido;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Integer getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(Integer idTienda) {
        this.idTienda = idTienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public String getDescripcionSku() {
        return descripcionSku;
    }

    public void setDescripcionSku(String descripcionSku) {
        this.descripcionSku = descripcionSku;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Integer getRemision() {
        return remision;
    }

    public void setRemision(Integer remision) {
        this.remision = remision;
    }

    public Date getFechaRemision() {
        return fechaRemision;
    }

    public void setFechaRemision(Date fechaRemision) {
        this.fechaRemision = fechaRemision;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}