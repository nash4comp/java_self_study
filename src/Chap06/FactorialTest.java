package Chap06;

public class FactorialTest {

    public static void main(String[] args) {
        int result = factorial(4);

        System.out.println(result);

    } // end of main

    // static 메서드이므로 클래스가 생성될 때 메모리에 올라간다.
    // 그리고 인스턴스(객체)를 생성하지 않고, 직접 호출이 가능하다.
    // 또한 main 메서드와 같은 클래스 내에 소속되어 있기에 클래스 이름을 생략하는 것도 가능하다.
    // 그래서 FactorialTest.factorial(4) 대신 factorial(4)로 사용이 가능한 것이다.
    static int factorial(int n) {
        int result = 0;
        if (n == 1) {
            result = 1;

        } else {
            result = n * factorial(n - 1);
        }
        return result;

    } // end of factorial
} // end of class FactorialTest
