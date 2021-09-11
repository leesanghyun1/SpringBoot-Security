package com.example.test.board.service.serviceImpl;

import com.example.test.board.mapper.BoardUserMapper;
import com.example.test.board.service.BoardUserService;
import com.example.test.board.vo.BoardUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardUserServiceImpl implements BoardUserService {


    @Autowired
    BoardUserMapper boardUserMapper;

    public List<BoardUserVo> select() throws Exception{
        return boardUserMapper.select();
    };
}
