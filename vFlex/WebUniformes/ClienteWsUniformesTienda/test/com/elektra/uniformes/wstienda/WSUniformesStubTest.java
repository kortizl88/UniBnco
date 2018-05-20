package com.elektra.uniformes.wstienda;

import org.apache.axis2.AxisFault;
import org.junit.Before;
import org.junit.Test;

import java.rmi.RemoteException;

import static junit.framework.Assert.assertNotNull;

public class WSUniformesStubTest {

    IWSUniformesStub stub;

    @Test
    public void testGeneraPedido() throws RemoteException {
        WSUniformesStub.GeneraPedido pedido = new WSUniformesStub.GeneraPedido();
        WSUniformesStub.ReciveDatos param = new WSUniformesStub.ReciveDatos();
        pedido.setRecive(param);
        WSUniformesStub.GeneraPedidoResponse result = stub.generaPedido(pedido);
        assertNotNull(result);
    }


    @Before
    public void setUp() throws AxisFault {
        stub = new WSUniformesStub("http://10.54.28.114/WebServicioTienda/Elektra.Servicios.Datos.AdmonUniformes.WSUniformes.svc");
    }

}
