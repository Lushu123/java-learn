package com.chenhu.controller;

import com.chenhu.pojo.Account;
import com.chenhu.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户。。。");
        //调用service的方法
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts",accounts);
        return "success";
    }
    @RequestMapping("/save")
    public String saveAccount(Account account){
        accountService.saveAccount(account);
        return "success";
    }
    @RequestMapping("/checkoutAccount")
    public String checkoutAccount(Account account){
        System.out.println(account);
        if(accountService.checkoutAccount(account)){
            return "success";
        }else {
            return "error";
        }


    }
}
