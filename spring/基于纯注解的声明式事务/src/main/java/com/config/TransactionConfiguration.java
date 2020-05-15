package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

//和事务相关的配置
public class TransactionConfiguration {
    @Bean
    public PlatformTransactionManager getTransactionConfiguration(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
