package Chap07.Exercise;

class SutdaCard2 {
    final int NUM;
    final boolean IS_KWANG;

    SutdaCard2() {
        this(1, true);
    } // end of constructor

    SutdaCard2(int num, boolean isKwang) {
        this.NUM = num;
        this.IS_KWANG = isKwang;
    } // end of constructor

    public String toString() {
        return NUM + (IS_KWANG ? "K" : "");
    } // end of method toString

} // end of class SutdaCard

public class Exercise7_14 {

    public static void main(String[] args) {
        SutdaCard2 card = new SutdaCard2(1, true);

    }

}
