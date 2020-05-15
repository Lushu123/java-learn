package com.server;

import com.dao.AccountDao;
import com.dao.IAccountDao;
import com.factory.BeanFctory;

public class AccountServer implements IAccountServer{
    //业务层实现类,调用持久层
//    private IAccountDao accountDao = new AccountDao();
    private IAccountDao accountDao = (IAccountDao) BeanFctory.getBean("accountDao");

    private int i = 1;
    public void saveAccount() {
        accountDao.saveAccount();
        System.out.println(i);
        i++;
    }
}
