package com.elektra.uniformes.cyc;

import com.elektra.uniformes.controller.IUserData;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserDataImpl implements IUserData {
    public Integer obtenerIdEmpleadoAutenticado(HttpServletRequest request, HttpServletResponse response) {
        Integer idEmpleado = (Integer) request.getSession().getAttribute("idEmpleado");
        if (idEmpleado == null) {
            request.getSession().invalidate();
            response.setHeader("SESSION_EXPIRED", "true");
            return null;
        } else {
            return idEmpleado;
        }
    }
}
