<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://JSAWEB2/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="http://JSAWEB2/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://JSAWEB2/">
      <s:element name="ObtenerInformacionRemisionesMotosItalika">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="fechaIniRemisionAAAAMMDD" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="fechaFinRemisionAAAAMMDD" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ObtenerInformacionRemisionesMotosItalikaResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ObtenerInformacionRemisionesMotosItalikaResult" type="tns:ArrayOfInfoRemision" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfInfoRemision">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="InfoRemision" type="tns:InfoRemision" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="InfoRemision">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="emisor" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="emisorNombre" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="receptor" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="receptorNombre" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="remision" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="fechaRemision" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="sku" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="skuDescripcion" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="serie" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="fechaConfirmacionRemision" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="numEmpDestinoMoto" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="nombreEmpDestinoMoto" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="motoAsignada" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="ObtenerInformacionGeneralMotosItalika">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="serieMotoFiltrar" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ObtenerInformacionGeneralMotosItalikaResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ObtenerInformacionGeneralMotosItalikaResult" type="tns:ArrayOfInfoMoto" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfInfoMoto">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="InfoMoto" type="tns:InfoMoto" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="InfoMoto">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="serieMoto" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="numeroMotor" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="placaVehicular" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="entidadEmplacamiento" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="marca" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="modelo" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estatusMoto" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="situacionOperativaMoto" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="empleadoAsignado" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="empleadoAsignadoNombre" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="cecoEmpleado" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="cecoEmpleadoNombre" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="fechaCambioEmpleadoOEstatus" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="ObtenerHistorialMotoItalika">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="serieMotoFiltrar" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ObtenerHistorialMotoItalikaResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ObtenerHistorialMotoItalikaResult" type="tns:ArrayOfInfoMotoMin" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfInfoMotoMin">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="InfoMotoMin" type="tns:InfoMotoMin" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="InfoMotoMin">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="serieMoto" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estatusMoto" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="situacionOperativaMoto" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="empleadoAsignado" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="empleadoAsignadoNombre" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="fechaCambioEstatusOEmpleado" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="RegistraKilometrajeMoto">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="empleadoUsaMoto" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="serieMoto" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="kilometrajeMoto" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="empleadoRegistraDatos" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="autenticacion" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RegistraKilometrajeMotoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="RegistraKilometrajeMotoResult" type="tns:ResultadoOP" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResultadoOP">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="codigo" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="mensaje" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="ObtenerMotosAsignadasAEmpleado">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="numeroEmpleado" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="autenticacion" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ObtenerMotosAsignadasAEmpleadoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ObtenerMotosAsignadasAEmpleadoResult" type="tns:ArrayOfMotoEmpleado" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfMotoEmpleado">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="MotoEmpleado" type="tns:MotoEmpleado" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="MotoEmpleado">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="serieMoto" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="placaActivoFijo" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="marca" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tipoMoto" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="modelo" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="numEmpleado" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="nombreEmpleado" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="ObtenerUltimaFechaAsignacionMotoItalikaNueva">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="empleadoConsultado" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="ObtenerUltimaFechaAsignacionMotoItalikaNuevaResult" type="tns:InfoFechaAsignacion" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="InfoFechaAsignacion">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="empleadoConsultado" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="fechaUltimaAsignacionMotoItalikaNueva" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="RegistraExperienciaItalikaRecibida">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="empleadoRecibeExperiencia" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="serieMoto" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="folioSisItalika" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="autenticacion" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RegistraExperienciaItalikaRecibidaResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="RegistraExperienciaItalikaRecibidaResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ArrayOfInfoRemision" nillable="true" type="tns:ArrayOfInfoRemision" />
      <s:element name="ArrayOfInfoMoto" nillable="true" type="tns:ArrayOfInfoMoto" />
      <s:element name="ArrayOfInfoMotoMin" nillable="true" type="tns:ArrayOfInfoMotoMin" />
      <s:element name="ResultadoOP" type="tns:ResultadoOP" />
      <s:element name="ArrayOfMotoEmpleado" nillable="true" type="tns:ArrayOfMotoEmpleado" />
      <s:element name="InfoFechaAsignacion" type="tns:InfoFechaAsignacion" />
      <s:element name="int" type="s:int" />
    </s:schema>
  </wsdl:types>
  <wsdl:message name="ObtenerInformacionRemisionesMotosItalikaSoapIn">
    <wsdl:part name="parameters" element="tns:ObtenerInformacionRemisionesMotosItalika" />
  </wsdl:message>
  <wsdl:message name="ObtenerInformacionRemisionesMotosItalikaSoapOut">
    <wsdl:part name="parameters" element="tns:ObtenerInformacionRemisionesMotosItalikaResponse" />
  </wsdl:message>
  <wsdl:message name="ObtenerInformacionGeneralMotosItalikaSoapIn">
    <wsdl:part name="parameters" element="tns:ObtenerInformacionGeneralMotosItalika" />
  </wsdl:message>
  <wsdl:message name="ObtenerInformacionGeneralMotosItalikaSoapOut">
    <wsdl:part name="parameters" element="tns:ObtenerInformacionGeneralMotosItalikaResponse" />
  </wsdl:message>
  <wsdl:message name="ObtenerHistorialMotoItalikaSoapIn">
    <wsdl:part name="parameters" element="tns:ObtenerHistorialMotoItalika" />
  </wsdl:message>
  <wsdl:message name="ObtenerHistorialMotoItalikaSoapOut">
    <wsdl:part name="parameters" element="tns:ObtenerHistorialMotoItalikaResponse" />
  </wsdl:message>
  <wsdl:message name="RegistraKilometrajeMotoSoapIn">
    <wsdl:part name="parameters" element="tns:RegistraKilometrajeMoto" />
  </wsdl:message>
  <wsdl:message name="RegistraKilometrajeMotoSoapOut">
    <wsdl:part name="parameters" element="tns:RegistraKilometrajeMotoResponse" />
  </wsdl:message>
  <wsdl:message name="ObtenerMotosAsignadasAEmpleadoSoapIn">
    <wsdl:part name="parameters" element="tns:ObtenerMotosAsignadasAEmpleado" />
  </wsdl:message>
  <wsdl:message name="ObtenerMotosAsignadasAEmpleadoSoapOut">
    <wsdl:part name="parameters" element="tns:ObtenerMotosAsignadasAEmpleadoResponse" />
  </wsdl:message>
  <wsdl:message name="ObtenerUltimaFechaAsignacionMotoItalikaNuevaSoapIn">
    <wsdl:part name="parameters" element="tns:ObtenerUltimaFechaAsignacionMotoItalikaNueva" />
  </wsdl:message>
  <wsdl:message name="ObtenerUltimaFechaAsignacionMotoItalikaNuevaSoapOut">
    <wsdl:part name="parameters" element="tns:ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse" />
  </wsdl:message>
  <wsdl:message name="RegistraExperienciaItalikaRecibidaSoapIn">
    <wsdl:part name="parameters" element="tns:RegistraExperienciaItalikaRecibida" />
  </wsdl:message>
  <wsdl:message name="RegistraExperienciaItalikaRecibidaSoapOut">
    <wsdl:part name="parameters" element="tns:RegistraExperienciaItalikaRecibidaResponse" />
  </wsdl:message>
  <wsdl:message name="ObtenerInformacionRemisionesMotosItalikaHttpGetIn">
    <wsdl:part name="fechaIniRemisionAAAAMMDD" type="s:string" />
    <wsdl:part name="fechaFinRemisionAAAAMMDD" type="s:string" />
  </wsdl:message>
  <wsdl:message name="ObtenerInformacionRemisionesMotosItalikaHttpGetOut">
    <wsdl:part name="Body" element="tns:ArrayOfInfoRemision" />
  </wsdl:message>
  <wsdl:message name="ObtenerInformacionGeneralMotosItalikaHttpGetIn">
    <wsdl:part name="serieMotoFiltrar" type="s:string" />
  </wsdl:message>
  <wsdl:message name="ObtenerInformacionGeneralMotosItalikaHttpGetOut">
    <wsdl:part name="Body" element="tns:ArrayOfInfoMoto" />
  </wsdl:message>
  <wsdl:message name="ObtenerHistorialMotoItalikaHttpGetIn">
    <wsdl:part name="serieMotoFiltrar" type="s:string" />
  </wsdl:message>
  <wsdl:message name="ObtenerHistorialMotoItalikaHttpGetOut">
    <wsdl:part name="Body" element="tns:ArrayOfInfoMotoMin" />
  </wsdl:message>
  <wsdl:message name="RegistraKilometrajeMotoHttpGetIn">
    <wsdl:part name="empleadoUsaMoto" type="s:string" />
    <wsdl:part name="serieMoto" type="s:string" />
    <wsdl:part name="kilometrajeMoto" type="s:string" />
    <wsdl:part name="empleadoRegistraDatos" type="s:string" />
    <wsdl:part name="autenticacion" type="s:string" />
  </wsdl:message>
  <wsdl:message name="RegistraKilometrajeMotoHttpGetOut">
    <wsdl:part name="Body" element="tns:ResultadoOP" />
  </wsdl:message>
  <wsdl:message name="ObtenerMotosAsignadasAEmpleadoHttpGetIn">
    <wsdl:part name="numeroEmpleado" type="s:string" />
    <wsdl:part name="autenticacion" type="s:string" />
  </wsdl:message>
  <wsdl:message name="ObtenerMotosAsignadasAEmpleadoHttpGetOut">
    <wsdl:part name="Body" element="tns:ArrayOfMotoEmpleado" />
  </wsdl:message>
  <wsdl:message name="ObtenerUltimaFechaAsignacionMotoItalikaNuevaHttpGetIn">
    <wsdl:part name="empleadoConsultado" type="s:string" />
  </wsdl:message>
  <wsdl:message name="ObtenerUltimaFechaAsignacionMotoItalikaNuevaHttpGetOut">
    <wsdl:part name="Body" element="tns:InfoFechaAsignacion" />
  </wsdl:message>
  <wsdl:message name="RegistraExperienciaItalikaRecibidaHttpGetIn">
    <wsdl:part name="empleadoRecibeExperiencia" type="s:string" />
    <wsdl:part name="serieMoto" type="s:string" />
    <wsdl:part name="folioSisItalika" type="s:string" />
    <wsdl:part name="autenticacion" type="s:string" />
  </wsdl:message>
  <wsdl:message name="RegistraExperienciaItalikaRecibidaHttpGetOut">
    <wsdl:part name="Body" element="tns:int" />
  </wsdl:message>
  <wsdl:message name="ObtenerInformacionRemisionesMotosItalikaHttpPostIn">
    <wsdl:part name="fechaIniRemisionAAAAMMDD" type="s:string" />
    <wsdl:part name="fechaFinRemisionAAAAMMDD" type="s:string" />
  </wsdl:message>
  <wsdl:message name="ObtenerInformacionRemisionesMotosItalikaHttpPostOut">
    <wsdl:part name="Body" element="tns:ArrayOfInfoRemision" />
  </wsdl:message>
  <wsdl:message name="ObtenerInformacionGeneralMotosItalikaHttpPostIn">
    <wsdl:part name="serieMotoFiltrar" type="s:string" />
  </wsdl:message>
  <wsdl:message name="ObtenerInformacionGeneralMotosItalikaHttpPostOut">
    <wsdl:part name="Body" element="tns:ArrayOfInfoMoto" />
  </wsdl:message>
  <wsdl:message name="ObtenerHistorialMotoItalikaHttpPostIn">
    <wsdl:part name="serieMotoFiltrar" type="s:string" />
  </wsdl:message>
  <wsdl:message name="ObtenerHistorialMotoItalikaHttpPostOut">
    <wsdl:part name="Body" element="tns:ArrayOfInfoMotoMin" />
  </wsdl:message>
  <wsdl:message name="RegistraKilometrajeMotoHttpPostIn">
    <wsdl:part name="empleadoUsaMoto" type="s:string" />
    <wsdl:part name="serieMoto" type="s:string" />
    <wsdl:part name="kilometrajeMoto" type="s:string" />
    <wsdl:part name="empleadoRegistraDatos" type="s:string" />
    <wsdl:part name="autenticacion" type="s:string" />
  </wsdl:message>
  <wsdl:message name="RegistraKilometrajeMotoHttpPostOut">
    <wsdl:part name="Body" element="tns:ResultadoOP" />
  </wsdl:message>
  <wsdl:message name="ObtenerMotosAsignadasAEmpleadoHttpPostIn">
    <wsdl:part name="numeroEmpleado" type="s:string" />
    <wsdl:part name="autenticacion" type="s:string" />
  </wsdl:message>
  <wsdl:message name="ObtenerMotosAsignadasAEmpleadoHttpPostOut">
    <wsdl:part name="Body" element="tns:ArrayOfMotoEmpleado" />
  </wsdl:message>
  <wsdl:message name="ObtenerUltimaFechaAsignacionMotoItalikaNuevaHttpPostIn">
    <wsdl:part name="empleadoConsultado" type="s:string" />
  </wsdl:message>
  <wsdl:message name="ObtenerUltimaFechaAsignacionMotoItalikaNuevaHttpPostOut">
    <wsdl:part name="Body" element="tns:InfoFechaAsignacion" />
  </wsdl:message>
  <wsdl:message name="RegistraExperienciaItalikaRecibidaHttpPostIn">
    <wsdl:part name="empleadoRecibeExperiencia" type="s:string" />
    <wsdl:part name="serieMoto" type="s:string" />
    <wsdl:part name="folioSisItalika" type="s:string" />
    <wsdl:part name="autenticacion" type="s:string" />
  </wsdl:message>
  <wsdl:message name="RegistraExperienciaItalikaRecibidaHttpPostOut">
    <wsdl:part name="Body" element="tns:int" />
  </wsdl:message>
  <wsdl:portType name="WS_JSA_ITALIKASoap">
    <wsdl:operation name="ObtenerInformacionRemisionesMotosItalika">
      <wsdl:input message="tns:ObtenerInformacionRemisionesMotosItalikaSoapIn" />
      <wsdl:output message="tns:ObtenerInformacionRemisionesMotosItalikaSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ObtenerInformacionGeneralMotosItalika">
      <wsdl:input message="tns:ObtenerInformacionGeneralMotosItalikaSoapIn" />
      <wsdl:output message="tns:ObtenerInformacionGeneralMotosItalikaSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ObtenerHistorialMotoItalika">
      <wsdl:input message="tns:ObtenerHistorialMotoItalikaSoapIn" />
      <wsdl:output message="tns:ObtenerHistorialMotoItalikaSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RegistraKilometrajeMoto">
      <wsdl:input message="tns:RegistraKilometrajeMotoSoapIn" />
      <wsdl:output message="tns:RegistraKilometrajeMotoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ObtenerMotosAsignadasAEmpleado">
      <wsdl:input message="tns:ObtenerMotosAsignadasAEmpleadoSoapIn" />
      <wsdl:output message="tns:ObtenerMotosAsignadasAEmpleadoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ObtenerUltimaFechaAsignacionMotoItalikaNueva">
      <wsdl:input message="tns:ObtenerUltimaFechaAsignacionMotoItalikaNuevaSoapIn" />
      <wsdl:output message="tns:ObtenerUltimaFechaAsignacionMotoItalikaNuevaSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RegistraExperienciaItalikaRecibida">
      <wsdl:input message="tns:RegistraExperienciaItalikaRecibidaSoapIn" />
      <wsdl:output message="tns:RegistraExperienciaItalikaRecibidaSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="WS_JSA_ITALIKAHttpGet">
    <wsdl:operation name="ObtenerInformacionRemisionesMotosItalika">
      <wsdl:input message="tns:ObtenerInformacionRemisionesMotosItalikaHttpGetIn" />
      <wsdl:output message="tns:ObtenerInformacionRemisionesMotosItalikaHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="ObtenerInformacionGeneralMotosItalika">
      <wsdl:input message="tns:ObtenerInformacionGeneralMotosItalikaHttpGetIn" />
      <wsdl:output message="tns:ObtenerInformacionGeneralMotosItalikaHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="ObtenerHistorialMotoItalika">
      <wsdl:input message="tns:ObtenerHistorialMotoItalikaHttpGetIn" />
      <wsdl:output message="tns:ObtenerHistorialMotoItalikaHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="RegistraKilometrajeMoto">
      <wsdl:input message="tns:RegistraKilometrajeMotoHttpGetIn" />
      <wsdl:output message="tns:RegistraKilometrajeMotoHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="ObtenerMotosAsignadasAEmpleado">
      <wsdl:input message="tns:ObtenerMotosAsignadasAEmpleadoHttpGetIn" />
      <wsdl:output message="tns:ObtenerMotosAsignadasAEmpleadoHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="ObtenerUltimaFechaAsignacionMotoItalikaNueva">
      <wsdl:input message="tns:ObtenerUltimaFechaAsignacionMotoItalikaNuevaHttpGetIn" />
      <wsdl:output message="tns:ObtenerUltimaFechaAsignacionMotoItalikaNuevaHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="RegistraExperienciaItalikaRecibida">
      <wsdl:input message="tns:RegistraExperienciaItalikaRecibidaHttpGetIn" />
      <wsdl:output message="tns:RegistraExperienciaItalikaRecibidaHttpGetOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="WS_JSA_ITALIKAHttpPost">
    <wsdl:operation name="ObtenerInformacionRemisionesMotosItalika">
      <wsdl:input message="tns:ObtenerInformacionRemisionesMotosItalikaHttpPostIn" />
      <wsdl:output message="tns:ObtenerInformacionRemisionesMotosItalikaHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="ObtenerInformacionGeneralMotosItalika">
      <wsdl:input message="tns:ObtenerInformacionGeneralMotosItalikaHttpPostIn" />
      <wsdl:output message="tns:ObtenerInformacionGeneralMotosItalikaHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="ObtenerHistorialMotoItalika">
      <wsdl:input message="tns:ObtenerHistorialMotoItalikaHttpPostIn" />
      <wsdl:output message="tns:ObtenerHistorialMotoItalikaHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="RegistraKilometrajeMoto">
      <wsdl:input message="tns:RegistraKilometrajeMotoHttpPostIn" />
      <wsdl:output message="tns:RegistraKilometrajeMotoHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="ObtenerMotosAsignadasAEmpleado">
      <wsdl:input message="tns:ObtenerMotosAsignadasAEmpleadoHttpPostIn" />
      <wsdl:output message="tns:ObtenerMotosAsignadasAEmpleadoHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="ObtenerUltimaFechaAsignacionMotoItalikaNueva">
      <wsdl:input message="tns:ObtenerUltimaFechaAsignacionMotoItalikaNuevaHttpPostIn" />
      <wsdl:output message="tns:ObtenerUltimaFechaAsignacionMotoItalikaNuevaHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="RegistraExperienciaItalikaRecibida">
      <wsdl:input message="tns:RegistraExperienciaItalikaRecibidaHttpPostIn" />
      <wsdl:output message="tns:RegistraExperienciaItalikaRecibidaHttpPostOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="WS_JSA_ITALIKASoap" type="tns:WS_JSA_ITALIKASoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ObtenerInformacionRemisionesMotosItalika">
      <soap:operation soapAction="http://JSAWEB2/ObtenerInformacionRemisionesMotosItalika" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ObtenerInformacionGeneralMotosItalika">
      <soap:operation soapAction="http://JSAWEB2/ObtenerInformacionGeneralMotosItalika" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ObtenerHistorialMotoItalika">
      <soap:operation soapAction="http://JSAWEB2/ObtenerHistorialMotoItalika" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RegistraKilometrajeMoto">
      <soap:operation soapAction="http://JSAWEB2/RegistraKilometrajeMoto" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ObtenerMotosAsignadasAEmpleado">
      <soap:operation soapAction="http://JSAWEB2/ObtenerMotosAsignadasAEmpleado" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ObtenerUltimaFechaAsignacionMotoItalikaNueva">
      <soap:operation soapAction="http://JSAWEB2/ObtenerUltimaFechaAsignacionMotoItalikaNueva" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RegistraExperienciaItalikaRecibida">
      <soap:operation soapAction="http://JSAWEB2/RegistraExperienciaItalikaRecibida" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="WS_JSA_ITALIKASoap12" type="tns:WS_JSA_ITALIKASoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ObtenerInformacionRemisionesMotosItalika">
      <soap12:operation soapAction="http://JSAWEB2/ObtenerInformacionRemisionesMotosItalika" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ObtenerInformacionGeneralMotosItalika">
      <soap12:operation soapAction="http://JSAWEB2/ObtenerInformacionGeneralMotosItalika" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ObtenerHistorialMotoItalika">
      <soap12:operation soapAction="http://JSAWEB2/ObtenerHistorialMotoItalika" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RegistraKilometrajeMoto">
      <soap12:operation soapAction="http://JSAWEB2/RegistraKilometrajeMoto" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ObtenerMotosAsignadasAEmpleado">
      <soap12:operation soapAction="http://JSAWEB2/ObtenerMotosAsignadasAEmpleado" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ObtenerUltimaFechaAsignacionMotoItalikaNueva">
      <soap12:operation soapAction="http://JSAWEB2/ObtenerUltimaFechaAsignacionMotoItalikaNueva" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RegistraExperienciaItalikaRecibida">
      <soap12:operation soapAction="http://JSAWEB2/RegistraExperienciaItalikaRecibida" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="WS_JSA_ITALIKAHttpGet" type="tns:WS_JSA_ITALIKAHttpGet">
    <http:binding verb="GET" />
    <wsdl:operation name="ObtenerInformacionRemisionesMotosItalika">
      <http:operation location="/ObtenerInformacionRemisionesMotosItalika" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ObtenerInformacionGeneralMotosItalika">
      <http:operation location="/ObtenerInformacionGeneralMotosItalika" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ObtenerHistorialMotoItalika">
      <http:operation location="/ObtenerHistorialMotoItalika" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RegistraKilometrajeMoto">
      <http:operation location="/RegistraKilometrajeMoto" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ObtenerMotosAsignadasAEmpleado">
      <http:operation location="/ObtenerMotosAsignadasAEmpleado" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ObtenerUltimaFechaAsignacionMotoItalikaNueva">
      <http:operation location="/ObtenerUltimaFechaAsignacionMotoItalikaNueva" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RegistraExperienciaItalikaRecibida">
      <http:operation location="/RegistraExperienciaItalikaRecibida" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="WS_JSA_ITALIKAHttpPost" type="tns:WS_JSA_ITALIKAHttpPost">
    <http:binding verb="POST" />
    <wsdl:operation name="ObtenerInformacionRemisionesMotosItalika">
      <http:operation location="/ObtenerInformacionRemisionesMotosItalika" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ObtenerInformacionGeneralMotosItalika">
      <http:operation location="/ObtenerInformacionGeneralMotosItalika" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ObtenerHistorialMotoItalika">
      <http:operation location="/ObtenerHistorialMotoItalika" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RegistraKilometrajeMoto">
      <http:operation location="/RegistraKilometrajeMoto" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ObtenerMotosAsignadasAEmpleado">
      <http:operation location="/ObtenerMotosAsignadasAEmpleado" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ObtenerUltimaFechaAsignacionMotoItalikaNueva">
      <http:operation location="/ObtenerUltimaFechaAsignacionMotoItalikaNueva" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RegistraExperienciaItalikaRecibida">
      <http:operation location="/RegistraExperienciaItalikaRecibida" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="WS_JSA_ITALIKA">
    <wsdl:port name="WS_JSA_ITALIKASoap" binding="tns:WS_JSA_ITALIKASoap">
      <soap:address location="http://10.50.124.24/WS_JSA_ITALIKA/WS_JSA_ITALIKA.asmx" />
    </wsdl:port>
    <wsdl:port name="WS_JSA_ITALIKASoap12" binding="tns:WS_JSA_ITALIKASoap12">
      <soap12:address location="http://10.50.124.24/WS_JSA_ITALIKA/WS_JSA_ITALIKA.asmx" />
    </wsdl:port>
    <wsdl:port name="WS_JSA_ITALIKAHttpGet" binding="tns:WS_JSA_ITALIKAHttpGet">
      <http:address location="http://10.50.124.24/WS_JSA_ITALIKA/WS_JSA_ITALIKA.asmx" />
    </wsdl:port>
    <wsdl:port name="WS_JSA_ITALIKAHttpPost" binding="tns:WS_JSA_ITALIKAHttpPost">
      <http:address location="http://10.50.124.24/WS_JSA_ITALIKA/WS_JSA_ITALIKA.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>