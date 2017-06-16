package com.mi.common.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 统一AOP日志输出
 * @author yesh
 *         (M.M)!
 *         Created by 2017/6/14.
 */
@Aspect
@Component
@Slf4j
public class WebRequestLogAspect {

    private JoinPoint joinPoint;

    @Before("execution(public * com.mi.controller..*.*(..))")
    public void doBefore(JoinPoint joinPoint){
        long beginTime =  System.currentTimeMillis();
        System.err.println("日志哟");
        log.info("真的哟");
    }

}
