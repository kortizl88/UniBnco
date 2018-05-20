var infoEmpleado;
var idCia;
var mensajesInicio;
var titulosMsgInicio;
var reposiciones;
var CONFIG;

const messages = {
    'MSG00001': '¡Muy pronto renovaremos nuestra imagen!<br>' +
    'Por esta razón no encontrarás algunas tallas disponibles,<br>' +
    '¡Espera el nuevo uniforme que estará disponible muy pronto!<br>' +
    '¿Necesitas ayuda? Envíanos un correo: evargas@elektra.com.mx<br>' +
    'O escríbenos en la sección "Ayuda" de tu sistema de uniformes.'
};

var imgCanal = {
    1: "logoElektra.png",
    2: "logoSyr.png",
    3: "logoCdt.png",
    4: "logoDek.png",
    5: "logoNeto.png",
    6: "logoCredito.png",
    7: "logoRemates.png",
    8: "logoPp.png",
    9: "logoEkm.png",
    10: "logoPcj.png",
    99: "logoServFinAzteca.png"
};

$(function () {

    $('#checkboxPoliticas').bind('click', function () {
        $('#lblPoliticas').trigger('ocultarTooltip');
        if ($('#checkboxPoliticas').is(':checked')) {
            $('#buttonAceptar').removeClass('ui-state-disabled');
        } else {
            $('#buttonAceptar').addClass('ui-state-disabled');
        }
    });
    $('#buttonAceptar').click(function () {
        $('#divFooter').hide('slow', function () {
            $('#contenido').empty();
            $('#titulo').html("");
            $('#contenido').attr('src', 'botones.html');
            $('#ayuda').css('visibility', 'visible');
        });
        $('#btnPoliticas').click(function () {
            $('#titulo').html("Políticas de Uniformes");
            $('#divBotonesMenu').css('visibility', 'visible');
            $('#contenido').attr('src', 'politicas.html');

            desactivaBoton('#solicitudButton', "img/solicita_aqui_uniforme.png");
            desactivaBoton('#estatusButton', "img/estatus_uniforme.png");
            desactivaBoton('#descuentosButton', "img/uniforme_descuento.png");
        });
    });
    $('#solicitudButton').click(function () {
        mostrarSolicitud();
    });
    $('#estatusButton').click(function () {
        mostrarEstatus();
    });
    $('#descuentosButton').click(function () {
        mostrarDescuentos();
    });

    $('#ayuda').click(function () {
        mostrarAyuda();
    });

    var img1 = new Image();
    var img2 = new Image();
    var img3 = new Image();

    img1.src = "img/solicita_aqui_uniforme_select.png";
    img2.src = "img/estatus_uniforme_select.png";
    img3.src = "img/uniforme_descuento_select.png";

    mensajesInicio = [];
    titulosMsgInicio = [];
    reposiciones = [];

});

$(document).ready(function () {
    consumirServicio(
        'empleado/consultaDatos.json',
        null,
        infoEmpleadoResultHandler
    );
    consumirServicio(
        'config/obtenerConfiguracion.json',
        null,
        obtenerConfiguracionHandler
    );
});

function obtenerConfiguracionHandler(result) {
    CONFIG = result.config;
    if (CONFIG['consultaItalikaActiva'] == "true") {
        consumirServicio('empleado/retreiveSolicitudesExternas.json');
    }
}

function infoEmpleadoResultHandler(result) {
    procesaInfoEmpleado(result.datosEmpleado);
    $('#contenido').attr('src', 'politicas.html');
    $('#divFooter').css('visibility', 'visible');

    if (result.reposiciones && result.reposiciones.length > 0) {
        $.each(result.reposiciones, function (index, rep) {
            var msgTemplate;
            var autorizada;
            if (rep.estatus == 10) {
                msgTemplate = "<p>Tu solicitud de reposicion de <b>{{rep.descripcionCorta}}</b> con folio {{rep.folioReposicion}} será atendida a la brevedad.</p>";
                autorizada = false;
            } else if (rep.estatus == 20) {
                msgTemplate = "<p>Tu solicitud de reposicion de <b>{{rep.descripcionCorta}}</b> con folio {{rep.folioReposicion}} fue autorizada con costo." +
                    "<br>Comentario del autorizante: {{rep.observaciones}}<br>¿Deseas realizar tu solicitud?</p>";
                autorizada = true;
            } else if (rep.estatus == 30) {
                msgTemplate = "<p>Tu solicitud de reposicion de <b>{{rep.descripcionCorta}}</b> con folio {{rep.folioReposicion}} fue autorizada sin costo." +
                    "<br>Comentario del autorizante: {{rep.observaciones}}<br>¿Deseas realizar tu solicitud?</p>";
                autorizada = true;
            } else {
                return;
            }
            var rendered = Mustache.render(msgTemplate, {
                rep: rep
            });
            reposiciones.push({msg: rendered, autorizada: autorizada});
        });
    }
    mostrarTooltip($('#lblPoliticas'));
}

function procesaInfoEmpleado(inf) {
    infoEmpleado = inf;
    idCia = inf.canal[0].id;
    $('#nombreEmpleado').html(inf.fcEmpleadoNombre.toLowerCase() + " (" + inf.fiEmpleadoNum + ")");
    $('#puestoEmpleado').html(inf.fnFuncionNum + " - " + inf.fcPosicionDesc.toLowerCase());
    var imgSrc = imgCanal[idCia];
    if (typeof imgSrc == 'undefined') {
        imgSrc = imgCanal[99];
    }
    $('#imgLogo').attr('src', 'img/logos/' + imgSrc);

    if (inf.canal.length > 1) {
        $.each(inf.canal, function (index, value) {
            $('#selectCanal').append($('<option>', {
                value: value.id,
                text: value.descripcion
            }));
        });
        $('#divSelectCanal').css('visibility', 'visible');
        $('#selectCanal').prop("selectedIndex", 0).selectmenu('refresh');
        $('#selectCanal').change(function () {
            idCia = $('#selectCanal').val();
            var newImgSrc = imgCanal[idCia];
            if (typeof newImgSrc == 'undefined') {
                newImgSrc = imgCanal[99];
            }
            $('#imgLogo').attr('src', 'img/logos/' + newImgSrc);
        });
    }

    if (inf.manualDeImagen != null && inf.manualDeImagen.length > 0) {
        $('#manualImagen').css('visibility', 'visible');

        $('#manualImagen').click(function () {
            if ($('#contenidoManualDeImagen').is(':empty')) {
                $.each(inf.manualDeImagen, function (index, value) {
                    $('#contenidoManualDeImagen').append($('<div><img src="img/' + value + '"/></div>'));
                });
            }

            $('#popupManualDeImagen').popup('open');
        });
    }

    if (inf.mensajesInicio != null && inf.mensajesInicio.length > 0) {
        $.each(inf.mensajesInicio, function (index, value) {
            titulosMsgInicio.push('Aviso');
            mensajesInicio.push(messages[value]);
        });
    }
}

function mostrarSolicitud() {
    $('#solicitudButton').addClass('boton-on');
    $('#solicitudButton img').attr('src', 'img/solicita_aqui_uniforme_select.png');
    desactivaBoton('#estatusButton', "img/estatus_uniforme.png");
    desactivaBoton('#descuentosButton', "img/uniforme_descuento.png");

    $('#titulo').html("Solicitud de Uniforme");
    $('#divBotonesMenu').css('visibility', 'visible');
    $('#contenido').empty();
    $('#contenido').attr('src', 'solicitud.html');
}

function mostrarEstatus() {
    $('#estatusButton').addClass('boton-on');
    $('#estatusButton img').attr('src', "img/estatus_uniforme_select.png");
    desactivaBoton('#solicitudButton', "img/solicita_aqui_uniforme.png");
    desactivaBoton('#descuentosButton', "img/uniforme_descuento.png");

    $('#titulo').html("Estatus de mi Uniforme");
    $('#divBotonesMenu').css('visibility', 'visible');
    $('#contenido').empty();
    $('#contenido').attr('src', 'estatus.html');
}

function mostrarDescuentos() {
    $('#descuentosButton').addClass('boton-on');
    $('#descuentosButton img').attr('src', "img/uniforme_descuento_select.png");
    desactivaBoton('#solicitudButton', "img/solicita_aqui_uniforme.png");
    desactivaBoton('#estatusButton', "img/estatus_uniforme.png");

    $('#titulo').html("Estatus de mis Descuentos");
    $('#divBotonesMenu').css('visibility', 'visible');
    $('#contenido').empty();
    $('#contenido').attr('src', 'descuentos.html');
}

function mostrarAyuda() {
    desactivaBoton('#solicitudButton', "img/solicita_aqui_uniforme.png");
    desactivaBoton('#estatusButton', "img/estatus_uniforme.png");
    desactivaBoton('#descuentosButton', "img/uniforme_descuento.png");

    $('#titulo').html("Preguntas frecuentes");
    $('#divBotonesMenu').css('visibility', 'visible');
    $('#contenido').empty();
    $('#contenido').attr('src', 'ayuda.html');
}

function desactivaBoton(elemBoton, imagen) {
    $(elemBoton).removeClass('boton-on');
    $(elemBoton + ' img').attr('src', imagen);
}

