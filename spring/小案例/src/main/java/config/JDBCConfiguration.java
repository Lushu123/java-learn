package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/*
* 连接数据库的配置类
* */

public class JDBCConfiguration {
    //占位符有问题
//    @Value("${jdbc.driverClass }")
//    private String jdbcClass;
//    @Value("${jdbc.jdbcUrl }")
//    private String jdbcUrl;
//    @Value("${jdbc.user }")
//    private String user;
//    @Value("${jdbc.password }")
//    private String password;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    //创建一个QueryRunner对象
    @Bean(name = "queryRunner")
    @Scope(scopeName = "prototype")//多例
    public QueryRunner creatQueryRunner(){
        return new QueryRunner();
    }
    //创建一个DataSource对象
    @Bean(name = "dataSource")
    public DataSource creatQueryDataSource(){
        ComboPooledDataSource ds = new ComboPooledDataSource();
        try {
            ds.setDriverClass("com.mysql.jdbc.Driver");
            ds.setJdbcUrl("jdbc:mysql://localhost:3306/first");
            ds.setUser("root");
            ds.setPassword("123456");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        return ds;
    }

}
