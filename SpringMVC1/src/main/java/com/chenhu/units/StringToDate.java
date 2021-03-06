package com.chenhu.units;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//自定义类型装换器
public class StringToDate implements Converter<String, Date> {

    public Date convert(String s) {
        if(s == null){
            throw new RuntimeException("请输入日期");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException("转换出错");
        }
    }
}
