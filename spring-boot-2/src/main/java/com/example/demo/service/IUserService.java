package com.example.demo.service;

import com.example.demo.pojo.User;

public interface IUserService {
    User getUserById(Integer id);
    void insertUser(User user);
}
