package com.chenhu;

import com.chenhu.domian.Account;
import com.chenhu.service.AccountService;
import com.chenhu.service.IAccountService;
import com.chenhu.service.Text1;
import config.SpringConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AccountServiceText1 {

    private ApplicationContext ac;
    private  IAccountService iAccountService;
    private Text1 t;
    @Before
    //重复代码整合
    public void init(){
         //1、获取容器
        //基于注解的获取ioc容器的方法
         ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
         //2、得到业务层对象
         iAccountService = (IAccountService) ac.getBean("accountService");
        t =  (Text1) ac.getBean("text1");
    }

    @Test
    //找到
    public void textFindAll() {
        //1、获取容器
        //ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        //3、执行方法
        List<Account>accounts = iAccountService.findAllAccount();

        for(Account account:accounts){
            System.out.println(account);
        }
    }
    @Test
    public void textFindOne() {

        //3、执行方法
        Account account = iAccountService.findAccountById(2);
        System.out.println(account);
    }
    @Test
    public void textSave() {
        Account account = new Account();
        account.setName("text");
        account.setMoney(12346f);

        //3、执行方法
        iAccountService.saveAccount(account);
    }
    @Test
    public void textUpdate() {
        Account account = new Account();
        account.setName("a");
        account.setMoney(55556f);
        account.setId(1);

        //3、执行方法
        iAccountService.updateAccount(account);
    }
    @Test
    public void textDelete() {

        //3、执行方法
        iAccountService.deleteAccount(3);
    }
    @Test
    public void transfer(){
        iAccountService.transfer("a","d",10f);
    }

    @Test
    public void text(){

        t.textAop();
    }
}
