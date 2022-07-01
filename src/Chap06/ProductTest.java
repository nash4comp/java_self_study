// 클래스(static) 변수의 활용 예제

package Chap06;

class Product {
    // 여기서 static으로 선언된 count는 모든 클래스의 공통 변수가 된다.
    // 따라서 클래스를 new로 생성하면 초기화 블럭이 호출되고,
    // 그 초기화 블럭에서 count를 1씩 증가시켜서 serialNo에 저장한다.
    // 여기서 클래스 변수는 클래스가 로딩될때 딱 한번만 로딩되므로
    // 만약, count를 인스턴스 변수로 선언헸다면 매번 0으로 초기화가 되게된다.
    static int count = 0;
    int serialNo;

    // 생성자가 하나 밖에 없기 때문에 인스턴스 블럭 대신에 생성자에 넣어도 되는 코드이다.
    // 하지만, 공통적으로 수행되는 부분이기에 인스턴스 블럭으로 만든 것이다.
    {
        ++count;
        serialNo = count;
    } // end of instance initialization block

    public Product() {
    }

} // end of class Product

public class ProductTest {

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
        System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo);
        System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
        System.out.println("생산된 제품의 수는 모두 " + Product.count + "개 입니다.");

    } // end of main

} // end of class ProductTest
