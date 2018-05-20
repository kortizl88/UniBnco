package com.elektra.uniformes.controller;

import Com.Elektra.Uniformes.Dto.ReposicionDto;
import Com.Elektra.Uniformes.Dto.SolicitudDto;
import Com.Elektra.Uniformes.Services.GrabaPedidoService;
import Com.Elektra.Uniformes.Services.ReposicionesService;
import Com.Elektra.Uniformes.Services.SolicitudUniformeService;
import Com.Elektra.Uniformes.Services.TiendaPorEmpleadoService;
import Com.Elektra.Uniformes.Services.resp.*;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/solicitud")
public class SolicitudController {

    private static final Logger log = Logger.getLogger(SolicitudController.class);

    private final TiendaPorEmpleadoService tiendasService;
    private final SolicitudUniformeService solicitudService;
    private final GrabaPedidoService grabaPedidoService;
    private final ReposicionesService reposicionesService;
    private final IUserData userData;

    private final long MAX_SIZE = 5242880;
    private final String[] VALID_EXT = {"jpg", "gif", "jpeg", "png", "bmp"};
    @Autowired
    public SolicitudController(
            TiendaPorEmpleadoService tiendasService,
            SolicitudUniformeService solicitudService,
            GrabaPedidoService grabaPedidoService,
            ReposicionesService reposicionesService, IUserData userData) {
        this.tiendasService = tiendasService;
        this.solicitudService = solicitudService;
        this.grabaPedidoService = grabaPedidoService;
        this.reposicionesService = reposicionesService;
        this.userData = userData;
    }

    @RequestMapping(value = "/consultaTiendas", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public TiendasResp consultaTiendasPorEmpleado(@RequestParam("idCia") Integer idCia, HttpServletRequest request, HttpServletResponse response) {
        Integer idEmpleado = userData.obtenerIdEmpleadoAutenticado(request, response);
        return tiendasService.getTiendasPorEmpleado(idEmpleado, idCia);
    }

    @RequestMapping(value = "/consultaKitUniforme", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ItemsSolicitudResp consultaKitUniforme(
            @RequestParam("idCia") Integer idCia,
            @RequestParam("idFuncion") Integer idFuncion,
            @RequestParam("genero") Integer genero,
            @RequestParam("tienda") Integer tienda,
            HttpServletRequest request, HttpServletResponse response) {
        Integer idEmpleado = userData.obtenerIdEmpleadoAutenticado(request, response);
        return solicitudService.consultaUniformes(idEmpleado, idCia, idFuncion, genero, tienda);
    }

    @RequestMapping(value = "/grabaPedido", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public GrabaPedidoResp grabaPedido(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            List<SolicitudDto> items = mapper.readValue(json, new TypeReference<List<SolicitudDto>>() {
            });
            return grabaPedidoService.grabaPedido(items);
        } catch (Exception e) {
            log.error("Ocurrio un error al procesar la petición", e);
            if (json != null) {
                log.error("json: " + StringUtils.normalizeSpace(json).replaceAll("\\n\\r|\\n|\\r", " "));
            }
            GrabaPedidoResp resp = new GrabaPedidoResp();
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("Ocurrió un error al procesar los datos. Favor de contactar a Soporte Técnico.");
            resp.setDetalleTecnico(e.toString());
            return resp;
        }
    }

    @RequestMapping(value = "/solicitaReposicion", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ReposicionResponse solicitaReposicion(MultipartHttpServletRequest request) {
        byte[] archivo = null;
        String nombreArchivo = null;
        String type = null;
        String reposicionJson = null;
        try {
            reposicionJson = request.getParameter("reposicionJson");
            ObjectMapper mapper = new ObjectMapper();
            ReposicionDto dto = mapper.readValue(reposicionJson, ReposicionDto.class);
            Iterator<String> itr = request.getFileNames();
            if (itr.hasNext()) {
                MultipartFile mpf = request.getFile(itr.next());
                List<String> validacionResult = validaArchivo(mpf);
                if (validacionResult.isEmpty()) {
                    archivo = mpf.getBytes();
                    nombreArchivo = mpf.getOriginalFilename();
                    type = mpf.getContentType();
                } else {
                    ReposicionResponse resp = new ReposicionResponse();
                    resp.setCodigo(-1);
                    resp.setDescripcionOperacion("Se detecto un archivo no válido, favor de verificar.");
                    resp.setDetalleTecnico(StringUtils.join(validacionResult, '\n'));
                    return resp;
                }

            }
            return reposicionesService.solicitaReposicion(dto, archivo, nombreArchivo, type);
        } catch (Exception e) {
            log.error("Ocurrio un error al procesar la petición", e);
            if (reposicionJson != null) {
                log.error("json: " + StringUtils.normalizeSpace(reposicionJson).replaceAll("\\n\\r|\\n|\\r", " "));
            }
            ReposicionResponse resp = new ReposicionResponse();
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("Ocurrió un error al procesar los datos. Favor de contactar a Soporte Técnico.");
            resp.setDetalleTecnico(e.toString());
            return resp;
        }
    }

    private List<String> validaArchivo(MultipartFile mpf) throws IOException {
        List<String> validacionResult = new LinkedList<String>();
        if (mpf.isEmpty()) {
            validacionResult.add(mpf.getOriginalFilename() + ": Archivo vacío.");
        }
        if (mpf.getBytes().length > MAX_SIZE) {
            validacionResult.add(mpf.getOriginalFilename() + ": El tamaño del archivo no puede ser mayor a 5MB.");
        }
        if (!mpf.getContentType().matches("image/(.+)")) {
            validacionResult.add(mpf.getOriginalFilename() + ": El tipo de contenido no es válido, sólo se aceptan imagenes.");
        }
        if (!Arrays.asList(VALID_EXT).contains(FilenameUtils.getExtension(mpf.getOriginalFilename()).toLowerCase())) {
            validacionResult.add(mpf.getOriginalFilename() + ": Solo se admiten los siguienes tipos de archivo: " + ArrayUtils.toString(VALID_EXT));
        }
        return validacionResult;
    }

    @RequestMapping(value = "/guardaSolicitudSinInventario", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ServiceResponse guardaSolicitudSinInventario(
            @RequestParam("idSubkit") Integer idSubkit,
            @RequestParam("sku") Integer sku,
            @RequestParam("sucursal") Integer sucursal,
            HttpServletRequest request, HttpServletResponse response) {
        Integer idEmpleado = userData.obtenerIdEmpleadoAutenticado(request, response);
        return solicitudService.guardaSolicitudSinInventario(idEmpleado, idSubkit, sku, sucursal);
    }
}
