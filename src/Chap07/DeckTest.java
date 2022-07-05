package Chap07;

public class DeckTest {

    public static void main(String[] args) {
        // 클래스 Deck 타입의 인스턴스 d를 선언
        // 인스턴스 d는 CARD_NUM, cardArr[], pick(), shuffle()을 가진다.
        Deck d = new Deck();

        // 클래스 Card 타입의 인스턴스 c를 선언
        // 인스턴스 c는 KIND_MAX 등의 상수와 kind, number, toString()을 가진다.
        // Card c = new Card(); c = d.pick(0)
        // Card 생성자가 호출되면, 그 카드를 SPADE 1로 초기화를 한다.
        // d.pick(0)는 인스턴스 d에서 메서드 pick을 호출한다 -> pick의 인덱스 0를 가져온다.
        // 즉, pick의 첫번째 카드의 정보를 인스턴스 c에 넣는다.
        Card2 c = d.pick(0);
        System.out.println(c);

        d.shuffle(); // 인스턴스 d의 카드를 섞는다.
        c = d.pick(0); // 인스턴스 c에 첫번째 카드의 정보를 넣는다.
        System.out.println(c);

    } // end of main

} // end of class DeckTest

class Deck {
    final int CARD_NUM = 52;
    Card2 cardArr[] = new Card2[CARD_NUM];

    Deck() {
        int i = 0;
        for (int k = Card2.KIND_MAX; k > 0; k--) {
            for (int n = 0; n < Card2.NUM_MAX; n++) {
                // cardArr[0]을 하고 1을 증가시킨다.
                // cardArr[0] = new Card(4, 1) -> kind = 4, number = 1로 초기화
                // 즉, 0번 카드는 1 SPADE로 고정하고, 1번 카드는 new (Card(4, 2) 즉 2 SPADE
                cardArr[i++] = new Card2(k, n + 1);
            } // end of for n
        } // end of for k
    } // end of constructor Deck

    // 랜덤으로 아무 카드의 인덱스를 선택한다.
    Card2 pick() {
        int index = (int) (Math.random() * CARD_NUM);
        return pick(index);
    } // end of pick

    // Card 타입의 pick 메서드를 오버로딩한 것
    // parameter로 받은 index에 해당하는 card 값을 리턴한다.
    Card2 pick(int index) {
        return cardArr[index];
    } // end of pick

    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int r = (int) (Math.random() * CARD_NUM);
            Card2 temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        } // end of for i
    } // end of shuffle
} // end of class Deck

class Card {
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    Card() {
        this(SPADE, 1);
    } // end of constructor Card

    // Overloaded constructor
    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    } // end of constructor Card

    public String toString() {
        String[] kinds = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
        String numbers = "0123456789XJQK";
        return "kind: " + kinds[this.kind] + ", number: "
                + numbers.charAt(this.number);
    } // end of toString

} // end of class Card
