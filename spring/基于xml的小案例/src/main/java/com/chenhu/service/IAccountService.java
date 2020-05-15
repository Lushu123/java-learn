package com.chenhu.service;

import com.chenhu.domian.Account;

import java.util.List;

//账户业务层接口
public interface IAccountService {
    //查询所有
    List<Account> findAllAccount();

    //根据id返回账号
    Account findAccountById(Integer id);

    //保存
    void saveAccount(Account account);

    //更新
    void updateAccount(Account account);

    //删除
    void deleteAccount(Integer id);

    //转账
    void transfer(String sourceName, String targetName, Float money);
}
