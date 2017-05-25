package com.java8.tutorial.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream的创建
 */
public class StreamBuilders {


    static int i = 0;
    public static void main(String[] args) {
        //1、 Stream的创建 使用Stream.of
        Stream<Integer> streamOf = Stream.of(1,100,200,300,34,76);
//        streamOf.sorted().forEach(i-> System.out.println(i));
        //2、使用Arrays.stream
        Stream<Integer> streamArrays = Arrays.stream(new Integer[]{1,100,200,300,34,76});
//        streamArrays.sorted().forEach(i-> System.out.println(i));
        //3、Collection.stream() or Collection.parallelStream()
        List<String> list = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        Stream<String> streamList = list.stream();
        //Stream<String> streamParallel = list.parallelStream();
//        streamList.forEach(p-> System.out.println(p));
        //4、使用IntStream.range
        IntStream intStream = IntStream.range(20, 100);
//        intStream.forEach(p-> System.out.println(p));
        //5、使用Random.ints()
        IntStream intStream1 = new Random().ints(2,15);
//        intStream1.forEach(p-> System.out.println(p));
        //6、使用Stream.generate()

        Stream<Integer> generateStream = Stream.generate(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                if (i==10){
                    System.exit(0);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return i++;
        });
        generateStream.forEach(p-> System.out.println(p));
    }
}
