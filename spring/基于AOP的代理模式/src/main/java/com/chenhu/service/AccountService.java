package com.chenhu.service;

import org.springframework.stereotype.Service;

/*
* 业务层实现类
* */
@Service
public class AccountService implements IAccountService{

    public void saveAccount() {
        System.out.println("执行了保存");
    }

    public void uptataAccount(int i) {
        System.out.println("执行了更新"+i);
    }

    public int deleteAccount() {
        System.out.println("执行了删除");
        return 0;
    }
}
