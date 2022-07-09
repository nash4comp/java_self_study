// 섯다카드 20장을 담는 SutdaCard 배열 초기화

package Chap07.Exercise;

class SutdaDeck {
    final int CARD_NUM = 20;
    // SutdaCard 클래스 타입의 참조변수 배열 cards를 선언한다.
    // 참조변수 cards의 값에 SutdaCard[20]의 주소값을 넣는다.
    // 즉, 여기서는 클래스 배열을 선언하기만 한 것이다.
    // 객체도 생성을 해줘야하는데, 이는 생성자에서 해줘도 된다.
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // iteration을 돌면서 index 0부터 20까지 값을 할당한다.
        // 예를 들어, 시작은 참조변수 cards[0]의 값에 SutdaCard(1, true)의 주소값을 넣는다.
        // 이때, SutdaCard 클래스의 생성자를 호출하게 된다.

        // 아래는 내가 작성한 코드
        /*
         * int num = 1; boolean isKwang; for (int i = 0; i < CARD_NUM; i++) {
         * isKwang = false; if (num >= 11) { num = 1; } // end of if num
         * 
         * if (i == 0 || i == 2 || i == 7) { isKwang = true; } // end of if i
         * 
         * cards[i] = new SutdaCard(num++, isKwang); } // end of for i
         */

        // 아래는 모범 답안
        for (int i = 0; i < cards.length; i++) {
            // i의 값을 1부터 10까지 되돌려가면서 반복
            int num = i % 10 + 1;

            // true/false를 이렇게 판단할 수도 있음.
            // AND가 OR보다 우선순위가 높기 때문에 괄호를 꼭 넣어야 한다.
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
            cards[i] = new SutdaCard(num, isKwang);

        } // end of for i

    } // end of constructor SutdaDeck

    void shuffle() {

        // 아래는 내가 작성한 코드
        /*
         * SutdaCard tmp = new SutdaCard(); for (int i = 0; i < CARD_NUM; i++) {
         * // 0.0 <= x < 1.0 // 0 <= x < 20 int rnd = (int) (Math.random() *
         * 20); tmp.num = cards[i].num; tmp.isKwang = cards[i].isKwang;
         * cards[i].num = cards[rnd].num; cards[i].isKwang = cards[rnd].isKwang;
         * cards[rnd].num = tmp.num; cards[rnd].isKwang = tmp.isKwang; } // end
         * of for i
         */

        // 아래는 모범 답안
        for (int i = 0; i < cards.length; i++) {
            int j = (int) (Math.random() * cards.length);
            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;

        } // end of for i

    }

    SutdaCard pick(int index) {
        // index의 유효성 검사는 꼭 해야한다. 나는 빼먹었다.
        if (index < 0 || index >= CARD_NUM)
            return null;
        return cards[index];
    }

    SutdaCard pick() {
        return cards[(int) (Math.random() * cards.length)];
    }

} // end of class SutdaDeck

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }

} // end of class SutdaCard

public class Exercise7_1 {

    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        } // end of for i

        System.out.println();
        System.out.println(deck.pick(0));

    } // end of main

} // end of class Exercise7_1
