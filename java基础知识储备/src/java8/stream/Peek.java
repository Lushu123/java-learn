package java8.stream;

import java.util.stream.Stream;

/*
* peek方法生成一个包含原Stream的所有元素的新Stream，同时会提供一个消费函数（Consumer实例），
* 新Stream每个元素被消费的时候都会执行给定的消费函数，并且消费函数优先执行
* */
public class Peek {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5)
                .peek(count -> System.out.println("accept:" +count))
                .forEach(System.out::println);
    }
}
