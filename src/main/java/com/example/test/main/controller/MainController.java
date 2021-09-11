package com.example.test.main.controller;

import com.example.test.main.service.MainService;
import com.example.test.main.service.serviceImpl.MainServiceImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main")
@MapperScan(basePackages="com.example.test.main.service")
public class MainController {


    @GetMapping("/hello")
    public String testView(){
        return "index";
    }

    @GetMapping("/home")
    public String homeController(){
        return "main/home";
    }
}
