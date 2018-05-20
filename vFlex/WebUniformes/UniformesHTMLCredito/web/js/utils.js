var ajaxCalls = 0;

$.arrayIntersect = function (a, b) {
    return $.grep(a, function (i) {
        return $.inArray(i, b) > -1;
    });
};

function consumirServicio(url, data, resultHandler, errorHandler) {
    addAjaxCall();
    var ajaxCall = {
        url: url,
        data: data,
        type: 'POST',
        success: function (result, status, xhr) {
            if (xhr.getResponseHeader("SESSION_EXPIRED") == "true") {
                window.top.location.href = "cerrar_sesion.html";
                return;
            }
            if (result.codigo != 0) {
                if (errorHandler) {
                    errorHandler();
                }
                $('#mensaje').html(result.descripcionOperacion);
                $('#dialog_label').html('No se pudo procesar la petición.');
                $('#mensajeWindow').popup("open");
                return;
            }
            if (resultHandler) {
                resultHandler(result);
            }
        },
        error: function (xhr, status, errorThrown) {
            if (errorHandler) {
                errorHandler(xhr, status, errorThrown);
            }
            $('#mensaje').html("Estatus: " + status);
            $('#dialog_label').html('No se pudo conectar al servicio.');
            $('#mensajeWindow').popup("open");

        },
        complete: function () {
            removeAjaxCall();
        }
    };
    if (data instanceof FormData) {
        ajaxCall.processData = false;
        ajaxCall.contentType = false;
    } else {
        ajaxCall.dataType = 'json';
    }
    $.ajax(ajaxCall);
}

function addAjaxCall() {
    if (ajaxCalls == 0) {
        $.mobile.loading("show");
    }
    ajaxCalls++;
}

function removeAjaxCall() {
    ajaxCalls--;
    if (ajaxCalls == 0) {
        $.mobile.loading("hide");
    }
}

function mostrarTooltip(target) {
    var tip = target.attr('title');
    var tooltip = $('<div id="tooltip"></div>');

    if (!tip || tip == '')
        return false;

    target.removeAttr('title');
    tooltip.css('opacity', 0)
        .html(tip)
        .appendTo('body');

    var init_tooltip = function () {
        if ($(window).width() < tooltip.outerWidth() * 1.5)
            tooltip.css('max-width', $(window).width() / 2);
        else
            tooltip.css('max-width', 340);

        var pos_left = target.offset().left + ( target.outerWidth() / 2 ) - ( tooltip.outerWidth() / 2 ),
            pos_top = target.offset().top - tooltip.outerHeight() - 20;

        if (pos_left < 0) {
            pos_left = target.offset().left + target.outerWidth() / 2 - 20;
            tooltip.addClass('left');
        }
        else
            tooltip.removeClass('left');

        if (pos_left + tooltip.outerWidth() > $(window).width()) {
            pos_left = target.offset().left - tooltip.outerWidth() + target.outerWidth() / 2 + 20;
            tooltip.addClass('right');
        }
        else
            tooltip.removeClass('right');

        if (pos_top < 0) {
            var pos_top = target.offset().top + target.outerHeight();
            tooltip.addClass('top');
        }
        else
            tooltip.removeClass('top');

        tooltip.css({left: pos_left, top: pos_top})
            .animate({top: '+=10', opacity: 1}, 50);
    };

    init_tooltip();
    $(window).resize(init_tooltip);

    var remove_tooltip = function () {
        tooltip.animate({top: '-=10', opacity: 0}, 50, function () {
            $(this).remove();
        });

        target.attr('title', tip);
    };

    target.bind('click', remove_tooltip);
    tooltip.bind('click', remove_tooltip);
    target.on('ocultarTooltip', remove_tooltip);
    window.setTimeout(remove_tooltip, 9000);
}
