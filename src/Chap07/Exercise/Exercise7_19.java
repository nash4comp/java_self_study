package Chap07.Exercise;

public class Exercise7_19 {

    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    } // end of main

} // end of class

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
            return;
        } // end of if money

        money -= p.price;
        add(p);

    } // end of method buy

    void add(Product p) {
        if (i >= cart.length) {
            Product[] newCart = new Product[cart.length * 2];
            System.arraycopy(cart, 0, newCart, 0, cart.length);
            cart = newCart;
        } // end of if i

        cart[i++] = p;

    } // end of method add

    void summary() {
        String list = "";
        int sum = 0;
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                break;
            } // end of if cart
            list += cart[i] + ", ";
            sum += cart[i].price;
        } // end of for j
        System.out.println("구입한 물건: " + list);
        System.out.println("사용한 금액: " + sum);
        System.out.println("남은 금액: " + money);

    } // end of method summary

} // end of class Buyer

class Product {
    int price;

    Product(int price) {
        this.price = price;
    } // end of constructor

} // end of class Product

class Tv extends Product {
    Tv() {
        super(100);
    } // end of constructor

    public String toString() {
        return "Tv";
    } // end of method

} // end of class Tv

class Computer extends Product {
    Computer() {
        super(200);
    } // end of constructor

    public String toString() {
        return "Computer";
    } // end of method

} // end of class Computer

class Audio extends Product {
    Audio() {
        super(50);
    } // end of constructor

    public String toString() {
        return "Audio";
    } // end of method

}
// end of class Audio
