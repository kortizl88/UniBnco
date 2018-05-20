//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.beans;

import java.io.Serializable;

public class Sistema implements Serializable {
    private int idSistema;
    private String nombreSistema;
    private String url;
    private Modulo[] modulos;
    private static final long serialVersionUID = -4121959087715571875L;

    public Sistema(int idSistema, String nombreSistema, String url, Modulo[] modulos) {
        this.idSistema = idSistema;
        this.nombreSistema = nombreSistema;
        this.url = url;
        this.modulos = modulos;
    }

    public int getIdSistema() {
        return this.idSistema;
    }

    public String getNombreSistema() {
        return this.nombreSistema;
    }

    public Modulo[] getModulos() {
        return this.modulos;
    }

    public String getUrl() {
        return this.url;
    }

    public void setModulos(Modulo[] modulos) {
        this.modulos = modulos;
    }

    public String toString() {
        String cadena = "id sistema: " + this.idSistema + "  Sistema:" + this.nombreSistema + "\n";
        Modulo[] var2 = this.modulos;
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            Modulo mod = var2[var4];
            cadena = cadena + mod.toString();
        }

        return cadena;
    }
}
