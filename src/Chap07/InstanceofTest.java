package Chap07;

public class InstanceofTest {

    public static void main(String[] args) {
        FireEngine6 fe = new FireEngine6();
        if (fe instanceof FireEngine6) {
            System.out.println("This is a FireEngine instance.");
        }
        if (fe instanceof Car999) {
            System.out.println("This is a Car instance.");
        }

        if (fe instanceof Object) {
            System.out.println("This is an Object instance.");
        }
        System.out.println(fe.getClass().getName());
    }
}

class Car999 {
}

class FireEngine6 extends Car999 {
}
