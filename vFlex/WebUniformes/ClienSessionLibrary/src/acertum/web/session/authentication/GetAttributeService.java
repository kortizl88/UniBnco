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

public class GetAttributeService {
    private HttpServletRequest request;
    private HttpServletResponse response;
    private String urlServidorAuth;

    public GetAttributeService(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.urlServidorAuth = Config.obtenerParametro("urlAuthServer");
    }

    public Object getAttribute(String name) {
        Object obj = null;

        try {
            ObjetoSession e = (ObjetoSession) this.request.getSession().getAttribute("objetoSession");
            e.getAttribute(name);
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
            if (paquete == null) {
                Logeo.log("Ocurrio un error al leer el paquete. He recibido null");
                return null;
            }

            if (paquete.getName() == null && paquete.getValue() == null && paquete.getIdSession() == null) {
                Logeo.log("El objeto no se encontró, se ha seteado en null");
                obj = null;
            } else if (paquete.getName().equals("update")) {
                Logeo.log("El atributo se necesita actualizar. Hay una version superior en el servidor");
                e.setAttribute(name, paquete.getValue());
                this.request.getSession().setAttribute("objetoSession", e);
                obj = paquete.getValue();
            } else {
                Logeo.log("El atributo es el mismo que tengo en local");
                obj = e.getAttribute(name);
            }
        } catch (Exception var11) {
            Logeo.logearExcepcion(var11, new String[]{"Error  al enviar esto a una sesión remota"});
        }

        return obj;
    }
}
