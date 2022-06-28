package Chap06;

class Data2 {
    int x;
}

public class ReferenceParamEx {

    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main(): x = " + d.x);

        // change 메서드에 Data2 클래스 타입의 d의 주소값을 넘겨준다.
        change(d);
        System.out.println("After change(d)");
        System.out.println("main(): x = " + d.x);

    } // end of main

    static void change(Data2 d) {
        // main에서 넘겨받은 주소값이 복사된다.
        // 복사된 주소값을 참조하여 해당 주소에 있는 값을 변경한다.
        // change 메서드가 종료되면 복사된 주소값이 스택에서 제거된다.
        // 즉, 복사된 주소값은 사라지지만 이미 해당 주소값에서의 값 변경은 이루어진 상태이다.
        d.x = 1000;
        System.out.println("change(): x = " + d.x);

    } // end of method change

} // end of class
