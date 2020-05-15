package com.factory;
//模拟spring框架

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/*
* 创建Bean对象的工厂
*
* */
public class BeanFctory {
    //定义一个Properties对象
    private static Properties props;

    //定义一个map，用于存放我们要创建的对象，我们把它称之为容器
    private static Map<String,Object> beans;

    //利用静态代码块为Properties对象赋值
    static {
        try {
            //实例化对象
            props = new Properties();
            //加载properties文件的流对象
            InputStream in = BeanFctory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
            //实例化容器
            beans = new HashMap<String, Object>();
            //取出配置文件中所有的key
            Enumeration keys = props.keys();
            //遍历枚举
            while (keys.hasMoreElements()){
                //取出key
                String key = keys.nextElement().toString();
                //根据key取配置文件中的全限定类名
                String pathName = props.getProperty(key);
                //反射创建对象
                Object value = Class.forName(pathName).newInstance();
                //将key和value存入容器中
                beans.put(key,value);
            }
            //遍历枚举

        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化失败");
        }
    }


    //根据bean的全限定类名获取bean实例
    /*public static Object getBean(String beanName){
        Object bean = null;
        String beanPath = props.getProperty(beanName);//得到配置文件中的全限定类名
        System.out.println(beanPath);
        try {
            bean = Class.forName(beanPath).newInstance();//利用反射获取类实例(调用默认构造函数创建对象)
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }*/


    //改造
    public static Object getBean(String beanName){
        return beans.get(beanName);
    }

}
