package com.java8.tutorial.functionalInterface;

/**
 * Interface can extend another interface and in case the Interface it is extending in functional
 *  and it doesn’t declare any new abstract methods then the new interface is also functional.
 *  But an interface can have one abstract method and any number of default methods and the
 *  interface would still be called an functional interface. To get an idea of default methods
 *  please read here.
 */
@FunctionalInterface
public interface ComplexFunctionalInterface extends SimpleFuncInterface {
    default public void doSomeWork() {
        System.out.println("Doing some work in interface impl...");
    }

    default public void doSomeOtherWork() {
        System.out.println("Doing some other work in interface impl...");
    }
    //public boolean isFunctional();
}