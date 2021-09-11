package com.example.test.user.mapper;

import com.example.test.user.vo.UserVo;
import org.apache.el.util.Validation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserMapper {

     UserVo select(String loginId) throws Exception;

    long insertSign(UserVo userVo);
}
