package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Dao.ReposicionesDao;
import Com.Elektra.Uniformes.Dao.SolicitudUniformeDao;
import Com.Elektra.Uniformes.Dto.*;
import Com.Elektra.Uniformes.Services.resp.ItemsSolicitudResp;
import Com.Elektra.Uniformes.Services.resp.ServiceResponse;
import Com.Elektra.Uniformes.Services.resp.ValueResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

@Service("solicitudUniforme")
public class SolicitudUniformeService {

    private static final Logger LOGGER = Logger.getLogger(SolicitudUniformeService.class);

    private static final String ESTATUS_ENTREGADO = "1";
    private static final Integer AUTORIZADO_CON_COSTO = 20;
    private static final Integer AUTORIZADO_SIN_COSTO = 30;

    private final ReposicionesDao reposicionesDao;
    private final SolicitudUniformeDao dao;

    @Autowired
    public SolicitudUniformeService(SolicitudUniformeDao dao, ReposicionesDao reposicionesDao) {
        this.dao = dao;
        this.reposicionesDao = reposicionesDao;

    }

    public ItemsSolicitudResp consultaUniformes(Integer idEmp, Integer idCia, Integer idFunc, Integer genero, Integer tienda) {
        ItemsSolicitudResp resp = new ItemsSolicitudResp();
        try {
            KitUniformeDto kitUniforme = dao.consultaUniformes(
                    idEmp,
                    idCia,
                    idFunc,
                    genero,
                    tienda);
            if (kitUniforme == null) {
                resp.setCodigo(0);
                return resp;
            }
            validaKitUniforme(idEmp, idFunc, genero, kitUniforme);
            procesaEnsambles(tienda, kitUniforme);
            Boolean esPrimerKit = dao.consultaEsPrimerKit(idEmp, kitUniforme.getIdKit());
            kitUniforme.setEsPrimerKit(esPrimerKit);

            resp.setKitUniforme(kitUniforme);
            resp.setCodigo(0);
        } catch (Throwable t) {
            LOGGER.error("Error al consultar uniformes", t);
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("Se presento una excepcion interna al procesar los datos. Favor de contactar a soporte técnico");
            resp.setDetalleTecnico(t.toString());
        }
        return resp;
    }

    private void procesaEnsambles(Integer tienda, KitUniformeDto kitUniforme) {
        for (ItemUniformeDto item : kitUniforme.getItems()) {
            if (!item.getFlagValido()) {
                continue;
            }
            for (TallaDto talla : item.getTallas()) {
                for (PiezaDto pieza : talla.getPiezas()) {
                    if (pieza.getInventario() == 0) {
                        EnsambleDto ensamble = dao.obtenerEnsamble(pieza.getSku(), tienda);
                        if (ensamble != null) {
                            pieza.setSku(ensamble.getSku());
                            pieza.setInventario(ensamble.getInventario());
                            pieza.setCosto(ensamble.getCosto());
                        }
                    }
                }
            }
        }
    }

    private void validaKitUniforme(Integer idEmp, Integer idFunc, Integer genero, KitUniformeDto kitUniforme) {
        for (ItemUniformeDto item : kitUniforme.getItems()) {
            for (Integer idSubkit : item.getSubkitsIds()) {
                List<ValidacionResult> resultVal = dao.validaSolicitud(idEmp, idFunc, genero, idSubkit, item.getMesesRenovacion());
                if (resultVal.isEmpty()) {
                    item.setFlagValido(true);
                    item.setTipoSolicitud(ItemUniformeDto.TIPO_ORDINARIA);
                } else if (resultVal.get(0).getAplicaExcepcion()) {
                    item.setFlagValido(true);
                    item.setPrecioSubkit(item.getPrecioExtraordinario());
                    item.setTipoSolicitud(ItemUniformeDto.TIPO_EXT_CON_COSTO);
                } else {
                    String motivo = MessageFormat.format(resultVal.get(0).getDescripcionMotivo(), (Object[]) resultVal.get(0).getDatosMotivo().split(";"));
                    item.setMotivo(motivo);
                    ReposicionDto reposicion = reposicionesDao.consultaReposicion(idEmp, idSubkit);
                    if (reposicion == null) {
                        item.setFlagValido(false);
                        item.setAplicaReposicion(item.getAplicaReposicion() && resultVal.get(0).getEstatus().equals(ESTATUS_ENTREGADO));
                    } else {
                        item.setFlagValido(Arrays.asList(AUTORIZADO_CON_COSTO, AUTORIZADO_SIN_COSTO).contains(reposicion.getEstatus()));
                        item.setAplicaReposicion(false);
                        item.setFolioReposicion(reposicion.getFolioReposicion());
                        item.setEstatusReposicion(reposicion.getEstatus());
                        item.setObservacionesReposicion(reposicion.getObservaciones());
                        item.setPrecioSubkit(reposicion.getEstatus().equals(AUTORIZADO_SIN_COSTO) ? BigDecimal.ZERO : item.getPrecioExtraordinario());
                        item.setTipoSolicitud(reposicion.getEstatus().equals(AUTORIZADO_SIN_COSTO) ? ItemUniformeDto.TIPO_EXT_SIN_COSTO : ItemUniformeDto.TIPO_EXT_CON_COSTO);
                    }
                }
            }
        }
    }

    @Transactional
    public ServiceResponse guardaSolicitudSinInventario(Integer idEmpleado, Integer idSubkit, Integer sku, Integer sucursal) {
        ServiceResponse resp = new ServiceResponse();
        try {
            SolicitudSinInventarioDto dto = new SolicitudSinInventarioDto();
            dto.setIdEmpleado(idEmpleado);
            Calendar calendar = Calendar.getInstance();

            //Compatibilidad con el estandar ISO-8601
            calendar.setFirstDayOfWeek(Calendar.MONDAY);
            calendar.setMinimalDaysInFirstWeek(4);

            Integer year = calendar.get(Calendar.YEAR);
            Integer week = calendar.get(Calendar.WEEK_OF_YEAR);
            String periodo = String.format("%d%02d", year, week);
            dto.setPeriodo(Integer.parseInt(periodo));
            dto.setIdSubkit(idSubkit);
            dto.setSku(sku);
            dto.setSucursal(sucursal);
            dao.guardaSolicitudSinInventario(dto);
            resp.setCodigo(0);
        } catch (Throwable t) {
            LOGGER.error("Errror al grabar solicitud sin inventario", t);
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("Se presento una excepcion interna al procesar los datos. Favor de contactar a soporte técnico");
            resp.setDetalleTecnico(t.toString());
        }
        return resp;
    }

    public ValueResponse<List<CapturaMedidaDto>> consultaMedidasPorCarga(Integer idEmpleado, Integer idCarga) {
        ValueResponse<List<CapturaMedidaDto>> resp = new ValueResponse<List<CapturaMedidaDto>>();
        try {
            List<CapturaMedidaDto> medidas = dao.consultaMedidasParaCaptura(idEmpleado, idCarga);
            resp.setValue(medidas);
            resp.setCodigo(0);
        } catch (Throwable t) {
            LOGGER.error(
                    String.format("Error al consultar las medidas para captura. idEmpleado: %d, idCarga: %d", idEmpleado, idCarga),
                    t);
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("Se presento una excepcion interna al procesar los datos. Favor de contactar a soporte técnico");
            resp.setDetalleTecnico(t.toString());
        }
        return resp;
    }

    public ServiceResponse guardaMedidasCapturadas(GuardaCapturaMedidaDto captura) {
        ServiceResponse resp = new ServiceResponse();
        try {
            guardaCapturas(captura);
            resp.setCodigo(0);
        } catch (Throwable t) {
            LOGGER.error("Error al guardar la captura de medidas: " + captura.toString(), t);
            resp.setCodigo(-1);
            resp.setDescripcionOperacion("Error al guardar la captura de medidas. Favor de contactar a soporte técnico");
            resp.setDetalleTecnico(t.toString());
        }
        return resp;
    }

    @Transactional
    void guardaCapturas(GuardaCapturaMedidaDto captura) {
        dao.guardaCapturaDeMedida(captura);
        for (CapturaDetalleDto detalle : captura.getDetalle()) {
            dao.guardaCapturaDetalle(captura.getIdCaptura(), detalle);
        }
    }

}
