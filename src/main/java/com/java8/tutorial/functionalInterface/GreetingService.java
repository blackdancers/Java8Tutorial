package com.java8.tutorial.functionalInterface;


@FunctionalInterface
public interface GreetingService {

    public boolean equals(Object obj);

    public String toString();

    void sayMessage(String message);

    static void printHello() {
        System.out.println("Hello..");
    }

    //可以在接口中定义默认方法
    default void doSomeMoreWork1() {
        System.out.println("default method invoke");
    }
}