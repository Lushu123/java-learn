package com.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com")
@Import({JdbcConfiguration.class,TransactionConfiguration.class})
@EnableAspectJAutoProxy
public class SpringConfiguration {
}
