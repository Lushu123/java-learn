package com.chenhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.*;

@Controller
@RequestMapping("/DataBindingTest")
public class DataBindingController {
    //测试@Pathvariable、@RequestHeader、@CookieValue的用法

    @RequestMapping("/pathVariableTest/{userID}")
    public void pathVariableTest(@PathVariable Integer userID){
        System.out.println("通过@PathVariable获取的数据" + userID);

    }
    @RequestMapping("/requestHeaderTest")
    public void requestHeaderTest(
            @RequestHeader("User-Agent") String userAgent,
            @RequestHeader(value = "Accept") String accepts){
        System.out.println("通过@RequestHeader获取的数据" + userAgent + accepts);

    }

}
