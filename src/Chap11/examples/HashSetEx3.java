package Chap11.examples;

import java.util.HashSet;
import java.util.Objects;

public class HashSetEx3 {

    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));
        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    } // end of constructor

    // HashSet의 add method는 새로운 요소를 추가하기 전에 기존에 저장된 요소와 같은 것인지 판별하기 위해
    // 추가하려는 요소의 equals()와 hashCode()를 호출하기 떄문에 equals()와 hashCode()를 오버라이딩
    // 해야한다.
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person tmp = (Person) obj;
            return name.equals(tmp.name) && age == tmp.age;
        } // end of if obj
        return false;
    } // end of equals

    public int hashCode() {
        return Objects.hash(name, age);
    } // end of hashCode

    public String toString() {
        return name + ":" + age;
    } // end of toString
} // end of class Person
