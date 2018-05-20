package Com.Elektra.Uniformes.Dto;

import java.math.BigDecimal;

public class CapturaDetalleDto {
    private Integer idMedida;
    private BigDecimal valor;

    public Integer getIdMedida() {
        return idMedida;
    }

    public void setIdMedida(Integer idMedida) {
        this.idMedida = idMedida;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
