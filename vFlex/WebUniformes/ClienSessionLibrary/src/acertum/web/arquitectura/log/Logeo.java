//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.arquitectura.log;

import Com.Elektra.Log.Dao.LogeoAbstractoDAO;
import acertum.web.arquitectura.utilidades.Config;

public class Logeo {
    public static final int TIPO_LOGGEO_REQUEST = 1;
    public static final int TIPO_LOGGEO_RESPONSE = 2;
    private static final int TIPO_LOGGEO_DEFAULT = 4;

    private static final LogeoAbstractoDAO LOG = new LogeoAbstractoDAO("WebUniformeslog.properties");

    public Logeo() {
    }

    public static void logearExcepcion(Exception e, String... parametros) {
        LOG.logExcepcion(formatearMensaje(e, parametros));
    }

    public static void logearExcepcionBD(Exception e, String... parametros) {
        LOG.logExcepcion(formatearMensaje(e, parametros));
    }

    public static String formatearMensaje(Exception e, String... parametros) {
        StringBuilder strException = new StringBuilder();
        StackTraceElement frame = obtenerPilaLlamadas();
        strException.append("[" + e.getClass().getName() + "]@");
        strException.append("[" + frame.getClassName() + ", " + frame.getMethodName() + ", l�nea: " + frame.getLineNumber() + "]@");
        strException.append("[" + e.getLocalizedMessage() + "]:");
        if (parametros.length > 0) {
            strException.append("[");
            String[] var7 = parametros;
            int var6 = parametros.length;

            for (int var5 = 0; var5 < var6; ++var5) {
                String parametro = var7[var5];
                strException.append(parametro).append(", ");
            }

            strException.replace(strException.lastIndexOf(", "), strException.lastIndexOf(", ") + 2, "]");
        }

        return strException.toString();
    }

    public static void log(String mensaje) {
        if (Boolean.parseBoolean(Config.obtenerParametro("serverlog.habilitado"))) {
            StackTraceElement frame = obtenerPilaLlamadas();
            LOG.logXMLRequestResponse(4, "[" + frame.getClassName() + ", " + frame.getMethodName() + ", l�nea: " + frame.getLineNumber() + "] " + mensaje);
        }

    }

    public static LogeoAbstractoDAO obtenerLog() {
        return LOG;
    }

    private static StackTraceElement obtenerPilaLlamadas() {
        StackTraceElement[] pila = (new Throwable()).getStackTrace();
        int c = 0;

        for (int i = 0; i < pila.length; ++i) {
            StackTraceElement frame = pila[i];
            if (frame.getClassName().equals("neto.sion.genericos.log.Logeo")) {
                c = i;
            }
        }

        return pila[c + 1];
    }
}
