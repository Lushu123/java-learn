package com.chenhu.controller;

import com.chenhu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
   private static List<User> userList;
   public UserController(){
       userList = new ArrayList<User>();
   }
   //跳转到注册页面
   @RequestMapping(value = "/register",method = RequestMethod.GET)
   public String registerForm(){
       //跳转到注册页面
       return "user/registerForm";
   }
    //跳转到登录页面
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(
            @RequestParam("username")String username,
            @RequestParam("password")String password
    ){
       User user = new User();
       user.setUsername(username);
       user.setPassword(password);
       userList.add(user);
        //跳转到登录页面
        return "user/register";
    }
    //验证账号
    @RequestMapping(value = "/login")
    public String login(
            @RequestParam("username")String username,
            @RequestParam("password")String password,
            Model model
    ){
       for(User user:userList){
           if(user.getUsername().equals(username)&&user.getPassword().equals(password)){
               model.addAttribute("user",user);
               return "user/welcome";
           }
       }
        return "user/registerForm";
    }
}
