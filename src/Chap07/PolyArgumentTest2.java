// 객체배열로 물건 구매하는 클래스

package Chap07;

class Product4 {
    int price;
    int bonusPoint;

    Product4(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    } // end of constructor Product4

    Product4() {
    }
} // end of Product4

class Tv4 extends Product4 {
    Tv4() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
} // end of class Tv4

class Computer4 extends Product4 {
    Computer4() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
} // end of class Computer4

class Audio4 extends Product4 {

    Audio4() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
} // end of class Audio4

class Buyer4 {
    int money = 1000;
    int bonusPoint = 0;

    // Product4 클래스 타입의 배열 item을 선언
    Product4[] item = new Product4[10];
    int i = 0;

    void buy(Product4 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        } // end of if money
        money -= p.price;
        bonusPoint += p.bonusPoint;
        // p의 주소값을 item 배열에 넣고 인덱스를 1 증가시킨다.
        item[i++] = p;
        // p를 호출하면 해당 클래스의 toString() 메서드를 호출한다.
        System.out.println(p + "을/를 구입하셨습니다.");

    } // end of method buy

    void summary() {
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < item.length; i++) {
            if (item[i] == null)
                break;
            sum += item[i].price;
            // 응용할 만한 로직
            itemList += (i == 0) ? "" + item[i] : ", " + item[i];

        } // end of for i
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은" + itemList + "입니다.");

    } // end of method summary

} // end of class Buyer4

public class PolyArgumentTest2 {

    public static void main(String[] args) {

        Buyer4 b = new Buyer4();
        b.buy(new Tv4());
        b.buy(new Computer4());
        b.buy(new Audio4());
        b.summary();
    } // end of main

} // end of class PolyArgumentTest2
