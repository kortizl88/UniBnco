package Com.Elektra.Uniformes.Dto;

import java.util.List;

public class SucursalesDto {

    private List<TiendaDto> todasLasSucursales;
    private List<TiendaDto> sucursalPorEmpleado;

    public List<TiendaDto> getTodasLasSucursales() {
        return todasLasSucursales;
    }

    public void setTodasLasSucursales(List<TiendaDto> todasLasSucursales) {
        this.todasLasSucursales = todasLasSucursales;
    }

    public List<TiendaDto> getSucursalPorEmpleado() {
        return sucursalPorEmpleado;
    }

    public void setSucursalPorEmpleado(List<TiendaDto> sucursalPorEmpleado) {
        this.sucursalPorEmpleado = sucursalPorEmpleado;
    }
}
