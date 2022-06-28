// return값을 여러개 만드는 예제
// parameter로 배열 혹은 class를 넘겨주고, 메서드 안에서 instance 값을 업데이트 하는 형식으로 한다.

package Chap06;

public class ReturnTest {

    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();
        int result = r.add(3, 5);
        System.out.println(result);
        int[] result2 = { 0 };
        r.add(3, 5, result2);
        System.out.println(result2[0]);

    } // end of main

    int add(int a, int b) {
        return a + b;
    } // end of add

    void add(int a, int b, int[] result) {
        // return 값을 없애고, 대신 result 배열의 0번 index에 값을 업데이트했다.
        result[0] = a + b;
    } // end of add

} // end of class ReturnTest
