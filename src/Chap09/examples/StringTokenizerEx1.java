package Chap09.examples;
// StringTokenizer를 사용한 문자열 쪼개기

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

    public static void main(String[] args) {
        String source = "100,200,300,400";
        StringTokenizer st = new StringTokenizer(source, ",");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        } // end of while st

    } // end of main

}

// int countTokens()        전체 토큰 수 반환
// boolean hasMoreTokens()  토큰이 남아있는지 알려줌
// String nextToken()       다음 토큰을 반환
