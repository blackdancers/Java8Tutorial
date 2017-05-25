package com.java8.tutorial.defaultmethod;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {

        List<Person> personList = Person.createRoster();
        personList.forEach(System.out::println);

        List<String> list = new ArrayList<String>();
        list.add("001");
        list.add("002");
        list.forEach(System.out::println);//方法引用

        String[] array = new String[]{
                "hello",
                ", ",
                "world",
        };
        List<String> strs = Arrays.asList(array);
        strs.forEach(System.out::println); // 这是 jdk 1.8 新增的接口默认方法
    }
}
