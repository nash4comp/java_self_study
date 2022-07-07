// 인터페이스의 중간 역할
// 인터페이스 I가 중간에 있기 때문에 호출부는 구현부를 신경쓰지 않아도 된다.

package Chap07;

// 클래스 A1의 메서드 autoPlay는 인터페이스 타입의 참조변수를 parameter로 받는다. 
class A1 {
    void autoPlay(I i) {
        i.play();
    }
}

interface I {
    public abstract void play();
}

// 클래스 B1은 인터페이스 I를 구현한다.
class B1 implements I {
    public void play() {
        System.out.println("play in B class");
    }
}

// 클래스 C1은 인터페이스 I를 구현한다.
class C1 implements I {
    public void play() {
        System.out.println("play in C class");
    }
}

public class InterfaceTest2 {

    public static void main(String[] args) {
        // A1 타입의 참조변수 a를 선언하고, a에는 A1 객체의 주소값을 넣는다.
        A1 a = new A1();

        // A1 클래스의 autoPlay 메서드를 호출하는데, 여기에 B1 객체의 주소값을 parameter로 넣는다.
        // B1은 인터페이스 I를 구현했으므로, B1의 메서드가 호출된다.
        a.autoPlay(new B1());
        a.autoPlay(new C1());
    }

}
