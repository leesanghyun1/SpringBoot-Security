package com.example.test.user.controller;

import com.example.test.user.service.serviceImpl.UserServiceImpl;
import com.example.test.user.vo.UserVo;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("user")
@MapperScan(basePackages="com.example.test.main.service")
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @GetMapping("/loginForm")
    public String loginForm() throws Exception{
        return "user/loginForm";
    }

    @GetMapping("/signupForm")
    public String signupForm() throws Exception{
        return "user/signupForm";
    }

    @PostMapping("/signup")
    public String signup(UserVo userVo, Model model) throws Exception{
        System.out.println(ToStringBuilder.reflectionToString(userVo));
        long result =userServiceImpl.insertSign(userVo);

        if(result == 1){
            model.addAttribute("msgSignUp", "회원가입 성공");
            return "user/loginForm";
        }else{
            model.addAttribute("msgSignUp", "회원가입 실패");
            return "user/signupForm";
        }
    }
}
