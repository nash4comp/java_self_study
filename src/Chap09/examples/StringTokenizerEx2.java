// StringTokenizer를 사용한 문자열 쪼개기(복수의 구분자)

package Chap09.examples;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {

    public static void main(String[] args) {
        String expression = "x=100*(200+300)/2";
        // 구분자도 토큰으로 간주하도록 함.
        StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());

        } // end of while st
    }
}
