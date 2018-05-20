
/**
 * IntfPED_CENT_CANCELAServiceCallbackHandler.java
 * <p/>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.elektra.uniformes.wscancela;

/**
 *  IntfPED_CENT_CANCELAServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class IntfPED_CENT_CANCELAServiceCallbackHandler {


    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public IntfPED_CENT_CANCELAServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public IntfPED_CENT_CANCELAServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */

    public Object getClientData() {
        return clientData;
    }


    /**
     * auto generated Axis2 call back method for pED__CENT__CANCELAOp method
     * override this method for handling normal response from pED__CENT__CANCELAOp operation
     */
    public void receiveResultpED__CENT__CANCELAOp(
            com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from pED__CENT__CANCELAOp operation
     */
    public void receiveErrorpED__CENT__CANCELAOp(java.lang.Exception e) {
    }


}
    