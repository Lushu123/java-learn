package com.chenhu.factory;

import com.chenhu.domian.Account;
import com.chenhu.service.IAccountService;
import com.chenhu.units.TransactionManager;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
* 用于创建service的代理对象的工厂(不知道如何用注解实现)
* */
@Component
@Aspect
public class BeanFactroy {

    private  TransactionManager transactionManager;

    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }
    //环绕通知写法
    @Pointcut("execution(* com.chenhu.service.AccountService.*(..))")
        private void ptl(){}
        @Around("ptl()")
        //获取service代理对象
        public Object getiAccountService(ProceedingJoinPoint joinPoint) {
            Object rtValue = null;
            Object[] args = joinPoint.getArgs();
            try {
                //1、开启事务
                System.out.println("前置通知");
                transactionManager.beginTransation();
                //2、执行操作
                rtValue =  joinPoint.proceed(args);
                //3、提交事务
                transactionManager.commit();
                //4、返回结果
                return rtValue;
            } catch (Throwable throwable) {
                //5、回滚操作
                transactionManager.rollback();
                throw  new RuntimeException("事务回滚了！");

            }finally {
                //6、释放资源
                transactionManager.release();
            }

        }
}
