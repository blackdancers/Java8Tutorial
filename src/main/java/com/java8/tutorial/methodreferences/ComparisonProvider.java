package com.java8.tutorial.methodreferences;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.function.Supplier;

public class ComparisonProvider {

    public int compareByAge(Person a, Person b) {
        return a.getBirthday().compareTo(b.getBirthday());
    }

    public int compareByName(Person p1, Person p2) {
        return p2.getName().compareTo(p1.getName());
    }

    /**
     * 集合拷贝
     * @param sourceCollection
     * @param collectionFactory
     * @param <T>
     * @param <SOURCE>
     * @param <DEST>
     * @return
     */
    public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>>
        DEST transferElements(SOURCE sourceCollection, Supplier<DEST> collectionFactory) {
        DEST result = collectionFactory.get();
        for (T t : sourceCollection) {
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        Person[] pArr = new Person[]{
                new Person("宋青书", LocalDate.of(1310, 9, 1)),
                new Person("张无忌", LocalDate.of(1298, 2, 1)),
                new Person("陈友谅", LocalDate.of(1300, 3, 1)),
                new Person("郭靖", LocalDate.of(1275, 12, 1))};

        ComparisonProvider myComparisonProvider = new ComparisonProvider();
        Arrays.sort(pArr, myComparisonProvider::compareByName);

        String[] stringArray = {"Barbara", "James", "Mary", "John"};
        Arrays.sort(stringArray, String::compareToIgnoreCase);


        List<Person> personList = Arrays.asList(pArr);
        //构造方法引用   HashSet::new
        HashSet<Person> elements = transferElements(personList, HashSet::new);
        System.out.println(Arrays.asList(elements));

    }
}
