package com.example.demo.controller;

import com.example.demo.pojo.ValidatorPojo;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/valid")
public class ValidatorController {

    @ResponseBody
    @RequestMapping("/validate")
    public Map<String,Object> validate(
            @Valid @RequestBody ValidatorPojo vp, Errors errors){
        Map<String,Object> map = new HashMap<>();

        //获取错误列表
        List<ObjectError> oes = errors.getAllErrors();
        for(ObjectError oe : oes){
            String key = null;
            String msg = null;
            //字段错误
            if(oe instanceof FieldError){
                FieldError fe = (FieldError) oe;
                key = fe.getField();//获取错误验证字段名
            }else {
                key = oe.getObjectName();
            }
            //错误信息
            msg = oe.getDefaultMessage();
            map.put(key,msg);
        }
        return map;
    }

}
