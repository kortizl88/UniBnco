package com.elektra.uniformes.filter;

import com.elektra.uniformes.cyc.UserDataImpl;
import org.apache.log4j.MDC;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ConfiguraLogFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String direccionIP = servletRequest.getRemoteAddr();
        try {
            if (servletRequest instanceof HttpServletRequest) {
                Integer idEmpleado = (new UserDataImpl()).obtenerIdEmpleadoAutenticado((HttpServletRequest) servletRequest, (HttpServletResponse) servletResponse);
                if (idEmpleado != null) {
                    MDC.put("idEmpleado", idEmpleado);
                }
            }
            MDC.put("direccionIP", direccionIP);
            filterChain.doFilter(servletRequest, servletResponse);
        } finally {
            MDC.remove("direccionIP");
            MDC.remove("idEmpleado");
        }
    }

    public void destroy() {

    }
}
