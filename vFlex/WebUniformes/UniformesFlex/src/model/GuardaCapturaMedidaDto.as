package model {
import mx.collections.ArrayCollection;

[RemoteClass(alias="Com.Elektra.Uniformes.Dto.GuardaCapturaMedidaDto")]
public class GuardaCapturaMedidaDto {
    private var _idCarga:Number;
    private var _idEmpleado:Number;
    private var _idNegocio:Number;
    private var _funcionSap:Number;
    private var _idGenero:Number;
    [ArrayElementType("model.CapturaDetalleDto")]
    private var _detalle:ArrayCollection;

    public function get idCarga():Number {
        return _idCarga;
    }

    public function set idCarga(value:Number):void {
        _idCarga = value;
    }

    public function get idEmpleado():Number {
        return _idEmpleado;
    }

    public function set idEmpleado(value:Number):void {
        _idEmpleado = value;
    }

    public function get idNegocio():Number {
        return _idNegocio;
    }

    public function set idNegocio(value:Number):void {
        _idNegocio = value;
    }

    public function get funcionSap():Number {
        return _funcionSap;
    }

    public function set funcionSap(value:Number):void {
        _funcionSap = value;
    }

    public function get idGenero():Number {
        return _idGenero;
    }

    public function set idGenero(value:Number):void {
        _idGenero = value;
    }

    public function get detalle():ArrayCollection {
        return _detalle;
    }

    public function set detalle(value:ArrayCollection):void {
        _detalle = value;
    }
}
}
