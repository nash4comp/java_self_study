package Chap06;

public class Ex_06_22 {

    static boolean isNumber(String str) {
        if (str.length() == 0 || str.isEmpty()) {
            return false;
        }

        boolean isNum = true;
        for (int i = 0; i < str.length(); i++) {

            // 여기에 '0'과 '9'를 써도 된다.
            if (str.charAt(i) < 48 || str.charAt(i) > 57) {
                isNum = false;
            } // end of if i
        } // end of for i
        return isNum;

    } // end of isNumber

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

    }

}
