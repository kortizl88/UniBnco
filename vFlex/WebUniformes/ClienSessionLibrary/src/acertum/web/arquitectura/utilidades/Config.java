//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.arquitectura.utilidades;

public class Config {
    private static final Configuracion CONFIG_PROPIEDADES;

    static {
        CONFIG_PROPIEDADES = new Configuracion("WebUniformes.properties");
    }

    public Config() {
    }

    public static String obtenerParametro(String _parametro) {
        return CONFIG_PROPIEDADES.obtenerParametro(_parametro);
    }
}
