package com.chenhu.service.impl;

import com.chenhu.dao.IAccountDao;
import com.chenhu.pojo.Account;
import com.chenhu.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao iAccountDao;

    public List<Account> findAll() {
        System.out.println("业务层：查询所有信息");
        return iAccountDao.findAll();
    }

    public void saveAccount(Account account) {
        System.out.println("业务层：保存信息");
        iAccountDao.saveAccount(account);
    }

    public Boolean checkoutAccount(Account account) {
        Account checkAccount = iAccountDao.findAccountByNameAadPwd(account);
        System.out.println("数据库数据："+checkAccount);
        if(checkAccount == null){
            return false;
        }else {
            return true;
        }
    }
}
