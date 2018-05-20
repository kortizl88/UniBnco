package com.elektra.uniformes.controller;

import Com.Elektra.Uniformes.Services.DatosEmpleadoService;
import Com.Elektra.Uniformes.Services.PosicionAyudaService;
import Com.Elektra.Uniformes.Services.SolicitudesExternasService;
import Com.Elektra.Uniformes.Services.resp.DatosEmpleadoResp;
import Com.Elektra.Uniformes.Services.resp.PosicionAyudaResp;
import Com.Elektra.Uniformes.Services.resp.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {

    private final DatosEmpleadoService datosEmpleadoService;
    private final PosicionAyudaService posicionAyudaService;
    private final SolicitudesExternasService solicitudesExternasService;
    private final IUserData userData;

    @Autowired
    public EmpleadoController(
            DatosEmpleadoService datosEmpleadoService,
            PosicionAyudaService posicionAyudaService,
            SolicitudesExternasService solicitudesExternasService, IUserData userData) {
        this.datosEmpleadoService = datosEmpleadoService;
        this.posicionAyudaService = posicionAyudaService;
        this.solicitudesExternasService = solicitudesExternasService;
        this.userData = userData;
    }

    @RequestMapping(value = "/consultaDatos", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public DatosEmpleadoResp consultaEmpleadoDatos(HttpServletRequest request, HttpServletResponse response) {
        Integer idEmpleado = userData.obtenerIdEmpleadoAutenticado(request, response);
        if (idEmpleado == null) {
            return null;
        }
        return datosEmpleadoService.consultaEmpleadoDatos(idEmpleado);
    }

    @RequestMapping(value = "/consultaPosicionAyuda", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public PosicionAyudaResp consultaPosicionAyuda(HttpServletRequest request, HttpServletResponse response) {
        Integer idEmpleado = userData.obtenerIdEmpleadoAutenticado(request, response);
        if (idEmpleado == null) {
            return null;
        }
        return posicionAyudaService.consultaPosicionAyuda(idEmpleado);
    }

    @RequestMapping(value = "/retreiveSolicitudesExternas", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ServiceResponse retreiveSolicitudesExternas(HttpServletRequest request, HttpServletResponse response) {
        Integer idEmpleado = userData.obtenerIdEmpleadoAutenticado(request, response);
        if (idEmpleado == null) {
            return null;
        }
        return solicitudesExternasService.retreiveSolicitudesExternas(idEmpleado);
    }
}
