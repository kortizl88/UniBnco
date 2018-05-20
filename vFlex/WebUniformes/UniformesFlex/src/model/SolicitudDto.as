package model {
[RemoteClass(alias="Com.Elektra.Uniformes.Dto.SolicitudDto")]
public class SolicitudDto {
    private var _empleado:Number;
    private var _tienda:Number;
    private var _pedido:Number;
    private var _sku:Number;
    private var _cantidad:Number;
    private var _cia:Number;
    private var _pais:Number;
    private var _funcion:Number;
    private var _genero:Number;
    private var _tipoSolicitud:Number;

    public function get empleado():Number {
        return _empleado;
    }

    public function set empleado(value:Number):void {
        _empleado = value;
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

    public function get cantidad():Number {
        return _cantidad;
    }

    public function set cantidad(value:Number):void {
        _cantidad = value;
    }

    public function get cia():Number {
        return _cia;
    }

    public function set cia(value:Number):void {
        _cia = value;
    }

    public function get pais():Number {
        return _pais;
    }

    public function set pais(value:Number):void {
        _pais = value;
    }

    public function get funcion():Number {
        return _funcion;
    }

    public function set funcion(value:Number):void {
        _funcion = value;
    }

    public function get genero():Number {
        return _genero;
    }

    public function set genero(value:Number):void {
        _genero = value;
    }


    public function get tipoSolicitud():Number {
        return _tipoSolicitud;
    }

    public function set tipoSolicitud(value:Number):void {
        _tipoSolicitud = value;
    }
}
}
