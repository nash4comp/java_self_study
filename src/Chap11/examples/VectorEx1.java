package Chap11.examples;

import java.util.Vector;

public class VectorEx1 {

    public static void main(String[] args) {
        Vector v = new Vector(5);
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize();
        System.out.println("\n=== After trimToSize() ===");
        print(v);

        v.setSize(5); // 사이즈를 5로 했는데, 기존의 사이즈가 3 이므로 총 사이즈는 3*2=6으로 설정된다.
        System.out.println("\n=== After ensureCapacity(5) ===");
        print(v);

        v.setSize(7); // 사이즈를 7로 했는데, 기존의 사이즈가 6 이므로 총 사이즈는 6*2=12로 설정된다.
        System.out.println("\n=== After setSize(7) ===");
        print(v);

        v.clear();
        System.out.println("\n=== After clear() ===");
        print(v);
    } // end of main

    public static void print(Vector v) {
        System.out.println(v);
        System.out.println("size :" + v.size());
        System.out.println("capacity: " + v.capacity());
    } // end of print

} // end of class
