package com.chenhu.dao;

import com.chenhu.domian.Account;
import com.chenhu.units.ConnectionUnit;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

//账户的持久层实现类

public class AccountDao implements IAccountDao {
    private QueryRunner queryRunner;
    private ConnectionUnit connectionUnit;

    public void setConnectionUnit(ConnectionUnit connectionUnit) {
        this.connectionUnit = connectionUnit;
    }

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }


    public List<Account> findAllAccount() {
        try {
            return queryRunner.query(connectionUnit.getThreadConnection(),"select * from account",new BeanListHandler<Account>(Account.class));
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public Account findAccountById(Integer id) {
        try {
            return queryRunner.query(connectionUnit.getThreadConnection(),"select * from account where id = ?",new BeanHandler<Account>(Account.class),id);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public Account findAccountByName(String accountName) {
        try {
            List<Account> accounts = queryRunner.query(connectionUnit.getThreadConnection(),"select * from account where name=?",new BeanListHandler<Account>(Account.class),accountName);
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

    public void saveAccount(Account account) {
        try {
            queryRunner.update(connectionUnit.getThreadConnection(),"insert into account (name,money) value(?,?)",account.getName(),account.getMoney());
            System.out.println("保存成功");
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public void updateAccount(Account account) {
        try {
            queryRunner.update(connectionUnit.getThreadConnection(),"update account set name = ?,money = ? where id=?",account.getName(),account.getMoney(),account.getId());
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public void deleteAccount(Integer id) {
        try {
            queryRunner.update(connectionUnit.getThreadConnection(),"delete from account  where id=?",id);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
