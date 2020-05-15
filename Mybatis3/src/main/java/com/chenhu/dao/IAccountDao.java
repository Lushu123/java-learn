package com.chenhu.dao;

import com.chenhu.pojo.Account;

import java.util.List;

public interface IAccountDao {

    List<Account> findAll();

    //查询所有账户，并且带有所属用户信息
    List<Account> findAllAccount();

    Account findAccountById(Integer id);
}
