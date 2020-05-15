package com.chenhu.test;

import com.chenhu.service.IAccountService;
import com.config.SpringConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Text {
    @Test
    public void text(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService as = (IAccountService) ac.getBean("accountService");
        as.transfer("a","d",1000f);
    }
}
