package com.java8.tutorial.defaultmethod;


@FunctionalInterface
public interface GreetingService {

    void sayMessage(String message);

    static void printHello() {
        System.out.println("Hello..");
    }

    //可以在接口中定义默认方法
    default void doSomeMoreWork1() {
        System.out.println("default method invoke");
    }
}