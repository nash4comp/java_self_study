package Chap07;

public class PolyArgumentTest {

    public static void main(String[] args) {
        Buyer b = new Buyer();

        // Tv2 t = new Tv2()
        // b.buy(t)
        b.buy(new Tv2());
        b.buy(new Computer());
        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
        b.buy(new Tv2());
        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
    }
}

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
} // end of class Product

class Tv2 extends Product {
    Tv2() {
        // 조상 클래스인 Product의 생성자 Product(int price)를 호출한다.
        super(100);
    } // end of constructor Tv2

    public String toString() {
        return "Tv";
    }

} // end of class Tv2

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
} // end of class Computer

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    // Product 클래스 타입의 매개변수를 받는다.
    // Tv 클래스 타입의 매개변수가 들어올 경우, p.price는 Tv 클래스에 없으므로 Product 클래스의 price가 된다.
    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        } // end of if money
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구입하셨습니다.");

    } // end of method buy

} // end of class Buyer
