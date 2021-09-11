package com.example.test.main.service.serviceImpl;

import com.example.test.main.mapper.MainMapper;
import com.example.test.main.service.MainService;
import com.example.test.main.vo.MainVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {

    public List<MainVo> select(MainVo param) {

        return null;
    }

}
