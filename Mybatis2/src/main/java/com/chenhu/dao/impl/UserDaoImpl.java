package com.chenhu.dao.impl;

import com.chenhu.dao.IUserDao;
import com.chenhu.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements IUserDao {

    private SqlSessionFactory factory;
    public UserDaoImpl(SqlSessionFactory factory){
        this.factory = factory;
    }

    public List<User> findAll() {
        //1根据factory获取SqlSession对象
        SqlSession session = factory.openSession();
        //2调用SqlSession中的方法，实现查询列表
        List<User> users = session.selectList("com.chenhu.dao.IUserDao.findAll");//参数就是能获取配置信息的key
        session.close();
        return users;
    }

    public void saveUser(User user) {

    }

    public void updateUser(User user) {

    }

    public void deleteUser(Integer id) {

    }

    public User findUserById(Integer id) {
        return null;
    }

    public List<User> findUserByName(String name) {
        return null;
    }

    public int findTotal() {
        return 0;
    }
}
