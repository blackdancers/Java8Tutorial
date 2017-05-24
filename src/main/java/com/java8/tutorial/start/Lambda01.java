package com.java8.tutorial.start;


public class Lambda01 {
    /*
    interface GreetingService {
        void sayMessage(String message);
    }
    interface MathOperation {
        int operation(int a, int b);
    }
    */
    interface Runnable {
        void run();
    }
    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
    public static void main(String[] args) {
        Lambda01 lambda01 = new Lambda01();
        /**
         * 有参数类型
         */
        MathOperation addition = (int a, int b) -> a + b;
        /**
         * 无参数类型
         */
        MathOperation subtraction = (a, b) -> a - b;
        /**
         * 无参数类型,有花括号，有return关键字
         */
        MathOperation multiplication = (a, b) -> {
            return a * b;
        };
        /**
         *  无花括号，无return关键字，单一表达式情况
         */
        MathOperation division = (int a, int b) -> a / b;

        //MathOperation调用示例
        System.out.println(addition.operation(10, 5));
        System.out.println(lambda01.operate(10, 5, addition));
        System.out.println("----------------------------");

        /**
         * 无括号
         */
        GreetingService greeting = message -> System.out.println(message + "Lambda!");
        greeting.sayMessage("Hello ..");
        /**
         * 有括号，单个参数情况
         */
        GreetingService service = (msg) -> System.out.println(msg);
        service.sayMessage("kongniqiwa!");
        /**
         * 有括号， 无参情况
         */
        Runnable run = () -> System.out.println("running...");
        run.run();
    }
}
