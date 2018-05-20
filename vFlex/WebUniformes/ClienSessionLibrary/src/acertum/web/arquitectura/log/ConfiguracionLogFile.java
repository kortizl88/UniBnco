//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.arquitectura.log;


import Com.Elektra.Log.Dao.LogeoAbstractoDAO;

import javax.naming.Context;
import java.util.ArrayList;

public class ConfiguracionLogFile {
    public static ArrayList<LogeoAbstractoDAO> loggeosAbstractos = null;

    static {
        loggeosAbstractos = new ArrayList();
    }

    public ConfiguracionLogFile() {
    }

    public static int agregarPropertiesLoggeo(String _nombreProperties, Context _contexto) throws Exception {
        boolean indice = true;

        try {
            LogeoAbstractoDAO e = new LogeoAbstractoDAO(_nombreProperties);
            e.setContext(_contexto);
            loggeosAbstractos.add(e);
            int indice1 = loggeosAbstractos.indexOf(e);
            return indice1;
        } catch (Exception var4) {
            throw new Exception("ConfiguracionLogFile. Error al obtener el nombre del properties:" + _nombreProperties + "Causa:" + var4.getLocalizedMessage());
        }
    }

    public static LogeoAbstractoDAO obtenerLoggeo(int _indice) {
        LogeoAbstractoDAO temp = null;

        try {
            temp = (LogeoAbstractoDAO) loggeosAbstractos.get(_indice);
        } catch (IndexOutOfBoundsException var3) {
            System.err.print("IndexOutOfBoundsException-ConfiguracionLogFile. Error al obtener el LogeoAbstracto el indice " + _indice + " no existe - Causa:" + var3.getLocalizedMessage());
        } catch (Exception var4) {
            System.err.print("Exception-ConfiguracionLogFile. Error al obtener el LogeoAbstracto con indice:" + _indice + " - Causa:" + var4.getLocalizedMessage());
        }

        return temp;
    }
}
