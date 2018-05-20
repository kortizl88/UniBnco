package Com.Elektra.Uniformes.Services.resp;

import Com.Elektra.Uniformes.Dto.FolioDto;

import java.util.List;

public class FoliosResp extends ServiceResponse {
    private List<FolioDto> folios;

    public List<FolioDto> getFolios() {
        return folios;
    }

    public void setFolios(List<FolioDto> folios) {
        this.folios = folios;
    }
}

