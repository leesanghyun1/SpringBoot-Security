package com.example.test.main.mapper;

import com.example.test.main.vo.MainVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainMapper {

    List<MainVo> select(MainVo param) throws Exception;

}
