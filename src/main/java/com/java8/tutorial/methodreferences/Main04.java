package com.java8.tutorial.methodreferences;


import java.time.LocalDate;
import java.util.Arrays;

public class Main04 {
    public static void main(String[] args) {
        Person[] pArr = new Person[]{
                new Person("003", LocalDate.of(2016, 9, 1)),
                new Person("001", LocalDate.of(2016, 2, 1)),
                new Person("002", LocalDate.of(2016, 3, 1)),
                new Person("004", LocalDate.of(2016, 12, 1))};
        //因为这个Lambda表达式调用了一个已存在的方法，因此，我们可以直接使用方法引用来替代这个Lambda表达式，
        Arrays.sort(pArr,Person::compareByAge);
        
        System.out.println(Arrays.asList(pArr));
    }
}
