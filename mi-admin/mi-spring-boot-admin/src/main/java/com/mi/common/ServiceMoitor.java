package com.mi.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.stereotype.Component;

/**
 * gague和counter的定制 监控
 * @author yesh
 *         (M.M)!
 *         Created by 2017/5/10.
 */
@Aspect
@Component
public class ServiceMoitor {

    @Autowired
    private GaugeService gaugeService;

    @Autowired
    private CounterService counterService;

    @Before(value = "execution(* com.mi.controller.*.*(..))")
    public void countServiceInvoke(JoinPoint joinPoint) {
//        counterService.increment(joinPoint.getSignature().toString());
//        System.err.println("监控咯"+joinPoint.getSignature());
    }

    @Around(value = "execution(* com.mi.controller.*.*(..))")
    public void latencyService(ProceedingJoinPoint pjp) throws Throwable {
//        long start = System.currentTimeMillis();
////        pjp.proceed();
////        Thread.sleep(2000);
//        long end = System.currentTimeMillis();
//        System.err.println("延迟多久："+(end-start));
//        gaugeService.submit(pjp.getSignature().toString(), end - start);
    }

}
