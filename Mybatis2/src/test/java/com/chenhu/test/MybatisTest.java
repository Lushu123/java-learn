package com.chenhu.test;

import com.chenhu.dao.IUserDao;
import com.chenhu.dao.impl.UserDaoImpl;
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

    @Before
    public void init() throws IOException {

         in = Resources.getResourceAsStream("SqlMapConfig.xml");
         SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
         SqlSessionFactory factory = builder.build(in);
         sqlSession = factory.openSession();
         iUserDao = sqlSession.getMapper(IUserDao.class);
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
    public void textSaveUser(){
        User user = new User();
        user.setUsername("Test");
        user.setBirthday(new Date());
        user.setSex("f");
        user.setAddress("yueyan");
        System.out.println("保存操作之前"+user);
        iUserDao.saveUser(user);
        System.out.println("保存操作之后"+user);

    }

    @Test
    public void textUpdateUser(){
        User user = new User();
        user.setUsername("xiugai");
        user.setId(7);
        user.setBirthday(new Date());
        user.setSex("m");
        user.setAddress("yueyan");
        iUserDao.updateUser(user);

    }

    @Test
    public void textDeleteUser(){
        iUserDao.deleteUser(4);
    }

    @Test
    public void textFindUserById(){
        User user = iUserDao.findUserById(2);
        System.out.println(user);
    }

    @Test
    public  void textFindUserByName() {
        //5、使用代理对象执行方法
        List<User> users = iUserDao.findUserByName("B%");
        for(User user:users){
            System.out.println(user);
        }
    }
    @Test
    public  void textFindTotal() {
      int total =  iUserDao.findTotal();
        System.out.println(total);
    }
}
