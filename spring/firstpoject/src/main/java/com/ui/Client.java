package com.ui;

import com.factory.BeanFctory;
import com.server.AccountServer;
import com.server.IAccountServer;

/*
* 模拟一个表现层，调用业务层
* */
public class Client {
    public static void main(String[] args) {
//        IAccountServer accountServer = new AccountServer();
        for (int i = 0; i < 5; i++) {
            IAccountServer accountServer = (IAccountServer) BeanFctory.getBean("accountServer");
            System.out.println(accountServer);
            accountServer.saveAccount();
        }

    }
}
