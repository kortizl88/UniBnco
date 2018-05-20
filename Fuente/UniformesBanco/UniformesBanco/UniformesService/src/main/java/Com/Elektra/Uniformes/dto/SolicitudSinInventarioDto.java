package Com.Elektra.Uniformes.Dto;

public class SolicitudSinInventarioDto {
    private Integer idEmpleado;
    private Integer periodo;
    private Integer idSubkit;
    private Integer sku;
    private Integer sucursal;

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public Integer getIdSubkit() {
        return idSubkit;
    }

    public void setIdSubkit(Integer idSubkit) {
        this.idSubkit = idSubkit;
    }

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public Integer getSucursal() {
        return sucursal;
    }

    public void setSucursal(Integer sucursal) {
        this.sucursal = sucursal;
    }
}