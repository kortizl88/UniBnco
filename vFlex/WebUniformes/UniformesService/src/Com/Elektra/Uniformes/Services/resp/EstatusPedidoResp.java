package Com.Elektra.Uniformes.Services.resp;

import Com.Elektra.Uniformes.Dto.EstatusPedidoDto;


public class EstatusPedidoResp extends ServiceResponse {

    private EstatusPedidoDto informacionPedido;

    public EstatusPedidoDto getInformacionPedido() {
        return informacionPedido;
    }

    public void setInformacionPedido(EstatusPedidoDto informacionPedido) {
        this.informacionPedido = informacionPedido;
    }
}
