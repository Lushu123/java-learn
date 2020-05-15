package com.chenhu;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ShiroApplicationTests {

    @Test
    void contextLoads() {

    }

    @Test
    public void testHelloworld(){
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityManager securityManager1 = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager1);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("zhang","123");
        try {
            subject.login(token);
            System.out.println("登陆成功");
        }catch (AuthenticationException e){

        }

        //6、退出
        subject.logout();
    }

}
