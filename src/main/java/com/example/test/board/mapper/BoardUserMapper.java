package com.example.test.board.mapper;

import com.example.test.board.vo.BoardUserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardUserMapper {

    List<BoardUserVo> select() throws Exception;
}
