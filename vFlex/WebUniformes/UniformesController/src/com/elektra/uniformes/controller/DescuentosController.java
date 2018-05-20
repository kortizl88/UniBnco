package com.elektra.uniformes.controller;

import Com.Elektra.Uniformes.Services.DescuentosService;
import Com.Elektra.Uniformes.Services.resp.DescuentosResp;
import Com.Elektra.Uniformes.Services.resp.FoliosResp;
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
@RequestMapping("/descuentos")
public class DescuentosController {

    private final DescuentosService descuentosService;

    private final IUserData userData;

    @Autowired
    public DescuentosController(DescuentosService descuentosService, IUserData userData) {
        this.descuentosService = descuentosService;
        this.userData = userData;
    }

    @RequestMapping(value = "/consultaFolios", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public FoliosResp consultaFolio(HttpServletRequest request, HttpServletResponse response) {
        Integer idEmpleado = userData.obtenerIdEmpleadoAutenticado(request, response);
        if (idEmpleado == null) {
            return null;
        }
        return descuentosService.consultaFolio(idEmpleado);
    }

    @RequestMapping(value = "/consultaDescuentos", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public DescuentosResp consDescEmp(@RequestParam("folio") String folio, HttpServletRequest request, HttpServletResponse response) {
        Integer idEmpleado = userData.obtenerIdEmpleadoAutenticado(request, response);
        if (idEmpleado == null) {
            return null;
        }
        return descuentosService.consDescEmp(idEmpleado, folio);
    }
}
