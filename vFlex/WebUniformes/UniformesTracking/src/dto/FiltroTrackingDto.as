package dto {
[RemoteClass(alias='Com.Elektra.Uniformes.Dto.FiltroTrackingDto')]
public class FiltroTrackingDto {
    private var _idEmpleado:Number;
    private var _tienda:Number;
    private var _pedido:Number;
    private var _sku:Number;
    private var _centroDeCostos:Number;
    private var _remision:Number;
    private var _fechaSolicitudIni:Date;
    private var _fechaSolicitudFin:Date;
    private var _fechaRemisionIni:Date;
    private var _fechaRemisionFin:Date;

    public function isEmpty():Boolean {
        return isNaN(_idEmpleado) &&
                isNaN(_tienda) &&
                isNaN(_pedido) &&
                isNaN(_sku) &&
                isNaN(_centroDeCostos) &&
                isNaN(_remision) &&
                _fechaSolicitudIni == null &&
                _fechaSolicitudFin == null &&
                _fechaRemisionIni == null &&
                _fechaRemisionFin == null;
    }
    public function get idEmpleado():Number {
        return _idEmpleado;
    }

    public function set idEmpleado(value:Number):void {
        _idEmpleado = value;
    }

    public function get tienda():Number {
        return _tienda;
    }

    public function set tienda(value:Number):void {
        _tienda = value;
    }

    public function get pedido():Number {
        return _pedido;
    }

    public function set pedido(value:Number):void {
        _pedido = value;
    }

    public function get sku():Number {
        return _sku;
    }

    public function set sku(value:Number):void {
        _sku = value;
    }

    public function get centroDeCostos():Number {
        return _centroDeCostos;
    }

    public function set centroDeCostos(value:Number):void {
        _centroDeCostos = value;
    }

    public function get remision():Number {
        return _remision;
    }

    public function set remision(value:Number):void {
        _remision = value;
    }

    public function get fechaSolicitudIni():Date {
        return _fechaSolicitudIni;
    }

    public function set fechaSolicitudIni(value:Date):void {
        _fechaSolicitudIni = value;
    }

    public function get fechaSolicitudFin():Date {
        return _fechaSolicitudFin;
    }

    public function set fechaSolicitudFin(value:Date):void {
        _fechaSolicitudFin = value;
    }

    public function get fechaRemisionIni():Date {
        return _fechaRemisionIni;
    }

    public function set fechaRemisionIni(value:Date):void {
        _fechaRemisionIni = value;
    }

    public function get fechaRemisionFin():Date {
        return _fechaRemisionFin;
    }

    public function set fechaRemisionFin(value:Date):void {
        _fechaRemisionFin = value;
    }
}
}
