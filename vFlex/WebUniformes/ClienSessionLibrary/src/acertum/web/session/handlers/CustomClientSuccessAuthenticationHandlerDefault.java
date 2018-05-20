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
public class CustomClientSuccessAuthenticationHandlerDefault implements CustomClientSuccessAuthenticationHandler {
    public CustomClientSuccessAuthenticationHandlerDefault() {
    }

    public void customCode() {
        Logeo.log("Ejecutando el codigo de Custom Client Success Authentication Handler por default\nEl cliente NO ha hecho su implementacion");
    }
}
