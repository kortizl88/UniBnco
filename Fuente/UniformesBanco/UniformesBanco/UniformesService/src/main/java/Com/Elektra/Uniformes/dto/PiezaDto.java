package Com.Elektra.Uniformes.Dto;

import java.math.BigDecimal;

public class PiezaDto {
    private Integer sku;
    private Integer cantidad;
    private Integer categoria;
    private Integer inventario;
    private Integer idSubkit;
    private BigDecimal costo;

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public Integer getInventario() {
        return inventario;
    }

    public void setInventario(Integer inventario) {
        this.inventario = inventario;
    }

    public Integer getIdSubkit() {
        return idSubkit;
    }

    public void setIdSubkit(Integer idSubkit) {
        this.idSubkit = idSubkit;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }
}
