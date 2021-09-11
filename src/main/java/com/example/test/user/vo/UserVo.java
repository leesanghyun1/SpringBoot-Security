package com.example.test.user.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

@Getter
@Setter
public class UserVo implements UserDetails{

    private String userId;
    private String loginId;
    private String password;
    private String name;
    private String email;
    private String address;
    private String mobileNo;
    private String birth;
    private String role;
    private boolean ENABLED;
    private ArrayList<GrantedAuthority> authority;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authority;
    }

    public void setAuthority(ArrayList<String> authList) {
        ArrayList<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
        for(int i=0;i<authList.size();i++) {
            auth.add(new SimpleGrantedAuthority(authList.get(i)));
        }
        this.authority=auth;
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return password;
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return loginId;
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return ENABLED;
    }
}
