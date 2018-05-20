$(function () {
    $('#selectFolio').change(function () {
        consultaDescuentosPorFolio($('#selectFolio').val());
    });
});

$(document).ready(function () {
    consumirServicio(
        'descuentos/consultaFolios.json',
        null,
        procesaFolios
    );
});

function procesaFolios(result) {
    if (result.folios.length == 0) {
        $('#ditTituloAlert').html('No se encontraron pedidos en descuento.');
        $('#divMensajeAlert').html('Por el momento no se encuentra información de tus descuentos.');
        $('#alertPopup').popup('open');
        return;
    }
    $.each(result.folios, function (index, folio) {
        folio.fecha = $.format.date(new Date(folio.fecha), "yyyy-MM-dd");
    });
    var template = $('#selectFoliosTemplate').html();
    var rendered = Mustache.render(template, {
        folios: result.folios
    });
    var selectFolio = $('#selectFolio');
    selectFolio.append($(rendered));
    selectFolio.selectmenu('refresh', true);
    $('#divFooter').css('visibility', 'visible');

    consultaDescuentosPorFolio(result.folios[0].folio);
}

function consultaDescuentosPorFolio(folio) {
    consumirServicio(
        'descuentos/consultaDescuentos.json',
        {
            folio: folio
        },
        procesaDescuentos
    );
}

function procesaDescuentos(result) {
    var sumaPagado = 0;
    var sumaPorPagar = 0;
    var sumaTotal = 0;
    $.each(result.empleadoDesctos, function (index, descto) {
        sumaPagado += descto.pagado;
        sumaPorPagar += descto.porPagar;
        sumaTotal += descto.total;
    });

    var template = $('#descuentosTemplate').html();
    var rendered = Mustache.render(template, {
        empleadoDesctos: result.empleadoDesctos,
        sumaPagado: sumaPagado,
        sumaPorPagar: sumaPorPagar,
        sumaTotal: sumaTotal
    });
    $('#divMain').html(rendered);

    $.each(result.empleadoDesctos, function (index, descto) {
        $('#detalle' + descto.refPedido).css('display', 'none');
        $('#btnVerDetalle' + descto.refPedido).click(function () {
            $('#btnVerDetalle' + descto.refPedido).prop('disabled', true);
            if ($('#detalle' + descto.refPedido).css('display') == 'none') {
                $('#detalle' + descto.refPedido).show("slow", function () {
                    $('#btnVerDetalle' + descto.refPedido).prop('disabled', false);
                    $('#btnVerDetalle' + descto.refPedido).html('&#8211;');
                });
            } else {
                $('#detalle' + descto.refPedido).hide("slow", function () {
                    $('#btnVerDetalle' + descto.refPedido).prop('disabled', false);
                    $('#btnVerDetalle' + descto.refPedido).html('+');
                });

            }
        });
    });
}
