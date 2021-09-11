package com.example.test.board.service;

import com.example.test.board.vo.BoardUserVo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BoardUserService {

    public List<BoardUserVo> select() throws Exception;
}
