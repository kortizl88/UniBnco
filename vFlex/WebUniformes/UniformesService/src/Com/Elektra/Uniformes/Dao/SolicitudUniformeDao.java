package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.*;
import Com.Elektra.Uniformes.map.SolicitudUniformeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class SolicitudUniformeDao {

    private final SolicitudUniformeMap map;

    @Autowired
    public SolicitudUniformeDao(SolicitudUniformeMap map) {
        this.map = map;
    }

    public void guardaSolicitudSinInventario(SolicitudSinInventarioDto dto) {
        map.guardaSolicitudSinInventario(dto);
    }

    public List<ValidacionResult> validaSolicitud(Integer empleado, Integer idFuncion, Integer idGenero, Integer idSubkit, Integer mesesRenov) {
        ResultWrapper<ValidacionResult> resultWrapper = new ResultWrapper<ValidacionResult>();
        map.validaSolicitud(empleado, idFuncion, idGenero, idSubkit, mesesRenov, resultWrapper);
        return resultWrapper.getList();
    }

    public Boolean consultaEsPrimerKit(Integer idEmpleado, Integer idKitUniforme) {
        ResultWrapper<Boolean> resultWrapper = new ResultWrapper<Boolean>();
        map.consultaEsPrimerKit(idEmpleado, idKitUniforme, resultWrapper);
        return resultWrapper.getReturnVal();
    }

    public KitUniformeDto consultaUniformes(Integer empleado, Integer idCia, Integer idFuncion, Integer idGenero, Integer idTienda) {
        ResultWrapper<KitUniformeDto> resultWrapper = new ResultWrapper<KitUniformeDto>();
        map.consultaUniformes(empleado, idCia, idFuncion, idGenero, idTienda, resultWrapper);
        if (resultWrapper.getList() != null && !resultWrapper.getList().isEmpty()) {
            KitUniformeDto kit = resultWrapper.getList().get(0);
            kit.setItems(agrupar(kit.getItems()));
            return kit;
        }
        return null;
    }

    private List<ItemUniformeDto> agrupar(List<ItemUniformeDto> items) {
        List<ItemUniformeDto> result = new ArrayList<ItemUniformeDto>();
        Map<Integer, ItemUniformeDto> mapGrupos = new HashMap<Integer, ItemUniformeDto>();
        for (ItemUniformeDto item : items) {
            if (item.getGrupo().equals(0)) {
                result.add(item);
                continue;
            }
            if (mapGrupos.containsKey(item.getGrupo())) {
                ItemUniformeDto itemAgrupado = mapGrupos.get(item.getGrupo());
                itemAgrupado.setDescripcion(obtenerCoincidencias(itemAgrupado.getDescripcion(), item.getDescripcion()));
                itemAgrupado.getIdCategorias().addAll(item.getIdCategorias());
                itemAgrupado.getImagenes().addAll(item.getImagenes());
                itemAgrupado.getSubkitsIds().addAll(item.getSubkitsIds());
                itemAgrupado.setPrecioSubkit(itemAgrupado.getPrecioSubkit().add(item.getPrecioSubkit()));
                itemAgrupado.setCantidad(itemAgrupado.getCantidad() + item.getCantidad());
                itemAgrupado.setFlagObligatorio(itemAgrupado.getFlagObligatorio() && item.getFlagObligatorio());
                for (TallaDto talla : itemAgrupado.getTallas()) {
                    int index = item.getTallas().indexOf(talla);
                    if (index == -1) {
                        item.getTallas().add(talla);
                    } else {
                        List<PiezaDto> nuevasPiezas = item.getTallas().get(index).getPiezas();
                        talla.getPiezas().addAll(nuevasPiezas);
                    }
                }
            } else {
                mapGrupos.put(item.getGrupo(), item);
                result.add(item);
            }
        }
        return result;
    }

    public EnsambleDto obtenerEnsamble(Integer sku, Integer sucursal) {
        ResultWrapper<EnsambleDto> resultWrapper = new ResultWrapper<EnsambleDto>();
        map.obtenerEnsamble(sku, sucursal, resultWrapper);
        if (resultWrapper.getList() != null && !resultWrapper.getList().isEmpty()) {
            return resultWrapper.getList().get(0);
        }
        return null;
    }

    private String obtenerCoincidencias(String desc1, String desc2) {
        StringBuilder builder = new StringBuilder();
        for (String exp : desc1.split(" ")) {
            if (desc2.contains(exp)) {
                builder.append(exp);
                builder.append(' ');
            }
        }
        return builder.toString().trim();
    }

    public List<CapturaMedidaDto> consultaMedidasParaCaptura(Integer idEmpleado, Integer idCarga) {
        ResultWrapper<CapturaMedidaDto> resultWrapper = new ResultWrapper<CapturaMedidaDto>();
        map.consultaMedidasPorCarga(idEmpleado, idCarga, resultWrapper);
        return resultWrapper.getList();
    }

    public void guardaCapturaDeMedida(GuardaCapturaMedidaDto captura) {
        map.guardaCapturaDeMedida(captura);
    }

    public Integer guardaCapturaDetalle(Integer idCaptura, CapturaDetalleDto detalle) {
        ResultWrapper<Integer> resultWrapper = new ResultWrapper<Integer>();
        map.guardaCapturaDetalle(idCaptura, detalle, resultWrapper);
        return resultWrapper.getReturnVal();
    }

}

