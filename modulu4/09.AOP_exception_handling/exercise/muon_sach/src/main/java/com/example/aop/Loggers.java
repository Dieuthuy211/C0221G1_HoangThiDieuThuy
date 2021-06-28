package com.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


import java.util.Arrays;
@Component
@Aspect
public class Loggers {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @AfterReturning("execution(* com.example.controller.BookController.*(..)))")
    public void borrowBook(JoinPoint joinPoint){
        String methodName=joinPoint.getSignature().getName();
        String className=joinPoint.getTarget().getClass().getSimpleName();
        String args= Arrays.toString(joinPoint.getArgs());
        logger.error("className"+className);
        logger.error("methodName"+methodName);
        logger.error("args"+args);
    }
}
