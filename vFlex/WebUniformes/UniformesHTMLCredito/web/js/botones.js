$(function () {
    $('#solicitudButton').click(function () {
        parent.mostrarSolicitud();
    });
    $('#estatusButton').click(function () {
        parent.mostrarEstatus();
    });
    $('#descuentosButton').click(function () {
        parent.mostrarDescuentos();
    });

});

$(document).ready(function () {
    $('#btnAceptarMsgInicio').click(function () {
        setTimeout(mostrarSiguienteMensaje, 100);
    });

    $('#btnNo').click(function () {
        setTimeout(mostrarSiguienteMensaje, 100);
    });

    $('#btnSi').click(function () {
        setTimeout(parent.mostrarSolicitud, 100);
    });

    setTimeout(mostrarSiguienteMensaje, 100);
});

function procesaPosicionAyudaHandler(result) {
    var posicion = result.posicion;
    var elem;

    if (posicion == "SOLICITUD") {
        elem = $('#solicitudButton');
    }

    if (posicion == "ESTATUSPEDIDO") {
        elem = $('#estatusButton');
    }

    if (posicion == "ESTATUSDESCUENTO") {
        elem = $('#descuentosButton');
    }
    if (elem) {
        mostrarTooltip(elem);
    }
}

function mostrarSiguienteMensaje() {
    if (parent.mensajesInicio.length == 0 && parent.reposiciones.length == 0) {
        consumirServicio('empleado/consultaPosicionAyuda.json',
            null,
            procesaPosicionAyudaHandler
        );
        return;
    }
    if (parent.mensajesInicio.length > 0) {
        var msg = parent.mensajesInicio.pop();
        var tit = parent.titulosMsgInicio.pop();
        $('#divMsgInicio').html(msg);
        $('#tituloMsgInicio').html(tit);
        $('#msgInicioPopup').popup('open');
    } else {
        var reposicion = parent.reposiciones.pop();
        var msg = reposicion.msg;
        var tit = "Reposición de herramienta de trabajo.";
        if (reposicion.autorizada) {
            $('#msgReposicionAutorizada').html(msg);
            $('#titReposicionAutorizada').html(tit);
            $('#popupReposicionAutorizada').popup('open');
        } else {
            $('#divMsgInicio').html(msg);
            $('#tituloMsgInicio').html(tit);
            $('#msgInicioPopup').popup('open');
        }
    }


}