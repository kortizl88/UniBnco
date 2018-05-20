package model {
[RemoteClass(alias='Com.Elektra.Uniformes.Dto.ReposicionDto')]
public class ReposicionDto {
    private var _folioReposicion:Number;
    private var _idEmpleado:Number;
    private var _nombreEmpleado:String;
    private var _correo:String;
    private var _telefono:String;
    private var _motivo:String;
    private var _mensaje:String;
    private var _observaciones:String;
    private var _pedido:Number;
    private var _sucursal:Number;
    private var _precio:Number;
    private var _idSubkit:Number;
    private var _estatus:Number;
    private var _descripcionCorta:String;

    public function get folioReposicion():Number {
        return _folioReposicion;
    }

    public function set folioReposicion(value:Number):void {
        _folioReposicion = value;
    }

    public function get idEmpleado():Number {
        return _idEmpleado;
    }

    public function set idEmpleado(value:Number):void {
        _idEmpleado = value;
    }

    public function get nombreEmpleado():String {
        return _nombreEmpleado;
    }

    public function set nombreEmpleado(value:String):void {
        _nombreEmpleado = value;
    }

    public function get correo():String {
        return _correo;
    }

    public function set correo(value:String):void {
        _correo = value;
    }

    public function get telefono():String {
        return _telefono;
    }

    public function set telefono(value:String):void {
        _telefono = value;
    }

    public function get motivo():String {
        return _motivo;
    }

    public function set motivo(value:String):void {
        _motivo = value;
    }

    public function get mensaje():String {
        return _mensaje;
    }

    public function set mensaje(value:String):void {
        _mensaje = value;
    }

    public function get observaciones():String {
        return _observaciones;
    }

    public function set observaciones(value:String):void {
        _observaciones = value;
    }

    public function get pedido():Number {
        return _pedido;
    }

    public function set pedido(value:Number):void {
        _pedido = value;
    }

    public function get sucursal():Number {
        return _sucursal;
    }

    public function set sucursal(value:Number):void {
        _sucursal = value;
    }

    public function get precio():Number {
        return _precio;
    }

    public function set precio(value:Number):void {
        _precio = value;
    }

    public function get idSubkit():Number {
        return _idSubkit;
    }

    public function set idSubkit(value:Number):void {
        _idSubkit = value;
    }

    public function get estatus():Number {
        return _estatus;
    }

    public function set estatus(value:Number):void {
        _estatus = value;
    }


    public function get descripcionCorta():String {
        return _descripcionCorta;
    }

    public function set descripcionCorta(value:String):void {
        _descripcionCorta = value;
    }
}
}
