package com.chenhu.service;

import com.chenhu.dao.IAccountDao;
import com.chenhu.domian.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


//账户的业务层实现类
@Service("accountService")
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class AccountService implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Transactional(propagation = Propagation.REQUIRED,readOnly = false)
    public void transfer(String sourceName, String targetName, Float money) {

            /*
             * 以下四个连接如果在手动在某个连接上让它不执行，则它不会更新数据库，而其他成功的已经提交数据了，故事务不安全
             * */
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
