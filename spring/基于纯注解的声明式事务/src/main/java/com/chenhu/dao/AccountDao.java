package com.chenhu.dao;

import com.chenhu.domian.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

//账户的持久层实现类
@Repository("accountDao")

public class AccountDao implements IAccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Account findAccountById(Integer id) {
        try {
            List<Account> accounts = jdbcTemplate.query("select * from account where id = ?",new BeanPropertyRowMapper<Account>(Account.class),id);
            return accounts.get(0);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public Account findAccountByName(String accountName) {
        try {
            List<Account> accounts = jdbcTemplate.query("select * from account where name=?",new BeanPropertyRowMapper<Account>(Account.class),accountName);
            if(accounts == null || accounts.size() == 0){
                return null;
            }
            if(accounts.size() > 1){
                throw new RuntimeException("数据不唯一");
            }

            return accounts.get(0);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public void updateAccount(Account account) {
        try {
           jdbcTemplate.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }


}
