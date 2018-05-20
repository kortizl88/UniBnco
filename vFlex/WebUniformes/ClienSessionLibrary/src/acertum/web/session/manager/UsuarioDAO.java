//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsuarioDAO {
    private List<Usuario> listaUsuarios = new ArrayList();

    public UsuarioDAO() {
        Usuario u = new Usuario("user", "user", 2);
        this.listaUsuarios.add(u);
        u = new Usuario("admin", "admin", 1);
        this.listaUsuarios.add(u);
        u = new Usuario("lalo", "lalo", 1);
        this.listaUsuarios.add(u);
        u = new Usuario("betty", "betty", 1);
        this.listaUsuarios.add(u);
        u = new Usuario("pedro", "passPedro", 2);
        this.listaUsuarios.add(u);
        u = new Usuario("betty", "passBetty", 1);
        this.listaUsuarios.add(u);
    }

    public Usuario getUsuarioByNombre(String nomUsuario) {
        Usuario u = null;
        Iterator var3 = this.listaUsuarios.iterator();

        while (var3.hasNext()) {
            Usuario usr = (Usuario) var3.next();
            if (usr.getNomUsuario().equals(nomUsuario)) {
                u = usr;
                break;
            }
        }

        return u;
    }
}
