package Com.Elektra.Uniformes.Services.resp;

import Com.Elektra.Uniformes.Dto.KitUniformeDto;

public class ItemsSolicitudResp extends ServiceResponse {
    private KitUniformeDto kitUniforme;

    public KitUniformeDto getKitUniforme() {
        return kitUniforme;
    }

    public void setKitUniforme(KitUniformeDto kitUniforme) {
        this.kitUniforme = kitUniforme;
    }
}
