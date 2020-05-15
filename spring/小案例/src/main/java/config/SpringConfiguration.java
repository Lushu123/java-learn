package config;


import com.chenhu.factory.BeanFactroy;
import org.springframework.context.annotation.*;



/*
* 该类是一个配置类，它相当于一个xml配置文件，故xml配置文件已经不是必须的了
*   @Configuration：
*       作用：指定当前类为一个配置类
*       细节：当配置类作为AnnotationConfigApplicationContext对象创建的参数时，该注解可以不写。
*   @ComponentScan：
*       作用：用于通过注解指定Spring在创建容器时要扫描的包
*   @Bean：
*       作用：将函数创建的对象放入ioc容器中
*       属性：
*           name：用于指定bean的id，不写时默认为当前方法的名称
*   @Import()
*       作用；导入其他的配置类（导入的为此配置类的子类）
*       value：用于其他配置类的字节码
*   @PropertySource:
*       作用：用于指定properties文件的位置
* */
//根配置类，可以导入其他子配置类
@Configuration
@ComponentScan(basePackages = "com")//相当于：<context:component-scan base-package="com.chenhu"></context:component-scan>
@Import({JDBCConfiguration.class })
@PropertySource("classpath:jdbcConfiguration.properties")
@EnableAspectJAutoProxy
public class SpringConfiguration {

}
