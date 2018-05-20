package com.elektra.uniformes.iu;


import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Properties;

import static org.junit.Assert.assertEquals;


public class IndexUtilTest {
    private static final Logger log = Logger.getLogger(IndexUtilTest.class);
    private static final String CFG_PATH = System.getProperty("oracle.j2ee.home");

    private IndexUtil util;

    @Before
    public void setUp() {
        util = new IndexUtil();
    }

    @Test
    public void testGeneraLlaveSecreta() throws GeneralSecurityException {
        KeyGenerator keyGen = KeyGenerator.getInstance("TripleDES");
        SecretKey secretKey = keyGen.generateKey();
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DESede");
        DESedeKeySpec keySpec = (DESedeKeySpec) keyFactory.getKeySpec(secretKey, DESedeKeySpec.class);
        byte[] raw = keySpec.getKey();
        String stringKey = Base64.encodeBase64String(raw);
        log.info("Llave generada: " + stringKey);
    }

    @Test
    public void testDesencriptarIdEmpleado() throws GeneralSecurityException, Base64DecodingException, IOException {
        String idEmpleado = "681235";
        String idEmpleadoEncriptado = encriptaIdEmpleado(idEmpleado);
        log.info("Empleado encriptado: " + idEmpleadoEncriptado);
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.addParameter("idEmpleado", idEmpleadoEncriptado);
        MockHttpServletResponse response = new MockHttpServletResponse();
        Integer idEmpleadoDesencriptado = util.obtenerNumeroEmpleado(request, response);
        assertEquals(idEmpleado, idEmpleadoDesencriptado.toString());
    }

    private String encriptaIdEmpleado(String idEmpleado) throws GeneralSecurityException, Base64DecodingException {
        Cipher cipher = Cipher.getInstance("TripleDES", "SunJCE");
        SecretKey secretKey = getSecretKey();
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encriptado = cipher.doFinal(idEmpleado.getBytes());
        return Base64.encodeBase64URLSafeString(encriptado);
    }

    private SecretKey getSecretKey() throws GeneralSecurityException, Base64DecodingException {
        byte[] decodedKey = Base64.decodeBase64(obtenerLlaveBase64());
        DESedeKeySpec keySpec = new DESedeKeySpec(decodedKey);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("TripleDES");
        return keyFactory.generateSecret(keySpec);
    }

    private String obtenerLlaveBase64() {
        Properties properties = new Properties();
        String archivoConfig = CFG_PATH + File.separator + "config" + File.separator + "WebUniformesCredito.properties";
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(archivoConfig);
            properties.load(inputStream);
        } catch (IOException e) {
            log.error("Error al obtener configuración del archivo " + archivoConfig, e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    log.error("Error al cerrar inputStream", e);
                }
            }
        }
        return properties.getProperty("LLAVE");
    }
}
