package model {

[RemoteClass(alias="Com.Elektra.Uniformes.Dto.CapturaDetalleDto")]
public class CapturaDetalleDto {

    private var _idMedida:Number;
    private var _valor:Number;

    public function get idMedida():Number {
        return _idMedida;
    }

    public function set idMedida(value:Number):void {
        _idMedida = value;
    }

    public function get valor():Number {
        return _valor;
    }

    public function set valor(value:Number):void {
        _valor = value;
    }
}
}
