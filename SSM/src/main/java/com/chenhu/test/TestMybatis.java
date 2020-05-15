package com.chenhu.test;

import com.chenhu.dao.IAccountDao;
import com.chenhu.pojo.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    @Test
    public void run() throws IOException {

        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        SqlSession session = factory.openSession();
        IAccountDao iAccountDao = session.getMapper(IAccountDao.class);
        List<Account>accounts = iAccountDao.findAll();
        for(Account account:accounts){
            System.out.println(account);
        }
        session.close();
        in.close();
    }

    @Test
    public void run1() throws IOException {
//        Account account = new Account();
//        account.setUid(6);
//        account.setMoney(500.0);
//        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//
//        SqlSession session = factory.openSession();
//        IAccountDao iAccountDao = session.getMapper(IAccountDao.class);
//        iAccountDao.saveAccount(account);
//        session.commit();
//        session.close();
//        in.close();
    }
}
