// 2종류 이상의 구분자가 있을 경우, 쪼개기

package Chap09.examples;

import java.util.StringTokenizer;

public class StringTokenizerEx3 {

    public static void main(String[] args) {
        String source = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
        StringTokenizer st = new StringTokenizer(source, "|");

        // 토큰이 더 남아있으면 while문 계속 진행
        while (st.hasMoreTokens()) {
            // 다음 토큰 그룹을 별도로 저장 (1,김천재,100,100,100 ...)
            String token = st.nextToken();
            StringTokenizer st2 = new StringTokenizer(token, ",");
            while (st2.hasMoreTokens())
                System.out.println(st2.nextToken());
            System.out.println("------");
        } // end of while st
    }
}
