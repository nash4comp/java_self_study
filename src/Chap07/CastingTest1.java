// 다형성의 형변환
// 형변환은 참조변수의 타입을 변환하는 것이지 인스턴스를 변환하는 것은 아니기 때문에
// 참조변수의 형변환은 인스턴스에 아무런 영향을 미치지 않는다.
// 단지 참조변수의 형변환을 통해서, 참조하고 있는 인스턴스에서 사용할 수 있는 멤버의 범위(개수)를 조절하는 것 뿐이다.

package Chap07;

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("Drive, Brrrr~");
    }

    void stop() {
        System.out.println("stop!!");
    }

} // end of class Car

class FireEngine extends Car {
    void water() {
        System.out.println("water!!!");
    }

} // end of class FireEngine

public class CastingTest1 {

    public static void main(String[] args) {
        // Car 타입의 참조변수 car 선언
        Car car = null;

        // FireEngine 타입의 참조변수 fe를 선언
        // FireEngine 인스턴스를 생성하고 그 주소를 fe에 할당
        FireEngine fe = new FireEngine();

        // FireEngine 타입의 참조변수 fe2를 선언
        FireEngine fe2 = null;

        fe.water();

        // Car 타입의 참조변수 car에 FireEngine 타입의 참조변수 fe의 주소값을 할당
        // FireEngine은 Car의 자손이므로 car=(Car)fe 에서처럼 형변환 생략된 형태
        // Car 타입은 실체, FireEngine은 껍데기 즉, FireEngine 중에서 Car 부분만 취하는 형태이다.
        car = fe;
//        car.water(); 컴파일 에러. Car 타입의 참조변수로는 water()를 호출할 수 없다.

        // FireEngine은 실체, Car는 껍데기. 즉, 껍데기보다 실체가 크므로 형변환 생략 불가
        fe2 = (FireEngine) car;
        fe2.water();

    }

}
