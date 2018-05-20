package Com.Elektra.Uniformes.Dto;

import java.util.Date;
import java.util.List;

public class EstatusPedidoDto {
    private Integer idEmpleado;
    private String folioPedido;
    private Integer noTienda;
    private String nombreTienda;
    private Date fecha;
    private Integer idEstatus;
    private String descripcionEstatus;
    private List<DetallePedidoDto> detalle;

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getFolioPedido() {
        return folioPedido;
    }

    public void setFolioPedido(String folioPedido) {
        this.folioPedido = folioPedido;
    }

    public Integer getNoTienda() {
        return noTienda;
    }

    public void setNoTienda(Integer noTienda) {
        this.noTienda = noTienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<DetallePedidoDto> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetallePedidoDto> detalle) {
        this.detalle = detalle;
    }

    public Integer getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

    public String getDescripcionEstatus() {
        return descripcionEstatus;
    }

    public void setDescripcionEstatus(String descripcionEstatus) {
        this.descripcionEstatus = descripcionEstatus;
    }
}
