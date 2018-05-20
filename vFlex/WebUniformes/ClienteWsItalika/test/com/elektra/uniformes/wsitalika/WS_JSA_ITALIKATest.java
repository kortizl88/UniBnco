/**
 * WS_JSA_ITALIKATest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.elektra.uniformes.wsitalika;

    /*
     *  WS_JSA_ITALIKATest Junit test case
    */

public class WS_JSA_ITALIKATest extends junit.framework.TestCase {


    /**
     * Auto generated test method
     */
    public void testobtenerUltimaFechaAsignacionMotoItalikaNueva() throws java.lang.Exception {

        com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub stub =
                new com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub();//the default implementation should point to the right endpoint

        com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNueva obtenerUltimaFechaAsignacionMotoItalikaNueva40 =
                (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNueva) getTestObject(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNueva.class);
        obtenerUltimaFechaAsignacionMotoItalikaNueva40.setEmpleadoConsultado(141224);
        assertNotNull(stub.obtenerUltimaFechaAsignacionMotoItalikaNueva(
                obtenerUltimaFechaAsignacionMotoItalikaNueva40));


    }

    /**
     * Auto generated test method
     */
    public void testStartobtenerUltimaFechaAsignacionMotoItalikaNueva() throws java.lang.Exception {
        com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub stub = new com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub();
        com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNueva obtenerUltimaFechaAsignacionMotoItalikaNueva40 =
                (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNueva) getTestObject(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNueva.class);
        obtenerUltimaFechaAsignacionMotoItalikaNueva40.setEmpleadoConsultado(141224);
        stub.startobtenerUltimaFechaAsignacionMotoItalikaNueva(
                obtenerUltimaFechaAsignacionMotoItalikaNueva40,
                new tempCallbackN10102()
        );


    }

    private class tempCallbackN10102 extends com.elektra.uniformes.wsitalika.WS_JSA_ITALIKACallbackHandler {
        public tempCallbackN10102() {
            super(null);
        }

        public void receiveResultobtenerUltimaFechaAsignacionMotoItalikaNueva(
                com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse result
        ) {

        }

        public void receiveErrorobtenerUltimaFechaAsignacionMotoItalikaNueva(java.lang.Exception e) {
            fail();
        }

    }

    //Create an ADBBean and provide it as the test object
    public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception {
        return (org.apache.axis2.databinding.ADBBean) type.newInstance();
    }


}
    