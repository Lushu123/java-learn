package com.chenhu.dao;

import com.chenhu.pojo.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccountDao {

    @Select("select * from account")
    List<Account> findAll();

    @Select("select * from account where name=#{name} and password=#{password}")
    Account findAccountByNameAadPwd(Account account);

    @Insert("insert into account (name,password) values(#{name},#{password})")
    void saveAccount(Account account);


}
