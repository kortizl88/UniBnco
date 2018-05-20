package Com.Elektra.Uniformes.Dto;

public class CanalDto {

    private int id;
    private String clave;
    private String descripcion;


    public CanalDto(int id, String clave, String descripcion) {
        this.id = id;
        this.clave = clave;
        this.descripcion = descripcion;

    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
