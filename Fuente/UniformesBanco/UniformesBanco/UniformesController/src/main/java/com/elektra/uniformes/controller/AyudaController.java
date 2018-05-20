package com.elektra.uniformes.controller;

import Com.Elektra.Uniformes.Services.EnviaCorreoService;
import Com.Elektra.Uniformes.Services.resp.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/ayuda")
public class AyudaController {

    private final EnviaCorreoService correoService;

    private final IUserData userData;

    @Autowired
    public AyudaController(EnviaCorreoService correoService, IUserData userData) {
        this.correoService = correoService;
        this.userData = userData;
    }

    @RequestMapping(value = "/enviaCorreo", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ServiceResponse enviaCorreo(
            @RequestParam("nombre") String nombre,
            @RequestParam("email") String email,
            @RequestParam("telefono") String telefono,
            @RequestParam("mensaje") String mensaje,
            @RequestParam("asunto") String asunto,
            HttpServletRequest request, HttpServletResponse response) {
        Integer idEmpleado = userData.obtenerIdEmpleadoAutenticado(request, response);
        if (idEmpleado == null) {
            return null;
        }
        return correoService.enviaCorreo(idEmpleado, nombre, email, telefono, mensaje, asunto);
    }
}
