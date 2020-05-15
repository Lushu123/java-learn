package com.chenhu.units;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

/*
* 和事务管理相关的工具类，它包含了：开启事务、提交事务、回滚事务、释放事务
* */

public class TransactionManager {


    private ConnectionUnit connectionUnit;

    public void setConnectionUnit(ConnectionUnit connectionUnit) {
        this.connectionUnit = connectionUnit;
    }

    /*
    * 开启事务
    * */
    public void beginTransation(){
        try {
            connectionUnit.getThreadConnection().setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
     * 提交事务
     * */
    public void commit(){
        try {
            connectionUnit.getThreadConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
     * 回滚事务
     * */
    public void rollback(){
        try {
            connectionUnit.getThreadConnection().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
     * 释放事务
     * */
    public void release(){
        try {
            connectionUnit.getThreadConnection().close();
            connectionUnit.removeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
