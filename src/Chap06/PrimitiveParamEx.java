// 기본형 매개변수 (primitive parameter)는 변수에 저장된 값만 읽을 수만 있고, 변경하지 못한다.

package Chap06;

class Data {
    int x;
}

public class PrimitiveParamEx {

    public static void main(String[] args) {
        Data d = new Data();
        // main에서 x=10으로 변경
        d.x = 10;
        System.out.println("main(): x = " + d.x);
        // change 메서드에서 x를 parameter로 가져갔다.
        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main(): x = " + d.x);

    } // end of main

    static void change(int x) {
        // change 메서드에서는 기존의 x의 값을 복사해서 가져온다.
        // 그리고 x의 값을 1000으로 변경하지만, 이것은 복사본에 업데이트를 하는 것이다.
        // 메서드가 종료되면, 복사본은 스택에서 제거된다.
        x = 1000;
        System.out.println("change(): x = " + x);
    } // end of change
} // end of class PrimitiveParamEx
