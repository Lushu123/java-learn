package com.chenhu.controller;

import com.chenhu.domian.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.swing.*;


@Controller
@RequestMapping("/user")
public class HelloController {

    @RequestMapping(path = "/hello",method = RequestMethod.GET,params = {"username"})
    public String sayHello(){
        System.out.println("hello springmvc");
        return "success";
    }
    @RequestMapping(path = "/param")
    public String param(String username){
        System.out.println(username);
        return "success";
    }

    @RequestMapping(path = "/saveAccount")
    public String saveAccount(Account account){
        System.out.println(account);

        return "success";
    }
}
