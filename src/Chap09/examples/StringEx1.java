// String 값을 리터럴로 할당하면 문자열 리터럴의 주소가 저장된다.
// String 값을 new 연산자로 할당하면, 새로운 String 인스턴스를 생성한다.

package Chap09.examples;

public class StringEx1 {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        System.out.println("String str1 =\"abc\";");
        System.out.println("String str2 =\"abc\";");

        System.out.println("str1 == str2 ? " + (str1 == str2));
        System.out.println("str1.equals(str2) ? " + str1.equals(str2));
        System.out.println();

        String str3 = new String("\"abc\"");
        String str4 = new String("\"abc\"");

        System.out.println("String str3 =\"abc\";");
        System.out.println("String str4 =\"abc\";");

        System.out.println("str3 == str4 ? " + (str3 == str4));
        System.out.println("str3.equals(str4) ? " + str3.equals(str4));

        System.out.println("ABC" == "ABC");
        String str5 = null;
        String str6 = str5 + "AAA";

        System.out.println(str5 + str5);
//        System.out.println(str5.concat("BBB"));
        System.out.println(str6);
        System.out.println("BBB".concat(null));

    }
}
