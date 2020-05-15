package com.chenhu.service;

import com.chenhu.domian.Account;

import java.util.List;

//账户业务层接口
public interface IAccountService {



    void transfer(String sourceName, String targetName, Float money);
}
