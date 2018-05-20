package Com.Elektra.Uniformes.Services.resp;

public class ExcelResp extends ServiceResponse {
    private byte[] archivo;

    public byte[] getArchivo() {
        return archivo;
    }

    public void setArchivo(byte[] archivo) {
        this.archivo = archivo;
    }
}
