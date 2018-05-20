//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.manager;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class AcertumUserDetailsService implements UserDetailsService {
    public AcertumUserDetailsService() {
    }

    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usr = dao.getUsuarioByNombre(string);
        if (usr == null) {
            throw new UsernameNotFoundException("Usaurio no encontrado");
        } else {
            User u = new User(usr.getNomUsuario(), usr.getPassword(), enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, this.getAuthorities(Integer.valueOf(usr.getPermisos())));
            return u;
        }
    }

    public Collection<? extends GrantedAuthority> getAuthorities(Integer role) {
        List roles = this.getRoles(role);
        List authList = getGrantedAuthorities(roles);
        return authList;
    }

    public List<String> getRoles(Integer role) {
        ArrayList roles = new ArrayList();
        if (role.intValue() == 1) {
            roles.add("ROLE_USER");
            roles.add("ROLE_ADMIN");
        } else if (role.intValue() == 2) {
            roles.add("ROLE_USER");
        }

        return roles;
    }

    public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
        ArrayList authorities = new ArrayList();
        Iterator var2 = roles.iterator();

        while (var2.hasNext()) {
            String role = (String) var2.next();
            authorities.add(new SimpleGrantedAuthority(role));
        }

        return authorities;
    }
}
