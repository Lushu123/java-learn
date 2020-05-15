package java8.Lambda;

import java.util.function.Predicate;

/*
*断言型接口：Predicate<T>

    有传入参数，有返回值Boolean

    该接口对应的方法为接收一个参数，返回一个Boolean类型值

    多用于判断与过滤，使用test()方法执行这段行为

    需求：输入字符串，判断长度是否大于0
* */
public class Demo5 {
    public static void main(String[] args) {
        // 创建字符串
        String str = "hello world";

        // 调用
        boolean flag = testPre(str, (s) -> s.length() > 0);

        System.out.println(flag);
    }

    public static boolean testPre(String str, Predicate<String> pre) {
        // 执行
        boolean flag = pre.test(str);

        return flag;
    }

}
