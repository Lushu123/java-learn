package com.dao;

//持久层实现类
public class AccountDao implements IAccountDao{
    public void saveAccount() {
        System.out.println("保存了");
    }
}
