package Com.Elektra.Uniformes.Dto;

import java.util.Date;

public class DetallePedidoPorEntregarDto {

    private String folioPedido;
    private int noPedido;
    private String SKU;
    private String descSKU;
    private int totSKU;
    private Date fechaRemision;
    private int noRemision;
    private int noTienda;

    public void setFolioPedido(String folioPedido) {
        this.folioPedido = folioPedido;
    }

    public String getFolioPedido() {
        return folioPedido;
    }

    public void setNoPedido(int noPedido) {
        this.noPedido = noPedido;
    }

    public int getNoPedido() {
        return noPedido;
    }

    public void setSKU(String sKU) {
        SKU = sKU;
    }

    public String getSKU() {
        return SKU;
    }

    public void setDescSKU(String descSKU) {
        this.descSKU = descSKU;
    }

    public String getDescSKU() {
        return descSKU;
    }

    public void setTotSKU(int totSKU) {
        this.totSKU = totSKU;
    }

    public int getTotSKU() {
        return totSKU;
    }

    public void setFechaRemision(Date fechaRemision) {
        this.fechaRemision = fechaRemision;
    }

    public Date getFechaRemision() {
        return fechaRemision;
    }

    public void setNoRemision(int noRemision) {
        this.noRemision = noRemision;
    }

    public int getNoRemision() {
        return noRemision;
    }

    public void setNoTienda(int noTienda) {
        this.noTienda = noTienda;
    }

    public int getNoTienda() {
        return noTienda;
    }
}
