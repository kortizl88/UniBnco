

/**
 * IntfPED_CENT_CANCELAServiceTest.java
 * <p/>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.elektra.uniformes.wscancela;

    /*
     *  IntfPED_CENT_CANCELAServiceTest Junit test case
    */

public class IntfPED_CENT_CANCELAServiceTest extends junit.framework.TestCase {


    /**
     * Auto generated test method
     */
    public void testpED__CENT__CANCELAOp() throws java.lang.Exception {

        com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub stub =
                new com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub();//the default implementation should point to the right endpoint

        com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros_Entrada parametros_Entrada4 =
                (com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros_Entrada) getTestObject(com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros_Entrada.class);
        // TODO : Fill in the parametros_Entrada4 here
        parametros_Entrada4.setTienda("673");
        assertNotNull(stub.pED__CENT__CANCELAOp(
                parametros_Entrada4));


    }

    /**
     * Auto generated test method
     */
    public void testStartpED__CENT__CANCELAOp() throws java.lang.Exception {
        com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub stub = new com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub();
        com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros_Entrada parametros_Entrada4 =
                (com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros_Entrada) getTestObject(com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros_Entrada.class);
        // TODO : Fill in the parametros_Entrada4 here


        stub.startpED__CENT__CANCELAOp(
                parametros_Entrada4,
                new tempCallbackN1000C()
        );


    }

    private class tempCallbackN1000C extends com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceCallbackHandler {
        public tempCallbackN1000C() {
            super(null);
        }

        public void receiveResultpED__CENT__CANCELAOp(
                com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros result
        ) {

        }

        public void receiveErrorpED__CENT__CANCELAOp(java.lang.Exception e) {
            fail();
        }

    }

    //Create an ADBBean and provide it as the test object
    public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception {
        return (org.apache.axis2.databinding.ADBBean) type.newInstance();
    }


}
    