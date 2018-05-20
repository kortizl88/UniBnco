//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.authentication;

import acertum.web.arquitectura.log.Logeo;
import acertum.web.arquitectura.utilidades.Config;
import acertum.web.session.beans.AttributePacket;
import acertum.web.session.beans.ObjetoSession;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ObjectInputStream;
import java.net.URL;
import java.net.URLConnection;

public class GetAttributeService_conValidacionenServer {
    private HttpServletRequest request;
    private HttpServletResponse response;
    private String urlServidorAuth;

    public GetAttributeService_conValidacionenServer(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.urlServidorAuth = Config.obtenerParametro("urlAuthServer");
    }

    public Object getAttribute(String name) {
        Object obj = null;

        try {
            ObjetoSession e = (ObjetoSession) this.request.getSession().getAttribute("objetoSession");
            String ticket = e.getIdSession();
            Object attribute = e.getAttribute(name);
            int hashcode;
            if (attribute != null) {
                hashcode = attribute.hashCode();
            } else {
                hashcode = -1;
            }

            String url = String.format("%s/getSessionAttribute?ticket=%s&name=%s&hashcode=%d", new Object[]{this.urlServidorAuth, ticket, name, Integer.valueOf(hashcode)});
            URLConnection connection = (new URL(url)).openConnection();
            connection.setDoOutput(true);
            connection.setRequestProperty("user-agent", this.request.getHeader("user-agent"));
            connection.setRequestProperty("accept", this.request.getHeader("accept"));
            connection.setRequestProperty("accept-encoding", this.request.getHeader("accept-encoding"));
            connection.setRequestProperty("cookie", this.request.getHeader("cookie"));
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
            connection.connect();
            ObjectInputStream objInputStream = new ObjectInputStream(connection.getInputStream());
            AttributePacket paquete = (AttributePacket) objInputStream.readObject();
            objInputStream.close();
            connection.getInputStream().close();
            if (paquete != null) {
                String log = String.format("El paquete: %s  Valor: %s   IdSession:%s", new Object[]{paquete.getName(), paquete.getValue(), paquete.getIdSession()});
                Logeo.log(log);
            }

            if (paquete == null) {
                Logeo.log("Ocurrió un error al recibir el paquete. Llego null");
                return null;
            }

            if (paquete.getName() == null && paquete.getValue() == null && paquete.getIdSession() == null) {
                Logeo.log("No se enconró el objeto de sessión");
                obj = null;
            } else if (paquete.getName().equals("update")) {
                Logeo.log("Existe una versión superior en el servidor. Actualizando parametro");
                e.setAttribute(name, paquete.getValue());
                this.request.getSession().setAttribute("objetoSession", e);
                obj = paquete.getValue();
            } else {
                obj = e.getAttribute(name);
            }
        } catch (Exception var12) {
            Logeo.logearExcepcion(var12, new String[]{"Error."});
        }

        return obj;
    }
}
