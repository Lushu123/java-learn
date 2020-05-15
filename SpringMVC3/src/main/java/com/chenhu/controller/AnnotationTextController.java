package com.chenhu.controller;

import com.chenhu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/annotation")
public class AnnotationTextController {


    //RequestMapping注解测试
    @RequestMapping("/requestMapping")
    public String requestMapping(Model model){
        model.addAttribute("msg","RequestMapping");
        return "annotation";
    }

    //@ModelAttribute注解与Model、ModelMap、ModelAndView测试
    @ModelAttribute
    public void textModel(String username,String password,Model model){
        //创建User对象存储jsp页面传来的数据
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        //将User添加到Model中
        model.addAttribute("user",user);
    }

    @RequestMapping("/login1")
    public String login(Model model){
        //得到Model之前存储的user对象
        User user = (User) model.asMap().get("user");
        System.out.println(user.getUsername());
        return "annotation";
    }
}
