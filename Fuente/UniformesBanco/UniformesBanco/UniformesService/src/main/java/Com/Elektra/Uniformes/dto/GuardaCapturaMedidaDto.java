package Com.Elektra.Uniformes.Dto;

import java.util.List;

public class GuardaCapturaMedidaDto {
    private Integer idCarga;
    private Integer idEmpleado;
    private Integer idNegocio;
    private Integer funcionSap;
    private Integer idGenero;
    private Integer idCaptura;
    private List<CapturaDetalleDto> detalle;

    public Integer getIdCarga() {
        return idCarga;
    }

    public void setIdCarga(Integer idCarga) {
        this.idCarga = idCarga;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getIdNegocio() {
        return idNegocio;
    }

    public void setIdNegocio(Integer idNegocio) {
        this.idNegocio = idNegocio;
    }

    public Integer getFuncionSap() {
        return funcionSap;
    }

    public void setFuncionSap(Integer funcionSap) {
        this.funcionSap = funcionSap;
    }

    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public Integer getIdCaptura() {
        return idCaptura;
    }

    public void setIdCaptura(Integer idCaptura) {
        this.idCaptura = idCaptura;
    }

    public List<CapturaDetalleDto> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<CapturaDetalleDto> detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "GuardaCapturaMedidaDto{" +
                "idCarga=" + idCarga +
                ", idEmpleado=" + idEmpleado +
                ", idNegocio=" + idNegocio +
                ", funcionSap=" + funcionSap +
                ", idGenero=" + idGenero +
                ", idCaptura=" + idCaptura +
                '}';
    }
}
