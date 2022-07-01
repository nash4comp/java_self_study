package Chap06;

class Car3 {
    String color;
    String gearType;
    int door;

    Car3() {
        this("white", "auto", 4);
    }

    // 인스턴스의 복사를 위한 생성자.
    Car3(Car3 c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car3(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

} // end of class Car3

public class CarTest3 {

    public static void main(String[] args) {
        Car3 c1 = new Car3();
        Car3 c2 = new Car3(c1);
        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType
                + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType
                + ", door=" + c2.door);

        c1.door = 100;
        System.out.println("c1.door=100; 수행 후");
        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType
                + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType
                + ", door=" + c2.door);

    } // end of main

} // end of class CarTest3
