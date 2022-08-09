package code.test;

public class StringTest {

    public static void main(String[] args) {
        String str1 = "0123456789";
        String str2 = "23";
        String str3 = str1.substring(2, 4);
        String str4 = "23";
        String str5 = "2";
        String str6 = "3";

//        printHashCode(str1);
//        printHashCode(str2);
//        printHashCode(str3);
//        printHashCode(str4);
//        printHashCode(str5);
//        printHashCode(str6);
//        printHashCode(str5.concat(str6));

//        System.out.println("str1: " + str1);
//        System.out.println("str2: " + str2);
//        System.out.println("str2(to String): " + str2.hashCode());
//        System.out.println("str3: " + str3);
//        System.out.println("str3(to String): " + str3.hashCode());
//        System.out.println("str4: " + str4);
//        System.out.println("str1 == str2" + str1 == str2);
//        System.out.println("str1 == str3" + str1 == str3);
        System.out.println("str2 == str3: " + (str2 == str3));
        System.out.println("str2 == str4: " + (str2 == str4));
    }

    public static void printHashCode(String str) {
        System.out.println(str + "'s hashcode: " + str.hashCode());
    } // end of print

}
