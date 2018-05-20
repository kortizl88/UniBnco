//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.filters;

import acertum.web.arquitectura.log.Logeo;
import acertum.web.arquitectura.utilidades.Config;
import acertum.web.session.authentication.GetSessionService;
import acertum.web.session.authentication.ValidateSessionService;
import acertum.web.session.handlers.CustomClientSuccessAuthenticationHandler;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(
        filterName = "filtroLogin",
        urlPatterns = {"/*"}
)
public class LoginFilter implements Filter {
    private String urlServidorAuth;
    @Inject
    CustomClientSuccessAuthenticationHandler sucessfullLoginClientHandler;

    public LoginFilter() {
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        this.urlServidorAuth = Config.obtenerParametro("urlAuthServer");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse HttpResponse = (HttpServletResponse) response;
        HttpServletRequest HttpRequest = (HttpServletRequest) request;
        String myUrl = HttpRequest.getScheme() + "://" + HttpRequest.getServerName() + ":" + HttpRequest.getServerPort() + HttpRequest.getRequestURI();
        Boolean haySession = Boolean.valueOf(this.isLoggued(HttpRequest, HttpResponse));
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        httpResponse.setHeader("Pragma", "no-cache");
        if (haySession.booleanValue()) {
            chain.doFilter(request, response);
        } else if (HttpRequest.getParameter("ticket") != null) {
            String ticket = HttpRequest.getParameter("ticket");
            GetSessionService getSessionService = new GetSessionService(HttpRequest, HttpResponse);
            getSessionService.getSession(ticket);
            if (HttpRequest.getSession().getAttribute("objetoSession") != null) {
                this.ejecutarCustomLoginSuccessHandler(HttpRequest, HttpResponse);
                chain.doFilter(request, response);
            } else {
                HttpResponse.sendRedirect(this.urlServidorAuth + "/login?url=" + myUrl);
            }
        } else {
            HttpResponse.sendRedirect(this.urlServidorAuth + "/login?url=" + myUrl);
        }

    }

    public void destroy() {
    }

    private boolean isLoggued(HttpServletRequest request, HttpServletResponse response) {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        Authentication auth = securityContext.getAuthentication();
        boolean haySession;
        if (auth.getPrincipal() instanceof UserDetails) {
            Logeo.log("Autenticado a nivel local");
            ValidateSessionService validateSession = new ValidateSessionService(request, response);
            Boolean isLoguedAtServer = Boolean.valueOf(validateSession.validaSessionServer());
            Logeo.log("Autenticado en el servidor?: " + isLoguedAtServer);
            haySession = isLoguedAtServer.booleanValue();
            if (!haySession) {
                request.getSession().invalidate();
            }
        } else {
            haySession = false;
        }

        return haySession;
    }

    private void ejecutarCustomLoginSuccessHandler(HttpServletRequest request, HttpServletResponse response) {
        String firstLogin = (String) request.getSession().getAttribute("firstLogin");
        if (firstLogin == null) {
            if (this.sucessfullLoginClientHandler != null) {
                this.sucessfullLoginClientHandler.customCode();
            }

            request.getSession().setAttribute("firstLogin", "true");
        }

    }
}
