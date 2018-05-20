package com.elektra.uniformes.wstienda;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class TiendaCryptTest {

    @Test
    public void testEncriptaLlaveWsTienda() {
        String key = TiendaCrypt.encriptaLlaveWsTienda("673", "10.54.28.114", "929671", "1");
        assertNotNull(key);
    }
}
