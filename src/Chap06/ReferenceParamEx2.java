// 주소값을 통해서 변수의 값을 변경하기 위해서는 클래스 선언을 통해서 해결할 수도 있다.
// 하지만, 임시적으로 간단하게 처리하고자 할 때는 별도의 클래스를 선언하는 것보다는 배열을 이용할 수도 있다.

package Chap06;

public class ReferenceParamEx2 {

    public static void main(String[] args) {
        int[] x = { 10 };
        System.out.println("main(): x =" + x[0]);
        change(x);
        System.out.println("After change(x)");
        System.out.println("main(): x =" + x[0]);

    } // end of main

    static void change(int[] x) {

        x[0] = 1000;
        System.out.println("change() : x = " + x[0]);
    }
} // end of class
