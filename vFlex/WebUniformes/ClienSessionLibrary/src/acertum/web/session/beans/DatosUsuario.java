//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.beans;

import java.io.Serializable;

public class DatosUsuario implements Serializable {
    private int noEmpleado;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int idPuesto;
    private String descPuesto;
    private int idPerfil;
    private String descPerfil;
    private Sistema[] sistemas;
    private String[] roles;
    private int status;
    private String mensajeStatus;
    private static final long serialVersionUID = 8009546124992864162L;

    public DatosUsuario(int noEmpleado, String nombre, String apellidoPaterno, String apellidoMaterno, int idPuesto, String descPuesto, int idPerfil, String descPerfil, Sistema[] sistemas, String[] roles, int status, String mensajeStatus) {
        this.noEmpleado = noEmpleado;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.idPuesto = idPuesto;
        this.descPuesto = descPuesto;
        this.idPerfil = idPerfil;
        this.descPerfil = descPerfil;
        this.sistemas = sistemas;
        this.roles = roles;
        this.status = status;
        this.mensajeStatus = mensajeStatus;
    }

    public DatosUsuario(int noEmpleado, String nombre, String apellidoPaterno, String apellidoMaterno, int status) {
        this.noEmpleado = noEmpleado;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.status = status;
    }

    public int getNoEmpleado() {
        return this.noEmpleado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }

    public String[] getRoles() {
        return this.roles;
    }

    public int getStatus() {
        return this.status;
    }

    public int getIdPuesto() {
        return this.idPuesto;
    }

    public String getDescPuesto() {
        return this.descPuesto;
    }

    public int getIdPerfil() {
        return this.idPerfil;
    }

    public String getDescPerfil() {
        return this.descPerfil;
    }

    public Sistema[] getSistemas() {
        return this.sistemas;
    }

    public String getMensajeStatus() {
        return this.mensajeStatus;
    }

    public void setMensajeStatus(String mensajeStatus) {
        this.mensajeStatus = mensajeStatus;
    }
}
