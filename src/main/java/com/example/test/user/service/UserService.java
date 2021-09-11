package com.example.test.user.service;

import com.example.test.user.vo.UserVo;
import org.apache.el.util.Validation;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;


public interface UserService {
     public UserVo select(String loginId) throws Exception;

     public long insertSign(UserVo userVo) throws  Exception;
}
