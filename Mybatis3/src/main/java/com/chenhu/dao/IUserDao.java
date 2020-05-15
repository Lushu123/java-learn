package com.chenhu.dao;

import com.chenhu.pojo.User;

import java.util.List;

public interface IUserDao {
    //查询所有
    List<User>findAll();
    //查询一个
    User findUserById(Integer id);

}
