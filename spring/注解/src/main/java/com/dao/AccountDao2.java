package com.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//持久层实现类
@Repository("accountDao2")
public class AccountDao2 implements IAccountDao{
    public void saveAccount() {
        System.out.println("保存了2222");
    }
}
