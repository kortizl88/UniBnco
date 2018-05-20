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
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class SetAttributeService {
    private HttpServletRequest request;
    private HttpServletResponse response;
    private String urlServidorAuth;

    public SetAttributeService(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.urlServidorAuth = Config.obtenerParametro("urlAuthServer");
    }

    public boolean setAttribute(String name, Object parameter) {
        ObjetoSession objetoSession = (ObjetoSession) this.request.getSession().getAttribute("objetoSession");
        objetoSession.setAttribute(name, parameter);

        boolean ok;
        try {
            String e = objetoSession.getIdSession();
            String url = this.urlServidorAuth + "/setSessionAttribute";
            URLConnection connection = (new URL(url)).openConnection();
            connection.setDoOutput(true);
            connection.setRequestProperty("user-agent", this.request.getHeader("user-agent"));
            connection.setRequestProperty("accept", this.request.getHeader("accept"));
            connection.setRequestProperty("accept-encoding", this.request.getHeader("accept-encoding"));
            connection.setRequestProperty("cookie", this.request.getHeader("cookie"));
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
            connection.connect();
            ObjectOutputStream objOutput = new ObjectOutputStream(connection.getOutputStream());
            AttributePacket packet = new AttributePacket(name, parameter, e);
            objOutput.writeObject(packet);
            objOutput.flush();
            objOutput.close();
            Scanner sc = new Scanner(connection.getInputStream());

            while (sc.hasNext()) {
                sc.next();
            }

            sc.close();
            ok = true;
        } catch (IOException var11) {
            Logeo.logearExcepcion(var11, new String[]{"Error al enviar un objeto: " + name});
            ok = false;
        }

        return ok;
    }
}
