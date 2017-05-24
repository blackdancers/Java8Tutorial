package com.java8.tutorial.methodreferences;

import java.time.LocalDate;
import java.util.Arrays;


public class Main03 {
    public static void main(String[] args) {
        Person[] pArr = new Person[]{
                new Person("003", LocalDate.of(2016, 9, 1)),
                new Person("001", LocalDate.of(2016, 2, 1)),
                new Person("002", LocalDate.of(2016, 3, 1)),
                new Person("004", LocalDate.of(2016, 12, 1))};
        //使用Lambda表达式，调用已存在的方法
        Arrays.sort(pArr,(a,b)->Person.compareByAge(a,b));
        System.out.println(Arrays.asList(pArr));
    }
}
