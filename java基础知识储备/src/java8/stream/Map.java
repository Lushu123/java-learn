package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
* 如果有一个函数可以将一种类型的值转换成另外一种类型

    map 操作就可以使用该函数，将一个流中的值转换成一个新的流

    需求：将字符串全转换成大写
* */
public class Map {

    public static void main(String[] args) {
        // 创建集合
        List<String> list = new ArrayList<>();

        // 添加元素
        list.add("sdf");
        list.add("a");
        list.add("asdf");
        list.add("d");
        list.add("basdfgh");

        List<String> list1 = list.stream().map(String::toUpperCase).collect(Collectors.toList());

        list1.forEach(System.out::println);
    }

}
