package model {
import mx.collections.ArrayCollection;

[RemoteClass(alias="Com.Elektra.Uniformes.Dto.PreguntaDto")]
public class PreguntaDto {
    private var _idPregunta:Number;
    private var _orden:Number;
    private var _texto:String;
    private var _registro:Date;
    [ArrayElementType("model.RespuestaDto")]
    private var _respuestas:ArrayCollection;
    private var _idRespuestaSeleccionada:Number;

    public function get idPregunta():Number {
        return _idPregunta;
    }

    public function set idPregunta(value:Number):void {
        _idPregunta = value;
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

    public function get respuestas():ArrayCollection {
        return _respuestas;
    }

    public function set respuestas(value:ArrayCollection):void {
        _respuestas = value;
    }

    public function get idRespuestaSeleccionada():Number {
        return _idRespuestaSeleccionada;
    }

    public function set idRespuestaSeleccionada(value:Number):void {
        _idRespuestaSeleccionada = value;
    }

    public function PreguntaDto() {
    }
}
}
