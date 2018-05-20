if (!String.prototype.includes) {
    String.prototype.includes = function (search, start) {
        'use strict';
        if (typeof start !== 'number') {
            start = 0;
        }

        if (start + search.length > this.length) {
            return false;
        } else {
            return this.indexOf(search, start) !== -1;
        }
    };
}

var obj;

function validaHuellaUareU(userid) {
    if (navigator.userAgent.includes("Firefox")) {
        ejecutarPluginFirefox(userid);
        return;
    }

    if (typeof (window.ActiveXObject) == "undefined") {
        UniformesFlex.procesaRespuesta(-1, "ActiveX no se encuentra soportado en el navegador.");
        return;
    }

    $('#huella').animate({
        top: 0
    }, {
        done: function () {
            autenticaEmpleado(userid)
        }
    });

}

function autenticaEmpleado(userid) {
    if (obj == null) {
        obj = crearComponenteHuella();
    }
    if (obj) {
        try {
            obj.AutenticaXEmpleado(userid, 1);
        } catch (ex) {
            onProcesoAutEmpleado(-1, "Excepcion: " + ex.message);
        }
    }
}

function mostrarHuella() {
    $('#huella').animate({
        top: 0
    });

}

function onProcesoAutEmpleado(alerta, mensaje) {
    var codigo;
    if (alerta == 0) {
        codigo = obj.autenticado() ? alerta : -1;
    } else {
        codigo = alerta;
    }

    $('#huella').animate({
        top: -280
    }, {
        done: function () {
            if (codigo == 2) {
                obj.parentNode.removeChild(obj);
                obj = null;
            }
            UniformesFlex.procesaRespuesta(codigo, mensaje);
        }
    });
}

function crearComponenteHuella() {
    var newObj = document.createElement('object');
    try {
        document.getElementById('padHuella').appendChild(newObj);
        newObj.width = 169;
        newObj.height = 256;
        newObj.name = "CrlCUInterfaceAutentica";
        newObj.id = "CrlCUInterfaceAutentica";
        newObj.classid = "CLSID:EA9D815B-DC1B-4D59-B94D-CDB96A9039CB";
        newObj.attachEvent('OnProcesoAutEmpleado', onProcesoAutEmpleado);
    } catch (ex) {
        UniformesFlex.procesaRespuesta(-1, "No se pudo crear el objeto de autenticación. " + ex.message);
        document.getElementById('padHuella').removeChild(newObj);
        return null;
    }
    return newObj;
}

/***************************************************************
 * Componente anterior                                         *
 ***************************************************************/
function validaHuellaHDLoginRH(ipServer, userid) {
    if (navigator.userAgent.includes("Firefox")) {
        ejecutarPluginFirefox(userid);
        return;
    }
    var objLector;
    var mensaje;
    var codigo = "-1";
    if (typeof (window.ActiveXObject) == "undefined") {
        mensaje = "ActiveX no se encuentra soportado en el navegador.";
    } else {
        try {
            objLector = new ActiveXObject("HDLoginRH.LectorHuella");
        } catch (ex) {
            mensaje = ex.message;
        }
    }

    if (objLector != null && objLector) {
        try {
            objLector.IPServidor = ipServer;
            var loResult = objLector.Iniciar(userid, "False");
            if (loResult == 0) {
                codigo = "0";
            } else {
                switch (loResult) {
                    case 1:
                        mensaje = "Termin\u00F3 el proceso de Validaci\u00F3n de Huella incorrectamente. Se esta recibiendo mal la Huella favor de verificarla.";
                        break;
                    case 2:
                        mensaje = "Error durante el proceso de Validaci\u00F3n de Huella (no termin\u00F3). Por favor intente nuevamente.";
                        break;
                    case 3:
                        mensaje = "No hay lector de Huella.";
                        break;
                    case 4:
                        mensaje = "Proceso cancelado por el usuario.";
                        break;
                    case 5:
                        mensaje = "No existe huella en central. Por favor intente nuevamente.";
                        break;
                    case 6:
                        mensaje = "Usuario no v\u00E1lido. Por favor intente nuevamente.";
                        break;
                    default:
                        mensaje = "No se pudo validar la huella.";
                }
                mensaje = mensaje + " " + objLector.Errores;
            }
        } catch (e) {
            mensaje = "jsException ["
                + e.message + "]";
        }
    }

    objLector = null;
    setTimeout(function () {
        UniformesFlex.procesaRespuesta(codigo, mensaje)
    }, 500);
}

/***************************************************************
 * Plugin gdiNavegadorJ.exe                                    *
 ***************************************************************/
function ejecutarPluginFirefox(userid) {
    var objJson = {
        'employee': {
            'numberEmployee': userid
        },
        'settings': {
            'numberAttempts': 3,
            'location': [50, 50]
        }
    };
    try {
        CJSGlobalObject.JSCallEnviaMensaje('standard', JSON.stringify(objJson));
    } catch (ex) {
        UniformesFlex.procesaRespuesta(-1, "Excepci\u00F3n javascript: " + ex.message);
    }
}

function JSSetUpdate(resp) {
    var objResp = JSON.parse(resp);
    var mensaje = objResp.PluginResponse.processDetail;
    var codigo = "-1";
    if (objResp.Issue.statusControl) {
        var det = objResp.Issue.detail;
        mensaje = "Error al validar la huella del empleado, favor de contactar a Soporte.";
        mensaje += "<br/>Detalle del error:<br/><b>Message:</b> " + det.message + "<br/><b>TypeError:</b> " + det.typeError + "<br/><b>CodeError:</b> " + det.codeError;
    } else {
        codigo = objResp.PluginResponse.authenticated == 1 ? 0 : -1;
    }
    setTimeout(function () {
        UniformesFlex.procesaRespuesta(codigo, mensaje);
    }, 500);
}