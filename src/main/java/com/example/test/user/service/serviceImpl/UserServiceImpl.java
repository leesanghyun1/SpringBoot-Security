package com.example.test.user.service.serviceImpl;

import com.example.test.configuration.security.UserSecurityService;
import com.example.test.user.mapper.UserMapper;
import com.example.test.user.service.UserService;
import com.example.test.user.vo.UserVo;
import org.apache.el.util.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public UserVo select(String loginId) throws Exception{
        System.out.println("impl");
        return userMapper.select(loginId);
    };

    public long insertSign(UserVo userVo) throws  Exception{
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        userVo.setPassword(encoder.encode(userVo.getPassword()));
        return userMapper.insertSign(userVo);
    };

}
