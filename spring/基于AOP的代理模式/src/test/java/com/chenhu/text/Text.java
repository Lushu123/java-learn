package com.chenhu.text;

import com.chenhu.service.AccountService;
import com.chenhu.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {
    @Test
    public void saveAccountText(){
        ApplicationContext ac =new ClassPathXmlApplicationContext("bean.xml");
        IAccountService iac = (IAccountService) ac.getBean("accountService");
        iac.saveAccount();
    }
}
