package com.java8.tutorial.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main01 {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        Stream<String> stream = myList.stream();
        stream.filter(s -> s.startsWith("c")).  //过滤以c字母开头
                map(String::toUpperCase).       //字符变成大写
                sorted().                       //排序
                forEach(System.out::println);   //打印输出
    }
}
