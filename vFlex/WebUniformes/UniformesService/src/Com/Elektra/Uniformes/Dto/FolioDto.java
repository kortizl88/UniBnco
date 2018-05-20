package Com.Elektra.Uniformes.Dto;

import java.util.Date;

public class FolioDto {
    private String folio;
    private Date fecha;

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
