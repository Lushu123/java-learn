package com.example.demo.service.impl;

import com.example.demo.mapper.IUserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService implements IUserService {

    @Autowired
    private IUserMapper iUserMapper;

    @Override
    public User getUserById(Integer id) {
       User user = iUserMapper.getUserById(id);
        return user;
    }

    @Override
    public void insertUser(User user) {
        iUserMapper.insertUser(user);
    }
}
