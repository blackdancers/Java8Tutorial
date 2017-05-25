package com.java8.tutorial.defaultmethod;


public class Main02 {

    public static void main(String[] args) {
        //new InterfaceA(){}.foo();
        new InterfaceB(){}.foo();
        new InterfaceC(){}.foo();
        new InterfaceD(){
            @Override
            public void foo() {
                System.out.println("InterfaceD foo");
            }
        }.foo();
        //lambda 表达式
        ((InterfaceD)()-> System.out.println("InterfaceD foo")).foo();

    }

}

interface InterfaceA {
    default void foo() {
        System.out.println("InterfaceA foo");
    }
}

/**
 * 不覆写默认方法，直接从父接口中获取方法的默认实现。
 */
interface InterfaceB extends InterfaceA {
}

/**
 * 覆写默认方法，这跟类与类之间的覆写规则相类似。
 */
interface InterfaceC extends InterfaceA {
    @Override
    default void foo() {
        System.out.println("InterfaceC foo");
    }
}

/**
 * 覆写默认方法并将它重新声明为抽象方法，这样新接口的子类必须再次覆写并实现这个抽象方法。
 */
interface InterfaceD extends InterfaceA {
    @Override
    void foo();
}
