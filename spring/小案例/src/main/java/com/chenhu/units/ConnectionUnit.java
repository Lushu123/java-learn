package com.chenhu.units;

/*
* 连接的工具，用于从数据库中获取一个连接，并实现和线程的绑定
* */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component("connectionUnit")
public class ConnectionUnit {
    private ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

    @Autowired
    private DataSource dataSource;

//    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    //获取当前线程的连接
    public Connection getThreadConnection(){
        //1先从ThreadLocal上获取连接
        Connection con = tl.get();
        //2判断当前线程是否有连接

        if(con == null){
            //3从数据源获取一个连接，并和当前线程绑定
            try {
                con = dataSource.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            tl.set(con);
        }
        //4返回当前线程的连接
        return con;
    }
    public void removeConnection(){
        tl.remove();
    }
}
