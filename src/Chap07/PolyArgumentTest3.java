// 배열의 동적할당 적용하고 parameter를 다형성(polymorphism)으로 사용

package Chap07;

import java.util.Vector;

class Product5 {
    int price;
    int bonusPoint;

    Product5(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    } // end of constructor Product5

    Product5() {
        price = 0;
        bonusPoint = 0;
    } // end of constructor Product5
} // end of class Product5

class Tv5 extends Product5 {
    Tv5() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
} // end of class Tv

class Computer5 extends Product5 {
    Computer5() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
} // end of class Computer5

class Audio5 extends Product5 {
    Audio5() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
} // end of class Audio

class Buyer5 {
    int money = 1000;
    int bonusPoint = 0;

    // 구입한 제품을 저장하는데 사용될 Vector 객체 (동적 할당)
    Vector item = new Vector();

    // parameter를 부모 클래스인 Product5 타입으로 받는다.
    // 왜냐하면, parameter에는 Product5의 자손 클래스들이 들어오기 때문이다.
    void buy(Product5 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        } // end of if money
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + "을/를 구입하셨습니다.");
    } // end of method buy

    void refund(Product5 p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을/를 반품하셨습니다.");
        } else {
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        } // end of if item
    } // end of method refund

    void summary() {
        int sum = 0;
        String itemList = "";
        if (item.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다.");
            return;
        } // end of if item

        for (int i = 0; i < item.size(); i++) {
            // Vector의 i번째에 있는 객체를 얻어온다.
            // Product5 클래스 타입의 변수 p에 item에서 얻어온 i번째 객체의 주소값을 넣어준다.
            // 이때 item에서 얻어온 객체는 자손 클래스 타입이므로 이를 다시 Product5 형태로 형변환을 해준다.
            Product5 p = (Product5) item.get(i);
            sum += p.price;
            itemList += (i == 0) ? "" + p : ", " + p;
        } // end of for i
        System.out.println("구입하신 물품의 총급액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    } // end of method summary
} // end of class Buyer5

public class PolyArgumentTest3 {

    public static void main(String[] args) {
        Buyer5 b = new Buyer5();
        Tv5 tv = new Tv5();
        Computer5 com = new Computer5();
        Audio5 audio = new Audio5();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();
    }
}
