package com.chenhu.controller;

import com.chenhu.domian.Account;
import com.chenhu.domian.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/abc")
public class GetDataController {

    @RequestMapping(path = "/account")
    public String param(Model model){
        Account account = new Account();
        account.setUsername("sss");
        account.setPassworld("dddd");
        account.setDate(new Date());
        account.setMoney(1111.0);
        model.addAttribute("account",account);

        return "success";
    }
    @RequestMapping(path = "/wello")
    public String wello(Model model,User user){
        model.addAttribute("user1",user);
        System.out.println(user.getUsername());
        return "success";
    }
}
