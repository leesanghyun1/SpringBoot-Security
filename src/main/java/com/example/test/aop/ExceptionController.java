package com.example.test.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionController {
    Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @ExceptionHandler(Exception.class)
    public Map<String, Object> handler(Exception e) {
        Map<String, Object> resBody = new HashMap<>();
        resBody.put("errorMessage: ", e.getMessage());

        return resBody;
    }

}
