//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.beans;

import org.springframework.security.core.Authentication;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ObjetoSession implements Serializable {
    private Authentication authSpring;
    private String idSession;
    private Map<String, Object> attributes;
    private final Date startDate;
    private int usuario;
    private String mensajeStatus;
    private DatosUsuario datosUsuario;
    private DatosSucursal datosSucursal;
    private static final long serialVersionUID = -774826133918737051L;

    public ObjetoSession(Authentication authSpring, String idSession, String mensajeStatus, DatosUsuario datosUsuario, DatosSucursal datosSucursal) {
        this.authSpring = authSpring;
        this.idSession = idSession;
        this.mensajeStatus = mensajeStatus;
        this.datosUsuario = datosUsuario;
        this.datosSucursal = datosSucursal;
        this.usuario = datosUsuario.getNoEmpleado();
        this.attributes = new HashMap();
        this.startDate = Calendar.getInstance().getTime();
    }

    public ObjetoSession(Authentication authSpring, String idSession) {
        this.authSpring = authSpring;
        this.idSession = idSession;
        this.attributes = new HashMap();
        this.startDate = Calendar.getInstance().getTime();
    }

    public ObjetoSession(String mensajeStatus) {
        this.authSpring = null;
        this.idSession = "";
        this.mensajeStatus = mensajeStatus;
        this.datosUsuario = null;
        this.datosSucursal = null;
        this.attributes = new HashMap();
        this.startDate = Calendar.getInstance().getTime();
    }

    public void removeAttribute(String name) {
        this.attributes.remove(name);
    }

    public Authentication getAuthSpring() {
        return this.authSpring;
    }

    public void setAuthSpring(Authentication authSpring) {
        this.authSpring = authSpring;
    }

    public String getIdSession() {
        return this.idSession;
    }

    public void setIdSession(String idSession) {
        this.idSession = idSession;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public int getUsuario() {
        return this.usuario;
    }

    public DatosUsuario getDatosUsuario() {
        return this.datosUsuario;
    }

    public DatosSucursal getDatosSucursal() {
        return this.datosSucursal;
    }

    public Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public void setAttribute(String id, Object object) {
        this.attributes.put(id, object);
    }

    public Object getAttribute(String id) {
        return this.attributes.get(id);
    }

    public String getMensajeStatus() {
        return this.mensajeStatus;
    }

    public void setMensajeStatus(String mensajeStatus) {
        this.mensajeStatus = mensajeStatus;
    }
}
