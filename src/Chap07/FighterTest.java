package Chap07;

public class FighterTest {

    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit)
            System.out.println("f는 Unit 클래스의 자손입니다.");

        if (f instanceof Fightable)
            System.out.println("f는 Fightable 인터페이스를 구현했습니다.");

        if (f instanceof Movable)
            System.out.println("f는 Movable 인터페이스를 구현했습니다.");

        if (f instanceof Attackable)
            System.out.println("f는 Attackable 인터페이스를 구현했습니다.");

        if (f instanceof Object)
            System.out.println("f는 Object 클래스의 자손입니다.");

    } // end of main
} // end of class FighterTest

// Fighter 클래스는 Unit 클래스를 상속하고, Fightable 인터페이스를 구현한다.
// 클래스는 클래스, 인터페이스 둘다로부터 상속이 가능하지만, 인터페이스는 인터페이스로부터만 상속이 가능하다.
// 하지만, 인터페이스는 다중 상속이 가능하다는 장점이 있다.
class Fighter extends Unit implements Fightable {
    // Fightable에서는 Movable 및 Attackable을 상속받는다.
    // 따라서 여기서 구현하는 메서드는 아래와 같이 오버라이딩을 해야하며,
    // access modifier는 조상(ancestor)의 access modifier와 같거나 넓은 범위로 해야한다.
    // 그래서 public으로 해야한다.
    public void move(int x, int y) {

    }

    public void attack(Unit u) {
    }
}

class Unit {
    int currentHP;
    int x;
    int y;
}

// Fightable 인터페이스는 Movable과 Attackable 인터페이스를 상속한다.
interface Fightable extends Movable, Attackable {
}

interface Movable {
    // 인터페이스 이므로 여기서 접근제어자(access modifier)인 public abstract가 생략되었다.
    void move(int x, int y);
}

interface Attackable {
    void attack(Unit u);
}
