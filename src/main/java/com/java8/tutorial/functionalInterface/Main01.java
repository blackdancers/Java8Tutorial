package com.java8.tutorial.functionalInterface;

/**
 * Created by blackdancer on 2017/5/24.
 */
public class Main01 {

public static void main(String[] args) {
    MyFirstFunctionalInterface fun = ()-> System.out.println("The First FunctionalInterface");
    fun.firstWork();
}
}
