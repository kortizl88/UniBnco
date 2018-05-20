package Com.Elektra.Uniformes.Dto;

import java.util.List;

public class KitUniformeDto {
    private Integer idKit;
    private List<ItemUniformeDto> items;
    private Boolean flagMostrarGuia;
    private Integer semanasDescto;
    private Boolean esPrimerKit;
    private String archivoGuia;

    public List<ItemUniformeDto> getItems() {
        return items;
    }

    public void setItems(List<ItemUniformeDto> items) {
        this.items = items;
    }

    public Boolean getFlagMostrarGuia() {
        return flagMostrarGuia;
    }

    public void setFlagMostrarGuia(Boolean flagMostrarGuia) {
        this.flagMostrarGuia = flagMostrarGuia;
    }

    public Integer getSemanasDescto() {
        return semanasDescto;
    }

    public void setSemanasDescto(Integer semanasDescto) {
        this.semanasDescto = semanasDescto;
    }

    public Boolean getEsPrimerKit() {
        return esPrimerKit;
    }

    public void setEsPrimerKit(Boolean esPrimerKit) {
        this.esPrimerKit = esPrimerKit;
    }

    public Integer getIdKit() {
        return idKit;
    }

    public void setIdKit(Integer idKit) {
        this.idKit = idKit;
    }

    public String getArchivoGuia() {
        return archivoGuia;
    }

    public void setArchivoGuia(String archivoGuia) {
        this.archivoGuia = archivoGuia;
    }
}
