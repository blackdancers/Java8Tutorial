package com.java8.tutorial.defaultmethod;


public class Main03 {

    public static void main(String[] args) {
        new ClassC().foo();
        //ClassA 类并没有实现 InterfaceA 接口中的 foo 方法，InterfaceA 接口中提供了 foo 方法的默认实现，
        // 因此可以直接调用 ClassA 类的 foo 方法。
    }
}

interface Interface {
    default void foo() {
        System.out.println("Interface foo");
    }
}

class ClassC implements Interface {

}
