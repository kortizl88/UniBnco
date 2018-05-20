package Com.Elektra.Uniformes.Dto;

public class DatosPedidoDto {
    private String folioPedido;
    private Integer noPedido;
    private Integer noTienda;
    private Integer numEmpleado;

    public String getFolioPedido() {
        return folioPedido;
    }

    public void setFolioPedido(String folioPedido) {
        this.folioPedido = folioPedido;
    }

    public Integer getNoPedido() {
        return noPedido;
    }

    public void setNoPedido(Integer noPedido) {
        this.noPedido = noPedido;
    }

    public Integer getNoTienda() {
        return noTienda;
    }

    public void setNoTienda(Integer noTienda) {
        this.noTienda = noTienda;
    }

    public Integer getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(Integer numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

}
