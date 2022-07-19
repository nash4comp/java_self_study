package Chap09.examples;

final class Card2 {
    String kind;
    int num;

    Card2() {
        this("SPADE", 1);
    } // end of constructor

    Card2(String kind, int num) {
        this.kind = kind;
        this.num = num;
    } // end of constructor

    public String toString() {
        return kind + ":" + num;
    } // end of method toString

} // end of class Card

public class ClassEx1 {

    public static void main(String[] args) {
        Card2 c = new Card2("HEART", 3);
//        Card2 c2 = Card2.class.newInstance();

        Class cObj = c.getClass();
        System.out.println(c);
//        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());

    }

}
