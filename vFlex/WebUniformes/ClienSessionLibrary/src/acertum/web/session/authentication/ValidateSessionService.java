//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.authentication;

import acertum.web.arquitectura.log.Logeo;
import acertum.web.arquitectura.utilidades.Config;
import acertum.web.session.beans.ObjetoSession;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ValidateSessionService {
    private HttpServletRequest request;
    private HttpServletResponse response;
    private String urlServidorAuth;

    public ValidateSessionService(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.urlServidorAuth = Config.obtenerParametro("urlAuthServer");
    }

    public boolean validaSessionServer() {
        boolean haySession = false;
        HttpSession session = this.request.getSession();
        ObjetoSession objetoSession = (ObjetoSession) session.getAttribute("objetoSession");
        if (objetoSession != null) {
            String idSession = objetoSession.getIdSession();
            String url = this.urlServidorAuth + "/updateSession?ticket=" + idSession;

            try {
                URLConnection e = (new URL(url)).openConnection();
                e.setDoOutput(true);
                e.setRequestProperty("user-agent", this.request.getHeader("user-agent"));
                e.setRequestProperty("accept", this.request.getHeader("accept"));
                e.setRequestProperty("accept-encoding", this.request.getHeader("accept-encoding"));
                e.setRequestProperty("cookie", this.request.getHeader("cookie"));
                e.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                e.connect();
                Scanner sc = new Scanner(e.getInputStream());

                while (sc.hasNext()) {
                    haySession = Boolean.valueOf(sc.next()).booleanValue();
                    Logeo.log("Hay sessión en el servidor: " + haySession);
                }

                sc.close();
                e.getInputStream().close();
            } catch (IOException var8) {
                Logeo.logearExcepcion(var8, new String[]{"Error al validar la sessión"});
            }
        }

        return haySession;
    }
}
