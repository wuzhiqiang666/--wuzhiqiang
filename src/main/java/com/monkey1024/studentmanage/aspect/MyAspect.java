package com.monkey1024.studentmanage.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class MyAspect {

    private final static Logger logger = LoggerFactory.getLogger(MyAspect.class);

    @Pointcut("execution(public * com.monkey1024.studentmanage.controller.StudentController.findAllStudent(..))")
    public void log(){
    }
    @Before("log()")
    public void doFirst(JoinPoint joinPoint){
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attr.getRequest();
        logger.info("周洁大美女我想泡你");
        logger.info("url={}",request.getRequestURL());
        logger.info("method={}",request.getMethod());
        logger.info("ip={}",request.getRemoteAddr());
        logger.info("class_metnod={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        logger.info("arg={}",joinPoint.getArgs());
    }
    @After("log()")
    public void doAfter(){
        logger.info("我从梦中醒来！");
    }
    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(Object object){
        logger.info("response={}",object);
    }
}
