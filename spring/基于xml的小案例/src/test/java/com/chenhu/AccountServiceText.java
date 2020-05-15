package com.chenhu;

import com.chenhu.domian.Account;
import com.chenhu.service.AccountService;
import com.chenhu.service.IAccountService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AccountServiceText {

    private ApplicationContext ac;
    private  IAccountService iAccountService;
    @Before
    //重复代码整合
    public void init(){
         //1、获取容器
         ac = new ClassPathXmlApplicationContext("bean.xml");
         //2、得到业务层对象
         iAccountService = (IAccountService) ac.getBean("accountService");
    }

    @Test
    //找到
    public void textFindAll() {


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
        account.setName("Bob");
        account.setMoney(55556f);
        account.setId(1);

        //3、执行方法
        iAccountService.updateAccount(account);
    }
    @Test
    public void textDelete() {

        //3、执行方法
        iAccountService.deleteAccount(4);
    }
    @Test
    public void transfer(){
        iAccountService.transfer("Bob","b",10000f);
    }

}
