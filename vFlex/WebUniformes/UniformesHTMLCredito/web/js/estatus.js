$(function () {
    $('#selectFolio').change(function () {
        consultarEstatusXFolio($('#selectFolio').val());
    });

    agregaTooltip('#estatusSolicitud', '#estatusCD', '#estatusEnCamino', '#estatusEnTienda', '#estatusEntregado');

});

$(document).ready(function () {
    consumirServicio(
        'estatus/consultaFolios.json',
        null,
        procesaFolios
    );
});

function agregaTooltip() {
    $.each(arguments, function (index, arg) {
        $(arg).click(function () {
            var elem = $(arg);
            mostrarTooltip(elem);
        });
    });
}

function procesaFolios(result) {
    if (result.folios.length == 0) {
        $('#ditTituloAlert').html('No se encontraron folios.');
        $('#divMensajeAlert').html('Por el momento no tienes solicitudes activas. Favor de realizar tu solicitud.');
        $('#alertPopup').popup('open');
        return;
    }
    var template = $('#selectFoliosTemplate').html();
    var rendered = Mustache.render(template, {
        folios: result.folios
    });
    var selectFolio = $('#selectFolio');
    selectFolio.append($(rendered));
    selectFolio.selectmenu('refresh', true);
    $('#divFooter').css('visibility', 'visible');

    consultarEstatusXFolio(result.folios[0].folio);
}

function consultarEstatusXFolio(folio) {
    consumirServicio(
        'estatus/consultaEstatus.json',
        {
            folio: folio
        },
        procesaEstatus
    )
}

function procesaEstatus(result) {
    var idEstatus = result.informacionPedido.idEstatus;

    var solicitadoVisible = idEstatus >= 1 && idEstatus <= 9;
    var cdVisible = idEstatus >= 3 && idEstatus <= 9;
    var enCaminoVisible = idEstatus >= 5 && idEstatus <= 9;
    var enTiendaVisible = idEstatus >= 7 && idEstatus <= 9;
    var entregadoVisible = idEstatus == 9;

    var filtroEstatusSolicitud = cdVisible ? 'grayscale(1)' : "";
    var filtroEstatusCD = enCaminoVisible ? 'grayscale(1)' : "";
    var filtroEstatusEnCamino = enTiendaVisible ? 'grayscale(1)' : "";
    var filtroEstatusEnTienda = entregadoVisible ? 'grayscale(1)' : "";

    var template = $('#estatusPedidoTemplate').html();
    var rendered = Mustache.render(template, result.informacionPedido);
    $('#divTabla').html(rendered);

    $('#divImagenesEstatus').css('visibility', 'visible');

    $('#imgEstatusSolicitud').css('-webkit-filter', filtroEstatusSolicitud);
    $('#imgEstatusCD').css('-webkit-filter', filtroEstatusCD);
    $('#imgEstatusEnCamino').css('-webkit-filter', filtroEstatusEnCamino);
    $('#imgEstatusEnTienda').css('-webkit-filter', filtroEstatusEnTienda);

    $('#divEstatusSolicitud').css('visibility', solicitadoVisible ? 'visible' : 'hidden');
    $('#divEstatusCD').css('visibility', cdVisible ? 'visible' : 'hidden');
    $('#divEstatusEnCamino').css('visibility', enCaminoVisible ? 'visible' : 'hidden');
    $('#divEstatusEnTienda').css('visibility', enTiendaVisible ? 'visible' : 'hidden');
    $('#divEstatusEntregado').css('visibility', entregadoVisible ? 'visible' : 'hidden');

    $('#flechaEstatusCD').css('visibility', cdVisible ? 'visible' : 'hidden');
    $('#flechaEstatusEnCamino').css('visibility', enCaminoVisible ? 'visible' : 'hidden');
    $('#flechaEstatusEnTienda').css('visibility', enTiendaVisible ? 'visible' : 'hidden');
    $('#flechaEstatusEntregado').css('visibility', entregadoVisible ? 'visible' : 'hidden');


}