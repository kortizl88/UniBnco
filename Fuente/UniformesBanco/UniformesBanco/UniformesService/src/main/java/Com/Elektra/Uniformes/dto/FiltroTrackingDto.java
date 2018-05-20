package Com.Elektra.Uniformes.Dto;

import java.util.Date;

public class FiltroTrackingDto {
    private Integer idEmpleado;
    private Integer tienda;
    private Integer pedido;
    private Integer sku;
    private Integer centroDeCostos;
    private Integer remision;
    private Date fechaSolicitudIni;
    private Date fechaSolicitudFin;
    private Date fechaRemisionIni;
    private Date fechaRemisionFin;

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getTienda() {
        return tienda;
    }

    public void setTienda(Integer tienda) {
        this.tienda = tienda;
    }

    public Integer getPedido() {
        return pedido;
    }

    public void setPedido(Integer pedido) {
        this.pedido = pedido;
    }

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public Integer getCentroDeCostos() {
        return centroDeCostos;
    }

    public void setCentroDeCostos(Integer centroDeCostos) {
        this.centroDeCostos = centroDeCostos;
    }

    public Integer getRemision() {
        return remision;
    }

    public void setRemision(Integer remision) {
        this.remision = remision;
    }

    public Date getFechaSolicitudIni() {
        return fechaSolicitudIni;
    }

    public void setFechaSolicitudIni(Date fechaSolicitudIni) {
        this.fechaSolicitudIni = fechaSolicitudIni;
    }

    public Date getFechaSolicitudFin() {
        return fechaSolicitudFin;
    }

    public void setFechaSolicitudFin(Date fechaSolicitudFin) {
        this.fechaSolicitudFin = fechaSolicitudFin;
    }

    public Date getFechaRemisionIni() {
        return fechaRemisionIni;
    }

    public void setFechaRemisionIni(Date fechaRemisionIni) {
        this.fechaRemisionIni = fechaRemisionIni;
    }

    public Date getFechaRemisionFin() {
        return fechaRemisionFin;
    }

    public void setFechaRemisionFin(Date fechaRemisionFin) {
        this.fechaRemisionFin = fechaRemisionFin;
    }
}
