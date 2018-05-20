package Com.Elektra.Uniformes.Services.resp;

public class ServiceResponse {
    private Integer codigo;
    private String descripcionOperacion;
    private String detalleTecnico;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcionOperacion() {
        return descripcionOperacion;
    }

    public void setDescripcionOperacion(String descripcionOperacion) {
        this.descripcionOperacion = descripcionOperacion;
    }

    public String getDetalleTecnico() {
        return detalleTecnico;
    }

    public void setDetalleTecnico(String detalleTecnico) {
        this.detalleTecnico = detalleTecnico;
    }
}
