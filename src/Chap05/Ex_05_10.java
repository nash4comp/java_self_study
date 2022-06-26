//다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
//(1)에 알맞은 코드를 넣어서 완성하시오.

package Chap05;

public class Ex_05_10 {

    public static void main(String[] args) {
        char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
                '(', ')', '-', '_', '+', '=', '|', '[', ']', '{', '}', ';', ':',
                ',', '.', '/' };
        // 0 1 2 3 4 5 6 7 8 9
        char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
        String src = "abc123";
        String result = "";

        // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            if (ch >= 97 && ch <= 122) {
                // ch - 'a'로 쉽게 표현해도 ok
                result += abcCode[ch - 97];
            } else if (ch >= 48 && ch < 57) {
                // ch - '0'로 쉽게 표현해도 ok
                result += numCode[ch - 48];

            } // end of if ch

        } // end of for i
        System.out.println("src:" + src);
        System.out.println("result:" + result);
    } // end of main

} // end of class
