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

    /**
     * @blog http://www.baeldung.com/java-tutorial
     * @blog http://www.baeldung.com/java-8-sort-lambda
     * @param pArr
     */
    private static void sortByLambda(Person[] pArr) {
        //1 Lambda改进
        Arrays.sort(pArr, (a, b) -> {
            return a.getBirthday().compareTo(b.getBirthday());
        });
        //4 多条件排序
        Arrays.sort(pArr, (a, b) -> {
            if (a.getBirthday().equals(b.getBirthday())){
                return a.getName().compareTo(b.getName());
            }else
                return a.getBirthday().compareTo(b.getBirthday());
        });
        //5 多条件组合排序 可以把多个Comparator链在一起（chain together）去建造更复杂的比较逻辑
        Arrays.sort(pArr, Comparator.comparing(Person::getBirthday).thenComparing(Person::getName));

        //2 Lambda改进去掉语句{}和;分号
        Arrays.sort(pArr, (a, b) -> a.getBirthday().compareTo(b.getBirthday()));
        //3 Lambda改进  提取排序
        Arrays.sort(pArr, Comparator.comparing(Person::getBirthday));
        //倒序
//        Comparator<Person> comparator = Comparator.comparing(Person::getBirthday);
//        Arrays.sort(pArr, comparator.reversed());

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