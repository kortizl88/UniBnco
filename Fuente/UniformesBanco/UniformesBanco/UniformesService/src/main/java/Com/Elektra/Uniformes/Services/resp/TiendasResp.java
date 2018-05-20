package Com.Elektra.Uniformes.Services.resp;

import Com.Elektra.Uniformes.Dto.SucursalesDto;

public class TiendasResp extends ServiceResponse {
    private SucursalesDto sucursales;

    public SucursalesDto getSucursales() {
        return sucursales;
    }

    public void setSucursales(SucursalesDto sucursales) {
        this.sucursales = sucursales;
    }
}
