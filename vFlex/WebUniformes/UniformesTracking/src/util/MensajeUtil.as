package util {
import components.MensajeWindow;

import flash.display.DisplayObject;

import mx.core.FlexGlobals;
import mx.core.IFlexDisplayObject;
import mx.events.CloseEvent;
import mx.managers.PopUpManager;
import mx.rpc.events.FaultEvent;
import mx.rpc.events.ResultEvent;

public class MensajeUtil {

    public static function mostrarMensajeFault(faultEvent:FaultEvent, listener:Function = null, modal:Boolean = false):void {
        var mensajeWindow:MensajeWindow = MensajeWindow(PopUpManager.createPopUp(DisplayObject(FlexGlobals.topLevelApplication), MensajeWindow, modal));
        mensajeWindow.title = "No se pudo acceder al servicio remoto.";
        mensajeWindow.level = MensajeWindow.LEVEL_ERROR;
        mensajeWindow.infoSoporte = faultEvent.fault.toString();
        mensajeWindow.labelText = "Ocurrió un problema ejecutar la petición en el servidor. Favor de contactar a Soporte Técnico";
        mensajeWindow.addEventListener(CloseEvent.CLOSE, cerrarMensaje);
        if (listener != null) {
            mensajeWindow.addEventListener(CloseEvent.CLOSE, listener);
        }
        PopUpManager.centerPopUp(mensajeWindow);
    }

    public static function validaServiceResponse(event:ResultEvent, listener:Function = null, modal:Boolean = false):Boolean {
        if (event.result.codigo == 0) {
            return true;
        }
        var mensajeWindow:MensajeWindow = MensajeWindow(PopUpManager.createPopUp(DisplayObject(FlexGlobals.topLevelApplication), MensajeWindow, modal));
        mensajeWindow.title = "No se pudo procesar la petición.";
        mensajeWindow.level = MensajeWindow.LEVEL_ERROR;
        mensajeWindow.infoSoporte = event.result.detalleTecnico;
        mensajeWindow.labelText = event.result.descripcionOperacion;
        mensajeWindow.addEventListener(CloseEvent.CLOSE, cerrarMensaje);
        if (listener != null) {
            mensajeWindow.addEventListener(CloseEvent.CLOSE, listener);
        }
        PopUpManager.centerPopUp(mensajeWindow);
        return false;
    }

    public static function mostrarError(titulo:String, mensaje:String, detalleTecnico:String = null, listener:Function = null, modal:Boolean = true):void {
        var mensajeWindow:MensajeWindow = MensajeWindow(PopUpManager.createPopUp(DisplayObject(FlexGlobals.topLevelApplication), MensajeWindow, modal));
        mensajeWindow.title = titulo;
        mensajeWindow.level = MensajeWindow.LEVEL_ERROR;
        mensajeWindow.labelText = mensaje;
        mensajeWindow.addEventListener(CloseEvent.CLOSE, cerrarMensaje);
        if (detalleTecnico != null) {
            mensajeWindow.infoSoporte = detalleTecnico;
        }
        if (listener != null) {
            mensajeWindow.addEventListener(CloseEvent.CLOSE, listener);
        }
        PopUpManager.centerPopUp(mensajeWindow);
    }

    public static function mostrarAlerta(titulo:String, mensaje:String, listener:Function = null, modal:Boolean = true):void {
        var mensajeWindow:MensajeWindow = MensajeWindow(PopUpManager.createPopUp(DisplayObject(FlexGlobals.topLevelApplication), MensajeWindow, modal));
        mensajeWindow.title = titulo;
        mensajeWindow.level = MensajeWindow.LEVEL_WARN;
        mensajeWindow.labelText = mensaje;
        mensajeWindow.addEventListener(CloseEvent.CLOSE, cerrarMensaje);
        if (listener != null) {
            mensajeWindow.addEventListener(CloseEvent.CLOSE, listener);
        }
        PopUpManager.centerPopUp(mensajeWindow);
    }

    public static function mostrarInformacion(titulo:String, mensaje:String, listener:Function = null, modal:Boolean = true):void {
        var mensajeWindow:MensajeWindow = MensajeWindow(PopUpManager.createPopUp(DisplayObject(FlexGlobals.topLevelApplication), MensajeWindow, modal));
        mensajeWindow.title = titulo;
        mensajeWindow.level = MensajeWindow.LEVEL_INFO;
        mensajeWindow.labelText = mensaje;
        mensajeWindow.addEventListener(CloseEvent.CLOSE, cerrarMensaje);
        if (listener != null) {
            mensajeWindow.addEventListener(CloseEvent.CLOSE, listener);
        }
        PopUpManager.centerPopUp(mensajeWindow);
    }

    private static function cerrarMensaje(event:CloseEvent):void {
        PopUpManager.removePopUp(IFlexDisplayObject(event.target));
    }


}
}
