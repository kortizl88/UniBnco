package Com.Elektra.Uniformes.Dto;

import java.util.List;

public class TallaDto {

    private int idTalla;
    private String tallaClave;
    private List<PiezaDto> piezas;

    public void setIdTalla(int idTalla) {
        this.idTalla = idTalla;
    }

    public int getIdTalla() {
        return idTalla;
    }

    public void setTallaClave(String tallaClave) {
        this.tallaClave = tallaClave;
    }

    public String getTallaClave() {
        return tallaClave;
    }

    public List<PiezaDto> getPiezas() {
        return piezas;
    }

    public void setPiezas(List<PiezaDto> piezas) {
        this.piezas = piezas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TallaDto talla = (TallaDto) o;

        if (idTalla != talla.idTalla) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idTalla;
    }
}
