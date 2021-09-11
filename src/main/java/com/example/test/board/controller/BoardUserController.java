package com.example.test.board.controller;

import com.example.test.board.mapper.BoardUserMapper;
import com.example.test.board.service.BoardUserService;
import com.example.test.board.service.serviceImpl.BoardUserServiceImpl;
import com.example.test.board.vo.BoardUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardUserController {

    @Autowired
    BoardUserServiceImpl boardUserServiceImpl;

    @GetMapping("/selectBoardUser")
    public String selectBoardController() throws Exception{
        List<BoardUserVo> result= boardUserServiceImpl.select();
        return "selectBoardUser";
    }
}
