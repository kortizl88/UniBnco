package Com.Elektra.Uniformes.Dto;

public class CargaActivaDto {
    private Integer idCarga;
    private Boolean bandMedidasCapturadas;
    private Integer modificaciones;

    public Integer getIdCarga() {
        return idCarga;
    }

    public void setIdCarga(Integer idCarga) {
        this.idCarga = idCarga;
    }

    public Boolean getBandMedidasCapturadas() {
        return bandMedidasCapturadas;
    }

    public void setBandMedidasCapturadas(Boolean bandMedidasCapturadas) {
        this.bandMedidasCapturadas = bandMedidasCapturadas;
    }

    public Integer getModificaciones() {
        return modificaciones;
    }

    public void setModificaciones(Integer modificaciones) {
        this.modificaciones = modificaciones;
    }
}
