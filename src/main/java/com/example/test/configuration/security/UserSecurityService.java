package com.example.test.configuration.security;

import com.example.test.user.service.UserService;
import com.example.test.user.service.serviceImpl.UserServiceImpl;
import com.example.test.user.vo.UserSecurityVo;
import com.example.test.user.vo.UserVo;
import lombok.SneakyThrows;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserSecurityService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Autowired
    PasswordEncoder passwordEncoder;

    //회원 가입
    @Transactional
    public Long joinUser(UserVo userVo) throws Exception {
        // 비밀번호 암호화 처리
        userVo.setPassword(passwordEncoder.encode(userVo.getPassword()));
        return userService.insertSign(userVo);
    }

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        //전달되는 String 값은 로그인시 id 값
        //AuthenticationProvider로 부터 받아옴
        UserVo userVo = new UserVo();
        try {
            // 호출 대상 매서드
            userVo =  this.userService.select(id);
        } catch (Exception e) {
            // 예외처리
            e.printStackTrace();
        }
        return userVo;
        //UserDetails 를 상속받은 UserVo를 다시 return
    }
}
