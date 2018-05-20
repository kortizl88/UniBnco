package Com.Elektra.Uniformes.Dto;

import java.math.BigDecimal;

public class PedidoEnDescuentoDto {

    private String refPedido;
    private BigDecimal pagado;
    private BigDecimal porPagar;
    private BigDecimal total;
    private String descGral;
    private DetallePedidoEnDesctoDto[] detalle;
    private Boolean showDetail = false;

    public String getRefPedido() {
        return refPedido;
    }

    public void setRefPedido(String refPedido) {
        this.refPedido = refPedido;
    }

    public BigDecimal getPagado() {
        return pagado;
    }

    public void setPagado(BigDecimal pagado) {
        this.pagado = pagado;
    }

    public BigDecimal getPorPagar() {
        return porPagar;
    }

    public void setPorPagar(BigDecimal porPagar) {
        this.porPagar = porPagar;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public DetallePedidoEnDesctoDto[] getDetalle() {
        return detalle;
    }

    public void setDetalle(DetallePedidoEnDesctoDto[] detalle) {
        this.detalle = detalle;

    }

    public Boolean getShowDetail() {
        return showDetail;
    }

    public void setShowDetail(Boolean showDetail) {
        this.showDetail = showDetail;
    }

    public void setDescGral(String descGral) {
        this.descGral = descGral;
    }

    public String getDescGral() {
        return descGral;
    }

}
