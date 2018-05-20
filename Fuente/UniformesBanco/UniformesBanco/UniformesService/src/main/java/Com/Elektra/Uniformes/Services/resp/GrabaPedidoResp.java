package Com.Elektra.Uniformes.Services.resp;

import java.util.List;

public class GrabaPedidoResp extends ServiceResponse {
    private String folio;
    private List<Integer> pedidos;
    private Integer tienda;

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public List<Integer> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Integer> pedidos) {
        this.pedidos = pedidos;
    }

    public Integer getTienda() {
        return tienda;
    }

    public void setTienda(Integer tienda) {
        this.tienda = tienda;
    }
}
