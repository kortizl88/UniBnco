package com.gsalinas.uniformes.servlets;

import com.gsalinas.uniformes.crypt.CryptProcs;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndexServlet extends HttpServlet {
    private static final Logger log = Logger.getLogger(IndexServlet.class);
    private static final String MEXICO = "1";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String noempleado = null;
        String sucursal = null;
        String canal = null;
        String pais = null;

        //Ingreso por AdministraCambaceo
        if (request.getParameter("noempleado") != null) {
            noempleado = request.getParameter("noempleado");
        }

        //Ingreso por InternetAdnXP con parametro
        if (request.getParameter("noEmpleado") != null) {
            noempleado = request.getParameter("noEmpleado");
        }

        //Ingreso por InternetAdnXP con parametros
        if (request.getParameter("Usuario") != null) {
            noempleado = request.getParameter("Usuario");
            sucursal = request.getParameter("Sucursal");
            canal = request.getParameter("Canal");
            pais = MEXICO;
        }

        //Ingreso por gdiNavegadorJ con parametros
        if (request.getParameter("numempleado") != null) {
            noempleado = request.getParameter("numempleado");
            sucursal = request.getParameter("sucursal");
            canal = request.getParameter("canal");
            pais = request.getParameter("pais");
        }

        if (noempleado == null) {
            response.sendError(400, "Se esperaba el numero de empleado. Favor de verificar");
            return;
        }

        if (StringUtils.isNumeric(noempleado)) {

            request.getSession().setAttribute("idEmpleado", noempleado);
            request.getSession().setAttribute("Sucursal", sucursal);
            request.getSession().setAttribute("Canal", canal);
            request.getSession().setAttribute("Pais", pais);

            RequestDispatcher dispatcher = request.getRequestDispatcher("UniformesFlex.jsp");
            dispatcher.forward(request, response);
            return;
        }

        try {
            Pattern pattern = Pattern.compile("[0-9]+$");
            CryptProcs cp = new CryptProcs();
            String cadenaDesencriptada = cp.decryptNOBlock(noempleado.trim());
            Matcher matcher = pattern.matcher(cadenaDesencriptada);
            if (matcher.find()) {
                String idEmpleado = matcher.group();
                request.getSession().setAttribute("idEmpleado", idEmpleado);
                RequestDispatcher dispatcher = request.getRequestDispatcher("UniformesFlex.jsp");
                dispatcher.forward(request, response);
            } else {
                log.error("No se encontró el numero de empleado en el parámetro desencriptado: " + cadenaDesencriptada);
                response.sendError(400, "No se encontro el numero de empleado en el parametro desencriptado. Favor de contactar a soporte tecnico");
            }
        } catch (Exception e) {
            log.error("Error al desencriptar parámetro 'noempleado': " + noempleado, e);
            response.sendError(500, "Error al desencriptar parametro 'noempleado'. Favor de contactar a soporte tecnico");
        }

    }
}
