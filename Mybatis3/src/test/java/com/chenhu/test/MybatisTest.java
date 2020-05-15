package com.chenhu.test;

import com.chenhu.dao.IAccountDao;
import com.chenhu.dao.IUserDao;
import com.chenhu.pojo.Account;
import com.chenhu.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MybatisTest {
    private InputStream in;
    private  SqlSession sqlSession;
    private  IUserDao iUserDao;
    private IAccountDao iAccountDao;

    @Before
    public void init() throws IOException {

         in = Resources.getResourceAsStream("SqlMapConfig.xml");
         SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
         SqlSessionFactory factory = builder.build(in);
         sqlSession = factory.openSession();
         iUserDao = sqlSession.getMapper(IUserDao.class);
         iAccountDao = sqlSession.getMapper(IAccountDao.class);

    }

    @After
    public void destory() throws IOException {
        sqlSession.commit();
        in.close();
    }

    @Test
    public  void textFillAll() {
        //5、使用代理对象执行方法
        List<User> users = iUserDao.findAll();
        for(User user:users){
            System.out.println(user);
        }

    }
    @Test
    public void textFindUserById(){
        User user = iUserDao.findUserById(2);
        System.out.println(user);
    }
    //account
    @Test
    public void textAccountFindAll(){
        List<Account> accounts = iAccountDao.findAll();
        for(Account account:accounts){
            System.out.println(account);
        }
    }

}
