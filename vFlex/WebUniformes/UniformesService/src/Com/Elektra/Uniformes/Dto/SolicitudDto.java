package Com.Elektra.Uniformes.Dto;

public class SolicitudDto {
    private Integer empleado;
    private Integer tienda;
    private Integer pedido;
    private Integer sku;
    private Integer cantidad;
    private Integer cia;
    private Integer pais;
    private Integer funcion;
    private Integer genero;
    private Integer tipoSolicitud;

    public Integer getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Integer empleado) {
        this.empleado = empleado;
    }

    public Integer getTienda() {
        return tienda;
    }

    public void setTienda(Integer tienda) {
        this.tienda = tienda;
    }

    public Integer getPedido() {
        return pedido;
    }

    public void setPedido(Integer pedido) {
        this.pedido = pedido;
    }

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

    public Integer getCia() {
        return cia;
    }

    public void setCia(Integer cia) {
        this.cia = cia;
    }

    public Integer getPais() {
        return pais;
    }

    public void setPais(Integer pais) {
        this.pais = pais;
    }

    public Integer getFuncion() {
        return funcion;
    }

    public void setFuncion(Integer funcion) {
        this.funcion = funcion;
    }

    public Integer getGenero() {
        return genero;
    }

    public void setGenero(Integer genero) {
        this.genero = genero;
    }

    public Integer getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(Integer tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    @Override
    public String toString() {
        return "SolicitudDto{" +
                "empleado=" + empleado +
                ", tienda=" + tienda +
                ", pedido=" + pedido +
                ", sku=" + sku +
                ", cantidad=" + cantidad +
                ", cia=" + cia +
                ", pais=" + pais +
                ", funcion=" + funcion +
                ", genero=" + genero +
                ", tipoSolicitud=" + tipoSolicitud +
                '}';
    }
}
