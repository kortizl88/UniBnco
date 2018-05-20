//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.manager;

public class Usuario {
    private String nomUsuario;
    private String password;
    private int permisos;

    public Usuario(String nomUsuario, String password, int permisos) {
        this.nomUsuario = nomUsuario;
        this.password = password;
        this.permisos = permisos;
    }

    public String getNomUsuario() {
        return this.nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPermisos() {
        return this.permisos;
    }

    public void setPermisos(int permisos) {
        this.permisos = permisos;
    }
}
