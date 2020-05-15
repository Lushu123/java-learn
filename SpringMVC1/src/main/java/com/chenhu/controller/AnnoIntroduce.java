package com.chenhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/annotation")
public class AnnoIntroduce {

    @RequestMapping(path = "/param")
    public String param(@RequestParam(value = "name") String username){
        System.out.println(username);
        return "annotionpage";
    }
}
