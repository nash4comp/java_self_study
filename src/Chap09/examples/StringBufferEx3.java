// String 을 StringBuffer로 변환
// StringBuffer를 String으로 변환하는 예제

package Chap09.examples;

public class StringBufferEx3 {

    public static void main(String[] args) {

        String str = "ABCDEFG";
        // String을 StringBuffer로 변환 2가지 방법
        StringBuffer stb = new StringBuffer(str);
        System.out.println(stb);

        StringBuffer stb2 = new StringBuffer(stb.length());
        stb2.append(str);
        System.out.println(stb2);

        // StringBuffer를 String으로 변환 2가지 방법
        String str2 = stb.toString();
        System.out.println(str2);

        String str3 = new String(stb);
        System.out.println(str3);

    }
}
