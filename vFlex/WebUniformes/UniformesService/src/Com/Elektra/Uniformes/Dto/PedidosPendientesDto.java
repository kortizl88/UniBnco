package Com.Elektra.Uniformes.Dto;

import java.util.List;

public class PedidosPendientesDto {

    //TODO: Eliminar propiedades
    private int numEmpDistrital;
    private String fcEmpleadoNombre;

    public int getNumEmpDistrital() {
        return numEmpDistrital;
    }

    public void setFcEmpleadoNombre(String fcEmpleadoNombre) {
        this.fcEmpleadoNombre = fcEmpleadoNombre;
    }

    public String getFcEmpleadoNombre() {
        return fcEmpleadoNombre;
    }

    public void setNumEmpDistrital(int numEmpDistrital) {
        this.numEmpDistrital = numEmpDistrital;
    }

    //------------------------
    private int idEmpelado;
    private String empleadoNombre;
    private String descFuncion;
    private int cencosNum;
    private String folioPedido;
    private String clave;
    private List<DetallePedidoPorEntregarDto> detalle;

    public void setFolioPedido(String folioPedido) {
        this.folioPedido = folioPedido;
    }

    public String getFolioPedido() {
        return folioPedido;
    }

    public void setIdEmpelado(int idEmpelado) {
        this.idEmpelado = idEmpelado;
    }

    public int getIdEmpelado() {
        return idEmpelado;
    }

    public void setCencosNum(int cencosNum) {
        this.cencosNum = cencosNum;
    }

    public int getCencosNum() {
        return cencosNum;
    }

    public void setEmpleadoNombre(String empleadoNombre) {
        this.empleadoNombre = empleadoNombre;
    }

    public String getEmpleadoNombre() {
        return empleadoNombre;
    }

    public void setDescFuncion(String descFuncion) {
        this.descFuncion = descFuncion;
    }

    public String getDescFuncion() {
        return descFuncion;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public List<DetallePedidoPorEntregarDto> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetallePedidoPorEntregarDto> detalle) {
        this.detalle = detalle;
    }
}