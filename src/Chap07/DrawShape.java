package Chap07;

public class DrawShape {

    public static void main(String[] args) {
        // p1 = new Point(100, 100)
        // p2 = new Point(140, 50)
        // p3 = new Point(200, 100)
        // Point[] p = {p1, p2 ,p3}

        Point[] p = { new Point(100, 100), new Point(140, 50),
                new Point(200, 100) };
        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150, 150), 50);
        t.draw();
        c.draw();

    } // end of main

} // end of class DrawShape

class Shape {
    String color = "black";

    void draw() {
        System.out.printf("[color=%s]%n", color);

    } // end of draw

} // end of class Shape

// x, y 좌표를 갖는 클래스
class Point {
    int x;
    int y;

    // Point 클래스의 생성자.
    // parameter가 없으면, 오버로딩된 Point(0, 0)를 호출한다.
    Point() {
        this(0, 0);
    } // end of constructor Point

    Point(int x, int y) {
        this.x = x;
        this.y = y;

    } // end of constructor Point

    String getXY() {
        return "(" + x + "," + y + ")";
    } // end of getXY

} // end of class Point

// A Circle is a Shape 이므로 Circle은 Shape를 상속받는다.
// A Circle has a Point 이므로 Circle은 Point를 포함한다.
class Circle extends Shape {

    // Point 클래스 타입의 변수 center를 선언한다.
    // center에는 변수 x, y, 그리고 getXY 메서드를 포함한다.
    Point center;
    int r;

    // Circle의 생성자.
    // parameter가 없으면 오버로딩된 Circle(new Point(0,0), 100)을 호출하는데,
    // new Point(0,0)은 x와 y를 0으로 초기화하는 생성자를 호출한다.
    // 여기서 new Point()로 써도 무방하다.
    Circle() {
        //
        this(new Point(0, 0), 100);
    } // end of constructor Circle

    Circle(Point center, int r) {
        // Point 클래스 타입으로 선언된 변수의 center의 center 변수 값에 parameter로 들어온 center를
        // 넣는다.
        // 즉, Point center = new Point(0,0)이고, 이것은 Point 생성자를 호출해서 x와 y의 값에 0을
        // 넣는다.
        this.center = center;
        this.r = r;
    } // end of constructor Circle

    void draw() {
        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x,
                center.y, r, color);

    } // end of draw

} // end of class Circle

// A Triangle is a Shape이므로 Triangle은 Shape를 상속받는다.
// A Triangle has a Point이므로, Triangle은 Point를 포함한다.
class Triangle extends Shape {

    // Point 클래스 타입의 배열 p를 선언하고, p는 p[0], p[1], p[2]를 가지고 있다.
    Point[] p = new Point[3];

    Triangle(Point[] p) {
        // Point 클래스 타입의 배열 p가 parameter로 들어오면, 그 p를 Triangle 클래스가 가지고 있는 Point
        // 클래스 배열의 주소값에 넣는다.
        // 즉, parameter의 주소값을 p에 넣어서 동일한 주소값으로 만드는 것이다.
        this.p = p;

    } // end of constructor Triangle

    void draw() {
        System.out.printf("[p1=%s, p2=%s, [p3=%s, color=%s]%n", p[0].getXY(),
                p[1].getXY(), p[2].getXY(), color);

    } // end of draw

} // end of class Triangle
