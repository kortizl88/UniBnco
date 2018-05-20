package model {
import mx.collections.ArrayCollection;

[RemoteClass(alias="Com.Elektra.Uniformes.Dto.EncuestaDto")]
public class EncuestaDto {
    private var _idEmpleado:Number;
    private var _idEncuesta:Number;
    private var _titulo:String;
    private var _descripcion:String;
    private var _vigencia:Date;
    private var _registro:Date;
    [ArrayElementType("model.PreguntaDto")]
    private var _preguntas:ArrayCollection;
    private var _idSucursal:Number;
    private var _sucursal:String;
    private var _region:String;
    private var _comentarios:String;

    public function get idEmpleado():Number {
        return _idEmpleado;
    }

    public function set idEmpleado(value:Number):void {
        _idEmpleado = value;
    }

    public function get idEncuesta():Number {
        return _idEncuesta;
    }

    public function set idEncuesta(value:Number):void {
        _idEncuesta = value;
    }

    public function get titulo():String {
        return _titulo;
    }

    public function set titulo(value:String):void {
        _titulo = value;
    }

    public function get descripcion():String {
        return _descripcion;
    }

    public function set descripcion(value:String):void {
        _descripcion = value;
    }

    public function get vigencia():Date {
        return _vigencia;
    }

    public function set vigencia(value:Date):void {
        _vigencia = value;
    }

    public function get registro():Date {
        return _registro;
    }

    public function set registro(value:Date):void {
        _registro = value;
    }

    public function get preguntas():ArrayCollection {
        return _preguntas;
    }

    public function set preguntas(value:ArrayCollection):void {
        _preguntas = value;
    }

    public function get idSucursal():Number {
        return _idSucursal;
    }

    public function set idSucursal(value:Number):void {
        _idSucursal = value;
    }

    public function get sucursal():String {
        return _sucursal;
    }

    public function set sucursal(value:String):void {
        _sucursal = value;
    }

    public function get region():String {
        return _region;
    }

    public function set region(value:String):void {
        _region = value;
    }

    public function get comentarios():String {
        return _comentarios;
    }

    public function set comentarios(value:String):void {
        _comentarios = value;
    }

    public function EncuestaDto() {
    }
}
}
