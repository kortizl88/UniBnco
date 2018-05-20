//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.beans;

import java.io.Serializable;

public class Submodulo implements Serializable {
    private int idSubmodulo;
    private String nombreSubmodulo;
    private String urlSubmodulo;
    private static final long serialVersionUID = -3398483764116930884L;

    public Submodulo(int idSubmodulo, String nombreSubmodulo, String urlSubmodulo) {
        this.idSubmodulo = idSubmodulo;
        this.nombreSubmodulo = nombreSubmodulo;
        this.urlSubmodulo = urlSubmodulo;
    }

    public int getIdSubmodulo() {
        return this.idSubmodulo;
    }

    public String getNombreSubmodulo() {
        return this.nombreSubmodulo;
    }

    public String getUrlSubmodulo() {
        return this.urlSubmodulo;
    }

    public String toString() {
        String cadena = "\t\tID Submodulo:" + this.idSubmodulo + "  Nombre Submodulo:" + this.nombreSubmodulo + "\n";
        return cadena;
    }
}
