package com.ui;

import com.server.IAccountServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
*
* */

public class Client {
    public static void main(String[] args) {
        //获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //根据id获取bean
        IAccountServer as = (IAccountServer) ac.getBean("accountServer");
        IAccountServer as2 = (IAccountServer) ac.getBean("ac2");
        System.out.println(as);
        System.out.println(as2);
        as.saveAccount();

    }
}
