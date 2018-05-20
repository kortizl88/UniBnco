//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.filters;

import acertum.web.arquitectura.utilidades.Config;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "LogoutServlet",
        urlPatterns = {"/logout"}
)
public class LogoutServlet extends HttpServlet {
    private String authServerUrl;

    public LogoutServlet() {
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.authServerUrl = Config.obtenerParametro("urlAuthServer") + "/logout";
        SecurityContext securityContext = SecurityContextHolder.getContext();
        securityContext.getAuthentication().setAuthenticated(false);
        SecurityContextHolder.clearContext();
        request.getSession().setAttribute("logoutType", "byLogout");
        request.getSession().invalidate();
        response.setHeader("cache-control", "private, max-age=0, no-cache");
        response.sendRedirect(this.authServerUrl);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.processRequest(request, response);
    }

    public String getServletInfo() {
        return "Short description";
    }
}
