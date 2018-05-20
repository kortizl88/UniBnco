package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Log.Dao.LogeoAbstractoDAO;
import org.apache.log4j.Logger;
import org.apache.log4j.MDC;

import java.io.*;
import java.util.Properties;


public class LogDao {

    private static final Logger logger = Logger.getLogger(LogDao.class);

    private static final LogeoAbstractoDAO LOG_C3;

    static {
        Properties appConfig = new Properties();
        String archivoConfigLog = null;
        InputStream inputStream = null;
        try {
            inputStream = LogDao.class.getClassLoader().getResourceAsStream("app.config");
            appConfig.load(inputStream);
            archivoConfigLog = appConfig.getProperty("ARCHIVO_LOG");
        } catch (IOException e) {
            logger.error("No se pudo obtener la configuracion de app.config");
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    logger.error("Error al cerrar inputStream", e);
                }
            }
        }
        LOG_C3 = new LogeoAbstractoDAO(archivoConfigLog);
    }

    public static void logExcepcion(String message, Throwable t) {
        StringBuilder sb = new StringBuilder(message);
        if (t != null) {
            String NEW_LINE = System.getProperty("line.separator");
            sb.append(NEW_LINE);
            Writer writer = new StringWriter();
            PrintWriter printWriter = new PrintWriter(writer);
            t.printStackTrace(printWriter);
            sb.append(writer.toString());
        }
        logExcepcion(sb.toString());
    }

    public static void logExcepcion(String message) {
        Object idEmpleado = MDC.get("idEmpleado");
        Object direccionIP = MDC.get("direccionIP");
        if (idEmpleado != null || direccionIP != null) {
            LOG_C3.logExcepcion(String.format("\nEmpleado: %d - IP cliente: %s\n%s", MDC.get("idEmpleado"), MDC.get("direccionIP"), message));
        } else {
            LOG_C3.logExcepcion(message);
        }

    }
}
