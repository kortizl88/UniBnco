//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.listeners;

import acertum.web.arquitectura.log.Logeo;
import acertum.web.arquitectura.utilidades.Config;
import acertum.web.session.beans.ObjetoSession;
import acertum.web.session.handlers.CustomClientSuccessLogoutHandler;
import org.springframework.security.web.session.HttpSessionEventPublisher;

import javax.inject.Inject;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

@WebListener
public class ExpirationLogoutListenerClient extends HttpSessionEventPublisher {
    @Inject
    CustomClientSuccessLogoutHandler handler;

    public ExpirationLogoutListenerClient() {
    }

    public void sessionDestroyed(HttpSessionEvent event) {
        String logoutType = (String) event.getSession().getAttribute("logoutType");
        if (logoutType == null) {
            this.expireSessionOnServer(event.getSession());
        }

        this.ejecutarCustomSuccessLogoutHandler();
        super.sessionDestroyed(event);
    }

    private void expireSessionOnServer(HttpSession session) {
        try {
            String e = Config.obtenerParametro("urlAuthServer");
            ObjetoSession sessionObj = (ObjetoSession) session.getAttribute("objetoSession");
            String idSession = sessionObj.getIdSession();
            String referer = Config.obtenerParametro("myDomain");
            String stringURL = e + "/sessionExpired";
            URL url = new URL(stringURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
            String urlParametros = String.format("ticket=%s&referer=%s", new Object[]{idSession, referer});
            DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
            wr.writeBytes(urlParametros);
            wr.flush();
            wr.close();
            Scanner scanner = new Scanner(conn.getInputStream());

            while (scanner.hasNext()) {
                Logeo.log("respuesta invalidate Invalidate session on Service. " + scanner.next());
            }
        } catch (Exception var12) {
            Logeo.logearExcepcion(var12, new String[]{"Cualquier mensaje."});
        }

    }

    private void ejecutarCustomSuccessLogoutHandler() {
        if (this.handler != null) {
            this.handler.customCodeOnLogout();
        }

    }
}
