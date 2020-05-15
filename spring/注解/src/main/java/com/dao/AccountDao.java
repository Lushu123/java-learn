package com.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//持久层实现类
@Repository("accountDao")
public class AccountDao implements IAccountDao{
    public void saveAccount() {
        System.out.println("保存了111111");
    }
}
