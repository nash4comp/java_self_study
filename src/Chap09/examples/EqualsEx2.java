package Chap09.examples;

class Person {
    long id;

    Person(long id) {
        this.id = id;
    } // end of constructor

    // equals method 오버라이딩
    public boolean equals(Object obj) {
        // parameter로 받은 obj 인스턴스가 Person 인스턴스로 형변환 가능한지 체크
        if (obj instanceof Person) {
            // obj 인스턴스를 Person 클래스 타입으로 형변환하고, 멤버변수 id의 값을 대입
            return id == ((Person) obj).id;
        } else {
            // parameter로 받은 obj 인스턴스가 Person 인스턴스로 형변환 불가하면 false 리턴
            return false;
        } // end of if obj

    } // end of method

} // end of class Person

public class EqualsEx2 {

    public static void main(String[] args) {
        Person p1 = new Person(801108111222L);
        Person p2 = new Person(801108111222L);

        if (p1 == p2)
            System.out.println("p1과 p2는 같은 사람입니다.");
        else
            System.out.println("p1과 p2는 다른 사람입니다.");

        if (p1.equals(p2))
            System.out.println("p1과 p2는 같은 사람입니다.");
        else
            System.out.println("p1과 p2는 다른 사람입니다.");

    } // end of main

} // end of class
