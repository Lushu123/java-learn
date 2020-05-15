package com.chenhu.dao;

import com.chenhu.domian.Account;

import java.util.List;

//账户的持久层接口
public interface IAccountDao {

    //查询所有
    List<Account> findAllAccount();

    //根据id返回账号
    Account findAccountById(Integer id);

    //根据名字返回账号
    Account findAccountByName(String accountName);

    //保存
    void saveAccount(Account account);

    //更新
    void updateAccount(Account account);

    //删除
    void deleteAccount(Integer id);

}
