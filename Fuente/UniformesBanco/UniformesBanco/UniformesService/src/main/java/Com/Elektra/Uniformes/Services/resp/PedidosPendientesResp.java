package Com.Elektra.Uniformes.Services.resp;


import Com.Elektra.Uniformes.Dto.PedidosPendientesDto;

import java.util.List;

public class PedidosPendientesResp extends ServiceResponse {

    private List<? extends PedidosPendientesDto> lsPedPends;
    private String ip;

    public void setLsPedPends(List<? extends PedidosPendientesDto> lsPedPends) {
        this.lsPedPends = lsPedPends;
    }

    public List<? extends PedidosPendientesDto> getLsPedPends() {
        return lsPedPends;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

}
