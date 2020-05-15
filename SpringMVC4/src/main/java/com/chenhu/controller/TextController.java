package com.chenhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TextController {

    @RequestMapping("/textStart")
    public String text(){
        System.out.println("textStart执行了。。。");
        return "success";
    }
}
