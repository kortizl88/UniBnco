package model {
import mx.collections.ArrayCollection;

public class ItemUniforme {

    private var _cantidad:int;
    private var _descripcion:String;
    private var _flagValido:Boolean;
    private var _imagenes:ArrayCollection;
    private var _motivo:String;
    private var _precioSubkit:Number;
    private var _tallas:ArrayCollection;
    private var _idCategoria:Number;

    private var _tallaSeleccionada:int;
    private var _seleccionado:Boolean;
    private var _bloqueado:Boolean;
    private var _aplicaReposicion:Boolean;
    private var _folioReposicion:Number;
    private var _estatusReposicion:Number;
    private var _observacionesReposicion:String;
    private var _tipoSolicitud:Number;
    private var _guiaTallas:String;

    private var _subkitsIds:ArrayCollection;

    public function ItemUniforme() {
    }

    public function get cantidad():int {
        return _cantidad;
    }

    public function set cantidad(value:int):void {
        _cantidad = value;
    }

    public function get descripcion():String {
        return _descripcion;
    }

    public function set descripcion(value:String):void {
        _descripcion = value;
    }

    public function get flagValido():Boolean {
        return _flagValido;
    }

    public function set flagValido(value:Boolean):void {
        _flagValido = value;
    }

    public function get imagenes():ArrayCollection {
        return _imagenes;
    }

    public function set imagenes(value:ArrayCollection):void {
        _imagenes = value;
    }

    public function get motivo():String {
        return _motivo;
    }

    public function set motivo(value:String):void {
        _motivo = value;
    }

    public function get precioSubkit():Number {
        return _precioSubkit;
    }

    public function set precioSubkit(value:Number):void {
        _precioSubkit = value;
    }

    public function get tallas():ArrayCollection {
        return _tallas;
    }

    public function set tallas(value:ArrayCollection):void {
        _tallas = value;
    }

    public function get tallaSeleccionada():int {
        return _tallaSeleccionada;
    }

    public function set tallaSeleccionada(value:int):void {
        _tallaSeleccionada = value;
    }

    public function get seleccionado():Boolean {
        return _seleccionado;
    }

    public function set seleccionado(value:Boolean):void {
        _seleccionado = value;
    }

    public function get bloqueado():Boolean {
        return _bloqueado;
    }

    public function set bloqueado(value:Boolean):void {
        _bloqueado = value;
    }

    public function get aplicaReposicion():Boolean {
        return _aplicaReposicion;
    }

    public function set aplicaReposicion(value:Boolean):void {
        _aplicaReposicion = value;
    }

    public function get subkitsIds():ArrayCollection {
        return _subkitsIds;
    }

    public function set subkitsIds(value:ArrayCollection):void {
        _subkitsIds = value;
    }

    public function get folioReposicion():Number {
        return _folioReposicion;
    }

    public function set folioReposicion(value:Number):void {
        _folioReposicion = value;
    }

    public function get estatusReposicion():Number {
        return _estatusReposicion;
    }

    public function set estatusReposicion(value:Number):void {
        _estatusReposicion = value;
    }

    public function get observacionesReposicion():String {
        return _observacionesReposicion;
    }

    public function set observacionesReposicion(value:String):void {
        _observacionesReposicion = value;
    }

    public function get idCategoria():Number {
        return _idCategoria;
    }

    public function set idCategoria(value:Number):void {
        _idCategoria = value;
    }

    public function get tipoSolicitud():Number {
        return _tipoSolicitud;
    }

    public function set tipoSolicitud(value:Number):void {
        _tipoSolicitud = value;
    }

    public function get guiaTallas():String {
        return _guiaTallas;
    }

    public function set guiaTallas(value:String):void {
        _guiaTallas = value;
    }
}
}
