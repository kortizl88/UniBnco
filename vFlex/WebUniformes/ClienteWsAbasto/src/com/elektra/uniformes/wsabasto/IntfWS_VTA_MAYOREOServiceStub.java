/**
 * IntfWS_VTA_MAYOREOServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.elektra.uniformes.wsabasto;

        

        /*
        *  IntfWS_VTA_MAYOREOServiceStub java implementation
        */


import org.apache.axis2.AxisFault;

public class IntfWS_VTA_MAYOREOServiceStub extends org.apache.axis2.client.Stub implements IWsVtaMayoreoServiceStub {

    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();

    private static int counter = 0;
    private final String abastoVtaQname;
    private final String abastoVtaAction;

    public IntfWS_VTA_MAYOREOServiceStub(String abastoVtaQname, String targetEndpoint, String abastoVtaAction) throws AxisFault {
        this.abastoVtaQname = abastoVtaQname;
        this.abastoVtaAction = abastoVtaAction;
        populateAxisService();
        populateFaults();
        _serviceClient = new org.apache.axis2.client.ServiceClient(null, _service);
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(false);
    }

    private static synchronized String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }
        counter = counter + 1;
        return Long.toString(System.currentTimeMillis()) + "_" + counter;
    }


    private void populateAxisService() throws org.apache.axis2.AxisFault {

        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService("IntfWS_VTA_MAYOREOService" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[1];

        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName(abastoVtaQname, "wS__VTA__MAYOREOOp"));
        _service.addOperation(__operation);


        _operations[0] = __operation;


    }

    //populates the faults
    private void populateFaults() {


    }


    /**
     * Auto generated method signature
     *
     * @param parametros0
     */


    public com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida wS__VTA__MAYOREOOp(

            com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceStub.Parametros parametros0)


            throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions().setAction(abastoVtaAction);
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    parametros0,
                    optimizeContent(new javax.xml.namespace.QName(abastoVtaQname,
                            "wS__VTA__MAYOREOOp")), new javax.xml.namespace.QName(abastoVtaQname,
                            "wS__VTA__MAYOREOOp"));

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


            Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WS__VTA__MAYOREOOp"))) {
                    //make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WS__VTA__MAYOREOOp"));
                        Class exceptionClass = Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        Exception ex = (Exception) constructor.newInstance(f.getMessage());
                        //message class
                        String messageClassName = (String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WS__VTA__MAYOREOOp"));
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new Class[]{messageClass});
                        m.invoke(ex, new Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (InstantiationException e) {
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
     * @param parametros0
     */
    public void startwS__VTA__MAYOREOOp(

            com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceStub.Parametros parametros0,

            final com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
        _operationClient.getOptions().setAction(abastoVtaAction);
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                parametros0,
                optimizeContent(new javax.xml.namespace.QName(abastoVtaQname,
                        "wS__VTA__MAYOREOOp")), new javax.xml.namespace.QName(abastoVtaQname,
                        "wS__VTA__MAYOREOOp"));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultwS__VTA__MAYOREOOp(
                            (com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorwS__VTA__MAYOREOOp(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WS__VTA__MAYOREOOp"))) {
                            //make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WS__VTA__MAYOREOOp"));
                                Class exceptionClass = Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                Exception ex = (Exception) constructor.newInstance(f.getMessage());
                                //message class
                                String messageClassName = (String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WS__VTA__MAYOREOOp"));
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new Class[]{messageClass});
                                m.invoke(ex, new Object[]{messageObject});


                                callback.receiveErrorwS__VTA__MAYOREOOp(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorwS__VTA__MAYOREOOp(f);
                            } catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorwS__VTA__MAYOREOOp(f);
                            } catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorwS__VTA__MAYOREOOp(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorwS__VTA__MAYOREOOp(f);
                            } catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorwS__VTA__MAYOREOOp(f);
                            } catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorwS__VTA__MAYOREOOp(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorwS__VTA__MAYOREOOp(f);
                            }
                        } else {
                            callback.receiveErrorwS__VTA__MAYOREOOp(f);
                        }
                    } else {
                        callback.receiveErrorwS__VTA__MAYOREOOp(f);
                    }
                } else {
                    callback.receiveErrorwS__VTA__MAYOREOOp(error);
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
                    callback.receiveErrorwS__VTA__MAYOREOOp(axisFault);
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

    //http://ws.ad.elektra.com.mx:7068/BusinessProcesses/Systems/WSEvents/intfWS_VTA_MAYOREO-service.serviceagent/intfwsWS_VTA_MAYOREOEndpoint1
    public static class DETALLE_type0
            implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = DETALLE_type0
                Namespace URI = http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo
                Namespace Prefix = ns2
                */


        /**
         * field for Skuequ
         */


        protected String localSkuequ;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getSkuequ() {
            return localSkuequ;
        }


        /**
         * Auto generated setter method
         *
         * @param param Skuequ
         */
        public void setSkuequ(String param) {

            this.localSkuequ = param;


        }


        /**
         * field for Preuni
         */


        protected String localPreuni;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getPreuni() {
            return localPreuni;
        }


        /**
         * Auto generated setter method
         *
         * @param param Preuni
         */
        public void setPreuni(String param) {

            this.localPreuni = param;


        }


        /**
         * field for Totventa
         */


        protected String localTotventa;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getTotventa() {
            return localTotventa;
        }


        /**
         * Auto generated setter method
         *
         * @param param Totventa
         */
        public void setTotventa(String param) {

            this.localTotventa = param;


        }


        /**
         * field for Descuen
         */


        protected String localDescuen;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getDescuen() {
            return localDescuen;
        }


        /**
         * Auto generated setter method
         *
         * @param param Descuen
         */
        public void setDescuen(String param) {

            this.localDescuen = param;


        }


        /**
         * field for Flete
         */


        protected String localFlete;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getFlete() {
            return localFlete;
        }


        /**
         * Auto generated setter method
         *
         * @param param Flete
         */
        public void setFlete(String param) {

            this.localFlete = param;


        }


        /**
         * field for Sku
         */


        protected String localSku;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getSku() {
            return localSku;
        }


        /**
         * Auto generated setter method
         *
         * @param param Sku
         */
        public void setSku(String param) {

            this.localSku = param;


        }


        /**
         * field for Qty
         */


        protected String localQty;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getQty() {
            return localQty;
        }


        /**
         * Auto generated setter method
         *
         * @param param Qty
         */
        public void setQty(String param) {

            this.localQty = param;


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


            String prefix = null;
            String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                String namespacePrefix = registerPrefix(xmlWriter, "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":DETALLE_type0",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "DETALLE_type0",
                            xmlWriter);
                }


            }

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "skuequ", xmlWriter);


            if (localSkuequ == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("skuequ cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localSkuequ);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "preuni", xmlWriter);


            if (localPreuni == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("preuni cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localPreuni);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "totventa", xmlWriter);


            if (localTotventa == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("totventa cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTotventa);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "descuen", xmlWriter);


            if (localDescuen == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("descuen cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localDescuen);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "flete", xmlWriter);


            if (localFlete == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("flete cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localFlete);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "sku", xmlWriter);


            if (localSku == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("sku cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localSku);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "qty", xmlWriter);


            if (localQty == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("qty cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localQty);

            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();


        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo")) {
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
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
        private void writeAttribute(String prefix, String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
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
        private void writeQNameAttribute(String namespace, String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
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
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
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
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

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
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
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


            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "skuequ"));

            if (localSkuequ != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSkuequ));
            } else {
                throw new org.apache.axis2.databinding.ADBException("skuequ cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "preuni"));

            if (localPreuni != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreuni));
            } else {
                throw new org.apache.axis2.databinding.ADBException("preuni cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "totventa"));

            if (localTotventa != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotventa));
            } else {
                throw new org.apache.axis2.databinding.ADBException("totventa cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "descuen"));

            if (localDescuen != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescuen));
            } else {
                throw new org.apache.axis2.databinding.ADBException("descuen cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "flete"));

            if (localFlete != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFlete));
            } else {
                throw new org.apache.axis2.databinding.ADBException("flete cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "sku"));

            if (localSku != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSku));
            } else {
                throw new org.apache.axis2.databinding.ADBException("sku cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "qty"));

            if (localQty != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQty));
            } else {
                throw new org.apache.axis2.databinding.ADBException("qty cannot be null!!");
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
            public static DETALLE_type0 parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
                DETALLE_type0 object =
                        new DETALLE_type0();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"DETALLE_type0".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (DETALLE_type0) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "skuequ").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "skuequ" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setSkuequ(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "preuni").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "preuni" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setPreuni(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "totventa").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "totventa" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setTotventa(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "descuen").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "descuen" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setDescuen(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "flete").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "flete" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setFlete(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "sku").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "sku" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setSku(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "qty").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "qty" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setQty(
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
                    throw new Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class ExtensionMapper {

        public static Object getTypeObject(String namespaceURI,
                                           String typeName,
                                           javax.xml.stream.XMLStreamReader reader) throws Exception {


            if (
                    "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo".equals(namespaceURI) &&
                            "DETALLE_type0".equals(typeName)) {

                return DETALLE_type0.Factory.parse(reader);


            }


            throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
        }

    }

    public static class Parametro_Salida
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo",
                "Parametro_Salida",
                "ns1");


        /**
         * field for Estatus
         */


        protected java.math.BigDecimal localEstatus;


        /**
         * Auto generated getter method
         *
         * @return java.math.BigDecimal
         */
        public java.math.BigDecimal getEstatus() {
            return localEstatus;
        }


        /**
         * Auto generated setter method
         *
         * @param param Estatus
         */
        public void setEstatus(java.math.BigDecimal param) {

            this.localEstatus = param;


        }


        /**
         * field for Fecha
         */


        protected java.math.BigDecimal localFecha;


        /**
         * Auto generated getter method
         *
         * @return java.math.BigDecimal
         */
        public java.math.BigDecimal getFecha() {
            return localFecha;
        }


        /**
         * Auto generated setter method
         *
         * @param param Fecha
         */
        public void setFecha(java.math.BigDecimal param) {

            this.localFecha = param;


        }


        /**
         * field for Mensaje1
         */


        protected String localMensaje1;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getMensaje1() {
            return localMensaje1;
        }


        /**
         * Auto generated setter method
         *
         * @param param Mensaje1
         */
        public void setMensaje1(String param) {

            this.localMensaje1 = param;


        }


        /**
         * field for Mensaje2
         */


        protected String localMensaje2;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getMensaje2() {
            return localMensaje2;
        }


        /**
         * Auto generated setter method
         *
         * @param param Mensaje2
         */
        public void setMensaje2(String param) {

            this.localMensaje2 = param;


        }


        /**
         * field for Mensaje3
         */


        protected String localMensaje3;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getMensaje3() {
            return localMensaje3;
        }


        /**
         * Auto generated setter method
         *
         * @param param Mensaje3
         */
        public void setMensaje3(String param) {

            this.localMensaje3 = param;


        }


        /**
         * field for Mensaje4
         */


        protected String localMensaje4;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getMensaje4() {
            return localMensaje4;
        }


        /**
         * Auto generated setter method
         *
         * @param param Mensaje4
         */
        public void setMensaje4(String param) {

            this.localMensaje4 = param;


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


            String prefix = null;
            String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                String namespacePrefix = registerPrefix(xmlWriter, "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            namespacePrefix + ":Parametro_Salida",
                            xmlWriter);
                } else {
                    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                            "Parametro_Salida",
                            xmlWriter);
                }


            }

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo";
            writeStartElement(null, namespace, "Estatus", xmlWriter);


            if (localEstatus == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Estatus cannot be null!!");

            } else {


                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEstatus));

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo";
            writeStartElement(null, namespace, "Fecha", xmlWriter);


            if (localFecha == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Fecha cannot be null!!");

            } else {


                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFecha));

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo";
            writeStartElement(null, namespace, "Mensaje1", xmlWriter);


            if (localMensaje1 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Mensaje1 cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localMensaje1);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo";
            writeStartElement(null, namespace, "Mensaje2", xmlWriter);


            if (localMensaje2 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Mensaje2 cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localMensaje2);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo";
            writeStartElement(null, namespace, "Mensaje3", xmlWriter);


            if (localMensaje3 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Mensaje3 cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localMensaje3);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo";
            writeStartElement(null, namespace, "Mensaje4", xmlWriter);


            if (localMensaje4 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Mensaje4 cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localMensaje4);

            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();


        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo")) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
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
        private void writeAttribute(String prefix, String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
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
        private void writeQNameAttribute(String namespace, String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
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
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
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
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

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
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
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


            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo",
                    "Estatus"));

            if (localEstatus != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEstatus));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Estatus cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo",
                    "Fecha"));

            if (localFecha != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFecha));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Fecha cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo",
                    "Mensaje1"));

            if (localMensaje1 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMensaje1));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Mensaje1 cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo",
                    "Mensaje2"));

            if (localMensaje2 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMensaje2));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Mensaje2 cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo",
                    "Mensaje3"));

            if (localMensaje3 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMensaje3));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Mensaje3 cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo",
                    "Mensaje4"));

            if (localMensaje4 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMensaje4));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Mensaje4 cannot be null!!");
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
            public static Parametro_Salida parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
                Parametro_Salida object =
                        new Parametro_Salida();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"Parametro_Salida".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Parametro_Salida) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo", "Estatus").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Estatus" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setEstatus(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo", "Fecha").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Fecha" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setFecha(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo", "Mensaje1").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Mensaje1" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setMensaje1(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo", "Mensaje2").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Mensaje2" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setMensaje2(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo", "Mensaje3").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Mensaje3" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setMensaje3(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Sal_mayoreo", "Mensaje4").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Mensaje4" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setMensaje4(
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
                    throw new Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    public static class Parametros
            implements org.apache.axis2.databinding.ADBBean {

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                "Parametros",
                "ns2");


        /**
         * field for Tpo_Operacion
         */


        protected int localTpo_Operacion;


        /**
         * Auto generated getter method
         *
         * @return int
         */
        public int getTpo_Operacion() {
            return localTpo_Operacion;
        }


        /**
         * Auto generated setter method
         *
         * @param param Tpo_Operacion
         */
        public void setTpo_Operacion(int param) {

            this.localTpo_Operacion = param;


        }


        /**
         * field for Pais
         */


        protected java.math.BigDecimal localPais;


        /**
         * Auto generated getter method
         *
         * @return java.math.BigDecimal
         */
        public java.math.BigDecimal getPais() {
            return localPais;
        }


        /**
         * Auto generated setter method
         *
         * @param param Pais
         */
        public void setPais(java.math.BigDecimal param) {

            this.localPais = param;


        }


        /**
         * field for Canal
         */


        protected java.math.BigDecimal localCanal;


        /**
         * Auto generated getter method
         *
         * @return java.math.BigDecimal
         */
        public java.math.BigDecimal getCanal() {
            return localCanal;
        }


        /**
         * Auto generated setter method
         *
         * @param param Canal
         */
        public void setCanal(java.math.BigDecimal param) {

            this.localCanal = param;


        }


        /**
         * field for Cd
         */


        protected String localCd;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getCd() {
            return localCd;
        }


        /**
         * Auto generated setter method
         *
         * @param param Cd
         */
        public void setCd(String param) {

            this.localCd = param;


        }


        /**
         * field for Store_nbr
         */


        protected String localStore_nbr;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getStore_nbr() {
            return localStore_nbr;
        }


        /**
         * Auto generated setter method
         *
         * @param param Store_nbr
         */
        public void setStore_nbr(String param) {

            this.localStore_nbr = param;


        }


        /**
         * field for Pedido
         */


        protected java.math.BigDecimal localPedido;


        /**
         * Auto generated getter method
         *
         * @return java.math.BigDecimal
         */
        public java.math.BigDecimal getPedido() {
            return localPedido;
        }


        /**
         * Auto generated setter method
         *
         * @param param Pedido
         */
        public void setPedido(java.math.BigDecimal param) {

            this.localPedido = param;


        }


        /**
         * field for Tipped
         */


        protected String localTipped;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getTipped() {
            return localTipped;
        }


        /**
         * Auto generated setter method
         *
         * @param param Tipped
         */
        public void setTipped(String param) {

            this.localTipped = param;


        }


        /**
         * field for Fecentr
         */


        protected java.math.BigDecimal localFecentr;


        /**
         * Auto generated getter method
         *
         * @return java.math.BigDecimal
         */
        public java.math.BigDecimal getFecentr() {
            return localFecentr;
        }


        /**
         * Auto generated setter method
         *
         * @param param Fecentr
         */
        public void setFecentr(java.math.BigDecimal param) {

            this.localFecentr = param;


        }


        /**
         * field for Nombre
         */


        protected String localNombre;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getNombre() {
            return localNombre;
        }


        /**
         * Auto generated setter method
         *
         * @param param Nombre
         */
        public void setNombre(String param) {

            this.localNombre = param;


        }


        /**
         * field for Apepcl
         */


        protected String localApepcl;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getApepcl() {
            return localApepcl;
        }


        /**
         * Auto generated setter method
         *
         * @param param Apepcl
         */
        public void setApepcl(String param) {

            this.localApepcl = param;


        }


        /**
         * field for Apemcl
         */


        protected String localApemcl;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getApemcl() {
            return localApemcl;
        }


        /**
         * Auto generated setter method
         *
         * @param param Apemcl
         */
        public void setApemcl(String param) {

            this.localApemcl = param;


        }


        /**
         * field for Estado
         */


        protected String localEstado;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getEstado() {
            return localEstado;
        }


        /**
         * Auto generated setter method
         *
         * @param param Estado
         */
        public void setEstado(String param) {

            this.localEstado = param;


        }


        /**
         * field for Delegac
         */


        protected String localDelegac;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getDelegac() {
            return localDelegac;
        }


        /**
         * Auto generated setter method
         *
         * @param param Delegac
         */
        public void setDelegac(String param) {

            this.localDelegac = param;


        }


        /**
         * field for Cp
         */


        protected String localCp;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getCp() {
            return localCp;
        }


        /**
         * Auto generated setter method
         *
         * @param param Cp
         */
        public void setCp(String param) {

            this.localCp = param;


        }


        /**
         * field for Colonia
         */


        protected String localColonia;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getColonia() {
            return localColonia;
        }


        /**
         * Auto generated setter method
         *
         * @param param Colonia
         */
        public void setColonia(String param) {

            this.localColonia = param;


        }


        /**
         * field for Calle
         */


        protected String localCalle;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getCalle() {
            return localCalle;
        }


        /**
         * Auto generated setter method
         *
         * @param param Calle
         */
        public void setCalle(String param) {

            this.localCalle = param;


        }


        /**
         * field for Numero
         */


        protected String localNumero;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getNumero() {
            return localNumero;
        }


        /**
         * Auto generated setter method
         *
         * @param param Numero
         */
        public void setNumero(String param) {

            this.localNumero = param;


        }


        /**
         * field for Numerint
         */


        protected String localNumerint;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getNumerint() {
            return localNumerint;
        }


        /**
         * Auto generated setter method
         *
         * @param param Numerint
         */
        public void setNumerint(String param) {

            this.localNumerint = param;


        }


        /**
         * field for Telefono
         */


        protected String localTelefono;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getTelefono() {
            return localTelefono;
        }


        /**
         * Auto generated setter method
         *
         * @param param Telefono
         */
        public void setTelefono(String param) {

            this.localTelefono = param;


        }


        /**
         * field for Telcel
         */


        protected String localTelcel;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getTelcel() {
            return localTelcel;
        }


        /**
         * Auto generated setter method
         *
         * @param param Telcel
         */
        public void setTelcel(String param) {

            this.localTelcel = param;


        }


        /**
         * field for Pedidoobs
         */


        protected String localPedidoobs;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getPedidoobs() {
            return localPedidoobs;
        }


        /**
         * Auto generated setter method
         *
         * @param param Pedidoobs
         */
        public void setPedidoobs(String param) {

            this.localPedidoobs = param;


        }


        /**
         * field for Lugentobs
         */


        protected String localLugentobs;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getLugentobs() {
            return localLugentobs;
        }


        /**
         * Auto generated setter method
         *
         * @param param Lugentobs
         */
        public void setLugentobs(String param) {

            this.localLugentobs = param;


        }


        /**
         * field for Adicional1
         */


        protected String localAdicional1;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getAdicional1() {
            return localAdicional1;
        }


        /**
         * Auto generated setter method
         *
         * @param param Adicional1
         */
        public void setAdicional1(String param) {

            this.localAdicional1 = param;


        }


        /**
         * field for Adicional2
         */


        protected String localAdicional2;


        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public String getAdicional2() {
            return localAdicional2;
        }


        /**
         * Auto generated setter method
         *
         * @param param Adicional2
         */
        public void setAdicional2(String param) {

            this.localAdicional2 = param;


        }


        /**
         * field for DETALLE
         * This was an Array!
         */


        protected DETALLE_type0[] localDETALLE;


        /**
         * Auto generated getter method
         *
         * @return DETALLE_type0[]
         */
        public DETALLE_type0[] getDETALLE() {
            return localDETALLE;
        }


        /**
         * validate the array for DETALLE
         */
        protected void validateDETALLE(DETALLE_type0[] param) {

            if ((param != null) && (param.length < 1)) {
                throw new RuntimeException();
            }

        }


        /**
         * Auto generated setter method
         *
         * @param param DETALLE
         */
        public void setDETALLE(DETALLE_type0[] param) {

            validateDETALLE(param);


            this.localDETALLE = param;
        }


        /**
         * Auto generated add method for the array for convenience
         *
         * @param param DETALLE_type0
         */
        public void addDETALLE(DETALLE_type0 param) {
            if (localDETALLE == null) {
                localDETALLE = new DETALLE_type0[]{};
            }


            java.util.List list =
                    org.apache.axis2.databinding.utils.ConverterUtil.toList(localDETALLE);
            list.add(param);
            this.localDETALLE =
                    (DETALLE_type0[]) list.toArray(
                            new DETALLE_type0[list.size()]);

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


            String prefix = null;
            String namespace = null;


            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

            if (serializeType) {


                String namespacePrefix = registerPrefix(xmlWriter, "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo");
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

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Tpo_Operacion", xmlWriter);

            if (localTpo_Operacion == Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("Tpo_Operacion cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTpo_Operacion));
            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Pais", xmlWriter);


            if (localPais == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Pais cannot be null!!");

            } else {


                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPais));

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Canal", xmlWriter);


            if (localCanal == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Canal cannot be null!!");

            } else {


                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCanal));

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "cd", xmlWriter);


            if (localCd == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("cd cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localCd);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Store_nbr", xmlWriter);


            if (localStore_nbr == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Store_nbr cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localStore_nbr);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Pedido", xmlWriter);


            if (localPedido == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Pedido cannot be null!!");

            } else {


                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPedido));

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Tipped", xmlWriter);


            if (localTipped == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Tipped cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTipped);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Fecentr", xmlWriter);


            if (localFecentr == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Fecentr cannot be null!!");

            } else {


                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFecentr));

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Nombre", xmlWriter);


            if (localNombre == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Nombre cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNombre);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Apepcl", xmlWriter);


            if (localApepcl == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Apepcl cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localApepcl);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Apemcl", xmlWriter);


            if (localApemcl == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Apemcl cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localApemcl);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Estado", xmlWriter);


            if (localEstado == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Estado cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEstado);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Delegac", xmlWriter);


            if (localDelegac == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Delegac cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localDelegac);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Cp", xmlWriter);


            if (localCp == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Cp cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localCp);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Colonia", xmlWriter);


            if (localColonia == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Colonia cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localColonia);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Calle", xmlWriter);


            if (localCalle == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Calle cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localCalle);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Numero", xmlWriter);


            if (localNumero == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Numero cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNumero);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Numerint", xmlWriter);


            if (localNumerint == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Numerint cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNumerint);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Telefono", xmlWriter);


            if (localTelefono == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Telefono cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelefono);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Telcel", xmlWriter);


            if (localTelcel == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Telcel cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelcel);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "pedidoobs", xmlWriter);


            if (localPedidoobs == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("pedidoobs cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localPedidoobs);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "lugentobs", xmlWriter);


            if (localLugentobs == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("lugentobs cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localLugentobs);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Adicional1", xmlWriter);


            if (localAdicional1 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Adicional1 cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localAdicional1);

            }

            xmlWriter.writeEndElement();

            namespace = "http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo";
            writeStartElement(null, namespace, "Adicional2", xmlWriter);


            if (localAdicional2 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Adicional2 cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localAdicional2);

            }

            xmlWriter.writeEndElement();

            if (localDETALLE != null) {
                for (int i = 0; i < localDETALLE.length; i++) {
                    if (localDETALLE[i] != null) {
                        localDETALLE[i].serialize(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "DETALLE"),
                                xmlWriter);
                    } else {

                        throw new org.apache.axis2.databinding.ADBException("DETALLE cannot be null!!");

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("DETALLE cannot be null!!");

            }

            xmlWriter.writeEndElement();


        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo")) {
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
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
        private void writeAttribute(String prefix, String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
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
        private void writeQNameAttribute(String namespace, String attName,
                                         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            String attributeNamespace = qname.getNamespaceURI();
            String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }
            String attributeValue;
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
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
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
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

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
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
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


            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Tpo_Operacion"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTpo_Operacion));

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Pais"));

            if (localPais != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPais));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Pais cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Canal"));

            if (localCanal != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCanal));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Canal cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "cd"));

            if (localCd != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCd));
            } else {
                throw new org.apache.axis2.databinding.ADBException("cd cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Store_nbr"));

            if (localStore_nbr != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStore_nbr));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Store_nbr cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Pedido"));

            if (localPedido != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPedido));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Pedido cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Tipped"));

            if (localTipped != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipped));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Tipped cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Fecentr"));

            if (localFecentr != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFecentr));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Fecentr cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Nombre"));

            if (localNombre != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNombre));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Nombre cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Apepcl"));

            if (localApepcl != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localApepcl));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Apepcl cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Apemcl"));

            if (localApemcl != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localApemcl));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Apemcl cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Estado"));

            if (localEstado != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEstado));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Estado cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Delegac"));

            if (localDelegac != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDelegac));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Delegac cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Cp"));

            if (localCp != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCp));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Cp cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Colonia"));

            if (localColonia != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localColonia));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Colonia cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Calle"));

            if (localCalle != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCalle));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Calle cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Numero"));

            if (localNumero != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumero));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Numero cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Numerint"));

            if (localNumerint != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumerint));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Numerint cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Telefono"));

            if (localTelefono != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefono));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Telefono cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Telcel"));

            if (localTelcel != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelcel));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Telcel cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "pedidoobs"));

            if (localPedidoobs != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPedidoobs));
            } else {
                throw new org.apache.axis2.databinding.ADBException("pedidoobs cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "lugentobs"));

            if (localLugentobs != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLugentobs));
            } else {
                throw new org.apache.axis2.databinding.ADBException("lugentobs cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Adicional1"));

            if (localAdicional1 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdicional1));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Adicional1 cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                    "Adicional2"));

            if (localAdicional2 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdicional2));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Adicional2 cannot be null!!");
            }

            if (localDETALLE != null) {
                for (int i = 0; i < localDETALLE.length; i++) {

                    if (localDETALLE[i] != null) {
                        elementList.add(new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo",
                                "DETALLE"));
                        elementList.add(localDETALLE[i]);
                    } else {

                        throw new org.apache.axis2.databinding.ADBException("DETALLE cannot be null !!");

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("DETALLE cannot be null!!");

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
            public static Parametros parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
                Parametros object =
                        new Parametros();

                int event;
                String nillableValue = null;
                String prefix = "";
                String namespaceuri = "";
                try {

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();


                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");
                        if (fullTypeName != null) {
                            String nsPrefix = null;
                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;

                            String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                            if (!"Parametros".equals(type)) {
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Parametros) ExtensionMapper.getTypeObject(
                                        nsUri, type, reader);
                            }


                        }


                    }


                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();


                    reader.next();

                    java.util.ArrayList list25 = new java.util.ArrayList();


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Tpo_Operacion").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Tpo_Operacion" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setTpo_Operacion(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Pais").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Pais" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setPais(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Canal").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Canal" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setCanal(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "cd").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "cd" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setCd(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Store_nbr").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Store_nbr" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setStore_nbr(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Pedido").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Pedido" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setPedido(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Tipped").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Tipped" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setTipped(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Fecentr").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Fecentr" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setFecentr(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Nombre").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Nombre" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setNombre(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Apepcl").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Apepcl" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setApepcl(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Apemcl").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Apemcl" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setApemcl(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Estado").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Estado" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setEstado(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Delegac").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Delegac" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setDelegac(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Cp").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Cp" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setCp(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Colonia").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Colonia" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setColonia(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Calle").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Calle" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setCalle(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Numero").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Numero" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setNumero(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Numerint").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Numerint" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setNumerint(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Telefono").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Telefono" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setTelefono(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Telcel").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Telcel" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setTelcel(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "pedidoobs").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "pedidoobs" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setPedidoobs(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "lugentobs").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "lugentobs" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setLugentobs(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Adicional1").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Adicional1" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setAdicional1(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "Adicional2").equals(reader.getName())) {

                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "Adicional2" + "  cannot be null");
                        }


                        String content = reader.getElementText();

                        object.setAdicional2(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                        reader.next();

                    }  // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }


                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "DETALLE").equals(reader.getName())) {


                        // Process the array and step past its final element's end.
                        list25.add(DETALLE_type0.Factory.parse(reader));

                        //loop until we find a start element that is not part of this array
                        boolean loopDone25 = false;
                        while (!loopDone25) {
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
                                loopDone25 = true;
                            } else {
                                if (new javax.xml.namespace.QName("http://esquemas.elektra.com.mx/ekt/1.0/Esq_Entr_mayoreo", "DETALLE").equals(reader.getName())) {
                                    list25.add(DETALLE_type0.Factory.parse(reader));

                                } else {
                                    loopDone25 = true;
                                }
                            }
                        }
                        // call the converter utility  to convert and set the array

                        object.setDETALLE((DETALLE_type0[])
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                        DETALLE_type0.class,
                                        list25));

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
                    throw new Exception(e);
                }

                return object;
            }

        }//end of factory class


    }


    private org.apache.axiom.om.OMElement toOM(com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceStub.Parametros param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceStub.Parametros.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceStub.Parametros param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceStub.Parametros.MY_QNAME, factory));
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


    private Object fromOM(
            org.apache.axiom.om.OMElement param,
            Class type,
            java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {

        try {

            if (com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceStub.Parametros.class.equals(type)) {

                return com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceStub.Parametros.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida.class.equals(type)) {

                return com.elektra.uniformes.wsabasto.IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

        } catch (Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }


}
   