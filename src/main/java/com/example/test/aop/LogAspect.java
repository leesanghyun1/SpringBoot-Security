package com.example.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@Aspect
@Component
public class LogAspect {

    Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Around("execution(* com.example..*Controller.*(..)) || execution(* com.example..*Service.*(..))")
    public Object logAop(ProceedingJoinPoint pjp) throws Throwable {
        ServletRequest request;
        ServletResponse response;
        String name = pjp.getSignature().getDeclaringTypeName();

        logger.info("======== start - " + pjp.getSignature().getDeclaringTypeName() + " / " + pjp.getSignature().getName());

        Object result = pjp.proceed();
        logger.info("======== finished - " + pjp.getSignature().getDeclaringTypeName() + " / " + pjp.getSignature().getName());
        return result;
    }


}
