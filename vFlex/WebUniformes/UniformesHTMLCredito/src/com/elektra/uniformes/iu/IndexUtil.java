package com.elektra.uniformes.iu;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.util.Properties;


public class IndexUtil {
    private static final Logger log = Logger.getLogger(IndexUtil.class);

    private static final String CFG_PATH = System.getProperty("oracle.j2ee.home");
    private static String LLAVE;

    public Integer obtenerNumeroEmpleado(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String idEmpleado = request.getParameter("idEmpleado");
        if (idEmpleado == null) {
            response.sendError(400, "Se esperaba el parametro idEmpleado. Favor de verificar");
            return 0;
        }
        try {
            return desencriptarIdEmpleado(idEmpleado);
        } catch (Exception e) {
            log.error("Error al desencriptar el parametro idEmpleado", e);
            response.sendError(400, "Se presentó un error al desencriptar el parametro \"idEmpleado\". Favor de contactar a soporte técnico");
            return 0;
        }
    }

    private Integer desencriptarIdEmpleado(String idEmpleado) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance("TripleDES", "SunJCE");
        Key secretKey = obtenerLlave();
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] encriptado = Base64.decodeBase64(idEmpleado);
        byte[] desencriptado = cipher.doFinal(encriptado);
        String numEmpleado = new String(desencriptado);
        return Integer.parseInt(numEmpleado);
    }

    private SecretKey obtenerLlave() throws GeneralSecurityException {
        if (LLAVE == null) {
            inicializaLlave();
        }
        byte[] decodedKey = Base64.decodeBase64(LLAVE);
        DESedeKeySpec keySpec = new DESedeKeySpec(decodedKey);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("TripleDES");
        return keyFactory.generateSecret(keySpec);

    }

    private void inicializaLlave() {
        String archivoConfig = CFG_PATH + File.separator + "config" + File.separator + "WebUniformesCredito.properties";
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(archivoConfig);
            Properties properties = new Properties();
            properties.load(inputStream);
            LLAVE = properties.getProperty("LLAVE");
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
    }
}
