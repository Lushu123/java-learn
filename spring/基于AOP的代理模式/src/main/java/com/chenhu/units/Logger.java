package com.chenhu.units;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/*
* 用于记录日志的工具类，它里面提供了公共的代码
* */
@Component
@Aspect
public class Logger {

    @Pointcut("execution(* com.chenhu.service.*.*(..))")
    private void ptl(){}

    //用于打印日志：在切入点执行之前打印
//    @Before("ptl()")
//    public void printLogBe(){
//        System.out.println("开始记录日志(前置通知)");
//    }
//    @AfterReturning("ptl()")
//    public void printLogAf(){
//        System.out.println("结束记录日志（后置通知）");
//    }
//    @AfterThrowing("ptl()")
//    public void printLogYAf(){
//        System.out.println("结束记录日志（异常通知）");
//    }
//
//    @After("ptl()")
//    public void printLogZAf(){
//        System.out.println("结束记录日志（最终通知）");
//    }

    @Around("ptl()")
    public Object around(ProceedingJoinPoint joinPoint) {
        Object reValue = null;
        try {
            Object[] args = joinPoint.getArgs();

            System.out.println("开始记录日志(前置通知)");

            reValue = joinPoint.proceed(args);

            System.out.println("结束记录日志（后置通知）");
            return reValue;
        } catch (Throwable throwable) {
            System.out.println("结束记录日志（异常通知）");
            throw new RuntimeException(throwable);
        }finally {
            System.out.println("结束记录日志（最终通知）");
        }

    }

}
