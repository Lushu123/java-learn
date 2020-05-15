package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Part;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    //返回json数据
    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(Integer id){

        return userService.getUserById(id);
    }
    //rest风格
    @RequestMapping("/{id}")
    @ResponseBody
    public User getUser1(@PathVariable("id") Integer id){
        return userService.getUserById(id);
    }

    //保存数据到数据库
    @RequestMapping("/insertUser")
    public String insertUser(String name,Integer age){
       User user = new User();
       user.setName(name);
       user.setAge(age);
       userService.insertUser(user);
       return "redirect:/";
    }

    //格式化参数
    @RequestMapping("/format")
    @ResponseBody
    public Map<String,Object> format(
            @DateTimeFormat(pattern = "yyyy/MM/dd")Date date,
            @NumberFormat(pattern = "#,###.##") Double number){

        Map<String,Object> map = new HashMap<>();
        map.put("data",date);
        map.put("number",number);
        return map;
    }

    //文件上传

    @RequestMapping("uploadPart")
    @ResponseBody
    public Map<String,Object> uploadPart(Part file){
        Map<String,Object> filemap = new HashMap<>();
        //获取提交文件名称
        String fileName = file.getSubmittedFileName();
        try {
            //写入文件
            file.write(fileName);
            filemap.put("success",true);
            filemap.put("mag","上传成功");
        } catch (IOException e) {
            e.printStackTrace();
            filemap.put("success",false);
            filemap.put("mag","上传失败");
        }

        return filemap;
    }
}
