package Com.Elektra.Uniformes.map;

import Com.Elektra.Uniformes.Dto.*;
import org.apache.ibatis.annotations.Param;

public interface SolicitudUniformeMap {

    void guardaSolicitudSinInventario(SolicitudSinInventarioDto dto);

    void validaSolicitud(
            @Param("empleado") Integer empleado,
            @Param("idFuncion") Integer idFuncion,
            @Param("idGenero") Integer idGenero,
            @Param("idSubkit") Integer idSubkit,
            @Param("mesesRenov") Integer mesesRenov,
            @Param("result") ResultWrapper<ValidacionResult> result);

    void consultaEsPrimerKit(
            @Param("idEmpleado") Integer idEmpleado,
            @Param("idKitUniforme") Integer idKitUniforme,
            @Param("result") ResultWrapper<Boolean> result);

    void consultaUniformes(
            @Param("empleado") Integer empleado,
            @Param("idCia") Integer idCia,
            @Param("idFuncion") Integer idFuncion,
            @Param("idGenero") Integer idGenero,
            @Param("idTienda") Integer idTienda,
            @Param("result") ResultWrapper<KitUniformeDto> result);

    void obtenerEnsamble(
            @Param("sku") Integer sku,
            @Param("sucursal") Integer sucursal,
            @Param("result") ResultWrapper<EnsambleDto> result);

    void consultaMedidasPorCarga(
            @Param("idEmpleado") Integer idEmpleado,
            @Param("idCarga") Integer idCarga,
            @Param("result") ResultWrapper<CapturaMedidaDto> result);

    void guardaCapturaDeMedida(
            @Param("captura") GuardaCapturaMedidaDto captura
    );

    void guardaCapturaDetalle(
            @Param("idCaptura") Integer idCaptura,
            @Param("detalle") CapturaDetalleDto detalle,
            @Param("result") ResultWrapper<Integer> result
    );
}
