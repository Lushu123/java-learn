package com.example.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public  Map<String, Object> hello(){
        Map<String, Object> map = new HashMap<>();
        map.put("hello","你好");
        map.put("hello1","你好1");
        map.put("hello2","你好2");
        map.put("hello3","你好3");
        return map;
    }

    @RequestMapping("/success")
    public String success( Map<String,Object> map){
        map.put("hello","你好");
        map.put("hello1","你好1");
        map.put("hello2","你好2");
        map.put("hello3","你好3");
        return "success";
    }
}
