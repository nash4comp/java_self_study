package Chap06;

public class VarArgsEx {

    public static void main(String[] args) {
        String[] strArr = { "100", "200", "300" };
        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[] { "1", "2", "3" }));
        System.out.println("[" + concatenate(",", new String[0]) + "]");
        System.out.println("[" + concatenate(",") + "]"); // 여기에 ,는 포함되지 않는데,
                                                          // 왜냐하면 delim은 "," 이지만
                                                          // args 배열의 길이가
                                                          // 0이기 때문.
    } // end of main

    static String concatenate(String delim, String... args) {
        String result = "";
        // agrs 배열의 시작 인덱스부터 끝까지 가면서 그 값을 str에 저장한다.
        for (String str : args) {
            // result는 result에 (str + delim)을 더한 값을 누적으로 더한다.
            result += str + delim;
        } // end of for str
        return result;
    } // end of concatenate
}
// end of class VarArgsEx
