
/**
 * WS_JSA_ITALIKACallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.elektra.uniformes.wsitalika;

/**
 * WS_JSA_ITALIKACallbackHandler Callback class, Users can extend this class and implement
 * their own receiveResult and receiveError methods.
 */
public abstract class WS_JSA_ITALIKACallbackHandler {


    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     *
     * @param clientData Object mechanism by which the user can pass in user data
     *                   that will be avilable at the time this callback is called.
     */
    public WS_JSA_ITALIKACallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public WS_JSA_ITALIKACallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */

    public Object getClientData() {
        return clientData;
    }


    /**
     * auto generated Axis2 call back method for registraExperienciaItalikaRecibida method
     * override this method for handling normal response from registraExperienciaItalikaRecibida operation
     */
    public void receiveResultregistraExperienciaItalikaRecibida(
            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraExperienciaItalikaRecibidaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from registraExperienciaItalikaRecibida operation
     */
    public void receiveErrorregistraExperienciaItalikaRecibida(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obtenerHistorialMotoItalika method
     * override this method for handling normal response from obtenerHistorialMotoItalika operation
     */
    public void receiveResultobtenerHistorialMotoItalika(
            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerHistorialMotoItalikaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obtenerHistorialMotoItalika operation
     */
    public void receiveErrorobtenerHistorialMotoItalika(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obtenerInformacionRemisionesMotosItalika method
     * override this method for handling normal response from obtenerInformacionRemisionesMotosItalika operation
     */
    public void receiveResultobtenerInformacionRemisionesMotosItalika(
            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionRemisionesMotosItalikaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obtenerInformacionRemisionesMotosItalika operation
     */
    public void receiveErrorobtenerInformacionRemisionesMotosItalika(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for registraKilometrajeMoto method
     * override this method for handling normal response from registraKilometrajeMoto operation
     */
    public void receiveResultregistraKilometrajeMoto(
            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraKilometrajeMotoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from registraKilometrajeMoto operation
     */
    public void receiveErrorregistraKilometrajeMoto(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obtenerMotosAsignadasAEmpleado method
     * override this method for handling normal response from obtenerMotosAsignadasAEmpleado operation
     */
    public void receiveResultobtenerMotosAsignadasAEmpleado(
            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerMotosAsignadasAEmpleadoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obtenerMotosAsignadasAEmpleado operation
     */
    public void receiveErrorobtenerMotosAsignadasAEmpleado(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obtenerInformacionGeneralMotosItalika method
     * override this method for handling normal response from obtenerInformacionGeneralMotosItalika operation
     */
    public void receiveResultobtenerInformacionGeneralMotosItalika(
            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionGeneralMotosItalikaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obtenerInformacionGeneralMotosItalika operation
     */
    public void receiveErrorobtenerInformacionGeneralMotosItalika(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obtenerUltimaFechaAsignacionMotoItalikaNueva method
     * override this method for handling normal response from obtenerUltimaFechaAsignacionMotoItalikaNueva operation
     */
    public void receiveResultobtenerUltimaFechaAsignacionMotoItalikaNueva(
            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obtenerUltimaFechaAsignacionMotoItalikaNueva operation
     */
    public void receiveErrorobtenerUltimaFechaAsignacionMotoItalikaNueva(java.lang.Exception e) {
    }


}
    