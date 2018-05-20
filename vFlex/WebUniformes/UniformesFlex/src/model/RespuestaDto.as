package model {

[RemoteClass(alias="Com.Elektra.Uniformes.Dto.RespuestaDto")]
public class RespuestaDto {
    private var _idRespuesta:Number;
    private var _orden:Number;
    private var _texto:String;
    private var _registro:Date;

    public function get idRespuesta():Number {
        return _idRespuesta;
    }

    public function set idRespuesta(value:Number):void {
        _idRespuesta = value;
    }

    public function get orden():Number {
        return _orden;
    }

    public function set orden(value:Number):void {
        _orden = value;
    }

    public function get texto():String {
        return _texto;
    }

    public function set texto(value:String):void {
        _texto = value;
    }

    public function get registro():Date {
        return _registro;
    }

    public function set registro(value:Date):void {
        _registro = value;
    }

    public function RespuestaDto() {
    }
}
}
