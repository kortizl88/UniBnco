package com.elektra.uniformes.controller;

import Com.Elektra.Uniformes.Services.EstatusPedidoService;
import Com.Elektra.Uniformes.Services.resp.EstatusPedidoResp;
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
@RequestMapping("/estatus")
public class EstatusController {

    private final EstatusPedidoService estatusPedidoService;
    private final IUserData userData;

    @Autowired
    public EstatusController(EstatusPedidoService estatusPedidoService, IUserData userData) {
        this.estatusPedidoService = estatusPedidoService;
        this.userData = userData;
    }

    @RequestMapping(value = "/consultaFolios", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public FoliosResp consultaFolios(HttpServletRequest request, HttpServletResponse response) {
        Integer idEmpleado = userData.obtenerIdEmpleadoAutenticado(request, response);
        if (idEmpleado == null) {
            return null;
        }
        return estatusPedidoService.consultaFolios(idEmpleado);
    }

    @RequestMapping(value = "/consultaEstatus", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public EstatusPedidoResp consultaEstatus(@RequestParam("folio") String folio, HttpServletRequest request, HttpServletResponse response) {
        Integer idEmpleado = userData.obtenerIdEmpleadoAutenticado(request, response);
        if (idEmpleado == null) {
            return null;
        }
        return estatusPedidoService.consultaEstatus(folio, idEmpleado);
    }
}
