package com.elektra.uniformes.controller;

import Com.Elektra.Uniformes.Services.ConfiguracionService;
import Com.Elektra.Uniformes.Services.resp.ConfiguracionResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/config")
public class ConfiguracionController {

    private final ConfiguracionService service;

    @Autowired
    public ConfiguracionController(ConfiguracionService service) {
        this.service = service;
    }

    @RequestMapping(value = "/obtenerConfiguracion", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ConfiguracionResp obtenerConfiguracion() {
        return service.obtenerConfiguracion(0, 0, 0);
    }
}
