package Com.Elektra.Uniformes.Services.resp;

import Com.Elektra.Uniformes.Dto.PedidoEnDescuentoDto;

import java.util.List;

public class DescuentosResp extends ServiceResponse {
    private List<PedidoEnDescuentoDto> empleadoDesctos;

    public List<PedidoEnDescuentoDto> getEmpleadoDesctos() {
        return empleadoDesctos;
    }

    public void setEmpleadoDesctos(List<PedidoEnDescuentoDto> empleadoDesctos) {
        this.empleadoDesctos = empleadoDesctos;
    }
}
