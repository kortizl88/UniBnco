package Com.Elektra.Uniformes.Dto;

import java.util.Date;

public class DetallePedidoDto {

    private Integer noPedido;
    private String sku;
    private String descripcion;
    private String talla;
    private Integer totalSku;
    private Integer numRemision;
    private String estatusDesc;
    private Date fechaEstatus;

    public Integer getNoPedido() {
        return noPedido;
    }

    public void setNoPedido(Integer noPedido) {
        this.noPedido = noPedido;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public Integer getTotalSku() {
        return totalSku;
    }

    public void setTotalSku(Integer totalSku) {
        this.totalSku = totalSku;
    }

    public Integer getNumRemision() {
        return numRemision;
    }

    public void setNumRemision(Integer numRemision) {
        this.numRemision = numRemision;
    }

    public String getEstatusDesc() {
        return estatusDesc;
    }

    public void setEstatusDesc(String estatusDesc) {
        this.estatusDesc = estatusDesc;
    }

    public Date getFechaEstatus() {
        return fechaEstatus;
    }

    public void setFechaEstatus(Date fechaEstatus) {
        this.fechaEstatus = fechaEstatus;
    }

}
