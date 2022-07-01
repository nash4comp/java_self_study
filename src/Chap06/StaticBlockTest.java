package Chap06;

public class StaticBlockTest {
    // 명시적 초기화, 배열의 값이 int이므로 0으로 초기화된다.
    // page 278 참조
    // static을 붙이는 이유는 클래스 변수로 선언하는 것이고, 클래스 변수로 선언하면 메모리에 바로 로딩이 된다.
    //
    // 클래스 변수로 선언하는 이유는
    // 1. 모든 인스턴스에 공통된 값을 유지해야 하기 때문
    // 2. 작성한 메서드 중에서 인스턴스 변수나 인스턴스 메서드를 사용하지 않는 메서드일 경우
    // 이렇게 static으로 올려버리면, 작업 속도가 빨라진다. 대신 메모리 사용도 늘어남.
    static int[] arr = new int[10];

    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;

        } // end of for i

    } // end of class initialization block

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] :" + arr[i]);

        } // end of for i

    } // end of main

} // end of class StaticBlockTest
