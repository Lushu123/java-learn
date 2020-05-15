package com.chenhu.factory;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {
    @Pointcut("execution(* com.chenhu.service.Text1.*(..))")
    private void ptl(){}

    @Before("ptl()")
    public void be(){
        System.out.println("前置通知");
    }

//    @Around("ptl()")
//    //获取service代理对象
//    public Object around(ProceedingJoinPoint joinPoint) {
//
//        Object rtValue = null;
//        try {
//            Object[] args = joinPoint.getArgs();
//            System.out.println("前置通知");
//            rtValue =  joinPoint.proceed(args);
//            System.out.println("前置通知");
//
//            return rtValue;
//        } catch (Throwable throwable) {
//            System.out.println("前置通知");
//            throw  new RuntimeException("事务回滚了！");
//        }finally {
//            System.out.println("前置通知");
//        }
//
//    }
}
