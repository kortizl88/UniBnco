package Com.Elektra.Uniformes.Dto;

public class PendienteRegionalDto extends PedidosPendientesDto {
    private Integer numEmpRegional;
    private String nombreRegional;

    public Integer getNumEmpRegional() {
        return numEmpRegional;
    }

    public void setNumEmpRegional(Integer numEmpRegional) {
        this.numEmpRegional = numEmpRegional;
    }

    public String getNombreRegional() {
        return nombreRegional;
    }

    public void setNombreRegional(String nombreRegional) {
        this.nombreRegional = nombreRegional;
    }
}
