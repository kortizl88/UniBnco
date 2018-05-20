package Com.Elektra.Uniformes.Dto;

import java.math.BigDecimal;

public class MedidaDto {
    private Integer idMedida;
    private String descripcion;
    private String unidadesMedida;
    private Integer orden;
    private BigDecimal valor;

    public Integer getIdMedida() {
        return idMedida;
    }

    public void setIdMedida(Integer idMedida) {
        this.idMedida = idMedida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadesMedida() {
        return unidadesMedida;
    }

    public void setUnidadesMedida(String unidadesMedida) {
        this.unidadesMedida = unidadesMedida;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
