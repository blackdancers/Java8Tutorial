package com.java8.tutorial.methodreferences;

import java.util.Collection;
import java.util.function.Supplier;

public class Main05 {
    public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>>
    DEST transferElements(
            SOURCE sourceCollection,
            Supplier<DEST> collectionFactory) {

        DEST result = collectionFactory.get();
        for (T t : sourceCollection) {
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        
    }
}
