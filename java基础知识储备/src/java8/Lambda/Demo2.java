package java8.Lambda;

import java.util.function.Function;

/*
* a.功能性接口：Function<T, R>

    有输入参数，有返回值

    是对接收一个T类型参数，返回R类型的结果的方法的抽象

    通过调用apply方法执行内容

    需求：给定一个字符串，返回字符串长度
* */
public class Demo2 {

    public static void main(String[] args) {
        String str = "abcdefg";

        int length = testFun(str, String::length);

        System.out.println(length);

    }

    public static int testFun(String strs, Function<String,Integer> fun){
        //1执行

        return fun.apply(strs);
    }

}
