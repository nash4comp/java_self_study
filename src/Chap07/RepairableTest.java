// 클래스 상속과 인터페이스 구현을 활용한 예제

package Chap07;

public class RepairableTest {

    public static void main(String[] args) {

        Tank tank = new Tank();
        Dropship dropship = new Dropship();
        Marine marine = new Marine();
        tank.attacked(3);

        dropship.attacked(2);
        SCV scv = new SCV();
        scv.repair(tank);
        scv.repair(dropship);
    } // end of main

} // end of class RepairableTest

// Repairable 인터페이스 선언
interface Repairable {
}

// Unit3 클래스는 모든 유닛의 조상으로 선언
class Unit3 {
    int hitPoint;
    // MAX_HP는 변경 불가의 값이므로 final로 modifier를 선언했다.
    final int MAX_HP;

    Unit3(int hp) {
        MAX_HP = hp;
    } // end of constructor

    void attacked(int cnt) {
        hitPoint -= cnt;
    }

} // end of class Unit3

// GroundUnit은 Unit3를 상속받는다.
class GroundUnit extends Unit3 {
    // 생성자에서 조상의 생성자를 호출해서 hp의 값을 초기화한다.
    GroundUnit(int hp) {
        super(hp);
    } // end of constructor

} // end of class GroundUnit

class AirUnit extends Unit3 {
    AirUnit(int hp) {
        super(hp);
    } // end of constructor

} // end of class AirUnit

// Tank 클래스는 GroundUnit 클래스를 상속받고, Repairable 인터페이스를 구현한다.
class Tank extends GroundUnit implements Repairable {
    // Tank의 생성자에서는 GroundUnit의 생성자를 호출하고 parameter로 150을 줘서 HP를 초기화한다.
    Tank() {
        super(150);
        // hitPoint는 현재의 체력이고, MAX_HP는 최대 체력이다.
        hitPoint = MAX_HP;
    } // end of constructor

    public String toString() {
        return "Tank";
    } // end of method toString

    // 현재 Repairable 인터페이스는 비어있으므로, 사실 구현할 것이 없다.

} // end of class Tank

// Dropship 클래스는 AirUnit을 상속받고 Repairable 인터페이스를 구현(implement)한다.
class Dropship extends AirUnit implements Repairable {
    Dropship() {
        super(125);
        hitPoint = MAX_HP;
    } // end of constructor

    public String toString() {
        return "Dropship";
    }
} // end of class Dropship

// Marine은 GroundUnit을 상속받지만, 수리가 되는것이 아니므로 Repairable을 구현하지 않는다.
class Marine extends GroundUnit {
    Marine() {
        super(40);
        hitPoint = MAX_HP;
    } // end of constructor

} // end of class Marine

// SCV는 GroundUnit을 상속받고, Repairable을 구현한다.
class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;

    } // end of constructor

    // repair 메서드는 Repairable 인터페이스 타입의 참조변수를 parameter로 받는다.
    void repair(Repairable r) {
        // 전달받은 parameter의 타입 체크를 해서 Unit3와 같다면 아래의 코드를 수행한다.
        if (r instanceof Unit3) {
            // 전달받은 parameter의 타입을 일단 최상위 클래스인 Unit3 클래스 타입으로 형변환한다.
            Unit3 u = (Unit3) r;
            // 현재 체력이 최대 체력과 같지 않다면, 같아질 때까지 수리를 한다.
            System.out.println(
                    "현재 " + u.toString() + "의 HP는 " + u.hitPoint + " 입니다.");
            while (u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            } // end of while u.hitPoint
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
            System.out.println(
                    "현재 " + u.toString() + "의 HP는 " + u.hitPoint + " 입니다.\n");
        } // end of if r

    } // end of method repair
} // end of class SCV
