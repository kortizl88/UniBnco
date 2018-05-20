package Com.Elektra.Uniformes.Dto;

import java.math.BigDecimal;
import java.util.Date;

public class DetallePedidoEnDesctoDto {
    private Integer anio;
    private Integer semana;
    private Date fecha;
    private BigDecimal descuento;
    private Integer numPago;
    private Integer periodos;

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getSemana() {
        return semana;
    }

    public void setSemana(Integer semana) {
        this.semana = semana;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public Integer getNumPago() {
        return numPago;
    }

    public void setNumPago(Integer numPago) {
        this.numPago = numPago;
    }

    public Integer getPeriodos() {
        return periodos;
    }

    public void setPeriodos(Integer periodos) {
        this.periodos = periodos;
    }
}
