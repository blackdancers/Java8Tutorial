package com.java8.tutorial.examples;


public class Main02 {
    public static void main(String[] args) {
        DefaultClass1 test1 = new DefaultClass1();
        test1.foo();
    }
}

class DefaultClass1 implements InterfaceA1, InterfaceA {
    @Override
    public void foo() {
        InterfaceA1.super.foo();//优先调用,
        //InterfaceA.super.foo();
    }
}

class DefaultClass2 implements InterfaceA2, InterfaceA1 {
    @Override
    public void foo() {
        InterfaceA1.super.foo();
        InterfaceA2.super.foo();
    }
}
class DefaultClass3 implements InterfaceA3, InterfaceA1,InterfaceA2 {
    @Override
    public void foo() {
        //InterfaceA1.super.foo();
        InterfaceA2.super.foo();
        InterfaceA3.super.foo();
    }
}

interface InterfaceA {
    default void foo() {
        System.out.println("InterfaceA foo invoke");
    }
}

interface InterfaceA1 extends InterfaceA {
    @Override
    default void foo() {
        System.out.println("InterfaceA1 foo invoke");
    }
}

interface InterfaceA2 extends InterfaceA {
    @Override
    default void foo() {
        System.out.println("InterfaceA2 foo invoke");
    }
}

interface InterfaceA3 extends InterfaceA1 {
    @Override
    default void foo() {
        System.out.println("InterfaceA3 foo invoke");
    }
}

