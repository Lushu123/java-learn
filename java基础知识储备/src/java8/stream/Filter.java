package java8.stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
*  类似于JavaScript中的filter过滤：返回符合函数要求的项(遍历数据并检查其中的元素)
*
* */
public class Filter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // 添加元素
        list.add("sdf");
        list.add("a");
        list.add("asdf");
        list.add("d");

        //统计长度大于二的
        Long count = list.stream().filter((s)-> s.length() > 2).count();

        //将符合要求的放入集合中
        List<String> list1 = list.stream().filter((s)-> s.length() > 2).collect(Collectors.toList());

        System.out.println(count);

        //传入输出打印函数，对list1中的每个选项执行此函数
        list1.forEach(System.out::println);

    }
}
