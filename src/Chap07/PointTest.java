package Chap07;

public class PointTest {

    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 2, 3);
    }

}

class Point3 {
    int x, y;

    Point3() {
        this(0, 0);

    } // end of constructor Point3

    Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x: " + x + ", y: " + y;
    }

} // end of class Point

class Point3D extends Point3 {
    int z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    } // end of constructor Point3D

    String getLocation() {
        return "x: " + x + ", y: " + y;
    }

} // end of class Point3D
