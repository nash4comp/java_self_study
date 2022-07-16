package Chap07.Exercise;

class Circle extends Shape {
    double r;

    Circle(double r) {
        this(new Point(0, 0), r);
    } // end of constructor

    Circle(Point p, double r) {
        // 조상의 멤버를 초기화하기 위해서는 parameter로 받아야 한다.
        super(p); // 조상의 멤버는 조상의 생성자가 초기화하도록 한다.
        this.r = r; // 자신의 멤버는 자신이 직접 초기화 한다.
    } // end of

    double calcArea() {
        return Math.PI * r * r;
    } // end of calcArea
} // end of class

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this(new Point(0, 0), width, height);
    } // end of constructor

    Rectangle(Point p, double width, double height) {
        super(p); // 조상의 멤버는 조상의 생성자가 초기화하도록 한다.
        this.width = width; // 자신의 멤버는 자신이 직접 초기화 한다.
        this.height = height;
    } // end of constructor

    double calcArea() {
        return width * height;
    } // end of calcArea

    boolean isSquare() {
//        return ((width == height) && (width * height != 0)) ? true : false;
        return ((width == height) && (width * height != 0));
    } // end of isSquare

} // end of class

abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    } // end of constructor

    Shape(Point p) {
        this.p = p;
    } // end of constructor

    abstract double calcArea();

    Point getPosition() {
        return p;
    } // end of method

    void setPosition(Point p) {
        this.p = p;
    } // end of method

} // end of class

class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    } // end of constructor

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    } // end of constructor

    public String toString() {
        return "[" + x + "," + y + "]";
    } // end of toString

} // end of class Point

public class Exercise7_22 {
    static double totalArea = 0;

    static double sumArea(Shape[] arr) {
        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == null) {
//                break;
//            } // end of if arr
            totalArea += arr[i].calcArea();
        } // end of for i
        return totalArea;
    } // end of method sumArea

    public static void main(String[] args) {
        Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
        System.out.println("면적의 합: " + sumArea(arr));
    }

}
