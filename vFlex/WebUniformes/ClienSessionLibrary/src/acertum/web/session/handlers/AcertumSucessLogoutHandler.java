//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.handlers;

import acertum.web.arquitectura.utilidades.Config;
import acertum.web.session.beans.ObjetoSession;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class AcertumSucessLogoutHandler implements LogoutSuccessHandler {
    public AcertumSucessLogoutHandler() {
    }

    public void onLogoutSuccess(HttpServletRequest hsr, HttpServletResponse hsr1, Authentication a) throws IOException, ServletException {
        String urlServidorAuth = Config.obtenerParametro("urlAuthServer");
        HttpServletRequest request = hsr;
        HttpServletResponse response = hsr1;
        HttpSession httpSession = hsr.getSession();
        String myUrl = hsr.getScheme() + "://" + hsr.getServerName() + ":" + hsr.getServerPort() + hsr.getRequestURI();
        if (httpSession != null) {
            try {
                Boolean isLogout = (Boolean) httpSession.getAttribute("logout");
                Boolean isExpire = (Boolean) httpSession.getAttribute("expire");
                if (isExpire.booleanValue()) {
                    this.doExpire(request, response);
                } else {
                    this.doGlobalLogout(request, urlServidorAuth);
                    String e = hsr.getRequestURI();
                    e = e.substring(0, e.lastIndexOf(47));
                    myUrl = hsr.getScheme() + "://" + hsr.getServerName() + ":" + hsr.getServerPort() + e;
                    hsr1.sendRedirect(myUrl);
                }
            } catch (NullPointerException var12) {
                this.doExpire(hsr, hsr1);
            }
        }

    }

    private void doExpire(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession httpSession = request.getSession();
        httpSession.invalidate();
        PrintWriter print = response.getWriter();
        print.write("ok");
        print.close();
    }

    private void doGlobalLogout(HttpServletRequest request, String urlServidorAuth) throws MalformedURLException, IOException {
        HttpSession httpSession = request.getSession();
        ObjetoSession obj = (ObjetoSession) httpSession.getAttribute("objetoSession");
        if (obj != null) {
            String ticket = obj.getIdSession();
            String url = urlServidorAuth + "/logout?ticket=" + ticket;
            URLConnection connection = (new URL(url)).openConnection();
            connection.setDoOutput(true);
            connection.setRequestProperty("user-agent", request.getHeader("user-agent"));
            connection.setRequestProperty("accept", request.getHeader("accept"));
            connection.setRequestProperty("accept-encoding", request.getHeader("accept-encoding"));
            connection.setRequestProperty("cookie", request.getHeader("cookie"));
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
            connection.connect();
            Scanner sc = new Scanner(connection.getInputStream());

            while (true) {
                if (!sc.hasNext()) {
                    sc.close();
                    connection.getInputStream().close();
                    break;
                }
            }
        }

        httpSession.invalidate();
    }
}
