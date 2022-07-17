package Chap07.Exercise;

class Outer {
    class Inner {
        int iv = 100;
    } // end of class Inner
} // end of class Outer

public class Exercise7_25 {

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        System.out.println(i.iv);
    }
}
