package java8.Lambda;


import java.util.function.Consumer;
import java.util.function.Supplier;

/*
* 供给型接口：Supplier<T>

    无传入参数，有返回值

    该接口对应的方法类型不接受参数，但是提供一个返回值

    使用get()方法获得这个返回值
* */
public class Demo4 {
    public static void main(String[] args) {
        // 创建字符串
        String str = "hello world";

        // 调用
        testFun(()->str);


    }

    public static String testFun(Supplier<String> fun){
        return fun.get();
    }
}
