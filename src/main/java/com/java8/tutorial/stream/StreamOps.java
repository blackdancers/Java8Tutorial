package com.java8.tutorial.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream核心操作方法 Intermediate（中间操作）\Terminal（结束操作）
 *
 */
public class StreamOps {
    public static void main(String[] args) {


        List<String> list = Arrays.asList(new String[]{"Amitabh", "Shekhar", "Aman", "Rahul","Shahrukh", "Salman", "Yana", "Lokesh"});
        //map (mapToInt, flatMap 等)、 filter、 distinct、 sorted、 peek、 limit、 skip、 parallel、 sequential、 unordered
        Stream<String> mediateStream = list.stream();
        Stream<String> terminalStream = list.stream();
        //filter方法，过滤元素
        //mediateStream.filter(s->s.startsWith("S")).forEach(System.out::println);
        //map方法，修改元素
        //mediateStream.filter((s)->s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
        //sorted方法，排序，可以传入自定义排序接口Comparator，
        //mediateStream.sorted(String::compareTo).map(String::toLowerCase).forEach(System.out::println);
        //mediateStream.sorted(Comparator.reverseOrder()).map(String::toLowerCase).forEach(System.out::println);
        //mediateStream.sorted().map(String::toLowerCase).forEach(System.out::println);//forEach方法，迭代元素
        System.out.println("-------------------");

        //collect方法，从Stream中得到集合
        //List<String> memNamesInUppercase = terminalStream.sorted().map(String::toUpperCase).collect(Collectors.toList());
        //System.out.println(memNamesInUppercase);
        //Match方法，匹配判断Stream中的元素是否符合指定规则
        //boolean match = terminalStream.anyMatch(s -> s.startsWith("T"));
        //boolean match = terminalStream.allMatch(s -> s.startsWith("T"));
        //boolean match = terminalStream.noneMatch(s -> s.startsWith("T"));
        //System.out.println(match);
        //count方法，计数
        //long count = terminalStream.filter(s -> s.startsWith("A")).count();
        //System.out.println(count);
        //reduce方法，元素组合操作，常用于字符串拼接、数值的 sum、min、max、average
        Optional<String> optional = terminalStream.reduce((s1, s2) -> s1 + "##" + s2);//Represents a function that accepts two arguments and produces a result.
        optional.ifPresent(System.out::println);//Present -- 存在
        //Stream短路操作 anyMatch()，返回布尔值，只要找到一个匹配的元素，就停止接下来的元素遍历；
        //findFirst()，返回元素，同样，只返回第一个元素，不会全部遍历；

        //使用Stream与不用Stream对比

        List<String> strings = Arrays.asList("abc", "111", "bc", "efg", "12584","", "1254");
        //使用Java 7, 统计字符长度为3的字符串个数
        long count = 0;
        for(String string: strings){
            if(string.length() == 3){
                count++;
            }
        }
        System.out.println("using java7:Strings of length 3: " + count);
        //使用Java 8的stream, 统计字符长度为3的字符串个数
        count = strings.stream().filter(string -> string.length() == 3).count();
        System.out.println("using java8:Strings of length 3: " + count);

        System.out.println("-------------------");
    }

}
