package com.java8.tutorial.methodreferences;


import java.time.LocalDate;

public class Person {
    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    private String name;
    private LocalDate birthday;

    public LocalDate getBirthday() {
        return birthday;
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }
}
