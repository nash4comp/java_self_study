// delimiter를 활용한 문자열 쪼개기

package Chap09.examples;

import java.util.StringJoiner;

public class StringEx4 {

    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        System.out.println(String.join("-", arr));
        StringJoiner sj = new StringJoiner("/", "[", "]");
        for (String s : arr)
            sj.add(s);
        System.out.println(sj.toString());
    }
}
