package com.example.demo.mapper;

import com.example.demo.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserMapper {


    User getUserById(Integer id);
    void insertUser(User user);
}
