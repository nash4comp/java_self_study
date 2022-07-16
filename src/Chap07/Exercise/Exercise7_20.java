package Chap07.Exercise;

public class Exercise7_20 {

    public static void main(String[] args) {
        // Parent2 클래스 타입의 참조변수 p를 선언한다.
        // Child2 클래스의 인스턴스를 생성하고, 그 생성된 주소값을 p에 대입한다.
        Parent2 p = new Child2();

        // Child2 클래스 타입의 참조변수 c를 선언한다.
        // Child2 클래스의 인스턴스를 생성하고, 그 생성된 주소값을 c에 대입한다.
        Child2 c = new Child2();

        // 참조변수 p는 Parent2 클래스 타입이므로, Parent2에 있는 멤버변수를 참조하여 100을 리턴한다.
        System.out.println("p.x = " + p.x);
        // 메서드는 자손에서 오버라이딩이 되어있기 때문에, 자손의 method를 호출한다.
        p.method();

        // 참조변수 c는 Child2 클래스 타입이므로, Child2에 있는 멤버변수를 참조하여 200을 리턴한다.
        // 메서드는 자손에서 오버라이딩이 되어있기 때문에, 자손의 method를 호출한다.
        System.out.println("c.x = " + c.x);
        c.method();
    } // end of main

} // end of class

class Parent2 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    } // end of method

} // end of class Parent

class Child2 extends Parent2 {
    // 조상 클래스에 선언된 멤버변수와 같은 이름의 인스턴스 변수가 자손 클래스에 정의되어 있다.
    // 조상 타입의 참조변수(위에서는 p)로 자손의 인스턴스를 참조하는 경우와
    // 자손 타입의 참조변수(위에서는 c)로 자손의 인스턴스를 참조하는 경우는 서로 다른 결과를 갖는다.
    // 즉, 참조변수의 타입에 따라 멤버변수는 호출되는 것이 달라진다.

    // 메서드는 자손에서 오버라이딩이 된 경우, 무조건 오버라이딩 된 메서드만 호출한다.
    int x = 200;

    void method() {
        System.out.println("Child Method");
    } // end of method

} // end of class Child
