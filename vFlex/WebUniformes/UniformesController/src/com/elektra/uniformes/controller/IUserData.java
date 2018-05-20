package com.elektra.uniformes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IUserData {
    Integer obtenerIdEmpleadoAutenticado(HttpServletRequest request, HttpServletResponse response);
}
