package com.gsalinas.uniformes.crypt;

import org.apache.log4j.Logger;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.engines.RSAEngine;
import org.bouncycastle.crypto.generators.RSAKeyPairGenerator;
import org.bouncycastle.crypto.params.RSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.util.encoders.Base64;
import org.jdom.Document;
import org.jdom.input.SAXBuilder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Created by othoniel on 1/28/14.
 */
public class CryptProcs {
    private static final Logger log = Logger.getLogger(CryptProcs.class);
    private RSAPrivateCrtKeyParameters _privateKey;
    private BigInteger _modulus, _publicExponent, _privateExponent, _p, _q, _dP, _dQ, _qInv;
    private RSAKeyParameters _publicKey;

    private String pbKey;
    private String prKey;

    public CryptProcs() {
        try {
            setPrivateKey("<RSAKeyValue><Modulus>ANNp1K32JzKyxIXB0HOc1UcOYfLrG8+NvAWWnZr88RgDNiKltUjgblaZ1iZuQ8deBcrDJg1e2RDRdKhfbhCjhbOi3z5MpL2Ymv/LT+Quh8bu7YWQqqzEw9RPvXQO6dmr1Fv7zpGpgRItBsH4f56NEeDqk9ZhtvFO42o3lJdUQcZJ</Modulus><Exponent>AQAB</Exponent><P>AOr2e97lWpjLhVxOqFJ3BnLHZ1kMGQpQ113pdq/6L5zCaSEtrnUsgw44sFNXZfwesqG5/y/Rv+gZ9pHZo82o0K0=</P><Q>AOZXk8QxkuxsxXfzEV1tgupUYRQKFwf9Mrb5zZNqcrDo1y6T07EVUdYcmjUrh7jxCmb9myERPP4Sfq14pXkyE40=</Q><DP>U8Hd0k0sCH+0YH1hn1PypoPSoXmgi37Z5w5MUtr6kgTzePJR2E8vwKgQowTqw/8lamVlRGSe5lwq+z78F1nwWQ==</DP><DQ>B0+AQRnRr+9D1SrBwlVXclh7PEeVs4s1sNj8zVDzkunQ6omGjng+wKznuAhJpnT//4TNB5+kb+vmWVsa5V3RgQ==</DQ><InverseQ>AK/qqQ9n006OgGwf5VAHQYWEiaGcZptGi+UrVUe5jLDy7ZiNAVVgggET5+hDSgyKcN1E2xwq86DqC6X8bKnXxkc=</InverseQ><D>cn+wxf64wAZ91QthAByCjhdGCTA4QbK7kDNAbH5tfNnQafdhNXUHjTOH/gxd/Q35CRWj+D3URf2Ktt3oWG6Xq/SaMrF1sqmtHeFn9K/dbS0acNtiQh7NGJfDL3uETLZcgTYvZKVqjKBgLRWjv4tdrV1Xz9g1UvubixUho/AyNmE=</D></RSAKeyValue>");
        } catch (Exception e) {
            log.error("Error:", e);
        }
    }

    public String generateKey(int nsize) {
        RSAKeyPairGenerator kp = new RSAKeyPairGenerator();

        kp.init(new RSAKeyGenerationParameters(BigInteger.valueOf(0x10001), new SecureRandom(), nsize, 80));

        AsymmetricCipherKeyPair keys = kp.generateKeyPair();

        _publicKey = (RSAKeyParameters) keys.getPublic();

        String modulus, publicExponent, privateExponent, p, q, dP, dQ, qInv, pKey;

        modulus = new String(Base64.encode(_publicKey.getModulus().toByteArray()));
        publicExponent = new String(Base64.encode(_publicKey.getExponent().toByteArray()));

        pKey = "<RSAKeyValue><Modulus>" + modulus + "</Modulus>" + "<Exponent>" + publicExponent + "</Exponent></RSAKeyValue>";

        pbKey = pKey;

        RSAPrivateCrtKeyParameters privateKey = (RSAPrivateCrtKeyParameters) keys.getPrivate();

        modulus = new String(Base64.encode(privateKey.getModulus().toByteArray()));
        publicExponent = new String(Base64.encode(privateKey.getPublicExponent().toByteArray()));
        privateExponent = new String(Base64.encode(privateKey.getExponent().toByteArray()));
        p = new String(Base64.encode(privateKey.getP().toByteArray()));
        q = new String(Base64.encode(privateKey.getQ().toByteArray()));
        dP = new String(Base64.encode(privateKey.getDP().toByteArray()));
        dQ = new String(Base64.encode(privateKey.getDQ().toByteArray()));
        qInv = new String(Base64.encode(privateKey.getQInv().toByteArray()));

        pKey = "<RSAKeyValue><Modulus>" + modulus + "</Modulus>" +
                "<Exponent>" + publicExponent + "</Exponent>" +
                "<P>" + p + "</P><Q>" + q + "</Q><DP>" + dP + "</DP>" +
                "<DQ>" + dQ + "</DQ><InverseQ>" + qInv + "</InverseQ><D>" + privateExponent + "</D></RSAKeyValue>";

        prKey = pKey;

        return pKey;
    }

    public String encrypt(String _in) throws Exception {
        AsymmetricBlockCipher c = new RSAEngine();

        c.init(true, _publicKey);

        byte[] data = _in.getBytes("UTF-8");

        return new String(Base64.encode(c.processBlock(data, 0, data.length)));
    }

    public String decrypt(String _in) throws Exception {
        AsymmetricBlockCipher c = new RSAEngine();

        c.init(false, _privateKey);

        byte[] data = Base64.decode(_in), dout;

        int l = c.getOutputBlockSize() + 1, p = 0;
        ByteArrayOutputStream r = new ByteArrayOutputStream();

        while (p < data.length) {
            dout = c.processBlock(data, p, l);
            p += l;
            r.write(dout);
        }

        data = r.toByteArray();

        return new String(data);
    }

    public String decryptNOBlock(String _in) throws Exception {
        AsymmetricBlockCipher c = new RSAEngine();

        c.init(false, _privateKey);

        byte[] data = Base64.decode(new String(_in.getBytes("UTF-8"))), dout;

        dout = c.processBlock(data, 0, data.length);

        return new String(dout);
    }

    public void setPublicKey(String _skey) throws Exception {
        SAXBuilder builder = new SAXBuilder(false);
        Document xmlKey = builder.build(new ByteArrayInputStream(_skey.getBytes("UTF-8")));

        _modulus = new BigInteger(Base64.decode(xmlKey.getRootElement().getChild("Modulus").getText()));
        _publicExponent = new BigInteger(Base64.decode(xmlKey.getRootElement().getChild("Exponent").getText()));

        _publicKey = new RSAKeyParameters(false, _modulus, _publicExponent);
    }

    public void setPrivateKey(String _skey) throws Exception {
        SAXBuilder builder = new SAXBuilder(false);
        Document xmlKey = builder.build(new ByteArrayInputStream(_skey.getBytes("UTF-8")));

        _modulus = new BigInteger(Base64.decode(xmlKey.getRootElement().getChild("Modulus").getText()));

        _publicExponent = new BigInteger(Base64.decode(xmlKey.getRootElement().getChild("Exponent").getText()));
        _p = new BigInteger(Base64.decode(xmlKey.getRootElement().getChild("P").getText()));
        _q = new BigInteger(Base64.decode(xmlKey.getRootElement().getChild("Q").getText()));
        _dP = new BigInteger(Base64.decode(xmlKey.getRootElement().getChild("DP").getText()));
        _dQ = new BigInteger(Base64.decode(xmlKey.getRootElement().getChild("DQ").getText()));
        _qInv = new BigInteger(Base64.decode(xmlKey.getRootElement().getChild("InverseQ").getText()));
        _privateExponent = new BigInteger(Base64.decode(xmlKey.getRootElement().getChild("D").getText()));

        _publicExponent = _publicExponent.abs();
        _p = _p.abs();
        _q = _q.abs();
        _dP = _dP.abs();
        _dQ = _dQ.abs();
        _qInv = _qInv.abs();
        _privateExponent = _privateExponent.abs();

        _privateKey = new RSAPrivateCrtKeyParameters(_modulus, _publicExponent, _privateExponent, _p, _q, _dP, _dQ, _qInv);
    }


    public String getPbKey() {
        return pbKey;
    }

    public String getPrKey() {
        return prKey;
    }

    public void setPbKey(String string) {
        pbKey = string;
    }

    public void setPrKey(String string) {
        prKey = string;
    }

}
