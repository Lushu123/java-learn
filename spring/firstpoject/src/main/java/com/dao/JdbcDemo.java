package com.dao;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {
        try {
            //注册驱动
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //获取连接
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","123456");
            //获取操作数据库的预处理对象
            PreparedStatement ps = con.prepareStatement("select * from name");
            //执行sql语句,获取结果集
            ResultSet rs = ps.executeQuery();
            //遍历结果集
            while (rs.next()){
                System.out.println(rs.getString("name")+rs.getInt("id"));
            }

            rs.close();
            ps.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
