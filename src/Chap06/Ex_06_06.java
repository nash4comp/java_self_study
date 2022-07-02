package Chap06;

public class Ex_06_06 {
    // 아래는 클래스(static) 메서드이다. 여기서는 인스턴스 변수를 사용하지 않기 때문에 static으로 하는 것이고,
    // static으로 하면 클래스가 생성되면 메모리에 자동 로딩이되서 빠르다.
    static double getDistance(int x, int y, int x1, int y1) {
        return (double) Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));

    } // end of main

} // end of class
