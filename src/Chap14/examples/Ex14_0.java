package Chap14.examples;

import java.util.stream.Stream;

public class Ex14_0 {

    public static void main(String[] args) {
        Stream<Integer> intStream = Stream.iterate(1, n -> n + 2);
        intStream.limit(10).forEach(System.out::println);
    } // end of main

}
