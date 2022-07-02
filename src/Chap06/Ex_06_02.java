package Chap06;

class SutdaCard1 {
    int num;
    boolean isKwang;

    SutdaCard1() {
        this(1, true);
    }

    SutdaCard1(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;

    }

    String info() {
        return num + (isKwang ? "K" : "");
    }

}

public class Ex_06_02 {

    public static void main(String[] args) {
        SutdaCard1 card1 = new SutdaCard1(3, false);
        SutdaCard1 card2 = new SutdaCard1();

        System.out.println(card1.info());
        System.out.println(card2.info());

    } // end of main

} // end of class
