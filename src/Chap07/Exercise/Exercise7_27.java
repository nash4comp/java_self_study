package Chap07.Exercise;

class Outer3 {
    int value = 10;

    class Inner {
        int value = 20;

        void method1() {
            int value = 30;
            System.out.println(value);
            System.out.println(Inner.this.value);
            System.out.println(Outer3.this.value);
        } // end of method
    } // end of class Inner
} // end of class Outer3

public class Exercise7_27 {

    public static void main(String[] args) {
        Outer3 o = new Outer3();
        Outer3.Inner inner = o.new Inner();
        inner.method1();

    }

}
