// main method의 호출 순서

package Chap07.Exercise;

class Parent {
    int x = 100;

    Parent() {
        this(200);
    } // end of constructor Parent

    Parent(int x) {
        this.x = x;
    } // end of constructor Parent

    void getX() {
        System.out.println("X, This is Parent's method.");
    } // end of method getX

    void getY() {
        System.out.println("Y, This is Parent's method.");
    } // end of method getX

} // end of class Parent

class Child extends Parent {

    int x = 3000;

    Child() {
        this(1000);
    } // end of constructor Child

    Child(int x) {
        this.x = x;
    } // end of constructor Child

    void getX() {
        System.out.println("X, This is Child's method.");
    } // end of overrode method of getX

    void getZ() {
        System.out.println(super.x + " is Parent's value of x.");
        System.out.println(this.x + " is Child's value of x.");
    } // end of method getZ

} // end of Child

public class Exercise7_07 {

    public static void main(String[] args) {
        // Child 타입 참조변수 c에 Child 인스턴스를 생성하고 그 주소값을 넣는다.
        // Child 인스턴스를 생성하면, 자동으로 생성자 Child()를 호출한다.
        // Child()는 overloading된 Child(int x)를 호출한다.
        // 컴파일러는 생성자의 첫 줄에 다른 생성자를 호출하지 않으면, 조상의 기본 생성자를 호출하는 코드인 super()를 넣는다.
        // 따라서 Child(int x)에는 super()가 들어가고, Parent()를 호출하게 된다.
        Child c = new Child();
        c.getX(); // 자손에 override 된 메서드는 자손의 메서드를 호출한다.
        c.getY(); // 조상에만 있는 메서드는 조상의 메서드를 호출한다.
        c.getZ();

    }
}
