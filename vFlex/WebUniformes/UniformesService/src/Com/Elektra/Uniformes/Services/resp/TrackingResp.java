package Com.Elektra.Uniformes.Services.resp;

import Com.Elektra.Uniformes.Dto.DatosTrackingDto;

import java.util.List;

public class TrackingResp extends ServiceResponse {
    private List<DatosTrackingDto> pedidos;

    public List<DatosTrackingDto> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<DatosTrackingDto> pedidos) {
        this.pedidos = pedidos;
    }
}
