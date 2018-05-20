var asunto;

$(function () {
    $('#divRight').hide();
    $('#divRight').css('height', $('#divLeft').height());
    $('#listaProblemas li a').click(function (event) {
        $('#listaProblemas li').removeClass('selectedRow');
        $(this).parent().addClass('selectedRow');

        var prob = $(this).attr('href').replace('#', '');
        var causa = $('#divHtmlCausa').find('div[prob-ref="' + prob + '"]');
        var solucion = $('#divHtmlSolucion').find('div[prob-ref="' + prob + '"]');
        $('#divContenidoCausa').html(causa.html());
        $('#divContenidoSolucion').html(solucion.html());

        if ($('#divRight').css('display') == 'none') {
            $('#divLeft').animate({
                width: "49%"
            }, 1000, function () {
                $('#divRight').show(400, function () {
                    $('#divRight').animate({
                        height: $('#divLeft').height() + 'px'
                    })
                });
            });
        }
    });

    $('#linkEnviarCorreo').click(function () {
        $('#tipoProblema').val('');
        $('#tipoProblema').selectmenu("refresh");
        $('#divSeleccionaTipo').popup('open');
    });

    $('#tipoProblema').change(function () {
        var selectedVal = $('#tipoProblema').val();
        if (selectedVal == "10") {
            $('#liDescripcion').appendTo('#ulTipoProblema');
            $('#ulTipoProblema').listview('refresh');
        } else if (selectedVal == null || selectedVal == '') {
            $('#liDescripcion').appendTo('#ulDescripcion');
            $('#ulTipoProblema').listview('refresh');
        } else {
            mostrarFormularioEnviarCorreo();
            asunto = $("#tipoProblema option:selected").text();
        }

    });

    $('#btnOK').click(function (event) {
        event.preventDefault();
        if (!$.trim($('#inputDescripcion').val()).length) {
            mostrarTooltip($('#inputDescripcion'));
        } else {
            asunto = $('#inputDescripcion').val();
            mostrarFormularioEnviarCorreo();
        }
    });

    $('#btnEnviar').click(function () {
        if (!validarFormulario()) {
            return;
        }
        $('#divEnviarCorreoPopup').popup('close');
        consumirServicio(
            'ayuda/enviaCorreo.json',
            {
                nombre: parent.infoEmpleado.fcEmpleadoNombre,
                email: $('#inputCorreo').val(),
                telefono: $('#inputTelefono').val(),
                mensaje: $('#inputMensaje').val(),
                asunto: asunto
            },
            mostrarMensaje
        );
    });
});

function mostrarFormularioEnviarCorreo() {
    $('#inputNombre').html(parent.infoEmpleado.fcEmpleadoNombre.toLowerCase());
    $('#divSeleccionaTipo').popup('close');
    window.setTimeout(function () {
        $('#divEnviarCorreoPopup').popup('open');
    }, 200);

}

function validarFormulario() {
    var valResult = true;
    $.each($('#divEnviarCorreoPopup :input'), function (index, target) {
        if (!target.checkValidity()) {
            valResult = false;
            mostrarTooltip($(target));
            return false;
        }
    });
    return valResult;
}

function mostrarMensaje(result) {
    $('#mensajeCorreoEnviado').popup("open");
}