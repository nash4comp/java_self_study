package Chap12.examples;

// 람다식을 다루기 위한 인터페이스를 functional interface라고 한다.
// 단, 여기에는 하나의 추상 메서드만 정의되어 있어야 한다.
// static, default method의 개수에는 제약이 없다.
// @FunctionalInterface를 붙이면 컴파일러가 이것을 확인해 준다.

@FunctionalInterface
interface MyFunction {
    void run(); // public abstract void run();
} // end of interface

public class LambdaEx1 {
    static void execute(MyFunction f) { // parameter type이 MyFunction인 method
        // parameter로 전달받은 object의 run method를 실행한다.
        f.run();
    } // end of execute

    static MyFunction getMyFunction() { // return type이 MyFunction인 method
        // method의 return type이 functional interface라면, 이 functional interface의
        // 추상메서드와
        // 동등한 람다식을 가리키는 참조변수를 return하거나 람다식을 직접 return할 수 있다.
        // return type이 MyFunction인 참조변수 f에 "f3.run()"의 값이 들어있는 주소값을 저장
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    } // end of getMyFunction

    public static void main(String[] args) {
//        static void f1Run() {
//            System.out.println("f1.run()");
//        }
        MyFunction f1 = () -> System.out.println("f1.run()");
        MyFunction f2 = new MyFunction() { // 익명 클래스로 run()을 구현
            public void run() { // public을 반드시 붙여야 함
                System.out.println("f2.run()");
            } // expression 이므로 끝에 세미콜론(;)을 붙이지 않는다.
        }; // statement 이므로 끝에 세미콜론(;)을 붙인다.
        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));
    } // end of main

} // end of class
