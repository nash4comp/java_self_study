package Chap06;

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 클래스(static) 메서드로 선언할 수 없다. 왜냐하면 인스턴스 변수(x, y)를 사용해야 하기 때문이다.
    double getDistance(int x, int y) {
        return (double) Math
                .sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

}

public class Ex_06_07 {

    public static void main(String[] args) {
        // 인스턴스 메서드를 사용하기 위해서는 이렇게 선언해야 한다.
        MyPoint p = new MyPoint(1, 1);
        System.out.println(p.getDistance(2, 2));

    } // end of main

} // end of class
