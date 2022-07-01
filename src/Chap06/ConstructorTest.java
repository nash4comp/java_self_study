package Chap06;

class ConData1 {
    int value;
}

class ConData2 {
    int value;

    ConData2(int x) {
        value = x;
    }
}

public class ConstructorTest {

    public static void main(String[] args) {
        ConData1 d1 = new ConData1();
        // Constructor가 없다는 에러가 나는데, 이는 parameter가 맞지 않아서 그렇다. 컴파일러에서 기본적으로 추가되는
        // 경우는 클래스에 정의된 생성자가 하나도 없을 때 뿐이다.
//        ConData2 d2 = new ConData2(); 
    } // end of main

} // end of class ConstructorTest
