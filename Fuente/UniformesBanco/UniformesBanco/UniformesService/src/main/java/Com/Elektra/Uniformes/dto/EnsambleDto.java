package Com.Elektra.Uniformes.Dto;

import java.math.BigDecimal;

public class EnsambleDto {
    private Integer sku;
    private Integer inventario;
    private BigDecimal costo;

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public Integer getInventario() {
        return inventario;
    }

    public void setInventario(Integer inventario) {
        this.inventario = inventario;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }
}
