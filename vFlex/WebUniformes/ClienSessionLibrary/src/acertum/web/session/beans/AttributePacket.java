//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.beans;

import java.io.Serializable;

public class AttributePacket implements Serializable {
    private String name;
    private Object value;
    private String idSession;

    public AttributePacket(String name, Object value, String idSession) {
        this.name = name;
        this.value = value;
        this.idSession = idSession;
    }

    public String getName() {
        return this.name;
    }

    public Object getValue() {
        return this.value;
    }

    public String getIdSession() {
        return this.idSession;
    }
}
