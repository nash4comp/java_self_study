package Chap12.examples;

enum Transportation {
    BUS(100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    TRAIN(150) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    SHIP(100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    AIRPLANE(300) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    protected final int BASIC_FARE; // protected로 해야 각 상수에서 접근 가능
    // protected는 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근 가능
    // 이렇게 안할 경우, private으로 선언되어서 같은 클래스 내에서만 접근이 된다.
    // 즉, EnumEx3 클래스에서 BASIC_FARE에 접근할 수 없다.

    Transportation(int basicFare) { // private이 생략됨
        BASIC_FARE = basicFare;
    } // end of constructor

    public int getBasicFare() {
        return BASIC_FARE;
    }

    abstract int fare(int distance);

} // end of enum Transportation

public class EnumEx3 {

    public static void main(String[] args) {
        System.out.println("bus fare=" + Transportation.BUS.fare(100));
        System.out.println("train fare=" + Transportation.BUS.fare(100));
        System.out.println("ship fare=" + Transportation.BUS.fare(100));
        System.out.println("airplane fare=" + Transportation.BUS.fare(100));
    }

}
