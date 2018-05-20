//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.authentication;

import acertum.web.arquitectura.log.Logeo;
import acertum.web.arquitectura.utilidades.Config;
import acertum.web.session.beans.ObjetoSession;
import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.net.ssl.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

public class GetSessionService {

    private static final Logger log = Logger.getLogger(GetSessionService.class);
    private HttpServletRequest request;

    private String urlServidorAuth;

    public GetSessionService(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.urlServidorAuth = Config.obtenerParametro("urlAuthServer");
    }

    public void getSession(String ticket) throws IOException {
        ObjetoSession objetoSession;
        String url = this.urlServidorAuth + "/getSession";

        try {
            String myDomain;

            this.desactivarSSL();
            HttpURLConnection ex = (HttpURLConnection) (new URL(url)).openConnection();
            ex.setDoOutput(true);
            ex.setRequestMethod("POST");
            ex.setRequestProperty("user-agent", this.request.getHeader("user-agent"));
            ex.setRequestProperty("accept", this.request.getHeader("accept"));
            ex.setRequestProperty("accept-encoding", this.request.getHeader("accept-encoding"));
            ex.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
            String sc1 = Config.obtenerParametro("myDomain");
            myDomain = String.format("ticket=%s&referer=%s", new Object[]{ticket, sc1});
            DataOutputStream URLParameters1 = new DataOutputStream(ex.getOutputStream());
            URLParameters1.writeBytes(myDomain);
            URLParameters1.flush();
            URLParameters1.close();
            ObjectInputStream out1 = new ObjectInputStream(ex.getInputStream());
            objetoSession = (ObjetoSession) out1.readObject();
            out1.close();
            ex.getInputStream().close();


            if (objetoSession != null) {
                Authentication ex1 = objetoSession.getAuthSpring();
                SecurityContext sc2 = SecurityContextHolder.getContext();
                sc2.setAuthentication(ex1);
                this.request.getSession().setAttribute("objetoSession", objetoSession);
            } else {
                Logeo.log("No se pudo encontrar el objetoSession de local");
            }
        } catch (Exception e) {
            log.error("Ocurrió una excepcion conla lectura del objeto", e);
        }

    }

    private void desactivarSSL() throws KeyManagementException, NoSuchAlgorithmException {
        TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }};
        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        HostnameVerifier allHostsValid = new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
    }
}
