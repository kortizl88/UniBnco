//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.arquitectura.utilidades;

import acertum.web.arquitectura.log.Logeo;

import java.io.*;
import java.util.Calendar;
import java.util.Properties;

public class Utilerias {
    public Utilerias() {
    }

    public static String desencripta(String dato) {
        return null;
    }

    public static String encripta(String dato) {
        return null;
    }

    public static String formatearFecha(Calendar date, Constantes.FORMATO_FECHA format) {
        return formatearFecha(date, format, "/");
    }

    public static String formatearFecha(Calendar fecha, Constantes.FORMATO_FECHA formato, String separador) {
        StringBuilder sb = new StringBuilder();
        String month = fecha.get(2) + 1 < 10 ? "0" + (fecha.get(2) + 1) : "" + (fecha.get(2) + 1);
        String day = fecha.get(5) < 10 ? "0" + fecha.get(5) : "" + fecha.get(5);
        String hour = fecha.get(11) < 10 ? "0" + fecha.get(11) : "" + fecha.get(11);
        String minute = fecha.get(12) < 10 ? "0" + fecha.get(12) : "" + fecha.get(12);
        String second = fecha.get(13) < 10 ? "0" + fecha.get(13) : "" + fecha.get(13);
        switch (formato) {
            case DD_MM_YYYY:
                sb.append(day + separador + month + separador + fecha.get(1));
                break;
            case YYYY_MM_DD:
                sb.append(fecha.get(1) + separador + month + separador + day);
                break;
            case DD_MM_YYYY_HH24_MI_SS:
                sb.append(day + separador + month + separador + fecha.get(1));
                sb.append(" " + hour + ":" + minute + ":" + second);
                break;
            case YYYY_MM_DD_HH24_MI_SS:
                sb.append(fecha.get(1) + separador + month + separador + day);
                sb.append(" " + hour + ":" + minute + ":" + second);
        }

        return sb.toString();
    }

    public static String obtenerFechaSimple() {
        return formatearFecha(Calendar.getInstance(), Constantes.FORMATO_FECHA.DD_MM_YYYY);
    }

    public static String obtenerPropiedadDesdeRecurso(String recurso, String propiedad) {
        String str = null;
        if (obtenerPropiedadesDesdeRecurso(recurso) != null) {
            str = obtenerPropiedadesDesdeRecurso(recurso).getProperty(propiedad);
        }

        return str;
    }

    public static String obtenerPropiedadDesdeArchivo(File file, String propiedad) {
        String str = null;

        try {
            if (!file.exists()) {
                throw new FileNotFoundException(file.getAbsolutePath() + " (El sistema no puede encontrar la ruta especificada)");
            }

            str = obtenerPropiedadesDesdeArchivo(file).getProperty(propiedad);
        } catch (Exception var4) {
            Logeo.logearExcepcion(var4, new String[0]);
        }

        return str;
    }

    public static Properties obtenerPropiedadesDesdeRecurso(String recurso) {
        Properties properties = null;

        try {
            InputStream e = Thread.currentThread().getContextClassLoader().getResourceAsStream(recurso);
            if (e == null) {
                throw new NullPointerException(recurso + " (No se puede encontrar el recurso especificado)");
            }

            properties = obtenerPropiedadesDesdeInputStream(e);
        } catch (Exception var3) {
            Logeo.logearExcepcion(var3, new String[0]);
        }

        return properties;
    }

    public static Properties obtenerPropiedadesDesdeArchivo(File file) {
        Properties properties = null;

        try {
            properties = obtenerPropiedadesDesdeInputStream(new FileInputStream(file));
        } catch (Exception var3) {
            Logeo.logearExcepcion(var3, new String[0]);
        }

        return properties;
    }

    private static Properties obtenerPropiedadesDesdeInputStream(InputStream is) throws IOException {
        Properties props = new Properties();
        props.load(is);
        is.close();
        return props;
    }
}
