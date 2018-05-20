//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.handlers;

import acertum.web.arquitectura.log.Logeo;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

@Default
@Stateless
public class CustomClientSuccessLogoutHandlerDefault implements CustomClientSuccessLogoutHandler {
    public CustomClientSuccessLogoutHandlerDefault() {
    }

    public void customCodeOnLogout() {
        Logeo.log("Ejecutando SuccessLogoutHandler. Se está ejecutando el código por default. ");
    }
}
