// 생성자에 private을 걸어서 외부에서 인스턴스를 못만들게 하는 방법
// 이 경우, 같은 클래스에서만 인스턴스를 만들 수 있다.

package Chap07;

final class Singleton {

    // 생성자가 private이므로 같은 클래스인 Singleton에서만 인스턴스를 만들 수 있다.
    // 즉, 아래와 같이 여기서만 만들어야 한다.
    // static으로 선언하는 이유는 아래의 getInstance 메서드가 static이기 때문이다.
    private static Singleton s = new Singleton();

    // 생성자를 private으로 선언했다.
    // 즉, 같은 클래스 내에서만 접근이 가능하다.
    private Singleton() {

    }

    // 생성자에 private을 걸어서 외부에서는 직접 인스턴스를 생성하지 못한다.
    // 따라서 외부에서는 인스턴스를 생성하지 않고도 호출할 수 있어야 하므로 static이어야 한다.
    // 즉, 생성자가 클래스 메서드가 되어야 메모리에 미리 로딩되고 공통 메서드가 된다.
    // getInstance 메서드의 리턴 타입이 Singleton이다.
    public static Singleton getInstance() {
        // 안드로이드 앱의 경우 GC가 수행되서 static 영역의 데이터가 자주 날라간다.
        // 이때 null인 경우가 있어서 다시 객체를 생성해서 리턴하는 부분이다.
        if (s == null) {
            s = new Singleton();
        }
        return s;
    }
}

public class SingletonTest {

    public static void main(String[] args) {
        // Singleton s = new Singleton() 이렇게 인스턴스를 생성하면 에러가 난다.
        // 아래와 같이 메서드를 통해서 인스턴스를 만들어야 한다.
        Singleton s = Singleton.getInstance();

    }

}
