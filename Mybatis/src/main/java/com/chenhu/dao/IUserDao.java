package com.chenhu.dao;

import com.chenhu.pojo.User;

import java.util.List;

public interface IUserDao {
    //查询所有
    List<User>findAll();
    //保存数据
    void saveUser(User user);
    //更新数据
    void updateUser(User user);
    //删除用户
    void deleteUser(Integer id);
    //查询一个
    User findUserById(Integer id);
    //根据名称，模糊查询user
    List<User> findUserByName(String name);
    //查询总用户数
    int findTotal();
}
