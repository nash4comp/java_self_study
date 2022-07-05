// final modifier의 경우 생성자에서 초기화를 할 수 있다.
// 생성자에서 parameter를 받고 final 변수를 초기화 하는데,
// 이 기능을 활용하면 각 인스턴스마다 final이 붙은 멤버변수가
// 다른 값을 갖도록 하는 것이 가능하다.

package Chap07;

class Card2 {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    // 아래의 생성자에서 final 변수의 값을 초기화 한다.
    Card2(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }

    Card2() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }

} // end of class Card

public class FinalCardTest {

    public static void main(String[] args) {
        Card2 c = new Card2("HEART", 10);
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);

    } // end of main

} // end of class FinalCardTest
