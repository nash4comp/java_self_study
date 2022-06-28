// 호출 스택 예제이다.
// 스택(stack)의 뜻은 잘 정돈된 뭉치이며, 힙(heap)은 아무렇게나 쌓여있는 뭉치이다.
// 즉, 스택은 메서드, 지역변수, 매개변수, 중간 계산 결과 등을 저장하는데 사용되며, 메서드가 작업을 마치면 할당되었던 메모리 공간은 반환되어 비워진다. 

package Chap06;

public class CallStackTest {

    public static void main(String[] args) {
        firstMethod();
    } // end of main

    // static으로 선언되면, 클래스(스태틱) 메소드가 되며, 클래스가 메모리에 올라갈 때 같이 생성되어 올라간다.
    // 즉, main에서 따로 객체를 생성하지 않고도 메서드를 호출할 수 있다.
    static void firstMethod() {
        secondMethod();
    }

    static void secondMethod() {
        System.out.println("secondMethod()");
    }

} // end of class CallStackTest
