package com.java8.tutorial.methodreferences;

import java.time.LocalDate;
        import java.util.Arrays;
        import java.util.Comparator;

public class Main01 {

    static class PersonAgeComparator implements Comparator<Person> {
        public int compare(Person a, Person b) {
            return a.getBirthday().compareTo(b.getBirthday());
        }
    }

    //以前的做法，使用比较器
    private static void sortByComparator(Person[] pArr) {
        Arrays.sort(pArr, new PersonAgeComparator());
    }

    private static void sortByLambda(Person[] pArr) {
        Arrays.sort(pArr, (a, b) -> {
            return a.getBirthday().compareTo(b.getBirthday());
        });
    }

    private static void sortByMethod(Person[] pArr) {
        //使用Lambda表达式，调用已存在的方法
        Arrays.sort(pArr, (a, b) -> Person.compareByAge(a, b));
    }

    //因为这个Lambda表达式调用了一个已存在的方法，
    //因此，我们可以直接使用方法引用来替代这个Lambda表达式
    private static void sortByMethodReferences(Person[] pArr) {
        Arrays.sort(pArr, Person::compareByAge);
    }

    public static void main(String[] args) {
        Person[] pArr = new Person[]{
                new Person("003", LocalDate.of(2016, 9, 1)),
                new Person("001", LocalDate.of(2016, 2, 1)),
                new Person("002", LocalDate.of(2016, 3, 1)),
                new Person("004", LocalDate.of(2016, 12, 1))};
        //sortByComparator(pArr);
        //sortByLambda(pArr);
        //sortByMethod(pArr);
        sortByMethodReferences(pArr);
        System.out.println(Arrays.asList(pArr));
    }
}