package com.chenhu.service;

import com.chenhu.pojo.Account;

import java.util.List;

public interface IAccountService {
    List<Account> findAll();

    void saveAccount(Account account);

    Boolean checkoutAccount(Account account);
}
