
/**
 * IntfPED_CENT_CANCELAServiceStub.java
 * <p/>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.elektra.uniformes.wscancela;

        

        /*
        *  IntfPED_CENT_CANCELAServiceStub java implementation
        */


public class IntfPED_CENT_CANCELAServiceStub extends org.apache.axis2.client.Stub {
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
        _service = new org.apache.axis2.description.AxisService("IntfPED_CENT_CANCELAService" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[1];

        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://servicios.elektra.com.mx/ekt/1.0/ws_ped_cent_canela", "pED__CENT__CANCELAOp"));
        _service.addOperation(__operation);


        _operations[0] = __operation;


    }

    //populates the faults
    private void populateFaults() {


    }

    /**
     *Constructor that takes in a configContext
     */

    public IntfPED_CENT_CANCELAServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
                                           java.lang.String targetEndpoint)
            throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }


    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public IntfPED_CENT_CANCELAServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
                                           java.lang.String targetEndpoint, boolean useSeparateListener)
            throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);


        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);


    }

    /**
     * Default Constructor
     */
    public IntfPED_CENT_CANCELAServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {

        this(configurationContext, "http://ws.ad.elektra.com.mx:7062/BusinessProcesses/Systems/WSEvents/intfPED_CENT_CANCELA-service.serviceagent/intfwsPED_CENT_CANCELAEndpoint0");

    }

    /**
     * Default Constructor
     */
    public IntfPED_CENT_CANCELAServiceStub() throws org.apache.axis2.AxisFault {

        this("http://ws.ad.elektra.com.mx:7062/BusinessProcesses/Systems/WSEvents/intfPED_CENT_CANCELA-service.serviceagent/intfwsPED_CENT_CANCELAEndpoint0");

    }

    /**
     * Constructor taking the target endpoint
     */
    public IntfPED_CENT_CANCELAServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }


    /**
     * Auto generated method signature
     *
     * @see com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAService#pED__CENT__CANCELAOp
     * @param parametros_Entrada0

     */


    public com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros pED__CENT__CANCELAOp(

            com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros_Entrada parametros_Entrada0)


            throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions().setAction("/BusinessProcesses/Systems/WSEvents/intfPED_CENT_CANCELA-service.serviceagent/intfwsPED_CENT_CANCELAEndpoint0/PED__CENT__CANCELAOp");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    parametros_Entrada0,
                    optimizeContent(new javax.xml.namespace.QName("http://servicios.elektra.com.mx/ekt/1.0/ws_ped_cent_canela",
                            "pED__CENT__CANCELAOp")), new javax.xml.namespace.QName("http://servicios.elektra.com.mx/ekt/1.0/ws_ped_cent_canela",
                            "pED__CENT__CANCELAOp"));

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
                    com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "PED__CENT__CANCELAOp"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "PED__CENT__CANCELAOp"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "PED__CENT__CANCELAOp"));
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
     * @see com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAService#startpED__CENT__CANCELAOp
     * @param parametros_Entrada0

     */
    public void startpED__CENT__CANCELAOp(

            com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros_Entrada parametros_Entrada0,

            final com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
        _operationClient.getOptions().setAction("/BusinessProcesses/Systems/WSEvents/intfPED_CENT_CANCELA-service.serviceagent/intfwsPED_CENT_CANCELAEndpoint0/PED__CENT__CANCELAOp");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                parametros_Entrada0,
                optimizeContent(new javax.xml.namespace.QName("http://servicios.elektra.com.mx/ekt/1.0/ws_ped_cent_canela",
                        "pED__CENT__CANCELAOp")), new javax.xml.namespace.QName("http://servicios.elektra.com.mx/ekt/1.0/ws_ped_cent_canela",
                        "pED__CENT__CANCELAOp"));

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
                            com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultpED__CENT__CANCELAOp(
                            (com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorpED__CENT__CANCELAOp(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "PED__CENT__CANCELAOp"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "PED__CENT__CANCELAOp"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "PED__CENT__CANCELAOp"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});


                                callback.receiveErrorpED__CENT__CANCELAOp(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorpED__CENT__CANCELAOp(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorpED__CENT__CANCELAOp(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorpED__CENT__CANCELAOp(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorpED__CENT__CANCELAOp(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorpED__CENT__CANCELAOp(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorpED__CENT__CANCELAOp(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorpED__CENT__CANCELAOp(f);
                            }
                        } else {
                            callback.receiveErrorpED__CENT__CANCELAOp(f);
                        }
                    } else {
                        callback.receiveErrorpED__CENT__CANCELAOp(f);
                    }
                } else {
                    callback.receiveErrorpED__CENT__CANCELAOp(error);
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
                    callback.receiveErrorpED__CENT__CANCELAOp(axisFault);
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
     *  A utility method that copies the namepaces from the SOAPEnvelope
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

    //http://ws.ad.elektra.com.mx:7062/BusinessProcesses/Systems/WSEvents/intfPED_CENT_CANCELA-service.serviceagent/intfwsPED_CENT_CANCELAEndpoint0
    public static class Parametros_Entrada
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_Ped_Cent_Cancel",
                "Parametros_Entrada",
                "ns1");


        /**
         * field for Pais
         */


        protected int localPais;


        /**
         * Auto generated getter method
         * @return int
         */
        public int getPais() {
            return localPais;
        }


        /**
         * Auto generated setter method
         * @param param Pais
         */
        public void setPais(int param) {

            this.localPais = param;


        }


        /**
         * field for Canal
         */


        protected int localCanal;


        /**
         * Auto generated getter method
         * @return int
         */
        public int getCanal() {
            return localCanal;
        }


        /**
         * Auto generated setter method
         * @param param Canal
         */
        public void setCanal(int param) {

            this.localCanal = param;


        }


        /**
         * field for Tienda
         */


        protected java.lang.String localTienda;


        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTienda() {
            return localTienda;
        }


        /**
         * Auto generated setter method
         * @param param Tienda
         */
        public void setTienda(java.lang.String param) {

            this.localTienda = param;


        }


        /**
         * field for Pedido
         */


        protected int localPedido;


        /**
         * Auto generated getter method
         * @return int
         */
        public int getPedido() {
            return localPedido;
        }


        /**
         * Auto generated setter method
         * @param param Pedido
         */
        public void setPedido(int param) {

            this.localPedido = param;


        }


        /**
         *
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


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_Ped_Cent_Cancel");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":Parametros_Entrada",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "Parametros_Entrada",
                            xmlWriter);
                }


            }

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_Ped_Cent_Cancel";
            writeStartElement(null, namespace, "Pais", xmlWriter);

            if (localPais == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("Pais cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPais));
            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_Ped_Cent_Cancel";
            writeStartElement(null, namespace, "Canal", xmlWriter);

            if (localCanal == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("Canal cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCanal));
            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_Ped_Cent_Cancel";
            writeStartElement(null, namespace, "Tienda", xmlWriter);


            if (localTienda == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Tienda cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTienda);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_Ped_Cent_Cancel";
            writeStartElement(null, namespace, "Pedido", xmlWriter);

            if (localPedido == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("Pedido cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPedido));
            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_Ped_Cent_Cancel")) {
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
         *  method to handle Qnames
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
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_Ped_Cent_Cancel",
                    "Pais"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPais));

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_Ped_Cent_Cancel",
                    "Canal"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCanal));

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_Ped_Cent_Cancel",
                    "Tienda"));

            if (localTienda != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTienda));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Tienda cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_Ped_Cent_Cancel",
                    "Pedido"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPedido));


            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static Parametros_Entrada parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                Parametros_Entrada object =
                        new Parametros_Entrada();

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

                            if (!"Parametros_Entrada".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Parametros_Entrada) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_Ped_Cent_Cancel", "Pais").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Pais" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setPais(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_Ped_Cent_Cancel", "Canal").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Canal" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setCanal(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_Ped_Cent_Cancel", "Tienda").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Tienda" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setTienda(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_Ped_Cent_Cancel", "Pedido").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Pedido" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setPedido(
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


    public static class Parametros
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Salid_Ped_Cent_Cancel",
                "Parametros",
                "ns2");


        /**
         * field for ESTATUS
         */


        protected java.math.BigDecimal localESTATUS;


        /**
         * Auto generated getter method
         * @return java.math.BigDecimal
         */
        public java.math.BigDecimal getESTATUS() {
            return localESTATUS;
        }


        /**
         * Auto generated setter method
         * @param param ESTATUS
         */
        public void setESTATUS(java.math.BigDecimal param) {

            this.localESTATUS = param;


        }


        /**
         * field for MSG
         */


        protected java.lang.String localMSG;


        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getMSG() {
            return localMSG;
        }


        /**
         * Auto generated setter method
         * @param param MSG
         */
        public void setMSG(java.lang.String param) {

            this.localMSG = param;


        }


        /**
         *
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


                java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Salid_Ped_Cent_Cancel");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":Parametros",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "Parametros",
                            xmlWriter);
                }


            }

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Salid_Ped_Cent_Cancel";
            writeStartElement(null, namespace, "ESTATUS", xmlWriter);


            if (localESTATUS == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ESTATUS cannot be null!!");

            } else {


                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localESTATUS));

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Salid_Ped_Cent_Cancel";
            writeStartElement(null, namespace, "MSG", xmlWriter);


            if (localMSG == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("MSG cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localMSG);

            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();


        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Salid_Ped_Cent_Cancel")) {
                return "ns2";
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
         *  method to handle Qnames
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
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                throws org.apache.axis2.databinding.ADBException {


            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();


            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Salid_Ped_Cent_Cancel",
                    "ESTATUS"));

            if (localESTATUS != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localESTATUS));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ESTATUS cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Salid_Ped_Cent_Cancel",
                    "MSG"));

            if (localMSG != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMSG));
            } else {
                throw new org.apache.axis2.databinding.ADBException("MSG cannot be null!!");
            }


            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


        }


        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {


            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static Parametros parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                Parametros object =
                        new Parametros();

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

                            if (!"Parametros".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Parametros) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Salid_Ped_Cent_Cancel", "ESTATUS").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "ESTATUS" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setESTATUS(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Salid_Ped_Cent_Cancel", "MSG").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "MSG" + "  cannot be null");
                        }


                        java.lang.String content = reader.getElementText();

                        object.setMSG(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

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


    public static class ExtensionMapper {

        public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                     java.lang.String typeName,
                                                     javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {


            throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
        }

    }

    private org.apache.axiom.om.OMElement toOM(com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros_Entrada param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros_Entrada.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros_Entrada param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros_Entrada.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }
                                
                             
                             /* methods to provide back word compatibility */


    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }


    private java.lang.Object fromOM(
            org.apache.axiom.om.OMElement param,
            java.lang.Class type,
            java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {

        try {

            if (com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros_Entrada.class.equals(type)) {

                return com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros_Entrada.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros.class.equals(type)) {

                return com.elektra.uniformes.wscancela.IntfPED_CENT_CANCELAServiceStub.Parametros.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }


}
   