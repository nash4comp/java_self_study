package Chap06;

public class CardTest {

    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 ("
                + Card.width + ", " + Card.height + ") ");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 ("
                + Card.width + ", " + Card.height + ") ");
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");

        // width, height는 static(class) 변수이므로, 모든 클래스에서 공통적으로 공유한다.
        // 그리고 클래스 변수를 사용할 때는 가급적이면 Card.width=50과 같은 형식으로 사용하여 인스턴스 변수로 오해하지
        // 않도록 한다.
//        c1.width = 50;
//        c1.height = 80;

        Card.width = 60;
        Card.height = 90;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 ("
                + Card.width + ", " + Card.height + ") ");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 ("
                + Card.width + ", " + Card.height + ") ");

    } // end of main

} // end of class CardTest

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
} // end of class Card
