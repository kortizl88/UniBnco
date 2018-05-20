package Com.Elektra.Uniformes.Config;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfiguraAccesos {

    private static final Logger log = Logger.getLogger(ConfiguraAccesos.class);

    private static final String CFG_PATH = System.getProperty("oracle.j2ee.home");

    public static final String DATASOURCEORACLE;
    public static final String SPOBTIENEDATOSEMPLEADO;
    public static final String SPOBTIENETIENDAS;
    public static final String SPOBTIENESKU;
    public static final String SPRECOGEPEDIDO;
    public static final String MAILRESPONSABLE;
    public static final String IPSERVERMAIL;
    public static final String SPOBTIENEFOLIO;
    public static final String FNOBTIENEPEDIDO;
    public static final String SP_OBTIENE_POSICION_AYUDA;
    public static final String FNOBTIENEPEDIDOSPENDIENTES;
    public static final String IP_SERV_HUELLAS;
    public static final String SPSOLVALPED;
    public static final String SPSOLINSPED;
    public static final String SPCONSULTAPEDIDOSPORFILTRO = "{call RHEKT.PAWEBUNIFORMES.SPCONSULTAPEDIDOSPORFILTRO(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";

    public static final String WS_ABASTO_ACTION;
    public static final String WS_ABASTO_OP_QNAME;
    public static final String WS_ABASTO_ENDPOINT;
    public static final String WS_JSA_ITALIKA;
    public static final String WS_CANCELA_ABASTO;

    public static final String SCHEMA;
    public static final String PACKAGE;
    public static final String SPACTUALIZAMSGABASTO;
    public static final String SPCONSULTAIPTIENDA;
    public static final String FNSOLFOLIOENTREGA;
    public static final String FUNCIONES_ENTREGA;
    public static final String FUNCIONES_TRACKING;
    public static final String ASUNTO_REPOSICION;
    public static final String URL_AUTORIZA;

    static {
        Properties properties = new Properties();
        Properties appConfig = new Properties();
        InputStream inputStream = null;
        try {
            inputStream = ConfiguraAccesos.class.getClassLoader().getResourceAsStream("app.config");
            appConfig.load(inputStream);
            String archivoConfig = File.separator + "config" + File.separator + appConfig.getProperty("ARCHIVO_CONFIG");
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(CFG_PATH + archivoConfig);
                properties.load(fileInputStream);
            } finally {
                if (fileInputStream != null) {
                    safeClose(fileInputStream);
                }
            }
        } catch (IOException e) {
            log.error("Se genero una excepcion al cargar la configuracion del sistema.", e);
        } finally {
            if (inputStream != null) {
                safeClose(inputStream);
            }
            
        }
        DATASOURCEORACLE = properties.getProperty("DATASOURCEORACLE");
        SPOBTIENEDATOSEMPLEADO = properties.getProperty("SPOBTIENEDATOSEMPLEADO");
        SPOBTIENETIENDAS = properties.getProperty("SPOBTIENETIENDAS");
        SPOBTIENESKU = properties.getProperty("SPOBTIENESKU");
        SPRECOGEPEDIDO = properties.getProperty("SPRECOGEPEDIDO");
        MAILRESPONSABLE = properties.getProperty("MAILRESPONSABLE");
        IPSERVERMAIL = properties.getProperty("IPSERVERMAIL");
        SPOBTIENEFOLIO = properties.getProperty("SPOBTIENEFOLIO");
        FNOBTIENEPEDIDO = properties.getProperty("FNOBTIENEPEDIDO");
        SP_OBTIENE_POSICION_AYUDA = properties.getProperty("SPOBTIENEPOSICIONAYUDA");
        FNOBTIENEPEDIDOSPENDIENTES = properties.getProperty("FNOBTIENEPEDIDOSPENDIENTES");
        IP_SERV_HUELLAS = properties.getProperty("IPSERVHUELLAS");
        SPSOLVALPED = properties.getProperty("SPSOLVALPED");
        SPSOLINSPED = properties.getProperty("SPSOLINSPED");
        FUNCIONES_ENTREGA = properties.getProperty("FUNCIONES_ENTREGA");

        SCHEMA = properties.getProperty("SCHEMA");
        PACKAGE = properties.getProperty("PACKAGE");
        SPACTUALIZAMSGABASTO = properties.getProperty("SPACTUALIZAMSGABASTO");
        SPCONSULTAIPTIENDA = properties.getProperty("SPCONSULTAIPTIENDA");
        FNSOLFOLIOENTREGA = properties.getProperty("FNSOLFOLIOENTREGA");

        FUNCIONES_TRACKING = properties.getProperty("FUNCIONES_TRACKING");

        ASUNTO_REPOSICION = properties.getProperty("ASUNTO_REPOSICION");
        URL_AUTORIZA = properties.getProperty("URL_AUTORIZA");

        WS_ABASTO_ACTION = properties.getProperty("WS_ABASTO_ACTION");
        WS_ABASTO_OP_QNAME = properties.getProperty("WS_ABASTO_OP_QNAME");
        WS_ABASTO_ENDPOINT = properties.getProperty("WS_ABASTO_ENDPOINT");
        WS_JSA_ITALIKA = properties.getProperty("WS_JSA_ITALIKA");
        WS_CANCELA_ABASTO = properties.getProperty("WS_CANCELA_ABASTO");

        log.debug("URL_AUTORIZA=" + URL_AUTORIZA);
    }

    private static void safeClose(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                log.error("Se genero una excepcion al cerrar inputStream.", e);
            }
        }
    }
}
