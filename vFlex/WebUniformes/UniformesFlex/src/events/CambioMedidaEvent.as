package events {
import flash.events.Event;

public class CambioMedidaEvent extends Event {

    public static const CAMBIO_MEDIDA_EVENT:String = "CAMBIO_MEDIDA_EVENT";

    private var _idMedida:Number;
    private var _valor:Number;

    public function CambioMedidaEvent(type:String, idMedida:Number, valor:Number) {
        super(type, true);
        this.idMedida = idMedida;
        this.valor = valor;
    }


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
