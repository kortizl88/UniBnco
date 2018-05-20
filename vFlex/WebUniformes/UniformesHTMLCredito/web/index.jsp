<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.elektra.uniformes.iu.IndexUtil" %>
<html>
<head>
    <link rel="stylesheet" href="jquery-mobile/jquery.mobile.icons-1.4.5.css">
    <link rel="stylesheet" href="jquery-mobile/theme-classic.css">
    <link rel="stylesheet" href="jquery-mobile/jquery.mobile.structure-1.4.5.css">
    <link rel="stylesheet" href="css/index.css">

    <script src="jquery/jquery-2.1.4.min.js"></script>
    <script src="jquery-mobile/jquery.mobile-1.4.5.js"></script>
    <script src="js/mustache.js"></script>
    <script src="js/utils.js"></script>
    <script src="js/index.js"></script>
    <title>Sistema de Uniformes División Financiera</title>
</head>
<body>
<%
    IndexUtil util = new IndexUtil();
    Integer idEmpleado = util.obtenerNumeroEmpleado(request, response);
    request.getSession().setAttribute("idEmpleado", idEmpleado);
%>

<div id="divPage" data-role="page" data-theme="c">
    <div data-role="header">
        <div id="menuPrincipal">
            <img id="imgBaseSuperior" src="img/base_superior_01.png">
            <img id="imgSistemaDeUniformes" src="img/sistema_de_uniforme.png">
            <img id="imgBasePolitica" src="img/base_politica.png">
            <img id="btnPoliticas" src="img/btn_politicaOFF.png">
            <div id="divBotonesMenu">
                <button id="solicitudButton" class="ui-btn ui-btn-inline ui-corner-all">
                    <img src="img/solicita_aqui_uniforme.png">
                </button>
                <button id="estatusButton" class="ui-btn ui-btn-inline ui-corner-all">
                    <img src="img/estatus_uniforme.png">
                </button>
                <button id="descuentosButton" class="ui-btn ui-btn-inline ui-corner-all">
                    <img src="img/uniforme_descuento.png">
                </button>
            </div>
        </div>
        <div id="infoEmpleado">
            <div id="divSeparador"></div>
            <div id="divInfoEmpleadoBack">
                <svg width="100%" height="100%">
                    <defs>
                        <linearGradient id="grad1" x1="0%" y1="0%" x2="0%" y2="100%">
                            <stop offset="0%" style="stop-color:#E5E5E5;stop-opacity:1"/>
                            <stop offset="100%" style="stop-color:#D8D8D8;stop-opacity:1"/>
                        </linearGradient>
                        <linearGradient id="grad2" x1="0%" y1="0%" x2="0%" y2="100%">
                            <stop offset="0%" style="stop-color:#DADADA;stop-opacity:1"/>
                            <stop offset="100%" style="stop-color:#C5C5C5;stop-opacity:1"/>
                        </linearGradient>
                    </defs>
                    <rect id="infoEmpleadoBack" height="100%" width="100%"/>
                </svg>
            </div>

            <div id="divLogoNegocio">
                <div id="divImgLogo">
                    <img id="imgLogo"/>
                </div>

                <div id="divSelectCanal">
                    <select id="selectCanal" data-mini="true">

                    </select>
                </div>
            </div>

            <div id="divDatosEmpleado">
                <div id="divNombreEmpleado">
                    <div id="nombreEmpleado">
                    </div>
                    <div id="puestoEmpleado">
                    </div>
                </div>
                <img id="imgIcoUsuario" src="img/icoUsuario.png">
            </div>

        </div>
        <div id="barraTitulo">
            <div id="titulo">
                Políticas de uniformes
            </div>
            <div id="manualImagen">
                <img class="boton-imagen" src="img/manualDeImagen.png">
            </div>
            <div id="ayuda">
                <img class="boton-imagen" src="img/btn_ayuda.png">
            </div>
        </div>
    </div>

    <div id="divMain" data-role="main">
        <div class="scroll-wrapper">
            <iframe id="contenido" frameborder="0">
            </iframe>
        </div>

    </div>
    <div id="divFooter" data-role="footer"
         class="ui-bar">
        <input type="checkbox" id="checkboxPoliticas">
        <label id="lblPoliticas" for="checkboxPoliticas" rel="tooltip"
               title="Para solicitar tu uniforme debes leer y aceptar las pol&iacute;ticas">He le&iacute;do y Acepto la
            Pol&iacute;ticas y Reglas de Uniformes</label>
        <button id="buttonAceptar" class="ui-btn ui-mini ui-corner-all ui-btn-b ui-state-disabled">Aceptar</button>
    </div>

    <div id="mensajeWindow" data-role="popup" data-dismissible="false" data-theme="c"
         data-dismissible="false">
        <div id="dialog_label" data-role="header" data-theme="a">
            Titulo
        </div>
        <div role="main" class="ui-content">
            <div id="mensaje">
                Mensaje
            </div>
        </div>
        <div id="divFooterMensaje" data-role="footer">
            <a href="#" class="ui-btn ui-corner-all ui-shadow ui-btn-inline" data-rel="back" data-transition="flow">Aceptar</a>
        </div>
    </div>

    <div id="popupManualDeImagen" data-role="popup" data-dismissible="false">
        <div class="tituloPopup" data-role="header">
            Manual de Imagen Personal
        </div>
        <div id="contenidoManualDeImagen" data-role="main"></div>
        <div data-role="footer" class="popupControlbar">
            <a href="#" data-rel="back" class="ui-btn ui-corner-all ui-shadow ui-btn-inline" data-transition="flow">Aceptar</a>
        </div>
    </div>
</div>

</body>
</html>
