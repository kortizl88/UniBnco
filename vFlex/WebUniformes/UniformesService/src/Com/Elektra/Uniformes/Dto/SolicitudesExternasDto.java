package Com.Elektra.Uniformes.Dto;

import java.util.Date;

public class SolicitudesExternasDto {
    private Integer idEmpleado;
    private Integer idCategoria;
    private Date ultimaRemision;
    private Integer origen;

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Date getUltimaRemision() {
        return ultimaRemision;
    }

    public void setUltimaRemision(Date ultimaRemision) {
        this.ultimaRemision = ultimaRemision;
    }

    public Integer getOrigen() {
        return origen;
    }

    public void setOrigen(Integer origen) {
        this.origen = origen;
    }
}
