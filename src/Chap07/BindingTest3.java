package Chap07;

public class BindingTest3 {

    public static void main(String[] args) {

        // p는 Parent5 타입의 참조변수
        // 그 참조변수 p에 Child5의 인스턴스를 연결한 것이다.
        // 즉, p의 값에 Child5의 객체를 생성한 주소값은 넣은 것
        Parent5 p = new Child5();
        Child5 c = new Child5();

        System.out.println("p.x =" + p.x);
        // p의 메서드를 호출하면 Child5의 메서드가 호출된다.
        p.method();
        System.out.println();
        System.out.println("c.x =" + c.x);
        c.method();

    } // end of main

} // end of class BindingTest3

class Parent5 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");

    }
}

class Child5 extends Parent5 {
    int x = 200;

    void method() {
        System.out.println("x=" + x);
        System.out.println("super.x=" + super.x);
        System.out.println("this.x=" + this.x);
    }

}