//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.handlers;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AcertumSuccesAuthenticationHandler extends SimpleUrlAuthenticationSuccessHandler {
    public AcertumSuccesAuthenticationHandler() {
    }

    public void onAuthenticationSuccess(HttpServletRequest hsr, HttpServletResponse hsr1, Authentication a) throws IOException, ServletException {
        hsr.getRequestDispatcher("/index").forward(hsr, hsr1);
    }
}
