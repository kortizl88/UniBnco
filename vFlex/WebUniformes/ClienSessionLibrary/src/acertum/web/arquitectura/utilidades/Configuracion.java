//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.arquitectura.utilidades;

import acertum.web.arquitectura.log.Logeo;
import org.apache.log4j.Logger;

import java.io.File;
import java.util.Properties;

public class Configuracion {

    private static final Logger log = Logger.getLogger(Configuracion.class);

    private Properties configuracion = null;

    public static final String CFG_PATH = System.getProperty("oracle.j2ee.home") + File.separator + "config" + File.separator;
    ;

    public Configuracion(String _nombreArchivoPropiedades) {
        log.info("Ruta de las propiedades: " + CFG_PATH + _nombreArchivoPropiedades);
        this.configuracion = Utilerias.obtenerPropiedadesDesdeArchivo(new File(CFG_PATH + _nombreArchivoPropiedades));
    }

    public String obtenerParametro(String _parametro) {
        if (!this.configuracion.containsKey(_parametro)) {
            Logeo.log("No se encontr� la propiedad " + _parametro + " en el archivo de configuracion");
        }

        return this.configuracion.getProperty(_parametro);
    }
}
