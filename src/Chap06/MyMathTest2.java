package Chap06;

class MyMath2 {
    long a, b;

    // 인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
    // 즉, 아래는 인스턴스 메서드이다.
    long add() {
        return a + b;
    }

    long subtract() {
        return a - b;
    }

    long multiply() {
        return a * b;
    }

    long divide() {
        return a / b;
    }

    // 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
    // 아래는 클래스 메서드이며, 이 메서드 안에는 인스턴스 변수를 넣을 수 없다.
    // 이 경우, static으로 선언하여 클래스 메서드로 만드는 것이 낫다.
    // 왜냐하면 클래스 메서드로 만들면 클래스가 생성될 때 바로 메모리에 올라가기 때문에 성능이 향상되기 때문이다.
    // 단, 메모리 소비는 인스턴스 메서드보다는 크다.
    static long add(long a, long b) {
        return a + b;
    }

    static long subtract(long a, long b) {
        return a - b;
    }

    static long multiply(long a, long b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

} // end of class MyMath2

public class MyMathTest2 {

    public static void main(String[] args) {
        // 아래의 클래스 메서드는 객체 생성없이 바로 호출이 가능하다.
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200.0, 100.0));

        // 아래의 인스턴스 메서드는 객체를 생성해야 호출이 가능하다.
        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());

    } // end of main

} // end of class MyMathTest2
