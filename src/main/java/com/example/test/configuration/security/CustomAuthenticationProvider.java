
package com.example.test.configuration.security;

import com.example.test.user.vo.UserVo;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    UserSecurityService userSecurityService;

    @Autowired
    PasswordEncoder passwordEncoder;


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String loginId = authentication.getName();
        String password = (String) authentication.getCredentials();
        Collection<GrantedAuthority> authorities = null;
        try {
            UserVo userVo = (UserVo)userSecurityService.loadUserByUsername(loginId);
            // 이용자가 로그인 폼에서 입력한 비밀번호와 DB로부터 가져온 암호화된 비밀번호를 비교한다
            if (!passwordEncoder.matches(password, userVo.getPassword())) {
                throw new BadCredentialsException("비밀번호 불일치");
            }
            authorities = (Collection<GrantedAuthority>) userVo.getAuthorities();
        } catch(UsernameNotFoundException e) {
            e.printStackTrace();
            throw new UsernameNotFoundException(e.getMessage());
        } catch(BadCredentialsException e) {
            e.printStackTrace();
            throw new BadCredentialsException(e.getMessage());
        } catch(Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }


        return new UsernamePasswordAuthenticationToken(loginId,password,authorities);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);

    }
}

