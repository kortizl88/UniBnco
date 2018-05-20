
/**
 * WS_JSA_ITALIKAStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.elektra.uniformes.wsitalika;

        

        /*
        *  WS_JSA_ITALIKAStub java implementation
        */


public class WS_JSA_ITALIKAStub extends org.apache.axis2.client.Stub {
    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();

    private static int counter = 0;

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }
        counter = counter + 1;
        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
    }


    private void populateAxisService() throws org.apache.axis2.AxisFault {

        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService("WS_JSA_ITALIKA" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[7];

        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://JSAWEB2/", "registraExperienciaItalikaRecibida"));
        _service.addOperation(__operation);


        _operations[0] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://JSAWEB2/", "obtenerHistorialMotoItalika"));
        _service.addOperation(__operation);


        _operations[1] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://JSAWEB2/", "obtenerInformacionRemisionesMotosItalika"));
        _service.addOperation(__operation);


        _operations[2] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://JSAWEB2/", "registraKilometrajeMoto"));
        _service.addOperation(__operation);


        _operations[3] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://JSAWEB2/", "obtenerMotosAsignadasAEmpleado"));
        _service.addOperation(__operation);


        _operations[4] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://JSAWEB2/", "obtenerInformacionGeneralMotosItalika"));
        _service.addOperation(__operation);


        _operations[5] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://JSAWEB2/", "obtenerUltimaFechaAsignacionMotoItalikaNueva"));
        _service.addOperation(__operation);


        _operations[6] = __operation;


    }

    //populates the faults
    private void populateFaults() {


    }

    /**
     * Constructor that takes in a configContext
     */

    public WS_JSA_ITALIKAStub(org.apache.axis2.context.ConfigurationContext configurationContext,
                              java.lang.String targetEndpoint)
            throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }


    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public WS_JSA_ITALIKAStub(org.apache.axis2.context.ConfigurationContext configurationContext,
                              java.lang.String targetEndpoint, boolean useSeparateListener)
            throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);


        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

        //Set the soap version
        _serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);


    }

    /**
     * Default Constructor
     */
    public WS_JSA_ITALIKAStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {

        this(configurationContext, "http://10.50.124.24/WS_JSA_ITALIKA/WS_JSA_ITALIKA.asmx");

    }

    /**
     * Default Constructor
     */
    public WS_JSA_ITALIKAStub() throws org.apache.axis2.AxisFault {

        this("http://10.50.124.24/WS_JSA_ITALIKA/WS_JSA_ITALIKA.asmx");

    }

    /**
     * Constructor taking the target endpoint
     */
    public WS_JSA_ITALIKAStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }


    /**
     * Auto generated method signature
     *
     * @param registraExperienciaItalikaRecibida0
     * @see com.elektra.uniformes.wsitalika.WS_JSA_ITALIKA#registraExperienciaItalikaRecibida
     */


    public com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraExperienciaItalikaRecibidaResponse registraExperienciaItalikaRecibida(

            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraExperienciaItalikaRecibida registraExperienciaItalikaRecibida0)


            throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions().setAction("http://JSAWEB2/RegistraExperienciaItalikaRecibida");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    registraExperienciaItalikaRecibida0,
                    optimizeContent(new javax.xml.namespace.QName("http://JSAWEB2/",
                            "registraExperienciaItalikaRecibida")), new javax.xml.namespace.QName("http://JSAWEB2/",
                            "registraExperienciaItalikaRecibida"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraExperienciaItalikaRecibidaResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraExperienciaItalikaRecibidaResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RegistraExperienciaItalikaRecibida"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RegistraExperienciaItalikaRecibida"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RegistraExperienciaItalikaRecibida"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext != null && _messageContext.getTransportOut() != null && _messageContext.getTransportOut().getSender() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param registraExperienciaItalikaRecibida0
     * @see com.elektra.uniformes.wsitalika.WS_JSA_ITALIKA#startregistraExperienciaItalikaRecibida
     */
    public void startregistraExperienciaItalikaRecibida(

            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraExperienciaItalikaRecibida registraExperienciaItalikaRecibida0,

            final com.elektra.uniformes.wsitalika.WS_JSA_ITALIKACallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
        _operationClient.getOptions().setAction("http://JSAWEB2/RegistraExperienciaItalikaRecibida");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                registraExperienciaItalikaRecibida0,
                optimizeContent(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "registraExperienciaItalikaRecibida")), new javax.xml.namespace.QName("http://JSAWEB2/",
                        "registraExperienciaItalikaRecibida"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraExperienciaItalikaRecibidaResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultregistraExperienciaItalikaRecibida(
                            (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraExperienciaItalikaRecibidaResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorregistraExperienciaItalikaRecibida(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RegistraExperienciaItalikaRecibida"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RegistraExperienciaItalikaRecibida"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RegistraExperienciaItalikaRecibida"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});


                                callback.receiveErrorregistraExperienciaItalikaRecibida(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregistraExperienciaItalikaRecibida(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregistraExperienciaItalikaRecibida(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregistraExperienciaItalikaRecibida(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregistraExperienciaItalikaRecibida(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregistraExperienciaItalikaRecibida(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregistraExperienciaItalikaRecibida(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregistraExperienciaItalikaRecibida(f);
                            }
                        } else {
                            callback.receiveErrorregistraExperienciaItalikaRecibida(f);
                        }
                    } else {
                        callback.receiveErrorregistraExperienciaItalikaRecibida(f);
                    }
                } else {
                    callback.receiveErrorregistraExperienciaItalikaRecibida(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorregistraExperienciaItalikaRecibida(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[0].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param obtenerHistorialMotoItalika2
     * @see com.elektra.uniformes.wsitalika.WS_JSA_ITALIKA#obtenerHistorialMotoItalika
     */


    public com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerHistorialMotoItalikaResponse obtenerHistorialMotoItalika(

            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerHistorialMotoItalika obtenerHistorialMotoItalika2)


            throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
            _operationClient.getOptions().setAction("http://JSAWEB2/ObtenerHistorialMotoItalika");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    obtenerHistorialMotoItalika2,
                    optimizeContent(new javax.xml.namespace.QName("http://JSAWEB2/",
                            "obtenerHistorialMotoItalika")), new javax.xml.namespace.QName("http://JSAWEB2/",
                            "obtenerHistorialMotoItalika"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerHistorialMotoItalikaResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerHistorialMotoItalikaResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerHistorialMotoItalika"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerHistorialMotoItalika"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerHistorialMotoItalika"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext != null && _messageContext.getTransportOut() != null && _messageContext.getTransportOut().getSender() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param obtenerHistorialMotoItalika2
     * @see com.elektra.uniformes.wsitalika.WS_JSA_ITALIKA#startobtenerHistorialMotoItalika
     */
    public void startobtenerHistorialMotoItalika(

            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerHistorialMotoItalika obtenerHistorialMotoItalika2,

            final com.elektra.uniformes.wsitalika.WS_JSA_ITALIKACallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
        _operationClient.getOptions().setAction("http://JSAWEB2/ObtenerHistorialMotoItalika");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                obtenerHistorialMotoItalika2,
                optimizeContent(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "obtenerHistorialMotoItalika")), new javax.xml.namespace.QName("http://JSAWEB2/",
                        "obtenerHistorialMotoItalika"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerHistorialMotoItalikaResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultobtenerHistorialMotoItalika(
                            (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerHistorialMotoItalikaResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorobtenerHistorialMotoItalika(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerHistorialMotoItalika"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerHistorialMotoItalika"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerHistorialMotoItalika"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});


                                callback.receiveErrorobtenerHistorialMotoItalika(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerHistorialMotoItalika(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerHistorialMotoItalika(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerHistorialMotoItalika(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerHistorialMotoItalika(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerHistorialMotoItalika(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerHistorialMotoItalika(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerHistorialMotoItalika(f);
                            }
                        } else {
                            callback.receiveErrorobtenerHistorialMotoItalika(f);
                        }
                    } else {
                        callback.receiveErrorobtenerHistorialMotoItalika(f);
                    }
                } else {
                    callback.receiveErrorobtenerHistorialMotoItalika(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorobtenerHistorialMotoItalika(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[1].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param obtenerInformacionRemisionesMotosItalika4
     * @see com.elektra.uniformes.wsitalika.WS_JSA_ITALIKA#obtenerInformacionRemisionesMotosItalika
     */


    public com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionRemisionesMotosItalikaResponse obtenerInformacionRemisionesMotosItalika(

            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionRemisionesMotosItalika obtenerInformacionRemisionesMotosItalika4)


            throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
            _operationClient.getOptions().setAction("http://JSAWEB2/ObtenerInformacionRemisionesMotosItalika");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    obtenerInformacionRemisionesMotosItalika4,
                    optimizeContent(new javax.xml.namespace.QName("http://JSAWEB2/",
                            "obtenerInformacionRemisionesMotosItalika")), new javax.xml.namespace.QName("http://JSAWEB2/",
                            "obtenerInformacionRemisionesMotosItalika"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionRemisionesMotosItalikaResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionRemisionesMotosItalikaResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerInformacionRemisionesMotosItalika"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerInformacionRemisionesMotosItalika"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerInformacionRemisionesMotosItalika"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext != null && _messageContext.getTransportOut() != null && _messageContext.getTransportOut().getSender() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param obtenerInformacionRemisionesMotosItalika4
     * @see com.elektra.uniformes.wsitalika.WS_JSA_ITALIKA#startobtenerInformacionRemisionesMotosItalika
     */
    public void startobtenerInformacionRemisionesMotosItalika(

            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionRemisionesMotosItalika obtenerInformacionRemisionesMotosItalika4,

            final com.elektra.uniformes.wsitalika.WS_JSA_ITALIKACallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
        _operationClient.getOptions().setAction("http://JSAWEB2/ObtenerInformacionRemisionesMotosItalika");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                obtenerInformacionRemisionesMotosItalika4,
                optimizeContent(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "obtenerInformacionRemisionesMotosItalika")), new javax.xml.namespace.QName("http://JSAWEB2/",
                        "obtenerInformacionRemisionesMotosItalika"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionRemisionesMotosItalikaResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultobtenerInformacionRemisionesMotosItalika(
                            (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionRemisionesMotosItalikaResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorobtenerInformacionRemisionesMotosItalika(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerInformacionRemisionesMotosItalika"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerInformacionRemisionesMotosItalika"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerInformacionRemisionesMotosItalika"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});


                                callback.receiveErrorobtenerInformacionRemisionesMotosItalika(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerInformacionRemisionesMotosItalika(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerInformacionRemisionesMotosItalika(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerInformacionRemisionesMotosItalika(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerInformacionRemisionesMotosItalika(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerInformacionRemisionesMotosItalika(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerInformacionRemisionesMotosItalika(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerInformacionRemisionesMotosItalika(f);
                            }
                        } else {
                            callback.receiveErrorobtenerInformacionRemisionesMotosItalika(f);
                        }
                    } else {
                        callback.receiveErrorobtenerInformacionRemisionesMotosItalika(f);
                    }
                } else {
                    callback.receiveErrorobtenerInformacionRemisionesMotosItalika(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorobtenerInformacionRemisionesMotosItalika(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[2].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[2].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param registraKilometrajeMoto6
     * @see com.elektra.uniformes.wsitalika.WS_JSA_ITALIKA#registraKilometrajeMoto
     */


    public com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraKilometrajeMotoResponse registraKilometrajeMoto(

            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraKilometrajeMoto registraKilometrajeMoto6)


            throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
            _operationClient.getOptions().setAction("http://JSAWEB2/RegistraKilometrajeMoto");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    registraKilometrajeMoto6,
                    optimizeContent(new javax.xml.namespace.QName("http://JSAWEB2/",
                            "registraKilometrajeMoto")), new javax.xml.namespace.QName("http://JSAWEB2/",
                            "registraKilometrajeMoto"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraKilometrajeMotoResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraKilometrajeMotoResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RegistraKilometrajeMoto"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RegistraKilometrajeMoto"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RegistraKilometrajeMoto"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext != null && _messageContext.getTransportOut() != null && _messageContext.getTransportOut().getSender() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param registraKilometrajeMoto6
     * @see com.elektra.uniformes.wsitalika.WS_JSA_ITALIKA#startregistraKilometrajeMoto
     */
    public void startregistraKilometrajeMoto(

            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraKilometrajeMoto registraKilometrajeMoto6,

            final com.elektra.uniformes.wsitalika.WS_JSA_ITALIKACallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
        _operationClient.getOptions().setAction("http://JSAWEB2/RegistraKilometrajeMoto");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                registraKilometrajeMoto6,
                optimizeContent(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "registraKilometrajeMoto")), new javax.xml.namespace.QName("http://JSAWEB2/",
                        "registraKilometrajeMoto"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraKilometrajeMotoResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultregistraKilometrajeMoto(
                            (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraKilometrajeMotoResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorregistraKilometrajeMoto(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RegistraKilometrajeMoto"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RegistraKilometrajeMoto"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RegistraKilometrajeMoto"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});


                                callback.receiveErrorregistraKilometrajeMoto(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregistraKilometrajeMoto(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregistraKilometrajeMoto(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregistraKilometrajeMoto(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregistraKilometrajeMoto(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregistraKilometrajeMoto(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregistraKilometrajeMoto(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregistraKilometrajeMoto(f);
                            }
                        } else {
                            callback.receiveErrorregistraKilometrajeMoto(f);
                        }
                    } else {
                        callback.receiveErrorregistraKilometrajeMoto(f);
                    }
                } else {
                    callback.receiveErrorregistraKilometrajeMoto(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorregistraKilometrajeMoto(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[3].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[3].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param obtenerMotosAsignadasAEmpleado8
     * @see com.elektra.uniformes.wsitalika.WS_JSA_ITALIKA#obtenerMotosAsignadasAEmpleado
     */


    public com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerMotosAsignadasAEmpleadoResponse obtenerMotosAsignadasAEmpleado(

            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerMotosAsignadasAEmpleado obtenerMotosAsignadasAEmpleado8)


            throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
            _operationClient.getOptions().setAction("http://JSAWEB2/ObtenerMotosAsignadasAEmpleado");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    obtenerMotosAsignadasAEmpleado8,
                    optimizeContent(new javax.xml.namespace.QName("http://JSAWEB2/",
                            "obtenerMotosAsignadasAEmpleado")), new javax.xml.namespace.QName("http://JSAWEB2/",
                            "obtenerMotosAsignadasAEmpleado"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerMotosAsignadasAEmpleadoResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerMotosAsignadasAEmpleadoResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerMotosAsignadasAEmpleado"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerMotosAsignadasAEmpleado"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerMotosAsignadasAEmpleado"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext != null && _messageContext.getTransportOut() != null && _messageContext.getTransportOut().getSender() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param obtenerMotosAsignadasAEmpleado8
     * @see com.elektra.uniformes.wsitalika.WS_JSA_ITALIKA#startobtenerMotosAsignadasAEmpleado
     */
    public void startobtenerMotosAsignadasAEmpleado(

            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerMotosAsignadasAEmpleado obtenerMotosAsignadasAEmpleado8,

            final com.elektra.uniformes.wsitalika.WS_JSA_ITALIKACallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
        _operationClient.getOptions().setAction("http://JSAWEB2/ObtenerMotosAsignadasAEmpleado");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                obtenerMotosAsignadasAEmpleado8,
                optimizeContent(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "obtenerMotosAsignadasAEmpleado")), new javax.xml.namespace.QName("http://JSAWEB2/",
                        "obtenerMotosAsignadasAEmpleado"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerMotosAsignadasAEmpleadoResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultobtenerMotosAsignadasAEmpleado(
                            (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerMotosAsignadasAEmpleadoResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorobtenerMotosAsignadasAEmpleado(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerMotosAsignadasAEmpleado"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerMotosAsignadasAEmpleado"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerMotosAsignadasAEmpleado"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});


                                callback.receiveErrorobtenerMotosAsignadasAEmpleado(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerMotosAsignadasAEmpleado(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerMotosAsignadasAEmpleado(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerMotosAsignadasAEmpleado(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerMotosAsignadasAEmpleado(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerMotosAsignadasAEmpleado(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerMotosAsignadasAEmpleado(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerMotosAsignadasAEmpleado(f);
                            }
                        } else {
                            callback.receiveErrorobtenerMotosAsignadasAEmpleado(f);
                        }
                    } else {
                        callback.receiveErrorobtenerMotosAsignadasAEmpleado(f);
                    }
                } else {
                    callback.receiveErrorobtenerMotosAsignadasAEmpleado(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorobtenerMotosAsignadasAEmpleado(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[4].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[4].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param obtenerInformacionGeneralMotosItalika10
     * @see com.elektra.uniformes.wsitalika.WS_JSA_ITALIKA#obtenerInformacionGeneralMotosItalika
     */


    public com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionGeneralMotosItalikaResponse obtenerInformacionGeneralMotosItalika(

            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionGeneralMotosItalika obtenerInformacionGeneralMotosItalika10)


            throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
            _operationClient.getOptions().setAction("http://JSAWEB2/ObtenerInformacionGeneralMotosItalika");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    obtenerInformacionGeneralMotosItalika10,
                    optimizeContent(new javax.xml.namespace.QName("http://JSAWEB2/",
                            "obtenerInformacionGeneralMotosItalika")), new javax.xml.namespace.QName("http://JSAWEB2/",
                            "obtenerInformacionGeneralMotosItalika"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionGeneralMotosItalikaResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionGeneralMotosItalikaResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerInformacionGeneralMotosItalika"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerInformacionGeneralMotosItalika"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerInformacionGeneralMotosItalika"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext != null && _messageContext.getTransportOut() != null && _messageContext.getTransportOut().getSender() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param obtenerInformacionGeneralMotosItalika10
     * @see com.elektra.uniformes.wsitalika.WS_JSA_ITALIKA#startobtenerInformacionGeneralMotosItalika
     */
    public void startobtenerInformacionGeneralMotosItalika(

            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionGeneralMotosItalika obtenerInformacionGeneralMotosItalika10,

            final com.elektra.uniformes.wsitalika.WS_JSA_ITALIKACallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
        _operationClient.getOptions().setAction("http://JSAWEB2/ObtenerInformacionGeneralMotosItalika");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                obtenerInformacionGeneralMotosItalika10,
                optimizeContent(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "obtenerInformacionGeneralMotosItalika")), new javax.xml.namespace.QName("http://JSAWEB2/",
                        "obtenerInformacionGeneralMotosItalika"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionGeneralMotosItalikaResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultobtenerInformacionGeneralMotosItalika(
                            (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionGeneralMotosItalikaResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorobtenerInformacionGeneralMotosItalika(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerInformacionGeneralMotosItalika"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerInformacionGeneralMotosItalika"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerInformacionGeneralMotosItalika"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});


                                callback.receiveErrorobtenerInformacionGeneralMotosItalika(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerInformacionGeneralMotosItalika(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerInformacionGeneralMotosItalika(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerInformacionGeneralMotosItalika(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerInformacionGeneralMotosItalika(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerInformacionGeneralMotosItalika(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerInformacionGeneralMotosItalika(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerInformacionGeneralMotosItalika(f);
                            }
                        } else {
                            callback.receiveErrorobtenerInformacionGeneralMotosItalika(f);
                        }
                    } else {
                        callback.receiveErrorobtenerInformacionGeneralMotosItalika(f);
                    }
                } else {
                    callback.receiveErrorobtenerInformacionGeneralMotosItalika(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorobtenerInformacionGeneralMotosItalika(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[5].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[5].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @param obtenerUltimaFechaAsignacionMotoItalikaNueva12
     * @see com.elektra.uniformes.wsitalika.WS_JSA_ITALIKA#obtenerUltimaFechaAsignacionMotoItalikaNueva
     */


    public com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse obtenerUltimaFechaAsignacionMotoItalikaNueva(

            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNueva obtenerUltimaFechaAsignacionMotoItalikaNueva12)


            throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
            _operationClient.getOptions().setAction("http://JSAWEB2/ObtenerUltimaFechaAsignacionMotoItalikaNueva");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    obtenerUltimaFechaAsignacionMotoItalikaNueva12,
                    optimizeContent(new javax.xml.namespace.QName("http://JSAWEB2/",
                            "obtenerUltimaFechaAsignacionMotoItalikaNueva")), new javax.xml.namespace.QName("http://JSAWEB2/",
                            "obtenerUltimaFechaAsignacionMotoItalikaNueva"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerUltimaFechaAsignacionMotoItalikaNueva"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerUltimaFechaAsignacionMotoItalikaNueva"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerUltimaFechaAsignacionMotoItalikaNueva"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext != null && _messageContext.getTransportOut() != null && _messageContext.getTransportOut().getSender() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param obtenerUltimaFechaAsignacionMotoItalikaNueva12
     * @see com.elektra.uniformes.wsitalika.WS_JSA_ITALIKA#startobtenerUltimaFechaAsignacionMotoItalikaNueva
     */
    public void startobtenerUltimaFechaAsignacionMotoItalikaNueva(

            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNueva obtenerUltimaFechaAsignacionMotoItalikaNueva12,

            final com.elektra.uniformes.wsitalika.WS_JSA_ITALIKACallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
        _operationClient.getOptions().setAction("http://JSAWEB2/ObtenerUltimaFechaAsignacionMotoItalikaNueva");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                obtenerUltimaFechaAsignacionMotoItalikaNueva12,
                optimizeContent(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "obtenerUltimaFechaAsignacionMotoItalikaNueva")), new javax.xml.namespace.QName("http://JSAWEB2/",
                        "obtenerUltimaFechaAsignacionMotoItalikaNueva"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultobtenerUltimaFechaAsignacionMotoItalikaNueva(
                            (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorobtenerUltimaFechaAsignacionMotoItalikaNueva(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerUltimaFechaAsignacionMotoItalikaNueva"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerUltimaFechaAsignacionMotoItalikaNueva"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ObtenerUltimaFechaAsignacionMotoItalikaNueva"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});


                                callback.receiveErrorobtenerUltimaFechaAsignacionMotoItalikaNueva(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerUltimaFechaAsignacionMotoItalikaNueva(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerUltimaFechaAsignacionMotoItalikaNueva(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerUltimaFechaAsignacionMotoItalikaNueva(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerUltimaFechaAsignacionMotoItalikaNueva(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerUltimaFechaAsignacionMotoItalikaNueva(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerUltimaFechaAsignacionMotoItalikaNueva(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorobtenerUltimaFechaAsignacionMotoItalikaNueva(f);
                            }
                        } else {
                            callback.receiveErrorobtenerUltimaFechaAsignacionMotoItalikaNueva(f);
                        }
                    } else {
                        callback.receiveErrorobtenerUltimaFechaAsignacionMotoItalikaNueva(f);
                    }
                } else {
                    callback.receiveErrorobtenerUltimaFechaAsignacionMotoItalikaNueva(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorobtenerUltimaFechaAsignacionMotoItalikaNueva(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[6].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[6].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }


    /**
     * A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }
        return returnMap;
    }


    private javax.xml.namespace.QName[] opNameArray = null;

    private boolean optimizeContent(javax.xml.namespace.QName opName) {


        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }
        return false;
    }

    //http://10.50.124.24/WS_JSA_ITALIKA/WS_JSA_ITALIKA.asmx
    public static class ObtenerMotosAsignadasAEmpleadoResponse
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "ObtenerMotosAsignadasAEmpleadoResponse",
                "ns1");


        /**
         * field for ObtenerMotosAsignadasAEmpleadoResult
         */


        protected ArrayOfMotoEmpleado localObtenerMotosAsignadasAEmpleadoResult;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localObtenerMotosAsignadasAEmpleadoResultTracker = false;

        public boolean isObtenerMotosAsignadasAEmpleadoResultSpecified() {
            return localObtenerMotosAsignadasAEmpleadoResultTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return ArrayOfMotoEmpleado
         */
        public ArrayOfMotoEmpleado getObtenerMotosAsignadasAEmpleadoResult() {
            return localObtenerMotosAsignadasAEmpleadoResult;
        }


        /**
         * Auto generated setter method
         *
         * @param param ObtenerMotosAsignadasAEmpleadoResult
         */
        public void setObtenerMotosAsignadasAEmpleadoResult(ArrayOfMotoEmpleado param) {
            localObtenerMotosAsignadasAEmpleadoResultTracker = param != null;

            this.localObtenerMotosAsignadasAEmpleadoResult = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":ObtenerMotosAsignadasAEmpleadoResponse",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "ObtenerMotosAsignadasAEmpleadoResponse",
                            xmlWriter);
                }


            }
            if (localObtenerMotosAsignadasAEmpleadoResultTracker) {
                if (localObtenerMotosAsignadasAEmpleadoResult == null) {
                    throw new org.apache.axis2.databinding.ADBException("ObtenerMotosAsignadasAEmpleadoResult cannot be null!!");
                }
                localObtenerMotosAsignadasAEmpleadoResult.serialize(new javax.xml.namespace.QName("http://JSAWEB2/", "ObtenerMotosAsignadasAEmpleadoResult"),
                        xmlWriter);
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localObtenerMotosAsignadasAEmpleadoResultTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "ObtenerMotosAsignadasAEmpleadoResult"));


                if (localObtenerMotosAsignadasAEmpleadoResult == null) {
                    throw new org.apache.axis2.databinding.ADBException("ObtenerMotosAsignadasAEmpleadoResult cannot be null!!");
                }
                elementList.add(localObtenerMotosAsignadasAEmpleadoResult);
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ObtenerMotosAsignadasAEmpleadoResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ObtenerMotosAsignadasAEmpleadoResponse object =
                        new ObtenerMotosAsignadasAEmpleadoResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"ObtenerMotosAsignadasAEmpleadoResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ObtenerMotosAsignadasAEmpleadoResponse) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "ObtenerMotosAsignadasAEmpleadoResult").equals(reader.getName())) {

                        object.setObtenerMotosAsignadasAEmpleadoResult(ArrayOfMotoEmpleado.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ObtenerMotosAsignadasAEmpleado
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "ObtenerMotosAsignadasAEmpleado",
                "ns1");


        /**
         * field for NumeroEmpleado
         */


        protected int localNumeroEmpleado;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getNumeroEmpleado() {
            return localNumeroEmpleado;
        }


        /**
         * Auto generated setter method
         *
         * @param param NumeroEmpleado
         */
        public void setNumeroEmpleado(int param) {

            this.localNumeroEmpleado = param;


        }


        /**
         * field for Autenticacion
         */


        protected java.lang.String localAutenticacion;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localAutenticacionTracker = false;

        public boolean isAutenticacionSpecified() {
            return localAutenticacionTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getAutenticacion() {
            return localAutenticacion;
        }


        /**
         * Auto generated setter method
         *
         * @param param Autenticacion
         */
        public void setAutenticacion(java.lang.String param) {
            localAutenticacionTracker = param != null;

            this.localAutenticacion = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":ObtenerMotosAsignadasAEmpleado",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "ObtenerMotosAsignadasAEmpleado",
                            xmlWriter);
                }


            }

            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "numeroEmpleado", xmlWriter);

            if (localNumeroEmpleado == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("numeroEmpleado cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroEmpleado));
            }

            xmlWriter.writeEndElement();
            if (localAutenticacionTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "autenticacion", xmlWriter);


                if (localAutenticacion == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("autenticacion cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localAutenticacion);

                }

                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "numeroEmpleado"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroEmpleado));
            if (localAutenticacionTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "autenticacion"));

                if (localAutenticacion != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutenticacion));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("autenticacion cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ObtenerMotosAsignadasAEmpleado parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ObtenerMotosAsignadasAEmpleado object =
                        new ObtenerMotosAsignadasAEmpleado();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"ObtenerMotosAsignadasAEmpleado".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ObtenerMotosAsignadasAEmpleado) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "numeroEmpleado").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "numeroEmpleado" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setNumeroEmpleado(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "autenticacion").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "autenticacion" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setAutenticacion(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class InfoRemision
            implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = InfoRemision
                Namespace URI = http://JSAWEB2/
                Namespace Prefix = ns1
                */


        /**
         * field for Emisor
         */


        protected int localEmisor;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getEmisor() {
            return localEmisor;
        }


        /**
         * Auto generated setter method
         *
         * @param param Emisor
         */
        public void setEmisor(int param) {

            this.localEmisor = param;


        }


        /**
         * field for EmisorNombre
         */


        protected java.lang.String localEmisorNombre;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localEmisorNombreTracker = false;

        public boolean isEmisorNombreSpecified() {
            return localEmisorNombreTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getEmisorNombre() {
            return localEmisorNombre;
        }


        /**
         * Auto generated setter method
         *
         * @param param EmisorNombre
         */
        public void setEmisorNombre(java.lang.String param) {
            localEmisorNombreTracker = param != null;

            this.localEmisorNombre = param;


        }


        /**
         * field for Receptor
         */


        protected int localReceptor;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getReceptor() {
            return localReceptor;
        }


        /**
         * Auto generated setter method
         *
         * @param param Receptor
         */
        public void setReceptor(int param) {

            this.localReceptor = param;


        }


        /**
         * field for ReceptorNombre
         */


        protected java.lang.String localReceptorNombre;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localReceptorNombreTracker = false;

        public boolean isReceptorNombreSpecified() {
            return localReceptorNombreTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getReceptorNombre() {
            return localReceptorNombre;
        }


        /**
         * Auto generated setter method
         *
         * @param param ReceptorNombre
         */
        public void setReceptorNombre(java.lang.String param) {
            localReceptorNombreTracker = param != null;

            this.localReceptorNombre = param;


        }


        /**
         * field for Remision
         */


        protected int localRemision;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getRemision() {
            return localRemision;
        }


        /**
         * Auto generated setter method
         *
         * @param param Remision
         */
        public void setRemision(int param) {

            this.localRemision = param;


        }


        /**
         * field for FechaRemision
         */


        protected java.lang.String localFechaRemision;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localFechaRemisionTracker = false;

        public boolean isFechaRemisionSpecified() {
            return localFechaRemisionTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getFechaRemision() {
            return localFechaRemision;
        }


        /**
         * Auto generated setter method
         *
         * @param param FechaRemision
         */
        public void setFechaRemision(java.lang.String param) {
            localFechaRemisionTracker = param != null;

            this.localFechaRemision = param;


        }


        /**
         * field for Sku
         */


        protected int localSku;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getSku() {
            return localSku;
        }


        /**
         * Auto generated setter method
         *
         * @param param Sku
         */
        public void setSku(int param) {

            this.localSku = param;


        }


        /**
         * field for SkuDescripcion
         */


        protected java.lang.String localSkuDescripcion;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localSkuDescripcionTracker = false;

        public boolean isSkuDescripcionSpecified() {
            return localSkuDescripcionTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getSkuDescripcion() {
            return localSkuDescripcion;
        }


        /**
         * Auto generated setter method
         *
         * @param param SkuDescripcion
         */
        public void setSkuDescripcion(java.lang.String param) {
            localSkuDescripcionTracker = param != null;

            this.localSkuDescripcion = param;


        }


        /**
         * field for Serie
         */


        protected java.lang.String localSerie;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localSerieTracker = false;

        public boolean isSerieSpecified() {
            return localSerieTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getSerie() {
            return localSerie;
        }


        /**
         * Auto generated setter method
         *
         * @param param Serie
         */
        public void setSerie(java.lang.String param) {
            localSerieTracker = param != null;

            this.localSerie = param;


        }


        /**
         * field for FechaConfirmacionRemision
         */


        protected java.lang.String localFechaConfirmacionRemision;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localFechaConfirmacionRemisionTracker = false;

        public boolean isFechaConfirmacionRemisionSpecified() {
            return localFechaConfirmacionRemisionTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getFechaConfirmacionRemision() {
            return localFechaConfirmacionRemision;
        }


        /**
         * Auto generated setter method
         *
         * @param param FechaConfirmacionRemision
         */
        public void setFechaConfirmacionRemision(java.lang.String param) {
            localFechaConfirmacionRemisionTracker = param != null;

            this.localFechaConfirmacionRemision = param;


        }


        /**
         * field for NumEmpDestinoMoto
         */


        protected int localNumEmpDestinoMoto;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getNumEmpDestinoMoto() {
            return localNumEmpDestinoMoto;
        }


        /**
         * Auto generated setter method
         *
         * @param param NumEmpDestinoMoto
         */
        public void setNumEmpDestinoMoto(int param) {

            this.localNumEmpDestinoMoto = param;


        }


        /**
         * field for NombreEmpDestinoMoto
         */


        protected java.lang.String localNombreEmpDestinoMoto;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localNombreEmpDestinoMotoTracker = false;

        public boolean isNombreEmpDestinoMotoSpecified() {
            return localNombreEmpDestinoMotoTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getNombreEmpDestinoMoto() {
            return localNombreEmpDestinoMoto;
        }


        /**
         * Auto generated setter method
         *
         * @param param NombreEmpDestinoMoto
         */
        public void setNombreEmpDestinoMoto(java.lang.String param) {
            localNombreEmpDestinoMotoTracker = param != null;

            this.localNombreEmpDestinoMoto = param;


        }


        /**
         * field for MotoAsignada
         */


        protected java.lang.String localMotoAsignada;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localMotoAsignadaTracker = false;

        public boolean isMotoAsignadaSpecified() {
            return localMotoAsignadaTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getMotoAsignada() {
            return localMotoAsignada;
        }


        /**
         * Auto generated setter method
         *
         * @param param MotoAsignada
         */
        public void setMotoAsignada(java.lang.String param) {
            localMotoAsignadaTracker = param != null;

            this.localMotoAsignada = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":InfoRemision",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "InfoRemision",
                            xmlWriter);
                }


            }

            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "emisor", xmlWriter);

            if (localEmisor == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("emisor cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmisor));
            }

            xmlWriter.writeEndElement();
            if (localEmisorNombreTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "emisorNombre", xmlWriter);


                if (localEmisorNombre == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("emisorNombre cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localEmisorNombre);

                }

                xmlWriter.writeEndElement();
            }
            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "receptor", xmlWriter);

            if (localReceptor == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("receptor cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceptor));
            }

            xmlWriter.writeEndElement();
            if (localReceptorNombreTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "receptorNombre", xmlWriter);


                if (localReceptorNombre == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("receptorNombre cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localReceptorNombre);

                }

                xmlWriter.writeEndElement();
            }
            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "remision", xmlWriter);

            if (localRemision == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("remision cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemision));
            }

            xmlWriter.writeEndElement();
            if (localFechaRemisionTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "fechaRemision", xmlWriter);


                if (localFechaRemision == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("fechaRemision cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localFechaRemision);

                }

                xmlWriter.writeEndElement();
            }
            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "sku", xmlWriter);

            if (localSku == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("sku cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSku));
            }

            xmlWriter.writeEndElement();
            if (localSkuDescripcionTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "skuDescripcion", xmlWriter);


                if (localSkuDescripcion == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("skuDescripcion cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localSkuDescripcion);

                }

                xmlWriter.writeEndElement();
            }
            if (localSerieTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "serie", xmlWriter);


                if (localSerie == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("serie cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localSerie);

                }

                xmlWriter.writeEndElement();
            }
            if (localFechaConfirmacionRemisionTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "fechaConfirmacionRemision", xmlWriter);


                if (localFechaConfirmacionRemision == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("fechaConfirmacionRemision cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localFechaConfirmacionRemision);

                }

                xmlWriter.writeEndElement();
            }
            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "numEmpDestinoMoto", xmlWriter);

            if (localNumEmpDestinoMoto == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("numEmpDestinoMoto cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumEmpDestinoMoto));
            }

            xmlWriter.writeEndElement();
            if (localNombreEmpDestinoMotoTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "nombreEmpDestinoMoto", xmlWriter);


                if (localNombreEmpDestinoMoto == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("nombreEmpDestinoMoto cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localNombreEmpDestinoMoto);

                }

                xmlWriter.writeEndElement();
            }
            if (localMotoAsignadaTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "motoAsignada", xmlWriter);


                if (localMotoAsignada == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("motoAsignada cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localMotoAsignada);

                }

                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "emisor"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmisor));
            if (localEmisorNombreTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "emisorNombre"));

                if (localEmisorNombre != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmisorNombre));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("emisorNombre cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "receptor"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceptor));
            if (localReceptorNombreTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "receptorNombre"));

                if (localReceptorNombre != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceptorNombre));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("receptorNombre cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "remision"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemision));
            if (localFechaRemisionTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "fechaRemision"));

                if (localFechaRemision != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaRemision));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("fechaRemision cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "sku"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSku));
            if (localSkuDescripcionTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "skuDescripcion"));

                if (localSkuDescripcion != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSkuDescripcion));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("skuDescripcion cannot be null!!");
                }
            }
            if (localSerieTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "serie"));

                if (localSerie != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSerie));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("serie cannot be null!!");
                }
            }
            if (localFechaConfirmacionRemisionTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "fechaConfirmacionRemision"));

                if (localFechaConfirmacionRemision != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaConfirmacionRemision));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("fechaConfirmacionRemision cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "numEmpDestinoMoto"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumEmpDestinoMoto));
            if (localNombreEmpDestinoMotoTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "nombreEmpDestinoMoto"));

                if (localNombreEmpDestinoMoto != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNombreEmpDestinoMoto));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("nombreEmpDestinoMoto cannot be null!!");
                }
            }
            if (localMotoAsignadaTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "motoAsignada"));

                if (localMotoAsignada != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMotoAsignada));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("motoAsignada cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static InfoRemision parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                InfoRemision object =
                        new InfoRemision();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"InfoRemision".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (InfoRemision) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "emisor").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "emisor" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setEmisor(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "emisorNombre").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "emisorNombre" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setEmisorNombre(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "receptor").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "receptor" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setReceptor(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "receptorNombre").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "receptorNombre" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setReceptorNombre(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "remision").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "remision" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setRemision(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "fechaRemision").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "fechaRemision" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setFechaRemision(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "sku").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "sku" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setSku(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "skuDescripcion").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "skuDescripcion" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setSkuDescripcion(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "serie").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "serie" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setSerie(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "fechaConfirmacionRemision").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "fechaConfirmacionRemision" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setFechaConfirmacionRemision(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "numEmpDestinoMoto").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "numEmpDestinoMoto" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setNumEmpDestinoMoto(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "nombreEmpDestinoMoto").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "nombreEmpDestinoMoto" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setNombreEmpDestinoMoto(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "motoAsignada").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "motoAsignada" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setMotoAsignada(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ArrayOfInfoMoto
            implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = ArrayOfInfoMoto
                Namespace URI = http://JSAWEB2/
                Namespace Prefix = ns1
                */


        /**
         * field for InfoMoto
         * This was an Array!
         */


        protected InfoMoto[] localInfoMoto;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localInfoMotoTracker = false;

        public boolean isInfoMotoSpecified() {
            return localInfoMotoTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return InfoMoto[]
         */
        public InfoMoto[] getInfoMoto() {
            return localInfoMoto;
        }


        /**
         * validate the array for InfoMoto
         */
        protected void validateInfoMoto(InfoMoto[] param) {

        }


        /**
         * Auto generated setter method
         *
         * @param param InfoMoto
         */
        public void setInfoMoto(InfoMoto[] param) {

            validateInfoMoto(param);

            localInfoMotoTracker = param != null;

            this.localInfoMoto = param;
        }


        /**
         * Auto generated add method for the array for convenience
         *
         * @param param InfoMoto
         */
        public void addInfoMoto(InfoMoto param) {
            if (localInfoMoto == null) {
                localInfoMoto = new InfoMoto[]{};
            }


            //update the setting tracker
            localInfoMotoTracker = true;


            java.util.List list =
                    org.apache.axis2.databinding.utils.ConverterUtil.toList(localInfoMoto);
            list.add(param);
            this.localInfoMoto =
                    (InfoMoto[]) list.toArray(
                            new InfoMoto[list.size()]);

        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":ArrayOfInfoMoto",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "ArrayOfInfoMoto",
                            xmlWriter);
                }


            }
            if (localInfoMotoTracker) {
                if (localInfoMoto != null) {
                    for (int i = 0; i < localInfoMoto.length; i++) {
                        if (localInfoMoto[i] != null) {
                            localInfoMoto[i].serialize(new javax.xml.namespace.QName("http://JSAWEB2/", "InfoMoto"),
                                    xmlWriter);
                        } else {

                            // we don't have to do any thing since minOccures is zero

                        }

                    }
                } else {

                    throw new org.apache.axis2.databinding.ADBException("InfoMoto cannot be null!!");

                }
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localInfoMotoTracker) {
                if (localInfoMoto != null) {
                    for (int i = 0; i < localInfoMoto.length; i++) {

                        if (localInfoMoto[i] != null) {
                            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                                    "InfoMoto"));
                            elementList.add(localInfoMoto[i]);
                        } else {

                            // nothing to do

                        }

                    }
                } else {

                    throw new org.apache.axis2.databinding.ADBException("InfoMoto cannot be null!!");

                }

            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ArrayOfInfoMoto parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ArrayOfInfoMoto object =
                        new ArrayOfInfoMoto();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"ArrayOfInfoMoto".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ArrayOfInfoMoto) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();

                    java.util.ArrayList list1 = new java.util.ArrayList();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "InfoMoto").equals(reader.getName())) {


                        // Process the array and step past its final element's end.
                        list1.add(InfoMoto.Factory.parse(reader));

                        //loop until we find a start element that is not part of this array
                        boolean loopDone1 = false;
                        while (!loopDone1) {
                            // We should be at the end element, but make sure
                            while (!reader.isEndElement())
                                reader.next();
                            // Step out of this element
                            reader.next();
                            // Step to next element event.
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isEndElement()) {
                                //two continuous end elements means we are exiting the xml structure
                                loopDone1 = true;
                            } else {
                                if (new javax.xml.namespace.QName("http://JSAWEB2/", "InfoMoto").equals(reader.getName())) {
                                    list1.add(InfoMoto.Factory.parse(reader));

                                } else {
                                    loopDone1 = true;
                                }
                            }
                        }
                        // call the converter utility  to convert and set the array

                        object.setInfoMoto((InfoMoto[])
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                        InfoMoto.class,
                                        list1));

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class InfoFechaAsignacion
            implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = InfoFechaAsignacion
                Namespace URI = http://JSAWEB2/
                Namespace Prefix = ns1
                */


        /**
         * field for EmpleadoConsultado
         */


        protected int localEmpleadoConsultado;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getEmpleadoConsultado() {
            return localEmpleadoConsultado;
        }


        /**
         * Auto generated setter method
         *
         * @param param EmpleadoConsultado
         */
        public void setEmpleadoConsultado(int param) {

            this.localEmpleadoConsultado = param;


        }


        /**
         * field for FechaUltimaAsignacionMotoItalikaNueva
         */


        protected java.lang.String localFechaUltimaAsignacionMotoItalikaNueva;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localFechaUltimaAsignacionMotoItalikaNuevaTracker = false;

        public boolean isFechaUltimaAsignacionMotoItalikaNuevaSpecified() {
            return localFechaUltimaAsignacionMotoItalikaNuevaTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getFechaUltimaAsignacionMotoItalikaNueva() {
            return localFechaUltimaAsignacionMotoItalikaNueva;
        }


        /**
         * Auto generated setter method
         *
         * @param param FechaUltimaAsignacionMotoItalikaNueva
         */
        public void setFechaUltimaAsignacionMotoItalikaNueva(java.lang.String param) {
            localFechaUltimaAsignacionMotoItalikaNuevaTracker = param != null;

            this.localFechaUltimaAsignacionMotoItalikaNueva = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":InfoFechaAsignacion",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "InfoFechaAsignacion",
                            xmlWriter);
                }


            }

            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "empleadoConsultado", xmlWriter);

            if (localEmpleadoConsultado == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("empleadoConsultado cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmpleadoConsultado));
            }

            xmlWriter.writeEndElement();
            if (localFechaUltimaAsignacionMotoItalikaNuevaTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "fechaUltimaAsignacionMotoItalikaNueva", xmlWriter);


                if (localFechaUltimaAsignacionMotoItalikaNueva == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("fechaUltimaAsignacionMotoItalikaNueva cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localFechaUltimaAsignacionMotoItalikaNueva);

                }

                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "empleadoConsultado"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmpleadoConsultado));
            if (localFechaUltimaAsignacionMotoItalikaNuevaTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "fechaUltimaAsignacionMotoItalikaNueva"));

                if (localFechaUltimaAsignacionMotoItalikaNueva != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaUltimaAsignacionMotoItalikaNueva));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("fechaUltimaAsignacionMotoItalikaNueva cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static InfoFechaAsignacion parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                InfoFechaAsignacion object =
                        new InfoFechaAsignacion();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"InfoFechaAsignacion".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (InfoFechaAsignacion) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "empleadoConsultado").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "empleadoConsultado" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setEmpleadoConsultado(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "fechaUltimaAsignacionMotoItalikaNueva").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "fechaUltimaAsignacionMotoItalikaNueva" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setFechaUltimaAsignacionMotoItalikaNueva(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class InfoFechaAsignacionE
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "InfoFechaAsignacion",
                "ns1");


        /**
         * field for InfoFechaAsignacion
         */


        protected InfoFechaAsignacion localInfoFechaAsignacion;


        /**
         * Auto generated getter method
         *
         * @return InfoFechaAsignacion
         */
        public InfoFechaAsignacion getInfoFechaAsignacion() {
            return localInfoFechaAsignacion;
        }


        /**
         * Auto generated setter method
         *
         * @param param InfoFechaAsignacion
         */
        public void setInfoFechaAsignacion(InfoFechaAsignacion param) {

            this.localInfoFechaAsignacion = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it

            if (localInfoFechaAsignacion == null) {
                throw new org.apache.axis2.databinding.ADBException("InfoFechaAsignacion cannot be null!");
            }
            localInfoFechaAsignacion.serialize(MY_QNAME, xmlWriter);


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it
            return localInfoFechaAsignacion.getPullParser(MY_QNAME);

        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static InfoFechaAsignacionE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                InfoFechaAsignacionE object =
                        new InfoFechaAsignacionE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "InfoFechaAsignacion").equals(reader.getName())) {

                                object.setInfoFechaAsignacion(InfoFechaAsignacion.Factory.parse(reader));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class RegistraExperienciaItalikaRecibida
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "RegistraExperienciaItalikaRecibida",
                "ns1");


        /**
         * field for EmpleadoRecibeExperiencia
         */


        protected int localEmpleadoRecibeExperiencia;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getEmpleadoRecibeExperiencia() {
            return localEmpleadoRecibeExperiencia;
        }


        /**
         * Auto generated setter method
         *
         * @param param EmpleadoRecibeExperiencia
         */
        public void setEmpleadoRecibeExperiencia(int param) {

            this.localEmpleadoRecibeExperiencia = param;


        }


        /**
         * field for SerieMoto
         */


        protected java.lang.String localSerieMoto;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localSerieMotoTracker = false;

        public boolean isSerieMotoSpecified() {
            return localSerieMotoTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getSerieMoto() {
            return localSerieMoto;
        }


        /**
         * Auto generated setter method
         *
         * @param param SerieMoto
         */
        public void setSerieMoto(java.lang.String param) {
            localSerieMotoTracker = param != null;

            this.localSerieMoto = param;


        }


        /**
         * field for FolioSisItalika
         */


        protected int localFolioSisItalika;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getFolioSisItalika() {
            return localFolioSisItalika;
        }


        /**
         * Auto generated setter method
         *
         * @param param FolioSisItalika
         */
        public void setFolioSisItalika(int param) {

            this.localFolioSisItalika = param;


        }


        /**
         * field for Autenticacion
         */


        protected java.lang.String localAutenticacion;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localAutenticacionTracker = false;

        public boolean isAutenticacionSpecified() {
            return localAutenticacionTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getAutenticacion() {
            return localAutenticacion;
        }


        /**
         * Auto generated setter method
         *
         * @param param Autenticacion
         */
        public void setAutenticacion(java.lang.String param) {
            localAutenticacionTracker = param != null;

            this.localAutenticacion = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":RegistraExperienciaItalikaRecibida",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "RegistraExperienciaItalikaRecibida",
                            xmlWriter);
                }


            }

            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "empleadoRecibeExperiencia", xmlWriter);

            if (localEmpleadoRecibeExperiencia == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("empleadoRecibeExperiencia cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmpleadoRecibeExperiencia));
            }

            xmlWriter.writeEndElement();
            if (localSerieMotoTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "serieMoto", xmlWriter);


                if (localSerieMoto == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("serieMoto cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localSerieMoto);

                }

                xmlWriter.writeEndElement();
            }
            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "folioSisItalika", xmlWriter);

            if (localFolioSisItalika == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("folioSisItalika cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFolioSisItalika));
            }

            xmlWriter.writeEndElement();
            if (localAutenticacionTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "autenticacion", xmlWriter);


                if (localAutenticacion == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("autenticacion cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localAutenticacion);

                }

                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "empleadoRecibeExperiencia"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmpleadoRecibeExperiencia));
            if (localSerieMotoTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "serieMoto"));

                if (localSerieMoto != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSerieMoto));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("serieMoto cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "folioSisItalika"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFolioSisItalika));
            if (localAutenticacionTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "autenticacion"));

                if (localAutenticacion != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutenticacion));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("autenticacion cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static RegistraExperienciaItalikaRecibida parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                RegistraExperienciaItalikaRecibida object =
                        new RegistraExperienciaItalikaRecibida();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"RegistraExperienciaItalikaRecibida".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RegistraExperienciaItalikaRecibida) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "empleadoRecibeExperiencia").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "empleadoRecibeExperiencia" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setEmpleadoRecibeExperiencia(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "serieMoto").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "serieMoto" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setSerieMoto(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "folioSisItalika").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "folioSisItalika" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setFolioSisItalika(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "autenticacion").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "autenticacion" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setAutenticacion(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ObtenerInformacionGeneralMotosItalikaResponse
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "ObtenerInformacionGeneralMotosItalikaResponse",
                "ns1");


        /**
         * field for ObtenerInformacionGeneralMotosItalikaResult
         */


        protected ArrayOfInfoMoto localObtenerInformacionGeneralMotosItalikaResult;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localObtenerInformacionGeneralMotosItalikaResultTracker = false;

        public boolean isObtenerInformacionGeneralMotosItalikaResultSpecified() {
            return localObtenerInformacionGeneralMotosItalikaResultTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return ArrayOfInfoMoto
         */
        public ArrayOfInfoMoto getObtenerInformacionGeneralMotosItalikaResult() {
            return localObtenerInformacionGeneralMotosItalikaResult;
        }


        /**
         * Auto generated setter method
         *
         * @param param ObtenerInformacionGeneralMotosItalikaResult
         */
        public void setObtenerInformacionGeneralMotosItalikaResult(ArrayOfInfoMoto param) {
            localObtenerInformacionGeneralMotosItalikaResultTracker = param != null;

            this.localObtenerInformacionGeneralMotosItalikaResult = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":ObtenerInformacionGeneralMotosItalikaResponse",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "ObtenerInformacionGeneralMotosItalikaResponse",
                            xmlWriter);
                }


            }
            if (localObtenerInformacionGeneralMotosItalikaResultTracker) {
                if (localObtenerInformacionGeneralMotosItalikaResult == null) {
                    throw new org.apache.axis2.databinding.ADBException("ObtenerInformacionGeneralMotosItalikaResult cannot be null!!");
                }
                localObtenerInformacionGeneralMotosItalikaResult.serialize(new javax.xml.namespace.QName("http://JSAWEB2/", "ObtenerInformacionGeneralMotosItalikaResult"),
                        xmlWriter);
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localObtenerInformacionGeneralMotosItalikaResultTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "ObtenerInformacionGeneralMotosItalikaResult"));


                if (localObtenerInformacionGeneralMotosItalikaResult == null) {
                    throw new org.apache.axis2.databinding.ADBException("ObtenerInformacionGeneralMotosItalikaResult cannot be null!!");
                }
                elementList.add(localObtenerInformacionGeneralMotosItalikaResult);
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ObtenerInformacionGeneralMotosItalikaResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ObtenerInformacionGeneralMotosItalikaResponse object =
                        new ObtenerInformacionGeneralMotosItalikaResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"ObtenerInformacionGeneralMotosItalikaResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ObtenerInformacionGeneralMotosItalikaResponse) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "ObtenerInformacionGeneralMotosItalikaResult").equals(reader.getName())) {

                        object.setObtenerInformacionGeneralMotosItalikaResult(ArrayOfInfoMoto.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ExtensionMapper {

        public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                     java.lang.String typeName,
                                                     javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {


            if (
                    "http://JSAWEB2/".equals(namespaceURI) &&
                            "MotoEmpleado".equals(typeName)) {

                return MotoEmpleado.Factory.parse(reader);


            }


            if (
                    "http://JSAWEB2/".equals(namespaceURI) &&
                            "InfoMoto".equals(typeName)) {

                return InfoMoto.Factory.parse(reader);


            }


            if (
                    "http://JSAWEB2/".equals(namespaceURI) &&
                            "InfoMotoMin".equals(typeName)) {

                return InfoMotoMin.Factory.parse(reader);


            }


            if (
                    "http://JSAWEB2/".equals(namespaceURI) &&
                            "ArrayOfMotoEmpleado".equals(typeName)) {

                return ArrayOfMotoEmpleado.Factory.parse(reader);


            }


            if (
                    "http://JSAWEB2/".equals(namespaceURI) &&
                            "InfoRemision".equals(typeName)) {

                return InfoRemision.Factory.parse(reader);


            }


            if (
                    "http://JSAWEB2/".equals(namespaceURI) &&
                            "ArrayOfInfoMoto".equals(typeName)) {

                return ArrayOfInfoMoto.Factory.parse(reader);


            }


            if (
                    "http://JSAWEB2/".equals(namespaceURI) &&
                            "ResultadoOP".equals(typeName)) {

                return ResultadoOP.Factory.parse(reader);


            }


            if (
                    "http://JSAWEB2/".equals(namespaceURI) &&
                            "ArrayOfInfoMotoMin".equals(typeName)) {

                return ArrayOfInfoMotoMin.Factory.parse(reader);


            }


            if (
                    "http://JSAWEB2/".equals(namespaceURI) &&
                            "InfoFechaAsignacion".equals(typeName)) {

                return InfoFechaAsignacion.Factory.parse(reader);


            }


            if (
                    "http://JSAWEB2/".equals(namespaceURI) &&
                            "ArrayOfInfoRemision".equals(typeName)) {

                return ArrayOfInfoRemision.Factory.parse(reader);


            }


            throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
        }

    }

    public static class _int
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "int",
                "ns1");


        /**
         * field for _int
         */


        protected int local_int;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int get_int() {
            return local_int;
        }


        /**
         * Auto generated setter method
         *
         * @param param _int
         */
        public void set_int(int param) {

            this.local_int = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it

            java.lang.String namespace = "http://JSAWEB2/";
            java.lang.String _localName = "int";

            writeStartElement(null, namespace, _localName, xmlWriter);

            // add the type details if this is used in a simple type
            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":int",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "int",
                            xmlWriter);
                }
            }

            if (local_int == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("property value cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(local_int));
            }

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it
            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
                    new java.lang.Object[]{
                            org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(local_int)
                    },
                    null);

        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static _int parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                _int object =
                        new _int();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "int").equals(reader.getName())) {

                                nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                                if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                                    throw new org.apache.axis2.databinding.ADBException("The element: " + "int" + "  cannot be null");
                                }


                                java.lang.String content = reader.getElementText();

                                object.set_int(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class MotoEmpleado
            implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = MotoEmpleado
                Namespace URI = http://JSAWEB2/
                Namespace Prefix = ns1
                */


        /**
         * field for SerieMoto
         */


        protected java.lang.String localSerieMoto;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localSerieMotoTracker = false;

        public boolean isSerieMotoSpecified() {
            return localSerieMotoTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getSerieMoto() {
            return localSerieMoto;
        }


        /**
         * Auto generated setter method
         *
         * @param param SerieMoto
         */
        public void setSerieMoto(java.lang.String param) {
            localSerieMotoTracker = param != null;

            this.localSerieMoto = param;


        }


        /**
         * field for PlacaActivoFijo
         */


        protected java.lang.String localPlacaActivoFijo;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localPlacaActivoFijoTracker = false;

        public boolean isPlacaActivoFijoSpecified() {
            return localPlacaActivoFijoTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getPlacaActivoFijo() {
            return localPlacaActivoFijo;
        }


        /**
         * Auto generated setter method
         *
         * @param param PlacaActivoFijo
         */
        public void setPlacaActivoFijo(java.lang.String param) {
            localPlacaActivoFijoTracker = param != null;

            this.localPlacaActivoFijo = param;


        }


        /**
         * field for Marca
         */


        protected java.lang.String localMarca;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localMarcaTracker = false;

        public boolean isMarcaSpecified() {
            return localMarcaTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getMarca() {
            return localMarca;
        }


        /**
         * Auto generated setter method
         *
         * @param param Marca
         */
        public void setMarca(java.lang.String param) {
            localMarcaTracker = param != null;

            this.localMarca = param;


        }


        /**
         * field for TipoMoto
         */


        protected java.lang.String localTipoMoto;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localTipoMotoTracker = false;

        public boolean isTipoMotoSpecified() {
            return localTipoMotoTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getTipoMoto() {
            return localTipoMoto;
        }


        /**
         * Auto generated setter method
         *
         * @param param TipoMoto
         */
        public void setTipoMoto(java.lang.String param) {
            localTipoMotoTracker = param != null;

            this.localTipoMoto = param;


        }


        /**
         * field for Modelo
         */


        protected int localModelo;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getModelo() {
            return localModelo;
        }


        /**
         * Auto generated setter method
         *
         * @param param Modelo
         */
        public void setModelo(int param) {

            this.localModelo = param;


        }


        /**
         * field for NumEmpleado
         */


        protected int localNumEmpleado;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getNumEmpleado() {
            return localNumEmpleado;
        }


        /**
         * Auto generated setter method
         *
         * @param param NumEmpleado
         */
        public void setNumEmpleado(int param) {

            this.localNumEmpleado = param;


        }


        /**
         * field for NombreEmpleado
         */


        protected java.lang.String localNombreEmpleado;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localNombreEmpleadoTracker = false;

        public boolean isNombreEmpleadoSpecified() {
            return localNombreEmpleadoTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getNombreEmpleado() {
            return localNombreEmpleado;
        }


        /**
         * Auto generated setter method
         *
         * @param param NombreEmpleado
         */
        public void setNombreEmpleado(java.lang.String param) {
            localNombreEmpleadoTracker = param != null;

            this.localNombreEmpleado = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":MotoEmpleado",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "MotoEmpleado",
                            xmlWriter);
                }


            }
            if (localSerieMotoTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "serieMoto", xmlWriter);


                if (localSerieMoto == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("serieMoto cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localSerieMoto);

                }

                xmlWriter.writeEndElement();
            }
            if (localPlacaActivoFijoTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "placaActivoFijo", xmlWriter);


                if (localPlacaActivoFijo == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("placaActivoFijo cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localPlacaActivoFijo);

                }

                xmlWriter.writeEndElement();
            }
            if (localMarcaTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "marca", xmlWriter);


                if (localMarca == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("marca cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localMarca);

                }

                xmlWriter.writeEndElement();
            }
            if (localTipoMotoTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "tipoMoto", xmlWriter);


                if (localTipoMoto == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("tipoMoto cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localTipoMoto);

                }

                xmlWriter.writeEndElement();
            }
            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "modelo", xmlWriter);

            if (localModelo == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("modelo cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localModelo));
            }

            xmlWriter.writeEndElement();

            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "numEmpleado", xmlWriter);

            if (localNumEmpleado == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("numEmpleado cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumEmpleado));
            }

            xmlWriter.writeEndElement();
            if (localNombreEmpleadoTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "nombreEmpleado", xmlWriter);


                if (localNombreEmpleado == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("nombreEmpleado cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localNombreEmpleado);

                }

                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localSerieMotoTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "serieMoto"));

                if (localSerieMoto != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSerieMoto));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("serieMoto cannot be null!!");
                }
            }
            if (localPlacaActivoFijoTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "placaActivoFijo"));

                if (localPlacaActivoFijo != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPlacaActivoFijo));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("placaActivoFijo cannot be null!!");
                }
            }
            if (localMarcaTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "marca"));

                if (localMarca != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMarca));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("marca cannot be null!!");
                }
            }
            if (localTipoMotoTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "tipoMoto"));

                if (localTipoMoto != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipoMoto));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("tipoMoto cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "modelo"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localModelo));

            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "numEmpleado"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumEmpleado));
            if (localNombreEmpleadoTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "nombreEmpleado"));

                if (localNombreEmpleado != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNombreEmpleado));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("nombreEmpleado cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static MotoEmpleado parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                MotoEmpleado object =
                        new MotoEmpleado();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"MotoEmpleado".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MotoEmpleado) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "serieMoto").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "serieMoto" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setSerieMoto(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "placaActivoFijo").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "placaActivoFijo" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setPlacaActivoFijo(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "marca").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "marca" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setMarca(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "tipoMoto").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "tipoMoto" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setTipoMoto(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "modelo").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "modelo" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setModelo(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "numEmpleado").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "numEmpleado" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setNumEmpleado(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "nombreEmpleado").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "nombreEmpleado" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setNombreEmpleado(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class RegistraExperienciaItalikaRecibidaResponse
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "RegistraExperienciaItalikaRecibidaResponse",
                "ns1");


        /**
         * field for RegistraExperienciaItalikaRecibidaResult
         */


        protected int localRegistraExperienciaItalikaRecibidaResult;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getRegistraExperienciaItalikaRecibidaResult() {
            return localRegistraExperienciaItalikaRecibidaResult;
        }


        /**
         * Auto generated setter method
         *
         * @param param RegistraExperienciaItalikaRecibidaResult
         */
        public void setRegistraExperienciaItalikaRecibidaResult(int param) {

            this.localRegistraExperienciaItalikaRecibidaResult = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":RegistraExperienciaItalikaRecibidaResponse",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "RegistraExperienciaItalikaRecibidaResponse",
                            xmlWriter);
                }


            }

            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "RegistraExperienciaItalikaRecibidaResult", xmlWriter);

            if (localRegistraExperienciaItalikaRecibidaResult == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("RegistraExperienciaItalikaRecibidaResult cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRegistraExperienciaItalikaRecibidaResult));
            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "RegistraExperienciaItalikaRecibidaResult"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRegistraExperienciaItalikaRecibidaResult));


            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static RegistraExperienciaItalikaRecibidaResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                RegistraExperienciaItalikaRecibidaResponse object =
                        new RegistraExperienciaItalikaRecibidaResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"RegistraExperienciaItalikaRecibidaResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RegistraExperienciaItalikaRecibidaResponse) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "RegistraExperienciaItalikaRecibidaResult").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "RegistraExperienciaItalikaRecibidaResult" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setRegistraExperienciaItalikaRecibidaResult(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ObtenerHistorialMotoItalika
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "ObtenerHistorialMotoItalika",
                "ns1");


        /**
         * field for SerieMotoFiltrar
         */


        protected java.lang.String localSerieMotoFiltrar;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localSerieMotoFiltrarTracker = false;

        public boolean isSerieMotoFiltrarSpecified() {
            return localSerieMotoFiltrarTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getSerieMotoFiltrar() {
            return localSerieMotoFiltrar;
        }


        /**
         * Auto generated setter method
         *
         * @param param SerieMotoFiltrar
         */
        public void setSerieMotoFiltrar(java.lang.String param) {
            localSerieMotoFiltrarTracker = param != null;

            this.localSerieMotoFiltrar = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":ObtenerHistorialMotoItalika",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "ObtenerHistorialMotoItalika",
                            xmlWriter);
                }


            }
            if (localSerieMotoFiltrarTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "serieMotoFiltrar", xmlWriter);


                if (localSerieMotoFiltrar == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("serieMotoFiltrar cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localSerieMotoFiltrar);

                }

                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localSerieMotoFiltrarTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "serieMotoFiltrar"));

                if (localSerieMotoFiltrar != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSerieMotoFiltrar));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("serieMotoFiltrar cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ObtenerHistorialMotoItalika parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ObtenerHistorialMotoItalika object =
                        new ObtenerHistorialMotoItalika();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"ObtenerHistorialMotoItalika".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ObtenerHistorialMotoItalika) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "serieMotoFiltrar").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "serieMotoFiltrar" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setSerieMotoFiltrar(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class RegistraKilometrajeMotoResponse
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "RegistraKilometrajeMotoResponse",
                "ns1");


        /**
         * field for RegistraKilometrajeMotoResult
         */


        protected ResultadoOP localRegistraKilometrajeMotoResult;


        /**
         * Auto generated getter method
         *
         * @return ResultadoOP
         */
        public ResultadoOP getRegistraKilometrajeMotoResult() {
            return localRegistraKilometrajeMotoResult;
        }


        /**
         * Auto generated setter method
         *
         * @param param RegistraKilometrajeMotoResult
         */
        public void setRegistraKilometrajeMotoResult(ResultadoOP param) {

            this.localRegistraKilometrajeMotoResult = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":RegistraKilometrajeMotoResponse",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "RegistraKilometrajeMotoResponse",
                            xmlWriter);
                }


            }

            if (localRegistraKilometrajeMotoResult == null) {
                throw new org.apache.axis2.databinding.ADBException("RegistraKilometrajeMotoResult cannot be null!!");
            }
            localRegistraKilometrajeMotoResult.serialize(new javax.xml.namespace.QName("http://JSAWEB2/", "RegistraKilometrajeMotoResult"),
                    xmlWriter);

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "RegistraKilometrajeMotoResult"));


            if (localRegistraKilometrajeMotoResult == null) {
                throw new org.apache.axis2.databinding.ADBException("RegistraKilometrajeMotoResult cannot be null!!");
            }
            elementList.add(localRegistraKilometrajeMotoResult);


            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static RegistraKilometrajeMotoResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                RegistraKilometrajeMotoResponse object =
                        new RegistraKilometrajeMotoResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"RegistraKilometrajeMotoResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RegistraKilometrajeMotoResponse) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "RegistraKilometrajeMotoResult").equals(reader.getName())) {

                        object.setRegistraKilometrajeMotoResult(ResultadoOP.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ArrayOfMotoEmpleadoE
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "ArrayOfMotoEmpleado",
                "ns1");


        /**
         * field for ArrayOfMotoEmpleado
         */


        protected ArrayOfMotoEmpleado localArrayOfMotoEmpleado;


        /**
         * Auto generated getter method
         *
         * @return ArrayOfMotoEmpleado
         */
        public ArrayOfMotoEmpleado getArrayOfMotoEmpleado() {
            return localArrayOfMotoEmpleado;
        }


        /**
         * Auto generated setter method
         *
         * @param param ArrayOfMotoEmpleado
         */
        public void setArrayOfMotoEmpleado(ArrayOfMotoEmpleado param) {

            this.localArrayOfMotoEmpleado = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it

            if (localArrayOfMotoEmpleado == null) {
                java.lang.String namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "ArrayOfMotoEmpleado", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localArrayOfMotoEmpleado.serialize(MY_QNAME, xmlWriter);
            }


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it

            if (localArrayOfMotoEmpleado == null) {
                return new org.apache.axis2.databinding.utils.reader.NullXMLStreamReader(MY_QNAME);
            } else {
                return localArrayOfMotoEmpleado.getPullParser(MY_QNAME);
            }


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ArrayOfMotoEmpleadoE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ArrayOfMotoEmpleadoE object =
                        new ArrayOfMotoEmpleadoE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        // Skip the element and report the null value.  It cannot have subelements.
                        while (!reader.isEndElement())
                            reader.next();

                        return object;


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "ArrayOfMotoEmpleado").equals(reader.getName())) {

                                nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                                if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                                    object.setArrayOfMotoEmpleado(null);
                                    reader.next();

                                } else {

                                    object.setArrayOfMotoEmpleado(ArrayOfMotoEmpleado.Factory.parse(reader));
                                }
                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse",
                "ns1");


        /**
         * field for ObtenerUltimaFechaAsignacionMotoItalikaNuevaResult
         */


        protected InfoFechaAsignacion localObtenerUltimaFechaAsignacionMotoItalikaNuevaResult;


        /**
         * Auto generated getter method
         *
         * @return InfoFechaAsignacion
         */
        public InfoFechaAsignacion getObtenerUltimaFechaAsignacionMotoItalikaNuevaResult() {
            return localObtenerUltimaFechaAsignacionMotoItalikaNuevaResult;
        }


        /**
         * Auto generated setter method
         *
         * @param param ObtenerUltimaFechaAsignacionMotoItalikaNuevaResult
         */
        public void setObtenerUltimaFechaAsignacionMotoItalikaNuevaResult(InfoFechaAsignacion param) {

            this.localObtenerUltimaFechaAsignacionMotoItalikaNuevaResult = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse",
                            xmlWriter);
                }


            }

            if (localObtenerUltimaFechaAsignacionMotoItalikaNuevaResult == null) {
                throw new org.apache.axis2.databinding.ADBException("ObtenerUltimaFechaAsignacionMotoItalikaNuevaResult cannot be null!!");
            }
            localObtenerUltimaFechaAsignacionMotoItalikaNuevaResult.serialize(new javax.xml.namespace.QName("http://JSAWEB2/", "ObtenerUltimaFechaAsignacionMotoItalikaNuevaResult"),
                    xmlWriter);

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "ObtenerUltimaFechaAsignacionMotoItalikaNuevaResult"));


            if (localObtenerUltimaFechaAsignacionMotoItalikaNuevaResult == null) {
                throw new org.apache.axis2.databinding.ADBException("ObtenerUltimaFechaAsignacionMotoItalikaNuevaResult cannot be null!!");
            }
            elementList.add(localObtenerUltimaFechaAsignacionMotoItalikaNuevaResult);


            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse object =
                        new ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "ObtenerUltimaFechaAsignacionMotoItalikaNuevaResult").equals(reader.getName())) {

                        object.setObtenerUltimaFechaAsignacionMotoItalikaNuevaResult(InfoFechaAsignacion.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ArrayOfInfoMotoE
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "ArrayOfInfoMoto",
                "ns1");


        /**
         * field for ArrayOfInfoMoto
         */


        protected ArrayOfInfoMoto localArrayOfInfoMoto;


        /**
         * Auto generated getter method
         *
         * @return ArrayOfInfoMoto
         */
        public ArrayOfInfoMoto getArrayOfInfoMoto() {
            return localArrayOfInfoMoto;
        }


        /**
         * Auto generated setter method
         *
         * @param param ArrayOfInfoMoto
         */
        public void setArrayOfInfoMoto(ArrayOfInfoMoto param) {

            this.localArrayOfInfoMoto = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it

            if (localArrayOfInfoMoto == null) {
                java.lang.String namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "ArrayOfInfoMoto", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localArrayOfInfoMoto.serialize(MY_QNAME, xmlWriter);
            }


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it

            if (localArrayOfInfoMoto == null) {
                return new org.apache.axis2.databinding.utils.reader.NullXMLStreamReader(MY_QNAME);
            } else {
                return localArrayOfInfoMoto.getPullParser(MY_QNAME);
            }


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ArrayOfInfoMotoE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ArrayOfInfoMotoE object =
                        new ArrayOfInfoMotoE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        // Skip the element and report the null value.  It cannot have subelements.
                        while (!reader.isEndElement())
                            reader.next();

                        return object;


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "ArrayOfInfoMoto").equals(reader.getName())) {

                                nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                                if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                                    object.setArrayOfInfoMoto(null);
                                    reader.next();

                                } else {

                                    object.setArrayOfInfoMoto(ArrayOfInfoMoto.Factory.parse(reader));
                                }
                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ObtenerInformacionRemisionesMotosItalikaResponse
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "ObtenerInformacionRemisionesMotosItalikaResponse",
                "ns1");


        /**
         * field for ObtenerInformacionRemisionesMotosItalikaResult
         */


        protected ArrayOfInfoRemision localObtenerInformacionRemisionesMotosItalikaResult;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localObtenerInformacionRemisionesMotosItalikaResultTracker = false;

        public boolean isObtenerInformacionRemisionesMotosItalikaResultSpecified() {
            return localObtenerInformacionRemisionesMotosItalikaResultTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return ArrayOfInfoRemision
         */
        public ArrayOfInfoRemision getObtenerInformacionRemisionesMotosItalikaResult() {
            return localObtenerInformacionRemisionesMotosItalikaResult;
        }


        /**
         * Auto generated setter method
         *
         * @param param ObtenerInformacionRemisionesMotosItalikaResult
         */
        public void setObtenerInformacionRemisionesMotosItalikaResult(ArrayOfInfoRemision param) {
            localObtenerInformacionRemisionesMotosItalikaResultTracker = param != null;

            this.localObtenerInformacionRemisionesMotosItalikaResult = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":ObtenerInformacionRemisionesMotosItalikaResponse",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "ObtenerInformacionRemisionesMotosItalikaResponse",
                            xmlWriter);
                }


            }
            if (localObtenerInformacionRemisionesMotosItalikaResultTracker) {
                if (localObtenerInformacionRemisionesMotosItalikaResult == null) {
                    throw new org.apache.axis2.databinding.ADBException("ObtenerInformacionRemisionesMotosItalikaResult cannot be null!!");
                }
                localObtenerInformacionRemisionesMotosItalikaResult.serialize(new javax.xml.namespace.QName("http://JSAWEB2/", "ObtenerInformacionRemisionesMotosItalikaResult"),
                        xmlWriter);
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localObtenerInformacionRemisionesMotosItalikaResultTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "ObtenerInformacionRemisionesMotosItalikaResult"));


                if (localObtenerInformacionRemisionesMotosItalikaResult == null) {
                    throw new org.apache.axis2.databinding.ADBException("ObtenerInformacionRemisionesMotosItalikaResult cannot be null!!");
                }
                elementList.add(localObtenerInformacionRemisionesMotosItalikaResult);
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ObtenerInformacionRemisionesMotosItalikaResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ObtenerInformacionRemisionesMotosItalikaResponse object =
                        new ObtenerInformacionRemisionesMotosItalikaResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"ObtenerInformacionRemisionesMotosItalikaResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ObtenerInformacionRemisionesMotosItalikaResponse) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "ObtenerInformacionRemisionesMotosItalikaResult").equals(reader.getName())) {

                        object.setObtenerInformacionRemisionesMotosItalikaResult(ArrayOfInfoRemision.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ResultadoOPE
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "ResultadoOP",
                "ns1");


        /**
         * field for ResultadoOP
         */


        protected ResultadoOP localResultadoOP;


        /**
         * Auto generated getter method
         *
         * @return ResultadoOP
         */
        public ResultadoOP getResultadoOP() {
            return localResultadoOP;
        }


        /**
         * Auto generated setter method
         *
         * @param param ResultadoOP
         */
        public void setResultadoOP(ResultadoOP param) {

            this.localResultadoOP = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it

            if (localResultadoOP == null) {
                throw new org.apache.axis2.databinding.ADBException("ResultadoOP cannot be null!");
            }
            localResultadoOP.serialize(MY_QNAME, xmlWriter);


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it
            return localResultadoOP.getPullParser(MY_QNAME);

        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ResultadoOPE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ResultadoOPE object =
                        new ResultadoOPE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "ResultadoOP").equals(reader.getName())) {

                                object.setResultadoOP(ResultadoOP.Factory.parse(reader));

                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ObtenerInformacionRemisionesMotosItalika
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "ObtenerInformacionRemisionesMotosItalika",
                "ns1");


        /**
         * field for FechaIniRemisionAAAAMMDD
         */


        protected java.lang.String localFechaIniRemisionAAAAMMDD;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localFechaIniRemisionAAAAMMDDTracker = false;

        public boolean isFechaIniRemisionAAAAMMDDSpecified() {
            return localFechaIniRemisionAAAAMMDDTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getFechaIniRemisionAAAAMMDD() {
            return localFechaIniRemisionAAAAMMDD;
        }


        /**
         * Auto generated setter method
         *
         * @param param FechaIniRemisionAAAAMMDD
         */
        public void setFechaIniRemisionAAAAMMDD(java.lang.String param) {
            localFechaIniRemisionAAAAMMDDTracker = param != null;

            this.localFechaIniRemisionAAAAMMDD = param;


        }


        /**
         * field for FechaFinRemisionAAAAMMDD
         */


        protected java.lang.String localFechaFinRemisionAAAAMMDD;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localFechaFinRemisionAAAAMMDDTracker = false;

        public boolean isFechaFinRemisionAAAAMMDDSpecified() {
            return localFechaFinRemisionAAAAMMDDTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getFechaFinRemisionAAAAMMDD() {
            return localFechaFinRemisionAAAAMMDD;
        }


        /**
         * Auto generated setter method
         *
         * @param param FechaFinRemisionAAAAMMDD
         */
        public void setFechaFinRemisionAAAAMMDD(java.lang.String param) {
            localFechaFinRemisionAAAAMMDDTracker = param != null;

            this.localFechaFinRemisionAAAAMMDD = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":ObtenerInformacionRemisionesMotosItalika",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "ObtenerInformacionRemisionesMotosItalika",
                            xmlWriter);
                }


            }
            if (localFechaIniRemisionAAAAMMDDTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "fechaIniRemisionAAAAMMDD", xmlWriter);


                if (localFechaIniRemisionAAAAMMDD == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("fechaIniRemisionAAAAMMDD cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localFechaIniRemisionAAAAMMDD);

                }

                xmlWriter.writeEndElement();
            }
            if (localFechaFinRemisionAAAAMMDDTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "fechaFinRemisionAAAAMMDD", xmlWriter);


                if (localFechaFinRemisionAAAAMMDD == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("fechaFinRemisionAAAAMMDD cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localFechaFinRemisionAAAAMMDD);

                }

                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localFechaIniRemisionAAAAMMDDTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "fechaIniRemisionAAAAMMDD"));

                if (localFechaIniRemisionAAAAMMDD != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaIniRemisionAAAAMMDD));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("fechaIniRemisionAAAAMMDD cannot be null!!");
                }
            }
            if (localFechaFinRemisionAAAAMMDDTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "fechaFinRemisionAAAAMMDD"));

                if (localFechaFinRemisionAAAAMMDD != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaFinRemisionAAAAMMDD));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("fechaFinRemisionAAAAMMDD cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ObtenerInformacionRemisionesMotosItalika parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ObtenerInformacionRemisionesMotosItalika object =
                        new ObtenerInformacionRemisionesMotosItalika();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"ObtenerInformacionRemisionesMotosItalika".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ObtenerInformacionRemisionesMotosItalika) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "fechaIniRemisionAAAAMMDD").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "fechaIniRemisionAAAAMMDD" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setFechaIniRemisionAAAAMMDD(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "fechaFinRemisionAAAAMMDD").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "fechaFinRemisionAAAAMMDD" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setFechaFinRemisionAAAAMMDD(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ObtenerInformacionGeneralMotosItalika
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "ObtenerInformacionGeneralMotosItalika",
                "ns1");


        /**
         * field for SerieMotoFiltrar
         */


        protected java.lang.String localSerieMotoFiltrar;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localSerieMotoFiltrarTracker = false;

        public boolean isSerieMotoFiltrarSpecified() {
            return localSerieMotoFiltrarTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getSerieMotoFiltrar() {
            return localSerieMotoFiltrar;
        }


        /**
         * Auto generated setter method
         *
         * @param param SerieMotoFiltrar
         */
        public void setSerieMotoFiltrar(java.lang.String param) {
            localSerieMotoFiltrarTracker = param != null;

            this.localSerieMotoFiltrar = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":ObtenerInformacionGeneralMotosItalika",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "ObtenerInformacionGeneralMotosItalika",
                            xmlWriter);
                }


            }
            if (localSerieMotoFiltrarTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "serieMotoFiltrar", xmlWriter);


                if (localSerieMotoFiltrar == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("serieMotoFiltrar cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localSerieMotoFiltrar);

                }

                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localSerieMotoFiltrarTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "serieMotoFiltrar"));

                if (localSerieMotoFiltrar != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSerieMotoFiltrar));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("serieMotoFiltrar cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ObtenerInformacionGeneralMotosItalika parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ObtenerInformacionGeneralMotosItalika object =
                        new ObtenerInformacionGeneralMotosItalika();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"ObtenerInformacionGeneralMotosItalika".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ObtenerInformacionGeneralMotosItalika) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "serieMotoFiltrar").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "serieMotoFiltrar" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setSerieMotoFiltrar(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ResultadoOP
            implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = ResultadoOP
                Namespace URI = http://JSAWEB2/
                Namespace Prefix = ns1
                */


        /**
         * field for Codigo
         */


        protected int localCodigo;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getCodigo() {
            return localCodigo;
        }


        /**
         * Auto generated setter method
         *
         * @param param Codigo
         */
        public void setCodigo(int param) {

            this.localCodigo = param;


        }


        /**
         * field for Mensaje
         */


        protected java.lang.String localMensaje;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localMensajeTracker = false;

        public boolean isMensajeSpecified() {
            return localMensajeTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getMensaje() {
            return localMensaje;
        }


        /**
         * Auto generated setter method
         *
         * @param param Mensaje
         */
        public void setMensaje(java.lang.String param) {
            localMensajeTracker = param != null;

            this.localMensaje = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":ResultadoOP",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "ResultadoOP",
                            xmlWriter);
                }


            }

            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "codigo", xmlWriter);

            if (localCodigo == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("codigo cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigo));
            }

            xmlWriter.writeEndElement();
            if (localMensajeTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "mensaje", xmlWriter);


                if (localMensaje == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("mensaje cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localMensaje);

                }

                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "codigo"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigo));
            if (localMensajeTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "mensaje"));

                if (localMensaje != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMensaje));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("mensaje cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ResultadoOP parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ResultadoOP object =
                        new ResultadoOP();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"ResultadoOP".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ResultadoOP) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "codigo").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "codigo" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setCodigo(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "mensaje").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "mensaje" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setMensaje(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ArrayOfInfoMotoMin
            implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = ArrayOfInfoMotoMin
                Namespace URI = http://JSAWEB2/
                Namespace Prefix = ns1
                */


        /**
         * field for InfoMotoMin
         * This was an Array!
         */


        protected InfoMotoMin[] localInfoMotoMin;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localInfoMotoMinTracker = false;

        public boolean isInfoMotoMinSpecified() {
            return localInfoMotoMinTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return InfoMotoMin[]
         */
        public InfoMotoMin[] getInfoMotoMin() {
            return localInfoMotoMin;
        }


        /**
         * validate the array for InfoMotoMin
         */
        protected void validateInfoMotoMin(InfoMotoMin[] param) {

        }


        /**
         * Auto generated setter method
         *
         * @param param InfoMotoMin
         */
        public void setInfoMotoMin(InfoMotoMin[] param) {

            validateInfoMotoMin(param);

            localInfoMotoMinTracker = param != null;

            this.localInfoMotoMin = param;
        }


        /**
         * Auto generated add method for the array for convenience
         *
         * @param param InfoMotoMin
         */
        public void addInfoMotoMin(InfoMotoMin param) {
            if (localInfoMotoMin == null) {
                localInfoMotoMin = new InfoMotoMin[]{};
            }


            //update the setting tracker
            localInfoMotoMinTracker = true;


            java.util.List list =
                    org.apache.axis2.databinding.utils.ConverterUtil.toList(localInfoMotoMin);
            list.add(param);
            this.localInfoMotoMin =
                    (InfoMotoMin[]) list.toArray(
                            new InfoMotoMin[list.size()]);

        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":ArrayOfInfoMotoMin",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "ArrayOfInfoMotoMin",
                            xmlWriter);
                }


            }
            if (localInfoMotoMinTracker) {
                if (localInfoMotoMin != null) {
                    for (int i = 0; i < localInfoMotoMin.length; i++) {
                        if (localInfoMotoMin[i] != null) {
                            localInfoMotoMin[i].serialize(new javax.xml.namespace.QName("http://JSAWEB2/", "InfoMotoMin"),
                                    xmlWriter);
                        } else {

                            // we don't have to do any thing since minOccures is zero

                        }

                    }
                } else {

                    throw new org.apache.axis2.databinding.ADBException("InfoMotoMin cannot be null!!");

                }
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localInfoMotoMinTracker) {
                if (localInfoMotoMin != null) {
                    for (int i = 0; i < localInfoMotoMin.length; i++) {

                        if (localInfoMotoMin[i] != null) {
                            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                                    "InfoMotoMin"));
                            elementList.add(localInfoMotoMin[i]);
                        } else {

                            // nothing to do

                        }

                    }
                } else {

                    throw new org.apache.axis2.databinding.ADBException("InfoMotoMin cannot be null!!");

                }

            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ArrayOfInfoMotoMin parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ArrayOfInfoMotoMin object =
                        new ArrayOfInfoMotoMin();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"ArrayOfInfoMotoMin".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ArrayOfInfoMotoMin) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();

                    java.util.ArrayList list1 = new java.util.ArrayList();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "InfoMotoMin").equals(reader.getName())) {


                        // Process the array and step past its final element's end.
                        list1.add(InfoMotoMin.Factory.parse(reader));

                        //loop until we find a start element that is not part of this array
                        boolean loopDone1 = false;
                        while (!loopDone1) {
                            // We should be at the end element, but make sure
                            while (!reader.isEndElement())
                                reader.next();
                            // Step out of this element
                            reader.next();
                            // Step to next element event.
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isEndElement()) {
                                //two continuous end elements means we are exiting the xml structure
                                loopDone1 = true;
                            } else {
                                if (new javax.xml.namespace.QName("http://JSAWEB2/", "InfoMotoMin").equals(reader.getName())) {
                                    list1.add(InfoMotoMin.Factory.parse(reader));

                                } else {
                                    loopDone1 = true;
                                }
                            }
                        }
                        // call the converter utility  to convert and set the array

                        object.setInfoMotoMin((InfoMotoMin[])
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                        InfoMotoMin.class,
                                        list1));

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ObtenerHistorialMotoItalikaResponse
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "ObtenerHistorialMotoItalikaResponse",
                "ns1");


        /**
         * field for ObtenerHistorialMotoItalikaResult
         */


        protected ArrayOfInfoMotoMin localObtenerHistorialMotoItalikaResult;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localObtenerHistorialMotoItalikaResultTracker = false;

        public boolean isObtenerHistorialMotoItalikaResultSpecified() {
            return localObtenerHistorialMotoItalikaResultTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return ArrayOfInfoMotoMin
         */
        public ArrayOfInfoMotoMin getObtenerHistorialMotoItalikaResult() {
            return localObtenerHistorialMotoItalikaResult;
        }


        /**
         * Auto generated setter method
         *
         * @param param ObtenerHistorialMotoItalikaResult
         */
        public void setObtenerHistorialMotoItalikaResult(ArrayOfInfoMotoMin param) {
            localObtenerHistorialMotoItalikaResultTracker = param != null;

            this.localObtenerHistorialMotoItalikaResult = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":ObtenerHistorialMotoItalikaResponse",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "ObtenerHistorialMotoItalikaResponse",
                            xmlWriter);
                }


            }
            if (localObtenerHistorialMotoItalikaResultTracker) {
                if (localObtenerHistorialMotoItalikaResult == null) {
                    throw new org.apache.axis2.databinding.ADBException("ObtenerHistorialMotoItalikaResult cannot be null!!");
                }
                localObtenerHistorialMotoItalikaResult.serialize(new javax.xml.namespace.QName("http://JSAWEB2/", "ObtenerHistorialMotoItalikaResult"),
                        xmlWriter);
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localObtenerHistorialMotoItalikaResultTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "ObtenerHistorialMotoItalikaResult"));


                if (localObtenerHistorialMotoItalikaResult == null) {
                    throw new org.apache.axis2.databinding.ADBException("ObtenerHistorialMotoItalikaResult cannot be null!!");
                }
                elementList.add(localObtenerHistorialMotoItalikaResult);
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ObtenerHistorialMotoItalikaResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ObtenerHistorialMotoItalikaResponse object =
                        new ObtenerHistorialMotoItalikaResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"ObtenerHistorialMotoItalikaResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ObtenerHistorialMotoItalikaResponse) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "ObtenerHistorialMotoItalikaResult").equals(reader.getName())) {

                        object.setObtenerHistorialMotoItalikaResult(ArrayOfInfoMotoMin.Factory.parse(reader));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class InfoMoto
            implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = InfoMoto
                Namespace URI = http://JSAWEB2/
                Namespace Prefix = ns1
                */


        /**
         * field for SerieMoto
         */


        protected java.lang.String localSerieMoto;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localSerieMotoTracker = false;

        public boolean isSerieMotoSpecified() {
            return localSerieMotoTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getSerieMoto() {
            return localSerieMoto;
        }


        /**
         * Auto generated setter method
         *
         * @param param SerieMoto
         */
        public void setSerieMoto(java.lang.String param) {
            localSerieMotoTracker = param != null;

            this.localSerieMoto = param;


        }


        /**
         * field for NumeroMotor
         */


        protected java.lang.String localNumeroMotor;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localNumeroMotorTracker = false;

        public boolean isNumeroMotorSpecified() {
            return localNumeroMotorTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getNumeroMotor() {
            return localNumeroMotor;
        }


        /**
         * Auto generated setter method
         *
         * @param param NumeroMotor
         */
        public void setNumeroMotor(java.lang.String param) {
            localNumeroMotorTracker = param != null;

            this.localNumeroMotor = param;


        }


        /**
         * field for PlacaVehicular
         */


        protected java.lang.String localPlacaVehicular;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localPlacaVehicularTracker = false;

        public boolean isPlacaVehicularSpecified() {
            return localPlacaVehicularTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getPlacaVehicular() {
            return localPlacaVehicular;
        }


        /**
         * Auto generated setter method
         *
         * @param param PlacaVehicular
         */
        public void setPlacaVehicular(java.lang.String param) {
            localPlacaVehicularTracker = param != null;

            this.localPlacaVehicular = param;


        }


        /**
         * field for EntidadEmplacamiento
         */


        protected java.lang.String localEntidadEmplacamiento;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localEntidadEmplacamientoTracker = false;

        public boolean isEntidadEmplacamientoSpecified() {
            return localEntidadEmplacamientoTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getEntidadEmplacamiento() {
            return localEntidadEmplacamiento;
        }


        /**
         * Auto generated setter method
         *
         * @param param EntidadEmplacamiento
         */
        public void setEntidadEmplacamiento(java.lang.String param) {
            localEntidadEmplacamientoTracker = param != null;

            this.localEntidadEmplacamiento = param;


        }


        /**
         * field for Marca
         */


        protected java.lang.String localMarca;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localMarcaTracker = false;

        public boolean isMarcaSpecified() {
            return localMarcaTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getMarca() {
            return localMarca;
        }


        /**
         * Auto generated setter method
         *
         * @param param Marca
         */
        public void setMarca(java.lang.String param) {
            localMarcaTracker = param != null;

            this.localMarca = param;


        }


        /**
         * field for Modelo
         */


        protected java.lang.String localModelo;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localModeloTracker = false;

        public boolean isModeloSpecified() {
            return localModeloTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getModelo() {
            return localModelo;
        }


        /**
         * Auto generated setter method
         *
         * @param param Modelo
         */
        public void setModelo(java.lang.String param) {
            localModeloTracker = param != null;

            this.localModelo = param;


        }


        /**
         * field for EstatusMoto
         */


        protected java.lang.String localEstatusMoto;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localEstatusMotoTracker = false;

        public boolean isEstatusMotoSpecified() {
            return localEstatusMotoTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getEstatusMoto() {
            return localEstatusMoto;
        }


        /**
         * Auto generated setter method
         *
         * @param param EstatusMoto
         */
        public void setEstatusMoto(java.lang.String param) {
            localEstatusMotoTracker = param != null;

            this.localEstatusMoto = param;


        }


        /**
         * field for SituacionOperativaMoto
         */


        protected java.lang.String localSituacionOperativaMoto;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localSituacionOperativaMotoTracker = false;

        public boolean isSituacionOperativaMotoSpecified() {
            return localSituacionOperativaMotoTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getSituacionOperativaMoto() {
            return localSituacionOperativaMoto;
        }


        /**
         * Auto generated setter method
         *
         * @param param SituacionOperativaMoto
         */
        public void setSituacionOperativaMoto(java.lang.String param) {
            localSituacionOperativaMotoTracker = param != null;

            this.localSituacionOperativaMoto = param;


        }


        /**
         * field for EmpleadoAsignado
         */


        protected int localEmpleadoAsignado;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getEmpleadoAsignado() {
            return localEmpleadoAsignado;
        }


        /**
         * Auto generated setter method
         *
         * @param param EmpleadoAsignado
         */
        public void setEmpleadoAsignado(int param) {

            this.localEmpleadoAsignado = param;


        }


        /**
         * field for EmpleadoAsignadoNombre
         */


        protected java.lang.String localEmpleadoAsignadoNombre;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localEmpleadoAsignadoNombreTracker = false;

        public boolean isEmpleadoAsignadoNombreSpecified() {
            return localEmpleadoAsignadoNombreTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getEmpleadoAsignadoNombre() {
            return localEmpleadoAsignadoNombre;
        }


        /**
         * Auto generated setter method
         *
         * @param param EmpleadoAsignadoNombre
         */
        public void setEmpleadoAsignadoNombre(java.lang.String param) {
            localEmpleadoAsignadoNombreTracker = param != null;

            this.localEmpleadoAsignadoNombre = param;


        }


        /**
         * field for CecoEmpleado
         */


        protected int localCecoEmpleado;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getCecoEmpleado() {
            return localCecoEmpleado;
        }


        /**
         * Auto generated setter method
         *
         * @param param CecoEmpleado
         */
        public void setCecoEmpleado(int param) {

            this.localCecoEmpleado = param;


        }


        /**
         * field for CecoEmpleadoNombre
         */


        protected java.lang.String localCecoEmpleadoNombre;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localCecoEmpleadoNombreTracker = false;

        public boolean isCecoEmpleadoNombreSpecified() {
            return localCecoEmpleadoNombreTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getCecoEmpleadoNombre() {
            return localCecoEmpleadoNombre;
        }


        /**
         * Auto generated setter method
         *
         * @param param CecoEmpleadoNombre
         */
        public void setCecoEmpleadoNombre(java.lang.String param) {
            localCecoEmpleadoNombreTracker = param != null;

            this.localCecoEmpleadoNombre = param;


        }


        /**
         * field for FechaCambioEmpleadoOEstatus
         */


        protected java.lang.String localFechaCambioEmpleadoOEstatus;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localFechaCambioEmpleadoOEstatusTracker = false;

        public boolean isFechaCambioEmpleadoOEstatusSpecified() {
            return localFechaCambioEmpleadoOEstatusTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getFechaCambioEmpleadoOEstatus() {
            return localFechaCambioEmpleadoOEstatus;
        }


        /**
         * Auto generated setter method
         *
         * @param param FechaCambioEmpleadoOEstatus
         */
        public void setFechaCambioEmpleadoOEstatus(java.lang.String param) {
            localFechaCambioEmpleadoOEstatusTracker = param != null;

            this.localFechaCambioEmpleadoOEstatus = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":InfoMoto",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "InfoMoto",
                            xmlWriter);
                }


            }
            if (localSerieMotoTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "serieMoto", xmlWriter);


                if (localSerieMoto == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("serieMoto cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localSerieMoto);

                }

                xmlWriter.writeEndElement();
            }
            if (localNumeroMotorTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "numeroMotor", xmlWriter);


                if (localNumeroMotor == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("numeroMotor cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localNumeroMotor);

                }

                xmlWriter.writeEndElement();
            }
            if (localPlacaVehicularTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "placaVehicular", xmlWriter);


                if (localPlacaVehicular == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("placaVehicular cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localPlacaVehicular);

                }

                xmlWriter.writeEndElement();
            }
            if (localEntidadEmplacamientoTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "entidadEmplacamiento", xmlWriter);


                if (localEntidadEmplacamiento == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("entidadEmplacamiento cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localEntidadEmplacamiento);

                }

                xmlWriter.writeEndElement();
            }
            if (localMarcaTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "marca", xmlWriter);


                if (localMarca == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("marca cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localMarca);

                }

                xmlWriter.writeEndElement();
            }
            if (localModeloTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "modelo", xmlWriter);


                if (localModelo == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("modelo cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localModelo);

                }

                xmlWriter.writeEndElement();
            }
            if (localEstatusMotoTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "estatusMoto", xmlWriter);


                if (localEstatusMoto == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("estatusMoto cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localEstatusMoto);

                }

                xmlWriter.writeEndElement();
            }
            if (localSituacionOperativaMotoTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "situacionOperativaMoto", xmlWriter);


                if (localSituacionOperativaMoto == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("situacionOperativaMoto cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localSituacionOperativaMoto);

                }

                xmlWriter.writeEndElement();
            }
            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "empleadoAsignado", xmlWriter);

            if (localEmpleadoAsignado == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("empleadoAsignado cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmpleadoAsignado));
            }

            xmlWriter.writeEndElement();
            if (localEmpleadoAsignadoNombreTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "empleadoAsignadoNombre", xmlWriter);


                if (localEmpleadoAsignadoNombre == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("empleadoAsignadoNombre cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localEmpleadoAsignadoNombre);

                }

                xmlWriter.writeEndElement();
            }
            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "cecoEmpleado", xmlWriter);

            if (localCecoEmpleado == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("cecoEmpleado cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCecoEmpleado));
            }

            xmlWriter.writeEndElement();
            if (localCecoEmpleadoNombreTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "cecoEmpleadoNombre", xmlWriter);


                if (localCecoEmpleadoNombre == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("cecoEmpleadoNombre cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localCecoEmpleadoNombre);

                }

                xmlWriter.writeEndElement();
            }
            if (localFechaCambioEmpleadoOEstatusTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "fechaCambioEmpleadoOEstatus", xmlWriter);


                if (localFechaCambioEmpleadoOEstatus == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("fechaCambioEmpleadoOEstatus cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localFechaCambioEmpleadoOEstatus);

                }

                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localSerieMotoTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "serieMoto"));

                if (localSerieMoto != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSerieMoto));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("serieMoto cannot be null!!");
                }
            }
            if (localNumeroMotorTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "numeroMotor"));

                if (localNumeroMotor != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroMotor));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("numeroMotor cannot be null!!");
                }
            }
            if (localPlacaVehicularTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "placaVehicular"));

                if (localPlacaVehicular != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPlacaVehicular));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("placaVehicular cannot be null!!");
                }
            }
            if (localEntidadEmplacamientoTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "entidadEmplacamiento"));

                if (localEntidadEmplacamiento != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEntidadEmplacamiento));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("entidadEmplacamiento cannot be null!!");
                }
            }
            if (localMarcaTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "marca"));

                if (localMarca != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMarca));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("marca cannot be null!!");
                }
            }
            if (localModeloTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "modelo"));

                if (localModelo != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localModelo));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("modelo cannot be null!!");
                }
            }
            if (localEstatusMotoTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "estatusMoto"));

                if (localEstatusMoto != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEstatusMoto));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("estatusMoto cannot be null!!");
                }
            }
            if (localSituacionOperativaMotoTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "situacionOperativaMoto"));

                if (localSituacionOperativaMoto != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSituacionOperativaMoto));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("situacionOperativaMoto cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "empleadoAsignado"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmpleadoAsignado));
            if (localEmpleadoAsignadoNombreTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "empleadoAsignadoNombre"));

                if (localEmpleadoAsignadoNombre != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmpleadoAsignadoNombre));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("empleadoAsignadoNombre cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "cecoEmpleado"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCecoEmpleado));
            if (localCecoEmpleadoNombreTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "cecoEmpleadoNombre"));

                if (localCecoEmpleadoNombre != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCecoEmpleadoNombre));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("cecoEmpleadoNombre cannot be null!!");
                }
            }
            if (localFechaCambioEmpleadoOEstatusTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "fechaCambioEmpleadoOEstatus"));

                if (localFechaCambioEmpleadoOEstatus != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaCambioEmpleadoOEstatus));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("fechaCambioEmpleadoOEstatus cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static InfoMoto parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                InfoMoto object =
                        new InfoMoto();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"InfoMoto".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (InfoMoto) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "serieMoto").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "serieMoto" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setSerieMoto(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "numeroMotor").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "numeroMotor" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setNumeroMotor(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "placaVehicular").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "placaVehicular" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setPlacaVehicular(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "entidadEmplacamiento").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "entidadEmplacamiento" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setEntidadEmplacamiento(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "marca").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "marca" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setMarca(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "modelo").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "modelo" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setModelo(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "estatusMoto").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "estatusMoto" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setEstatusMoto(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "situacionOperativaMoto").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "situacionOperativaMoto" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setSituacionOperativaMoto(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "empleadoAsignado").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "empleadoAsignado" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setEmpleadoAsignado(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "empleadoAsignadoNombre").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "empleadoAsignadoNombre" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setEmpleadoAsignadoNombre(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "cecoEmpleado").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "cecoEmpleado" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setCecoEmpleado(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "cecoEmpleadoNombre").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "cecoEmpleadoNombre" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setCecoEmpleadoNombre(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "fechaCambioEmpleadoOEstatus").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "fechaCambioEmpleadoOEstatus" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setFechaCambioEmpleadoOEstatus(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ArrayOfMotoEmpleado
            implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = ArrayOfMotoEmpleado
                Namespace URI = http://JSAWEB2/
                Namespace Prefix = ns1
                */


        /**
         * field for MotoEmpleado
         * This was an Array!
         */


        protected MotoEmpleado[] localMotoEmpleado;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localMotoEmpleadoTracker = false;

        public boolean isMotoEmpleadoSpecified() {
            return localMotoEmpleadoTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return MotoEmpleado[]
         */
        public MotoEmpleado[] getMotoEmpleado() {
            return localMotoEmpleado;
        }


        /**
         * validate the array for MotoEmpleado
         */
        protected void validateMotoEmpleado(MotoEmpleado[] param) {

        }


        /**
         * Auto generated setter method
         *
         * @param param MotoEmpleado
         */
        public void setMotoEmpleado(MotoEmpleado[] param) {

            validateMotoEmpleado(param);

            localMotoEmpleadoTracker = param != null;

            this.localMotoEmpleado = param;
        }


        /**
         * Auto generated add method for the array for convenience
         *
         * @param param MotoEmpleado
         */
        public void addMotoEmpleado(MotoEmpleado param) {
            if (localMotoEmpleado == null) {
                localMotoEmpleado = new MotoEmpleado[]{};
            }


            //update the setting tracker
            localMotoEmpleadoTracker = true;


            java.util.List list =
                    org.apache.axis2.databinding.utils.ConverterUtil.toList(localMotoEmpleado);
            list.add(param);
            this.localMotoEmpleado =
                    (MotoEmpleado[]) list.toArray(
                            new MotoEmpleado[list.size()]);

        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":ArrayOfMotoEmpleado",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "ArrayOfMotoEmpleado",
                            xmlWriter);
                }


            }
            if (localMotoEmpleadoTracker) {
                if (localMotoEmpleado != null) {
                    for (int i = 0; i < localMotoEmpleado.length; i++) {
                        if (localMotoEmpleado[i] != null) {
                            localMotoEmpleado[i].serialize(new javax.xml.namespace.QName("http://JSAWEB2/", "MotoEmpleado"),
                                    xmlWriter);
                        } else {

                            // we don't have to do any thing since minOccures is zero

                        }

                    }
                } else {

                    throw new org.apache.axis2.databinding.ADBException("MotoEmpleado cannot be null!!");

                }
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localMotoEmpleadoTracker) {
                if (localMotoEmpleado != null) {
                    for (int i = 0; i < localMotoEmpleado.length; i++) {

                        if (localMotoEmpleado[i] != null) {
                            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                                    "MotoEmpleado"));
                            elementList.add(localMotoEmpleado[i]);
                        } else {

                            // nothing to do

                        }

                    }
                } else {

                    throw new org.apache.axis2.databinding.ADBException("MotoEmpleado cannot be null!!");

                }

            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ArrayOfMotoEmpleado parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ArrayOfMotoEmpleado object =
                        new ArrayOfMotoEmpleado();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"ArrayOfMotoEmpleado".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ArrayOfMotoEmpleado) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();

                    java.util.ArrayList list1 = new java.util.ArrayList();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "MotoEmpleado").equals(reader.getName())) {


                        // Process the array and step past its final element's end.
                        list1.add(MotoEmpleado.Factory.parse(reader));

                        //loop until we find a start element that is not part of this array
                        boolean loopDone1 = false;
                        while (!loopDone1) {
                            // We should be at the end element, but make sure
                            while (!reader.isEndElement())
                                reader.next();
                            // Step out of this element
                            reader.next();
                            // Step to next element event.
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isEndElement()) {
                                //two continuous end elements means we are exiting the xml structure
                                loopDone1 = true;
                            } else {
                                if (new javax.xml.namespace.QName("http://JSAWEB2/", "MotoEmpleado").equals(reader.getName())) {
                                    list1.add(MotoEmpleado.Factory.parse(reader));

                                } else {
                                    loopDone1 = true;
                                }
                            }
                        }
                        // call the converter utility  to convert and set the array

                        object.setMotoEmpleado((MotoEmpleado[])
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                        MotoEmpleado.class,
                                        list1));

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class InfoMotoMin
            implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = InfoMotoMin
                Namespace URI = http://JSAWEB2/
                Namespace Prefix = ns1
                */


        /**
         * field for SerieMoto
         */


        protected java.lang.String localSerieMoto;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localSerieMotoTracker = false;

        public boolean isSerieMotoSpecified() {
            return localSerieMotoTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getSerieMoto() {
            return localSerieMoto;
        }


        /**
         * Auto generated setter method
         *
         * @param param SerieMoto
         */
        public void setSerieMoto(java.lang.String param) {
            localSerieMotoTracker = param != null;

            this.localSerieMoto = param;


        }


        /**
         * field for EstatusMoto
         */


        protected java.lang.String localEstatusMoto;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localEstatusMotoTracker = false;

        public boolean isEstatusMotoSpecified() {
            return localEstatusMotoTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getEstatusMoto() {
            return localEstatusMoto;
        }


        /**
         * Auto generated setter method
         *
         * @param param EstatusMoto
         */
        public void setEstatusMoto(java.lang.String param) {
            localEstatusMotoTracker = param != null;

            this.localEstatusMoto = param;


        }


        /**
         * field for SituacionOperativaMoto
         */


        protected java.lang.String localSituacionOperativaMoto;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localSituacionOperativaMotoTracker = false;

        public boolean isSituacionOperativaMotoSpecified() {
            return localSituacionOperativaMotoTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getSituacionOperativaMoto() {
            return localSituacionOperativaMoto;
        }


        /**
         * Auto generated setter method
         *
         * @param param SituacionOperativaMoto
         */
        public void setSituacionOperativaMoto(java.lang.String param) {
            localSituacionOperativaMotoTracker = param != null;

            this.localSituacionOperativaMoto = param;


        }


        /**
         * field for EmpleadoAsignado
         */


        protected int localEmpleadoAsignado;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getEmpleadoAsignado() {
            return localEmpleadoAsignado;
        }


        /**
         * Auto generated setter method
         *
         * @param param EmpleadoAsignado
         */
        public void setEmpleadoAsignado(int param) {

            this.localEmpleadoAsignado = param;


        }


        /**
         * field for EmpleadoAsignadoNombre
         */


        protected java.lang.String localEmpleadoAsignadoNombre;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localEmpleadoAsignadoNombreTracker = false;

        public boolean isEmpleadoAsignadoNombreSpecified() {
            return localEmpleadoAsignadoNombreTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getEmpleadoAsignadoNombre() {
            return localEmpleadoAsignadoNombre;
        }


        /**
         * Auto generated setter method
         *
         * @param param EmpleadoAsignadoNombre
         */
        public void setEmpleadoAsignadoNombre(java.lang.String param) {
            localEmpleadoAsignadoNombreTracker = param != null;

            this.localEmpleadoAsignadoNombre = param;


        }


        /**
         * field for FechaCambioEstatusOEmpleado
         */


        protected java.lang.String localFechaCambioEstatusOEmpleado;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localFechaCambioEstatusOEmpleadoTracker = false;

        public boolean isFechaCambioEstatusOEmpleadoSpecified() {
            return localFechaCambioEstatusOEmpleadoTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getFechaCambioEstatusOEmpleado() {
            return localFechaCambioEstatusOEmpleado;
        }


        /**
         * Auto generated setter method
         *
         * @param param FechaCambioEstatusOEmpleado
         */
        public void setFechaCambioEstatusOEmpleado(java.lang.String param) {
            localFechaCambioEstatusOEmpleadoTracker = param != null;

            this.localFechaCambioEstatusOEmpleado = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":InfoMotoMin",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "InfoMotoMin",
                            xmlWriter);
                }


            }
            if (localSerieMotoTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "serieMoto", xmlWriter);


                if (localSerieMoto == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("serieMoto cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localSerieMoto);

                }

                xmlWriter.writeEndElement();
            }
            if (localEstatusMotoTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "estatusMoto", xmlWriter);


                if (localEstatusMoto == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("estatusMoto cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localEstatusMoto);

                }

                xmlWriter.writeEndElement();
            }
            if (localSituacionOperativaMotoTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "situacionOperativaMoto", xmlWriter);


                if (localSituacionOperativaMoto == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("situacionOperativaMoto cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localSituacionOperativaMoto);

                }

                xmlWriter.writeEndElement();
            }
            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "empleadoAsignado", xmlWriter);

            if (localEmpleadoAsignado == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("empleadoAsignado cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmpleadoAsignado));
            }

            xmlWriter.writeEndElement();
            if (localEmpleadoAsignadoNombreTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "empleadoAsignadoNombre", xmlWriter);


                if (localEmpleadoAsignadoNombre == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("empleadoAsignadoNombre cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localEmpleadoAsignadoNombre);

                }

                xmlWriter.writeEndElement();
            }
            if (localFechaCambioEstatusOEmpleadoTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "fechaCambioEstatusOEmpleado", xmlWriter);


                if (localFechaCambioEstatusOEmpleado == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("fechaCambioEstatusOEmpleado cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localFechaCambioEstatusOEmpleado);

                }

                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localSerieMotoTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "serieMoto"));

                if (localSerieMoto != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSerieMoto));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("serieMoto cannot be null!!");
                }
            }
            if (localEstatusMotoTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "estatusMoto"));

                if (localEstatusMoto != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEstatusMoto));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("estatusMoto cannot be null!!");
                }
            }
            if (localSituacionOperativaMotoTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "situacionOperativaMoto"));

                if (localSituacionOperativaMoto != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSituacionOperativaMoto));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("situacionOperativaMoto cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "empleadoAsignado"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmpleadoAsignado));
            if (localEmpleadoAsignadoNombreTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "empleadoAsignadoNombre"));

                if (localEmpleadoAsignadoNombre != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmpleadoAsignadoNombre));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("empleadoAsignadoNombre cannot be null!!");
                }
            }
            if (localFechaCambioEstatusOEmpleadoTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "fechaCambioEstatusOEmpleado"));

                if (localFechaCambioEstatusOEmpleado != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaCambioEstatusOEmpleado));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("fechaCambioEstatusOEmpleado cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static InfoMotoMin parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                InfoMotoMin object =
                        new InfoMotoMin();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"InfoMotoMin".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (InfoMotoMin) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "serieMoto").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "serieMoto" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setSerieMoto(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "estatusMoto").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "estatusMoto" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setEstatusMoto(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "situacionOperativaMoto").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "situacionOperativaMoto" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setSituacionOperativaMoto(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "empleadoAsignado").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "empleadoAsignado" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setEmpleadoAsignado(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "empleadoAsignadoNombre").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "empleadoAsignadoNombre" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setEmpleadoAsignadoNombre(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "fechaCambioEstatusOEmpleado").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "fechaCambioEstatusOEmpleado" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setFechaCambioEstatusOEmpleado(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ObtenerUltimaFechaAsignacionMotoItalikaNueva
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "ObtenerUltimaFechaAsignacionMotoItalikaNueva",
                "ns1");


        /**
         * field for EmpleadoConsultado
         */


        protected int localEmpleadoConsultado;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getEmpleadoConsultado() {
            return localEmpleadoConsultado;
        }


        /**
         * Auto generated setter method
         *
         * @param param EmpleadoConsultado
         */
        public void setEmpleadoConsultado(int param) {

            this.localEmpleadoConsultado = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":ObtenerUltimaFechaAsignacionMotoItalikaNueva",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "ObtenerUltimaFechaAsignacionMotoItalikaNueva",
                            xmlWriter);
                }


            }

            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "empleadoConsultado", xmlWriter);

            if (localEmpleadoConsultado == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("empleadoConsultado cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmpleadoConsultado));
            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "empleadoConsultado"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmpleadoConsultado));


            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ObtenerUltimaFechaAsignacionMotoItalikaNueva parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ObtenerUltimaFechaAsignacionMotoItalikaNueva object =
                        new ObtenerUltimaFechaAsignacionMotoItalikaNueva();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"ObtenerUltimaFechaAsignacionMotoItalikaNueva".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ObtenerUltimaFechaAsignacionMotoItalikaNueva) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "empleadoConsultado").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "empleadoConsultado" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setEmpleadoConsultado(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ArrayOfInfoRemisionE
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "ArrayOfInfoRemision",
                "ns1");


        /**
         * field for ArrayOfInfoRemision
         */


        protected ArrayOfInfoRemision localArrayOfInfoRemision;


        /**
         * Auto generated getter method
         *
         * @return ArrayOfInfoRemision
         */
        public ArrayOfInfoRemision getArrayOfInfoRemision() {
            return localArrayOfInfoRemision;
        }


        /**
         * Auto generated setter method
         *
         * @param param ArrayOfInfoRemision
         */
        public void setArrayOfInfoRemision(ArrayOfInfoRemision param) {

            this.localArrayOfInfoRemision = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it

            if (localArrayOfInfoRemision == null) {
                java.lang.String namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "ArrayOfInfoRemision", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localArrayOfInfoRemision.serialize(MY_QNAME, xmlWriter);
            }


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it

            if (localArrayOfInfoRemision == null) {
                return new org.apache.axis2.databinding.utils.reader.NullXMLStreamReader(MY_QNAME);
            } else {
                return localArrayOfInfoRemision.getPullParser(MY_QNAME);
            }


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ArrayOfInfoRemisionE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ArrayOfInfoRemisionE object =
                        new ArrayOfInfoRemisionE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        // Skip the element and report the null value.  It cannot have subelements.
                        while (!reader.isEndElement())
                            reader.next();

                        return object;


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "ArrayOfInfoRemision").equals(reader.getName())) {

                                nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                                if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                                    object.setArrayOfInfoRemision(null);
                                    reader.next();

                                } else {

                                    object.setArrayOfInfoRemision(ArrayOfInfoRemision.Factory.parse(reader));
                                }
                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class RegistraKilometrajeMoto
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "RegistraKilometrajeMoto",
                "ns1");


        /**
         * field for EmpleadoUsaMoto
         */


        protected int localEmpleadoUsaMoto;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getEmpleadoUsaMoto() {
            return localEmpleadoUsaMoto;
        }


        /**
         * Auto generated setter method
         *
         * @param param EmpleadoUsaMoto
         */
        public void setEmpleadoUsaMoto(int param) {

            this.localEmpleadoUsaMoto = param;


        }


        /**
         * field for SerieMoto
         */


        protected java.lang.String localSerieMoto;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localSerieMotoTracker = false;

        public boolean isSerieMotoSpecified() {
            return localSerieMotoTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getSerieMoto() {
            return localSerieMoto;
        }


        /**
         * Auto generated setter method
         *
         * @param param SerieMoto
         */
        public void setSerieMoto(java.lang.String param) {
            localSerieMotoTracker = param != null;

            this.localSerieMoto = param;


        }


        /**
         * field for KilometrajeMoto
         */


        protected int localKilometrajeMoto;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getKilometrajeMoto() {
            return localKilometrajeMoto;
        }


        /**
         * Auto generated setter method
         *
         * @param param KilometrajeMoto
         */
        public void setKilometrajeMoto(int param) {

            this.localKilometrajeMoto = param;


        }


        /**
         * field for EmpleadoRegistraDatos
         */


        protected int localEmpleadoRegistraDatos;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getEmpleadoRegistraDatos() {
            return localEmpleadoRegistraDatos;
        }


        /**
         * Auto generated setter method
         *
         * @param param EmpleadoRegistraDatos
         */
        public void setEmpleadoRegistraDatos(int param) {

            this.localEmpleadoRegistraDatos = param;


        }


        /**
         * field for Autenticacion
         */


        protected java.lang.String localAutenticacion;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localAutenticacionTracker = false;

        public boolean isAutenticacionSpecified() {
            return localAutenticacionTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getAutenticacion() {
            return localAutenticacion;
        }


        /**
         * Auto generated setter method
         *
         * @param param Autenticacion
         */
        public void setAutenticacion(java.lang.String param) {
            localAutenticacionTracker = param != null;

            this.localAutenticacion = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":RegistraKilometrajeMoto",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "RegistraKilometrajeMoto",
                            xmlWriter);
                }


            }

            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "empleadoUsaMoto", xmlWriter);

            if (localEmpleadoUsaMoto == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("empleadoUsaMoto cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmpleadoUsaMoto));
            }

            xmlWriter.writeEndElement();
            if (localSerieMotoTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "serieMoto", xmlWriter);


                if (localSerieMoto == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("serieMoto cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localSerieMoto);

                }

                xmlWriter.writeEndElement();
            }
            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "kilometrajeMoto", xmlWriter);

            if (localKilometrajeMoto == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("kilometrajeMoto cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKilometrajeMoto));
            }

            xmlWriter.writeEndElement();

            namespace = "http://JSAWEB2/";
            writeStartElement(null, namespace, "empleadoRegistraDatos", xmlWriter);

            if (localEmpleadoRegistraDatos == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("empleadoRegistraDatos cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmpleadoRegistraDatos));
            }

            xmlWriter.writeEndElement();
            if (localAutenticacionTracker) {
                namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "autenticacion", xmlWriter);


                if (localAutenticacion == null) {
                    // write the nil attribute

                    throw new org.apache.axis2.databinding.ADBException("autenticacion cannot be null!!");

                } else {


                    xmlWriter.writeCharacters(localAutenticacion);

                }

                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "empleadoUsaMoto"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmpleadoUsaMoto));
            if (localSerieMotoTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "serieMoto"));

                if (localSerieMoto != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSerieMoto));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("serieMoto cannot be null!!");
                }
            }
            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "kilometrajeMoto"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKilometrajeMoto));

            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                    "empleadoRegistraDatos"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmpleadoRegistraDatos));
            if (localAutenticacionTracker) {
                elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                        "autenticacion"));

                if (localAutenticacion != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutenticacion));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("autenticacion cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static RegistraKilometrajeMoto parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                RegistraKilometrajeMoto object =
                        new RegistraKilometrajeMoto();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"RegistraKilometrajeMoto".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RegistraKilometrajeMoto) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "empleadoUsaMoto").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "empleadoUsaMoto" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setEmpleadoUsaMoto(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "serieMoto").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "serieMoto" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setSerieMoto(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "kilometrajeMoto").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "kilometrajeMoto" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setKilometrajeMoto(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "empleadoRegistraDatos").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "empleadoRegistraDatos" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setEmpleadoRegistraDatos(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "autenticacion").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "autenticacion" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setAutenticacion(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ArrayOfInfoMotoMinE
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://JSAWEB2/",
                "ArrayOfInfoMotoMin",
                "ns1");


        /**
         * field for ArrayOfInfoMotoMin
         */


        protected ArrayOfInfoMotoMin localArrayOfInfoMotoMin;


        /**
         * Auto generated getter method
         *
         * @return ArrayOfInfoMotoMin
         */
        public ArrayOfInfoMotoMin getArrayOfInfoMotoMin() {
            return localArrayOfInfoMotoMin;
        }


        /**
         * Auto generated setter method
         *
         * @param param ArrayOfInfoMotoMin
         */
        public void setArrayOfInfoMotoMin(ArrayOfInfoMotoMin param) {

            this.localArrayOfInfoMotoMin = param;


        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
            return factory.createOMElement(dataSource, MY_QNAME);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it

            if (localArrayOfInfoMotoMin == null) {
                java.lang.String namespace = "http://JSAWEB2/";
                writeStartElement(null, namespace, "ArrayOfInfoMotoMin", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localArrayOfInfoMotoMin.serialize(MY_QNAME, xmlWriter);
            }


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            //We can safely assume an element has only one type associated with it

            if (localArrayOfInfoMotoMin == null) {
                return new org.apache.axis2.databinding.utils.reader.NullXMLStreamReader(MY_QNAME);
            } else {
                return localArrayOfInfoMotoMin.getPullParser(MY_QNAME);
            }


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ArrayOfInfoMotoMinE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ArrayOfInfoMotoMinE object =
                        new ArrayOfInfoMotoMinE();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        // Skip the element and report the null value.  It cannot have subelements.
                        while (!reader.isEndElement())
                            reader.next();

                        return object;


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {

                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "ArrayOfInfoMotoMin").equals(reader.getName())) {

                                nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                                if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                                    object.setArrayOfInfoMotoMin(null);
                                    reader.next();

                                } else {

                                    object.setArrayOfInfoMotoMin(ArrayOfInfoMotoMin.Factory.parse(reader));
                                }
                            }  // End of if for expected property start element

                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            }

                        } else {
                            reader.next();
                        }
                    }  // end of while loop


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ArrayOfInfoRemision
            implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = ArrayOfInfoRemision
                Namespace URI = http://JSAWEB2/
                Namespace Prefix = ns1
                */


        /**
         * field for InfoRemision
         * This was an Array!
         */


        protected InfoRemision[] localInfoRemision;

        /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
        protected boolean localInfoRemisionTracker = false;

        public boolean isInfoRemisionSpecified() {
            return localInfoRemisionTracker;
        }


        /**
         * Auto generated getter method
         *
         * @return InfoRemision[]
         */
        public InfoRemision[] getInfoRemision() {
            return localInfoRemision;
        }


        /**
         * validate the array for InfoRemision
         */
        protected void validateInfoRemision(InfoRemision[] param) {

        }


        /**
         * Auto generated setter method
         *
         * @param param InfoRemision
         */
        public void setInfoRemision(InfoRemision[] param) {

            validateInfoRemision(param);

            localInfoRemisionTracker = param != null;

            this.localInfoRemision = param;
        }


        /**
         * Auto generated add method for the array for convenience
         *
         * @param param InfoRemision
         */
        public void addInfoRemision(InfoRemision param) {
            if (localInfoRemision == null) {
                localInfoRemision = new InfoRemision[]{};
            }


            //update the setting tracker
            localInfoRemisionTracker = true;


            java.util.List list =
                    org.apache.axis2.databinding.utils.ConverterUtil.toList(localInfoRemision);
            list.add(param);
            this.localInfoRemision =
                    (InfoRemision[]) list.toArray(
                            new InfoRemision[list.size()]);

        }


        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


            org.apache.axiom.om.OMDataSource dataSource =
                    new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
            return factory.createOMElement(dataSource, parentQName);

        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter,
                              boolean serializeType)
                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


            java.lang.String prefix = null;
            java.lang.String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://JSAWEB2/");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":ArrayOfInfoRemision",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "ArrayOfInfoRemision",
                            xmlWriter);
                }


            }
            if (localInfoRemisionTracker) {
                if (localInfoRemision != null) {
                    for (int i = 0; i < localInfoRemision.length; i++) {
                        if (localInfoRemision[i] != null) {
                            localInfoRemision[i].serialize(new javax.xml.namespace.QName("http://JSAWEB2/", "InfoRemision"),
                                    xmlWriter);
                        } else {

                            // we don't have to do any thing since minOccures is zero

                        }

                    }
                } else {

                    throw new org.apache.axis2.databinding.ADBException("InfoRemision cannot be null!!");

                }
            }
            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://JSAWEB2/")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                    java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }


        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


        /**
         * databinding method to get an XML representation of this object
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localInfoRemisionTracker) {
                if (localInfoRemision != null) {
                    for (int i = 0; i < localInfoRemision.length; i++) {

                        if (localInfoRemision[i] != null) {
                            elementList.add(new javax.xml.namespace.QName("http://JSAWEB2/",
                                    "InfoRemision"));
                            elementList.add(localInfoRemision[i]);
                        } else {

                            // nothing to do

                        }

                    }
                } else {

                    throw new org.apache.axis2.databinding.ADBException("InfoRemision cannot be null!!");

                }

            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ArrayOfInfoRemision parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                ArrayOfInfoRemision object =
                        new ArrayOfInfoRemision();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"ArrayOfInfoRemision".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ArrayOfInfoRemision) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();

                    java.util.ArrayList list1 = new java.util.ArrayList();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://JSAWEB2/", "InfoRemision").equals(reader.getName())) {


                        // Process the array and step past its final element's end.
                        list1.add(InfoRemision.Factory.parse(reader));

                        //loop until we find a start element that is not part of this array
                        boolean loopDone1 = false;
                        while (!loopDone1) {
                            // We should be at the end element, but make sure
                            while (!reader.isEndElement())
                                reader.next();
                            // Step out of this element
                            reader.next();
                            // Step to next element event.
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isEndElement()) {
                                //two continuous end elements means we are exiting the xml structure
                                loopDone1 = true;
                            } else {
                                if (new javax.xml.namespace.QName("http://JSAWEB2/", "InfoRemision").equals(reader.getName())) {
                                    list1.add(InfoRemision.Factory.parse(reader));

                                } else {
                                    loopDone1 = true;
                                }
                            }
                        }
                        // call the converter utility  to convert and set the array

                        object.setInfoRemision((InfoRemision[])
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                        InfoRemision.class,
                                        list1));

                    }  // End of if for expected property start element

                    else {

                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    private org.apache.axiom.om.OMElement toOM(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraExperienciaItalikaRecibida param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraExperienciaItalikaRecibida.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraExperienciaItalikaRecibidaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraExperienciaItalikaRecibidaResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerHistorialMotoItalika param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerHistorialMotoItalika.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerHistorialMotoItalikaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerHistorialMotoItalikaResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionRemisionesMotosItalika param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionRemisionesMotosItalika.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionRemisionesMotosItalikaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionRemisionesMotosItalikaResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraKilometrajeMoto param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraKilometrajeMoto.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraKilometrajeMotoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraKilometrajeMotoResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerMotosAsignadasAEmpleado param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerMotosAsignadasAEmpleado.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerMotosAsignadasAEmpleadoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerMotosAsignadasAEmpleadoResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionGeneralMotosItalika param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionGeneralMotosItalika.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionGeneralMotosItalikaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionGeneralMotosItalikaResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNueva param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNueva.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraExperienciaItalikaRecibida param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraExperienciaItalikaRecibida.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }
                                
                             
                             /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerHistorialMotoItalika param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerHistorialMotoItalika.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }
                                
                             
                             /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionRemisionesMotosItalika param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionRemisionesMotosItalika.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }
                                
                             
                             /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraKilometrajeMoto param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraKilometrajeMoto.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }
                                
                             
                             /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerMotosAsignadasAEmpleado param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerMotosAsignadasAEmpleado.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }
                                
                             
                             /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionGeneralMotosItalika param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionGeneralMotosItalika.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }
                                
                             
                             /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNueva param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNueva.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }
                                
                             
                             /* methods to provide back word compatibility */


    /**
     * get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }


    private java.lang.Object fromOM(
            org.apache.axiom.om.OMElement param,
            java.lang.Class type,
            java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {

        try {

            if (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraExperienciaItalikaRecibida.class.equals(type)) {

                return com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraExperienciaItalikaRecibida.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraExperienciaItalikaRecibidaResponse.class.equals(type)) {

                return com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraExperienciaItalikaRecibidaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerHistorialMotoItalika.class.equals(type)) {

                return com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerHistorialMotoItalika.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerHistorialMotoItalikaResponse.class.equals(type)) {

                return com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerHistorialMotoItalikaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionRemisionesMotosItalika.class.equals(type)) {

                return com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionRemisionesMotosItalika.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionRemisionesMotosItalikaResponse.class.equals(type)) {

                return com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionRemisionesMotosItalikaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraKilometrajeMoto.class.equals(type)) {

                return com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraKilometrajeMoto.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraKilometrajeMotoResponse.class.equals(type)) {

                return com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.RegistraKilometrajeMotoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerMotosAsignadasAEmpleado.class.equals(type)) {

                return com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerMotosAsignadasAEmpleado.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerMotosAsignadasAEmpleadoResponse.class.equals(type)) {

                return com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerMotosAsignadasAEmpleadoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionGeneralMotosItalika.class.equals(type)) {

                return com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionGeneralMotosItalika.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionGeneralMotosItalikaResponse.class.equals(type)) {

                return com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerInformacionGeneralMotosItalikaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNueva.class.equals(type)) {

                return com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNueva.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse.class.equals(type)) {

                return com.elektra.uniformes.wsitalika.WS_JSA_ITALIKAStub.ObtenerUltimaFechaAsignacionMotoItalikaNuevaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }


}
   