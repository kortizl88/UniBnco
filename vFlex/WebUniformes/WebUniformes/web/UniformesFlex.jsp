<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
<head>
    <title>Sistema de Uniformes</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <style type="text/css" media="screen">
        html, body {
            height: 100%;
            overflow-y: hidden;
        }

        body {
            margin: 0;
            padding: 0;
            overflow: auto;
            text-align: center;
            background-color: #ffffff;
        }

        object:focus {
            outline: none;
        }

        #flashContent {
            display: none;
        }

        #wrapper {
            overflow: hidden;
            width: 100%;
            height: 100%;
        }

        #huella {
            position: absolute;
            width: 100%;
            height: auto;
            top: -280px;
            left: 0;
            text-align: center;
            z-index: 1000;
            background: none;
        }

        #flashWrapper {
            position: absolute;
            width: 100%;
            height: 100%;
            top: 0;
            left: 0;
        }

        #padHuella {
            margin: 1px;
            width: 173px;
            height: 260px;
            border: 2px ridge;
            background: url("img/background.png") repeat-x;
            box-shadow: 3px 3px 4px #2D2D2D;
            -ms-filter: "progid:DXImageTransform.Microsoft.Shadow(Strength=4, Direction=135, Color='#2D2D2D')";
            filter: progid:DXImageTransform.Microsoft.Shadow(Strength=4, Direction=135, Color='#2D2D2D');
        }

    </style>

    <!-- Componente de huella digital -->
    <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="js/compHuella.js"></script>

    <script type="text/javascript" src="js/swfobject.js"></script>
    <script type="text/javascript">
        var swfVersionStr = "10.3.0";
        var flashvars = {
            idEmpleado: "<%=session.getAttribute("idEmpleado")%>",
            sucursal: "<%=session.getAttribute("Sucursal")%>",
            canal: "<%=session.getAttribute("Canal")%>",
            pais: "<%=session.getAttribute("Pais")%>"
        };
        var params = {};
        params.quality = "high";
        params.bgcolor = "#ffffff";
        params.allowscriptaccess = "always";
        params.allowfullscreen = "true";
        params.wmode = "transparent";
        var attributes = {};
        attributes.id = "UniformesFlex";
        attributes.name = "UniformesFlex";
        attributes.align = "middle";

        swfobject.embedSWF(
                "UniformesFlex.swf", "flashContent",
                "100%", "100%",
                swfVersionStr, null,
                flashvars, params, attributes);
        swfobject.createCSS("#flashContent", "display:block;text-align:left;");


    </script>
</head>
<body>
<div id="wrapper">
    <div id="flashWrapper">
        <div id="flashContent">
            <p>
                Para abrir esta aplicaci&oacute;n necesita tener instalado Flash Player 10.3 o superior. <Br>
                Favor de aplicar <B>revisi&oacute;n de integridad</B> a su estaci&oacute;n de trabajo.
            </p>
        </div>
    </div>
    <div id="huella">
        <div id="padHuella">
        </div>
    </div>
</div>
</body>
</html>
