package Chap07;

public class PointTest2 {

    public static void main(String[] args) {
        Point3D4 p3 = new Point3D4();
        System.out.println("p3.x=" + p3.x);
        System.out.println("p3.x=" + p3.y);
        System.out.println("p3.x=" + p3.z);

    } // end of main

} // end of class PointTest2

class Point4 {
    int x = 10;
    int y = 20;

    Point4(int x, int y) {
        this.x = x;
        this.y = y;

    } // end of constructor Point

} // end of Point4

class Point3D4 extends Point4 {
    int z = 30;

    Point3D4() {
        this(100, 200, 300);
    }

    Point3D4(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
// end of Point3D4
