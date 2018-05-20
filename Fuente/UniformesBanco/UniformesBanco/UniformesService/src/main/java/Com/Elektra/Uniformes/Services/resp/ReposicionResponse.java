package Com.Elektra.Uniformes.Services.resp;

import Com.Elektra.Uniformes.Dto.AutorizanteDto;

public class ReposicionResponse extends ServiceResponse {
    Integer folioReposicon;
    AutorizanteDto autorizante;

    public Integer getFolioReposicon() {
        return folioReposicon;
    }

    public void setFolioReposicon(Integer folioReposicon) {
        this.folioReposicon = folioReposicon;
    }

    public AutorizanteDto getAutorizante() {
        return autorizante;
    }

    public void setAutorizante(AutorizanteDto autorizante) {
        this.autorizante = autorizante;
    }
}
