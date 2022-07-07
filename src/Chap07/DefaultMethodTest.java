package Chap07;

public class DefaultMethodTest {

    public static void main(String[] args) {
        Child6 c = new Child6();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();

    } // end of main

} // end of class DefaultMethodTest

interface MyInterface {
    default void method1() {
        System.out.println("method1() in MyInterface");
    }

    default void method2() {
        System.out.println("method2() in MyInterface");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}

class Parent6 {
    public void method2() {
        System.out.println("method2() in Parent");
    }
}

// Child6 클래스는 Parent6 클래스를 상속하고, MyInterface, MyInterface2 인터페이스를 구현한다.
// 하지만, 인터페이스들은 따로 구현할 메서드가 없다.
class Child6 extends Parent6 implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method1() in Child");
    }
}
