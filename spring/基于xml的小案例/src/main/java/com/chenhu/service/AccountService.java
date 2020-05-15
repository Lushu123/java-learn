package com.chenhu.service;

import com.chenhu.dao.IAccountDao;
import com.chenhu.domian.Account;
import com.chenhu.units.TransactionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//账户的业务层实现类

public class AccountService implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAllAccount() {

        return accountDao.findAllAccount();

    }

    public Account findAccountById(Integer id) {

        return findAccountById(id);




    }

    public void saveAccount(Account account) {

            accountDao.saveAccount(account);

    }

    public void updateAccount(Account account) {

            accountDao.updateAccount(account);

    }

    public void deleteAccount(Integer id) {


            accountDao.deleteAccount(id);

    }

    public void transfer(String sourceName, String targetName, Float money) {
        //重复代码已交给动态代理对象管理

            //2.1、根据名称找出转出账号
            Account sourceAccount = accountDao.findAccountByName(sourceName);//获取一个连接
            //2.2、根据名称找出转入账号
            Account targetAccount = accountDao.findAccountByName(targetName);//获取一个连接
            //2.3、转出账号减钱
            sourceAccount.setMoney(sourceAccount.getMoney()-money);
            //2.4、转入账号加钱
            targetAccount.setMoney(targetAccount.getMoney()+money);
            //2.5、更新数据
            accountDao.updateAccount(sourceAccount);//获取一个连接
            int i = 1/0; //此代码上面的连接更新数据有效，下面的连接更新数据无效
            accountDao.updateAccount(targetAccount);//获取一个连接




    }
}
