var numTienda;
var itemsCarrusel;
var itemsSeleccionados;
var semanas;
var itemReposicion;

$(function () {
    //Eventos+
    $('#enviarButton').click(function () {
        var flagValido = true;
        var total = 0;
        $.each(itemsSeleccionados, function (index, item) {
            if (item.tallaSeleccionada == -1) {
                flagValido = false;
                var origen = $('#selectTalla-' + index);
                origen.attr('title', 'Favor de seleccionar la talla.');
                mostrarTooltip(origen);
                return;
            } else if (parent.CONFIG['bloquearSolicitudSinInventario'] == "true") {
                $.each(item.tallas[item.tallaSeleccionada].piezas, function (idxPieza, pieza) {
                    if (pieza.inventario <= 0) {
                        flagValido = false;
                        var origen = $('#selectTalla-' + index);
                        origen.attr('title', 'Por el momento no se tiene inventario.<br/>Favor de seleccionar otra talla.')
                        mostrarTooltip(origen);
                        consumirServicio(
                            'solicitud/guardaSolicitudSinInventario.json',
                            {
                                idSubkit: pieza.idSubkit,
                                sku: pieza.sku,
                                sucursal: numTienda
                            }
                        );
                        return false;
                    }
                });
            }
            total += item.precioSubkit;
        });
        if (!flagValido) {
            return;
        }

        $('#divConfirmacionMensaje').empty();
        var template = $('#confirmacionMensajeTemplate').html();
        Mustache.parse(template);
        var rendered = Mustache.render(template, {
            items: itemsSeleccionados,
            semanas: semanas,
            total: total,
            desctoSemanal: function () {
                return (total / semanas).toFixed(0);
            }
        });
        $('#divConfirmacionMensaje').append($(rendered));
        $('#confirmacionPopup').popup('open');

    });

    $('#btnGrabarPedido').click(function () {
        var itemsSolicitud = [];
        $.each(itemsSeleccionados, function (index, item) {
            $.each(item.tallas[item.tallaSeleccionada].piezas, function (pzIndez, pieza) {
                var itemSeleccionado = {
                    empleado: parent.infoEmpleado.fiEmpleadoNum,
                    tienda: numTienda,
                    sku: pieza.sku,
                    cantidad: pieza.cantidad,
                    cia: parent.idCia,
                    pais: parent.infoEmpleado.pais,
                    funcion: parent.infoEmpleado.fnFuncionNum,
                    genero: parent.infoEmpleado.sexo,
                    tipoSolicitud: item.tipoSolicitud
                };
                itemsSolicitud.push(itemSeleccionado);
            });
        });
        ocultarItems();
        consumirServicio(
            'solicitud/grabaPedido.json',
            {
                json: JSON.stringify(itemsSolicitud)
            },
            grabaPedidoResultHandler,
            grabaPedidoErrorHandler
        );
    });

    $('#btnAceptarPedidoGrabado').click(function () {
        parent.mostrarEstatus();

    });

    $('#btnEnviarReposicion').click(enviarReposicionClickHandler);

    $('#btnAceptarMsgRep').click(function () {
        consultarUniforme();
    });

    $('#selectCanal', window.parent.document).change(function () {
        if (numTienda) {
            consultarUniforme();
        }
    });
});

$(document).ready(function () {
    consumirServicio(
        'solicitud/consultaTiendas.json',
        {
            idCia: parent.idCia
        },
        procesaSucursales
    );

});

function grabaPedidoResultHandler(result) {
    var msgTemplate = "Tu número de folio es el {{result.folio}}, tus pedidos son {{result.pedidos}} de la tienda {{result.tienda}} puedes darle seguimiento en Estatus de mi Uniforme";
    var rendered = Mustache.render(msgTemplate, {
        result: result
    });
    $('#divMensajePedidoGrabado').html(rendered);
    $('#pedidoGrabadoPopup').popup('open');
}

function grabaPedidoErrorHandler() {
    mostrarItems();
}

function enviarReposicionClickHandler(event) {
    event.preventDefault();
    event.stopPropagation();
    $.mobile.activePage.find('.ui-btn-active').removeClass('ui-btn-active ui-focus');
    if (!validarFormReposicion()) {
        return;
    }
    $('#popupReposicion').popup('close');
    ocultarItems();

    var descrCorta = itemReposicion.descripcion.replace(/(\w+).*/, "$1");

    var reposicionDto = {
        idEmpleado: parent.infoEmpleado.fiEmpleadoNum,
        nombreEmpleado: parent.infoEmpleado.fcEmpleadoNombre,
        correo: $('#inputCorreo').val(),
        telefono: $('#inputTelefono').val(),
        motivo: $('#inputMotivo').val(),
        mensaje: $('#inputMensaje').val(),
        descripcionCorta: descrCorta
    };

    var archivo = document.getElementById('inputArchivo');
    $.each(itemReposicion.subkitsIds, function (index, value) {
        reposicionDto.idSubkit = value;
        var fd = new FormData();
        fd.append('reposicionJson', JSON.stringify(reposicionDto));
        if (archivo.files.length > 0) {
            fd.append('archivo', archivo.files[0]);
        }
        consumirServicio(
            'solicitud/solicitaReposicion.json',
            fd,
            function (result) {
                solicitaReposicionResultHandler(result, descrCorta)
            },
            consultarUniforme);
    });

}

function solicitaReposicionResultHandler(result, descripcion) {
    var rendered;
    if (result.autorizante != null) {
        var msgTemplate = "El folio de tu solicitud es {{folio}}.<br>Tu solicitud de {{descripcion}} será autorizada a la brevedad por tu {{puesto}} {{nombre}}, cualquier duda contactar a Hugo Daniel Garcia Macias a la extensión 78042.";
        rendered = Mustache.render(msgTemplate, {
            folio: result.folioReposicon,
            descripcion: descripcion,
            puesto: result.autorizante.puesto,
            nombre: result.autorizante.nombre
        });
    } else {
        var msgTemplate = "El folio de tu solicitud es {{folio}}.<br>Tu solicitud de {{descripcion}} será autorizada a la brevedad por tu Regional, cualquier duda contactar a Hugo Daniel Garcia Macias a la extensión 78042.";
        rendered = Mustache.render(msgTemplate, {
            folio: result.folioReposicon,
            descripcion: descripcion
        });
    }

    $('#divMsgReposicion').html(rendered);
    $('#msgReposicionPopup').popup('open');
}


function validarFormReposicion() {
    var valResult = true;
    $.each($('#formReposicion :input'), function (index, target) {
        if (!target.checkValidity()) {
            valResult = false;
            mostrarTooltip($(target));
            return false;
        }
    });
    return valResult;
}

function procesaSucursales(result) {
    var tiendas;
    if (result.sucursales.todasLasSucursales) {
        tiendas = $.merge(result.sucursales.sucursalPorEmpleado, result.sucursales.todasLasSucursales)
    } else {
        tiendas = result.sucursales.sucursalPorEmpleado;
    }

    if (tiendas.length == 1) {
        seleccionaTienda(tiendas[0]);
        $('#selectTiendas').removeClass('ui-btn-icon-right');
    }
    else {
        $('#selectTiendas').click(function () {
            $('#popupTiendas').popup('open');
        });
        $.each(tiendas, function (index, value) {
            var inputTienda = $('<tr><td>' + value.num + " - " + value.nombre + '</td></tr>');
            $('#listaTiendas').append(inputTienda);
            inputTienda.click(function () {
                seleccionaTienda(value);
                $('#popupTiendas').popup('close');
            });
        });
        $('#selectTiendas').html("Selecciona o captura la tienda EKT o SyR más cercana.");

    }
    $('#divHeader').css('visibility', 'visible');
}

function seleccionaTienda(tienda) {
    numTienda = tienda.num;
    $('#selectTiendas').html(tienda.num + ' - ' + tienda.nombre);
    consultarUniforme();
}

function ocultarItems() {
    $('#selectTiendas').addClass('ui-state-disabled');
    $('#divSolicitudItems').css('visibility', 'hidden');
    $('#divFooter').css('visibility', 'hidden');
}

function mostrarItems() {
    $('#selectTiendas').removeClass('ui-state-disabled');
    $('#divSolicitudItems').css('visibility', 'visible');
    $('#divFooter').css('visibility', 'visible');
}
function consultarUniforme() {
    ocultarItems();
    itemsCarrusel = [];
    itemsSeleccionados = [];
    consumirServicio(
        'solicitud/consultaKitUniforme.json',
        {
            idCia: parent.idCia,
            idFuncion: parent.infoEmpleado.fnFuncionNum,
            genero: parent.infoEmpleado.sexo,
            tienda: numTienda
        },
        procesaKitUniforme
    );
}

function procesaKitUniforme(result) {
    var kitUniforme = result.kitUniforme;
    if (kitUniforme == null || kitUniforme.items.length == 0) {
        var msg = "Por el momento no se ha definido un kit para el empleado " + parent.infoEmpleado.fiEmpleadoNum
            + "<br>Negocio: " + parent.idCia
            + "<br>Función: " + parent.infoEmpleado.fnFuncionNum
            + "<br>Favor de reportarlo para configurarle uniforme a tu puesto.";
        $('#mensaje').html(msg);
        $('#dialog_label').html('No se tiene kit definido.');
        $('#mensajeWindow').popup("open");
        return;
    }
    semanas = kitUniforme.semanasDescto;
    itemsCarrusel = kitUniforme.items;
    if (kitUniforme.esPrimerKit) {
        validaItemsObligatorios();
    }
    refreshItemsCarrusel();
    refreshItemsSeleccionados();
    mostrarItems();
    if (kitUniforme.flagMostrarGuia) {
        var height = $(window).height() - 110 + "px";
        var width = $(window).width() - 60 + "px";
        $("#guiaScroll").css("height", height);
        $("#guiaScroll").css("width", width);
        var genero = parent.infoEmpleado.sexo == 1 ? 'Dama' : 'Caballero';
        $('#imgGuia').attr('src', 'img/guiaTallas/' + kitUniforme.archivoGuia.replace('{0}', genero));
        $('#popupGuia').popup('open');
    }
}

function validaItemsObligatorios() {
    $.each(itemsCarrusel, function (index, value) {
        if (value.flagObligatorio && value.flagValido) {
            value.tallaSeleccionada = -1;
            itemsSeleccionados.push(value);
        }
    });

    $.each(itemsSeleccionados, function (index, value) {
        itemsCarrusel.splice(itemsCarrusel.indexOf(value), 1);
    });
}

function refreshItemsCarrusel() {
    var owldata = $("#divCarrusel").data('owlCarousel');
    if (owldata) {
        owldata.destroy();
    }

    $("#divCarrusel").empty();
    $.each(itemsCarrusel, function (index, item) {
        var divItem = $('<div class="divItem"></div>');
        $('#divCarrusel').append(divItem);
        divItem.append($('<div class="descripcionItem"></div>').html(item.descripcion));
        var itemWrapper = $('<div class="itemWrapper"></div>');
        divItem.append(itemWrapper);
        if (item.flagValido) {
            var btnAgregar = $('<a href="#" class="ui-btn ui-btn-b ui-corner-all ui-shadow ui-icon-plus ui-btn-icon-notext ui-btn-right">Agregar</a>');
            itemWrapper.append(btnAgregar);
            btnAgregar.click(function () {
                moverItem(index, itemsCarrusel, itemsSeleccionados);
            })
        }
        $.each(item.imagenes, function (imgIndex, imgSrc) {
            var img = $('<img class="imgCarrusel">').attr('src', 'img/carrusel/' + imgSrc)
            itemWrapper.append(img);
            if (!item.flagValido) {
                img.css('opacity', 0.5);
            }
        });
        if (!item.flagValido) {
            itemWrapper.append($('<p class="motivo"></p>').html(item.motivo.replace(/\\n/g, "<br>")));
            if (item.aplicaReposicion) {
                var btnReposicion = $('<button class="ui-btn ui-btn-b ui-corner-all ui-shadow ui-mini ui-btn-inline">Reposici&oacute;n</button>');
                divItem.append(btnReposicion);
                btnReposicion.click(function () {
                    itemReposicion = item;
                    $("#formReposicion")[0].reset();
                    $('#inputNombre').attr('value', parent.infoEmpleado.fcEmpleadoNombre);
                    $('#popupReposicion').popup('open');
                });
            }
        }
    });

    var align = $("#divCarrusel").outerWidth(true) < ($(".divItem").outerWidth(true) * itemsCarrusel.length) ? 'flex-start' : 'center';
    $('#divCarrusel').css('justify-content', align);
    $('#divCarrusel').css('-webkit-justify-content', align);

}


function moverItem(index, origen, destino) {
    if (validaCategorias(origen[index], destino)) {
        var seleccion = origen.splice(index, 1);
        seleccion[0].tallaSeleccionada = -1;
        $.merge(destino, seleccion);
        refreshItemsSeleccionados();
        refreshItemsCarrusel();
    }
}

function validaCategorias(seleccion, destino) {
    var validResult = true;
    var descripcion;
    if (destino == itemsSeleccionados) {
        $.each(destino, function (index, item) {
            if ($.arrayIntersect(seleccion.idCategorias, item.idCategorias).length > 0) {
                validResult = false;
                descripcion = item.descripcion;
                return false;
            }
        });
    }
    if (!validResult) {
        var msgTemplate = "Ya tienes seleccionado un item de la misma categoria.\nPara seleccionar este elemento elimina {{descripcion}} de tu solicitud.";
        var rendered = Mustache.render(msgTemplate, {
            descripcion: descripcion
        });
        $('#divMsgCategoria').html(rendered);
        $('#msgCategoriaPopup').popup('open');
    }
    return validResult;
}

function refreshItemsSeleccionados() {
    $('#itemsSeleccionados').empty();
    var template = $('#itemSeleccionadoTemplate').html();
    Mustache.parse(template);
    var total = 0;
    $.each(itemsSeleccionados, function (index, item) {
        total += item.precioSubkit;
        var indiceTalla = 0;
        var rendered = Mustache.render(template, {
            item: item,
            index: index,
            indiceTalla: function () {
                return indiceTalla++;
            },
        });
        var divItem = $(rendered);

        $('#itemsSeleccionados').append(divItem);
        divItem.find('a').click(function (event) {
            event.preventDefault();
            moverItem(index, itemsSeleccionados, itemsCarrusel);
        });
        divItem.find('select').val(item.tallaSeleccionada);
        divItem.find('select').change(function () {
            item.tallaSeleccionada = $(this).val();
            if (item.tallaSeleccionada >= 0) {
                item.descrTalla = item.tallas[item.tallaSeleccionada].tallaClave;
            }
        });
        if (item.flagObligatorio) {
            divItem.find('.eliminarItem').css('visibility', 'hidden');
        }
    });
    if (itemsSeleccionados.length > 0) {
        $('#divTotal').html('Total: $' + total.toFixed(2));
        $('#enviarButton').removeClass('ui-state-disabled');
    } else {
        $('#divTotal').empty();
        $('#enviarButton').addClass('ui-state-disabled');
    }

    $("select").selectmenu();
}