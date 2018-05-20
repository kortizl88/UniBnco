package utils {
import components.MensajeWindow;

import mx.rpc.events.FaultEvent;
import mx.rpc.events.ResultEvent;

public class MensajeUtil {

    public static function mostrarMensajeFault(faultEvent:FaultEvent, listener:Function = null):void {
        MensajeWindow.show(
                "Ocurrió un problema ejecutar la petición en el servidor. Favor de contactar a Soporte Técnico",
                "No se pudo acceder al servicio remoto.",
                MensajeWindow.LEVEL_ERROR,
                MensajeWindow.OK,
                listener,
                faultEvent.fault.toString()
        );
    }

    public static function validaServiceResponse(event:ResultEvent, listener:Function = null):Boolean {
        if (event.result.codigo == 0) {
            return true;
        }
        MensajeWindow.show(
                event.result.descripcionOperacion,
                "No se pudo procesar la petición.",
                MensajeWindow.LEVEL_ERROR,
                MensajeWindow.OK,
                listener,
                event.result.detalleTecnico
        );
        return false;
    }

}
}
