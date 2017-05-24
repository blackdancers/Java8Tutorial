package com.java8.tutorial.functionalInterface;


public class GreetingServiceImpl implements GreetingService {
    @Override
    public void sayMessage(String message) {
        System.out.println("必须实现");
    }

    @Override
    public void doSomeMoreWork1() {
        System.out.println("default method invoked by impl");
    }
}
