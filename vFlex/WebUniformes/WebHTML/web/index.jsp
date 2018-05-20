<%@ page import="acertum.web.session.beans.DatosUsuario" %>
<%@ page import="acertum.web.session.beans.ObjetoSession" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        ObjetoSession obj = (ObjetoSession) request.getSession().getAttribute("objetoSession");
        DatosUsuario datosUsuario = obj.getDatosUsuario();
    %>
    <link rel="stylesheet" href="jquery-ui/jquery-ui.min.css">
    <link rel="stylesheet" href="prime-ui/theme/ui-lightness/theme.css">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="prime-ui/primeui-2.1-min.css">
    <script src="jquery/jquery-2.1.4.min.js"></script>
    <script src="jquery-ui/jquery-ui.min.js"></script>
    <script src="prime-ui/primeui-2.1-min.js"></script>
    <script>
        $(function () {
            $('#detalleTecnico').puiinputtextarea();
            $('#dialog').puidialog({
                showEffect: 'fade',
                hideEffect: 'fade',
                responsive: true,
                modal: true,
                width: 550,
                resizable: false,
                buttons: [{
                    text: 'Aceptar',
                    icon: 'fa-check',
                    click: function () {
                        $('#dialog').puidialog('hide');
                    }
                }]
            });

            $('#infoSoporte').puifieldset({
                toggleable: true,
                collapsed: true
            });
        });

        $(document).ready(function () {
            $.ajax({
                url: 'empleado/consultaDatos.json',
                data: {
                    idEmpleado: <%=datosUsuario.getNoEmpleado()%>
                },
                type: 'POST',
                dataType: 'json',
                success: function (result) {
                    if (result.codigoOperacion != 0) {
                        $('#mensaje').html(result.descripcionOperacion);
                        $('#detalleTecnico').html(result.detalleTecnico);
                        $('#dialog_label').html('No se pudo procesar la petición.');
                        $('#dialog').puidialog('show');
                    }
                    console.log(result);
                },
                error: function (xhr, status, errorThrown) {
                    alert("Sorry, there was a problem!");
                    console.log("Error: " + errorThrown);
                    console.log("Status: " + status);
                    console.dir(xhr);
                }
            })
        });
    </script>
    <title></title>
</head>


<body>
<h1>Sistema de Uniformes</h1>

<h2>Atributos</h2>

<p>usuario: <%=obj.getUsuario()%>
</p>

<h3>DatosUsuario</h3>

<p>noEmpleado: <%=datosUsuario.getNoEmpleado()%>
</p>

<p>nombre: <%=datosUsuario.getNombre()%>
</p>

<p>apellidoPaterno: <%=datosUsuario.getApellidoPaterno()%>
</p>

<p>apellidoMaterno: <%=datosUsuario.getApellidoMaterno()%>
</p>

<a href="logout">Salir</a>

<div id="dialog" style="width: auto">
    <div id="mensaje" style="padding-bottom: 10px"></div>
    <fieldset id="infoSoporte">
        <legend>Información para Soporte Técnico</legend>
        <textarea id="detalleTecnico" readonly style="width: 100%" rows="8"></textarea>
    </fieldset>
</div>

</body>
</html>
