package com.nowcoder.aspect;


import org.apache.log4j.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by korol on 2016/6/30.
 */
@Aspect
@Component
public class LogAspect {
    private  static final org.slf4j.Logger logger= LoggerFactory.getLogger(LogAspect.class);
    @Before("execution(* com.nowcoder.controller.IndexController.*(..))")
    public void BeforeMethod(JoinPoint joinPoint){
        StringBuilder sb =new StringBuilder();
        for(Object arg : joinPoint.getArgs()){
            sb.append("arg:"+arg.toString()+"|");
        }
        logger.info("before method:"+sb.toString());
    }
    @After("execution(* com.nowcoder.controller.IndexController.*(..))")
    public void AfterMethod(JoinPoint joinPoint){
        logger.info("after method:");
    }
}
