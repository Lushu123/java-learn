package com.chenhu.test;

import com.chenhu.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestSpring {
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService =(IAccountService) ac.getBean("accountService");
        accountService.findAll();
    }
}
