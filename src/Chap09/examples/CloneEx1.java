// 인스턴스의 복제

package Chap09.examples;

// Point 클래스는 Cloneable 인터페이스를 구현한다.
// Cloneable 인터페이스를 구현한 클래스에서만 clone()을 호출할 수 있다.
// 그 이유는 인스턴스 데이터를 보호하기 위해서이다.
// 즉, 해당 클래스에서 Cloneable 인터페이스가 구현되었다는 것은 클래스 작성자가 복제를 허용한다는 의미인 것이다.
// 이 인터페이스를 구현하지 않고 clone()을 호출하면 예외가 발생한다.
class Point implements Cloneable {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    } // end of constructor

    public String toString() {
        return "x=" + x + ", y=" + y;
    } // end of toString

    // clone의 원래 access modifier는 protected이다.
    // 상속관계가 없는 다른 클래스에서 호출할 수 있도록 public으로 변경한다.
    public Object clone() {
        Object obj = null;
        try {
            // clone()은 반드시 예외처리를 해주어야 한다.
            // try-catch 내에서 조상클래스의 clone()을 호출한다.
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
        } // end of try-catch
        return obj;
    } // end of method clone
} // end of class Point

public class CloneEx1 {

    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = (Point) original.clone();
        System.out.println(original);
        System.out.println(copy);

    } // end of main

} // end of class
