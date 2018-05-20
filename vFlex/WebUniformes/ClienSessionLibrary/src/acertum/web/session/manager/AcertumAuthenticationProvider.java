//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package acertum.web.session.manager;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public class AcertumAuthenticationProvider implements AuthenticationProvider {
    private UserDetailsService userDetailsService;

    public AcertumAuthenticationProvider() {
    }

    public void setUserDetailsService(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public Authentication authenticate(Authentication a) throws AuthenticationException {
        UserDetails userDetails = this.userDetailsService.loadUserByUsername(a.getName());
        if (userDetails != null) {
            UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(userDetails, (Object) null, userDetails.getAuthorities());
            return token;
        } else {
            throw new BadCredentialsException("Bad Credentials");
        }
    }

    public boolean supports(Class<?> type) {
        return true;
    }
}
