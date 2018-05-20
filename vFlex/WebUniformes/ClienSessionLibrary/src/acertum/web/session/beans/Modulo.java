//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.beans;

import java.io.Serializable;

public class Modulo implements Serializable {
    private int idModulo;
    private String nombreModulo;
    private String urlModulo;
    private Submodulo[] submodulos;
    private static final long serialVersionUID = 8981651719923578109L;

    public Modulo(int idModulo, String nombreModulo, String urlModulo, Submodulo[] submodulos) {
        this.idModulo = idModulo;
        this.nombreModulo = nombreModulo;
        this.urlModulo = urlModulo;
        this.submodulos = submodulos;
    }

    public int getIdModulo() {
        return this.idModulo;
    }

    public String getNombreModulo() {
        return this.nombreModulo;
    }

    public String getUrlModulo() {
        return this.urlModulo;
    }

    public Submodulo[] getSubmodulos() {
        return this.submodulos;
    }

    public void setSubmodulos(Submodulo[] submodulos) {
        this.submodulos = submodulos;
    }

    public String toString() {
        String cadena = "\tid MODULO: " + this.idModulo + "   nombre Modulo: " + this.nombreModulo + "\n";
        Submodulo[] var2 = this.submodulos;
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            Submodulo sub = var2[var4];
            cadena = cadena + sub.toString();
        }

        return cadena;
    }
}
