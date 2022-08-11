package Chap14.examples;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx4 {

    public static void main(String[] args) {
        String[] lineArr = { "Believe or not It is true",
                "Do or do not There is no try", };
        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +")))
//        .map(String::toLowerCase)
//        .distinct()
//        .sorted()
                .forEach(System.out::println);

    }

}
