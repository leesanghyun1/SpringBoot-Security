package com.example.test.main.service;

import com.example.test.main.vo.MainVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MainService {

    List<MainVo> select(MainVo param) throws Exception;


}
