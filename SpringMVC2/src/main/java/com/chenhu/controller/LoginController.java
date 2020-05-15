package com.chenhu.controller;


import com.chenhu.domian.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping(path = "/wello")
    public String wello(Model model, User user){
        model.addAttribute("user1",user);
        System.out.println(user.getUsername());
        return "success";
    }
}
