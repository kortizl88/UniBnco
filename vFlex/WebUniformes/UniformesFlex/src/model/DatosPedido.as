package model {

[Bindable]
[RemoteClass(alias="Com.Elektra.Uniformes.Dto.DatosPedidoDto")]
public class DatosPedido {
    private var _folioPedido:String;

    private var _noPedido:Number;

    private var _noTienda:Number;

    private var _numEmpleado:Number;

    public function get folioPedido():String {
        return _folioPedido;
    }

    public function set folioPedido(value:String):void {
        _folioPedido = value;
    }

    public function get noPedido():Number {
        return _noPedido;
    }

    public function set noPedido(value:Number):void {
        _noPedido = value;
    }

    public function get noTienda():Number {
        return _noTienda;
    }

    public function set noTienda(value:Number):void {
        _noTienda = value;
    }

    public function get numEmpleado():Number {
        return _numEmpleado;
    }

    public function set numEmpleado(value:Number):void {
        _numEmpleado = value;
    }
}
}
