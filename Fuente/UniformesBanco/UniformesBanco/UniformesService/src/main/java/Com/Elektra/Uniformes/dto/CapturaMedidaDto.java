package Com.Elektra.Uniformes.Dto;

import java.util.List;

public class CapturaMedidaDto {
    private Integer idTipoPrenda;
    private String descripcion;
    private List<MedidaDto> medidas;

    public Integer getIdTipoPrenda() {
        return idTipoPrenda;
    }

    public void setIdTipoPrenda(Integer idTipoPrenda) {
        this.idTipoPrenda = idTipoPrenda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<MedidaDto> getMedidas() {
        return medidas;
    }

    public void setMedidas(List<MedidaDto> medidas) {
        this.medidas = medidas;
    }
}
