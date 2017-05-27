package com.java8.tutorial.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream类型转集合/数组类型
 */
public class StreamTo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(new Integer[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 });
        Stream<Integer> stream = list.stream();

        List<Integer> integerList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        integerList.forEach(p-> System.out.println(p));


        Stream<Integer> stream2 = list.stream();
        Integer[] array = stream2.filter(i -> i % 2 == 1).toArray(Integer[]::new);
        System.out.println(Arrays.asList(array));
    }

}
