package com.elektra.uniformes.wsabasto;

import org.apache.axis2.AxisFault;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.rmi.RemoteException;

import static junit.framework.Assert.assertNotNull;

public class WsVtaMayoreoServiceTest {

    private static final Logger log = Logger.getLogger(WsVtaMayoreoServiceTest.class);

    IWsVtaMayoreoServiceStub stub;

    @Before
    public void setUp() throws AxisFault {
        String action = "/BusinessProcesses/intfWS_VTA_MAYOREO-service.serviceagent/intfwsWS_VTA_MAYOREOEndpoint3/WS__VTA__MAYOREOOp";
        String endPoint = "http://wsdes1.ad.elektra.com.mx:7068/BusinessProcesses/intfWS_VTA_MAYOREO-service.serviceagent/intfwsWS_VTA_MAYOREOEndpoint0";
        String qName = "http://xmlns.example.com/1404944964060";
        stub = new IntfWS_VTA_MAYOREOServiceStub(qName, endPoint, action);
    }

    @Test
    public void testWS__VTA__MAYOREOOp() {
        IntfWS_VTA_MAYOREOServiceStub.Parametros parametros = new IntfWS_VTA_MAYOREOServiceStub.Parametros();
        parametros.setTpo_Operacion(4);
        parametros.setPais(new BigDecimal("1"));
        parametros.setCanal(new BigDecimal("1"));
        parametros.setCd("");
        parametros.setStore_nbr("2244");
        parametros.setPedido(new BigDecimal("1"));
        parametros.setTipped("UNIFORMES");
        parametros.setFecentr(new BigDecimal(0));
        parametros.setNombre("");
        parametros.setApepcl("");
        parametros.setApemcl("");
        parametros.setEstado("");
        parametros.setDelegac("");
        parametros.setCp("");
        parametros.setColonia("");
        parametros.setCalle("");
        parametros.setNumero("");
        parametros.setNumerint("");
        parametros.setTelefono("");
        parametros.setTelcel("");
        parametros.setPedidoobs("");
        parametros.setLugentobs("");
        parametros.setAdicional1("555555");
        parametros.setAdicional2("");

        IntfWS_VTA_MAYOREOServiceStub.DETALLE_type0 DET = new IntfWS_VTA_MAYOREOServiceStub.DETALLE_type0();
        DET.setSkuequ("");
        DET.setPreuni("");
        DET.setTotventa("");
        DET.setDescuen("");
        DET.setFlete("");
        DET.setSku("0");
        DET.setQty("1");

        parametros.setDETALLE(new IntfWS_VTA_MAYOREOServiceStub.DETALLE_type0[]{DET});
        IntfWS_VTA_MAYOREOServiceStub.Parametro_Salida resp;
        try {
            resp = stub.wS__VTA__MAYOREOOp(parametros);
            assertNotNull(resp);
        } catch (RemoteException e) {
            log.error("Error al consumir el servicio wS__VTA__MAYOREOOp", e);
        }

    }
}
