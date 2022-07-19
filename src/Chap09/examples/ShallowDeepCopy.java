// 얕은 복사(shallow copy)와 깊은 복사(deep copy)
// 얕은 복사는 객체에 저장된 값을 그대로 복제한다.
// 따라서 주소값도 복사를 하므로 복사본과 원본이 서로 영향을 준다.
// 깊은 복사는 원본이 참조하고 있는 객체까지 복제해서 영향을 안주게 한다.

package Chap09.examples;

// Cloneable을 구현하게끔 선언이 되어있으므로 clone() 사용이 가능하다.
class Circle implements Cloneable {
    Point2 p;
    double r;

    Circle(Point2 p, double r) {
        this.p = p;
        this.r = r;
    } // end of constructor

    public Circle shallowCopy() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
        } // end of try-catch
        return (Circle) obj;
    } // end of method shallowCopy

    public Circle deepCopy() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
        } // end of try-catch

        // obj 인스턴스를 Circle 클래스 타입으로 형변환하고 참조변수 c에 주소값을 할당
        Circle c = (Circle) obj;
        // Point2 클래스 타입의 인스턴스를 생성
        // 생성된 인스턴스의 주소값을 Circle 클래스 타입 참조변수 c가 가지고 있는 p에 할당
        // Point2 인스턴스를 생성하면서 초기화를 한다.
        // 초기화는 현재 Circle 클래스의 멤버변수 p가 가지고 있는 x 와 y로 값을 할당한다.
        // 즉, 새로운 Point2 인스턴스를 참조하게끔 했다.
        c.p = new Point2(this.p.x, this.p.y);
        return c;
    } // end of method deepCopy

    public String toString() {
        return "[p=" + p + ", r=" + r + "]";
    } // end of method toString

} // end of class Circle

class Point2 {
    int x, y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    } // end of constructor

    public String toString() {
        return "(" + x + ", " + y + ")";
    } // end of method toString

} // end of class Point2

public class ShallowDeepCopy {

    public static void main(String[] args) {
        Circle c1 = new Circle(new Point2(1, 1), 2.0);
        Circle c2 = c1.shallowCopy();
        Circle c3 = c1.deepCopy();

        System.out.println("c1=" + c1);
        System.out.println("c2=" + c2);
        System.out.println("c3=" + c3);

        c1.p.x = 9;
        c1.p.y = 9;
        System.out.println("= c1의 변경 후=");
        System.out.println("c1=" + c1);
        System.out.println("c2=" + c2);
        System.out.println("c3=" + c3);

    } // end of main

} // end of class
