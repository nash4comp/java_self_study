package Chap12.examples;

@FunctionalInterface
interface MyFunction3 {
    void myMethod(); // private abstract 생략
} // end of interface

class Outer {
    int val = 10; // Outer.this.val

    class Inner {
        int val = 20;

        void method(int i) { // void mehtod(final int i)
            int val = 30; // final int val=30;
//            i = 10;

            MyFunction3 f = () -> {
                System.out.println("i:" + i);
                System.out.println("val:" + val);
                System.out.println("this.val:" + ++this.val);
                System.out.println("Outer.this.val:" + ++Outer.this.val);
            };
            f.myMethod();
        } // end of method
    } // end of class Inner
} // end of class Outer

public class LambdaEx3 {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method(100);
    }
}
