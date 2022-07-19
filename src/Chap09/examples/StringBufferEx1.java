// StringBuffer에는 equals()가 오버라이딩 되어있지 않다.
// 즉, equals()는 주소값을 비교하게 된다.
// 따라서 값을 비교하기 위해서는 String 인스턴스에 toString을 넣고 비교해야 한다.

package Chap09.examples;

public class StringBufferEx1 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");
        System.out.println("b == sb2 ? " + (sb == sb2));
        System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));

        String s = sb.toString();
        String s2 = sb2.toString();
        System.out.println("s.equals(s2) ? " + s.equals(s2));

    }

}
