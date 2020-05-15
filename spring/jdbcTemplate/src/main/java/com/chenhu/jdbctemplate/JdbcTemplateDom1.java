package com.chenhu.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/*
* jdbctemplate的基本用法
*
* */
public class JdbcTemplateDom1 {

    public static void main(String[] args) {
        //准备数据源spring内置的
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/first");
        ds.setUsername("root");
        ds.setPassword("123456");

        //创建JdbcTemplate
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(ds);
        //执行操作
        jdbcTemplate.execute("insert into account (name,money) values ('ccc',100)");
    }
}
