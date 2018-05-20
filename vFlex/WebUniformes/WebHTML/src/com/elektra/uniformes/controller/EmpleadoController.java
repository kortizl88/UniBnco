package com.elektra.uniformes.controller;

import Com.Elektra.Uniformes.Services.DatosEmpleadoService;
import Com.Elektra.Uniformes.Services.resp.DatosEmpleadoResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {

    private final DatosEmpleadoService datosEmpleadoService;

    @Autowired
    public EmpleadoController(DatosEmpleadoService datosEmpleadoService) {
        this.datosEmpleadoService = datosEmpleadoService;
    }

    @RequestMapping(value = "/consultaDatos", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public DatosEmpleadoResp consultaEmpleadoDatos(@RequestParam("idEmpleado") Integer idEmp) {
        return datosEmpleadoService.consultaEmpleadoDatos(idEmp);
    }
}
