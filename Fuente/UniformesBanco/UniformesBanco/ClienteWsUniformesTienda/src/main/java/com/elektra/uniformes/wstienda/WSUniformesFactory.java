package com.elektra.uniformes.wstienda;

import org.apache.axis2.AxisFault;

public class WSUniformesFactory {
    public IWSUniformesStub createWsUniformesStub(String url) throws AxisFault, AxisFault {
        return new WSUniformesStub(url);
    }
}
