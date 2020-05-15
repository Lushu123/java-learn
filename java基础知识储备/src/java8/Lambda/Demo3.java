package java8.Lambda;

import java.util.function.Consumer;
import java.util.function.Function;

/*
* 消费型接口：Consumer<T>

    有输入参数，没返回值

    对应的方法类型为接收一个参数，没有返回值

    一般来说使用Consumer接口往往伴随着一些期望状态的改变

    或者事件的发生，典型的forEach就是使用的Consumer接口

    虽然没有任何的返回值，但是向控制台输出结果

    Consumer 使用accept对参数执行行为

    需求：输出字符串

* */
public class Demo3 {
    public static void main(String[] args) {
        // 创建字符串
        String str = "hello world";

        // 调用
        testFun(str, System.out::println);

    }

    public static void testFun(String strs, Consumer<String> fun){
        fun.accept(strs);
    }
}
