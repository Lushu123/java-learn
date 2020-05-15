package java8.Lambda;


import java.util.Arrays;
import java.util.Comparator;

/*
 * 随着大数据的兴起，函数式编程在处理大数据上的优势开始体现，引入了Lambada函数式编程
 * */
public class Demo1 {
    //自定义排序规则
    public static void main(String[] args) {
        String[] strs = {"abc", "cd", "abce", "a"};

        //传统方法
        // 匿名内部类
//        Arrays.sort(strs, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(),o2.length());
//            }
//        });

        //Lambda表达式

        Arrays.sort(strs, Comparator.comparing(String::length));

        for(String s :strs){
            System.out.println(s);
        }



    }
}
