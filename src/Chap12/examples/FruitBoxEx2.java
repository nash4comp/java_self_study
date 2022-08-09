package Chap12.examples;

import java.util.ArrayList;

class Fruit2 implements Eatable {
    public String toString() {
        return "Fruit";
    }
}

class Apple2 extends Fruit2 {
    public String toString() {
        return "Apple";
    }
}

class Gala2 extends Apple2 {
    public String toString() {
        return "Gala";
    }
}

class Grape2 extends Fruit2 {
    public String toString() {
        return "Grape";
    }
}

class Toy2 {
    public String toString() {
        return "Toy";
    }
}

interface Eatable {
}

public class FruitBoxEx2 {

    public static void main(String[] args) {

        // Fruit 타입의 변수만 허용하는 FruitBox 클래스 타입의 참조변수 fruitBox를 선언하되,
        // Fruit 타입의 변수만 허용하는 FruitBox 클래스의 인스턴스를 생성하고
        // 그 주소값을 fruitBox에 대입한다.
        FruitBox<Fruit2> fruitBox = new FruitBox<Fruit2>();
        FruitBox<Apple2> appleBox = new FruitBox<Apple2>();
        FruitBox<Grape2> grapeBox = new FruitBox<Grape2>();

        // Toy는 Fruit를 상속하지 않으므로 에러.
//      FruitBox<Toy>   toyBox   = new FruitBox<Toy>();

        // Grape 타입의 변수만 허용하는 Box 클래스 타입의 참조변수 grapeBox를 선언하되,
        // Apple 타입의 변수만 허용하는 Box 클래스의 인스턴스를 생성하고
        // 그 주소값을 grapeBox에 대입하는 것은 불가능하다.
        // 타입이 불일치 하기 때문.
//      Box<Grape> grapeBox = new Box<Apple>();

        // Fruit 인스턴스를 생성하고, 그것을 Fruit 타입의 변수만 허용하는 Box클래스 타입의 참조변수 fruitBox에
        // 추가한다.
        fruitBox.add(new Fruit2());

        // Apple 인스턴스를 생성하고, 그것을 Fruit 타입의 변수만 허용하는 Box클래스 타입의 참조변수 fruitBox에
        // 추가한다.
        // 가능하다. 왜냐하면, Apple은 Fruit을 상속하기 때문. = void add(Fruit item)
        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());

        appleBox.add(new Apple2());
        appleBox.add(new Apple2());
        appleBox.add(new Gala2());

        // 에러. Grape는 Apple의 자손이 아님
//      appleBox.add(new Grape());

        // Toy 인스턴스를 생성하고, 그것을 Fruit 타입의 변수만 허용하는 Box클래스 타입의 참조변수 fruitBox에
        // 추가한다.
        // 에러. Box<Apple>에는 Apple과 Apple을 상속하는 클래스 타입만 담을 수 있음.
//      appleBox.add(new Toy());

        System.out.println("fruitBox: " + fruitBox);
        System.out.println("appleBox: " + appleBox);

    } // end of main

} // end of class FruitBox2

//FruitBox 클래스는 Box 클래스를 상속하고, parameter로 T 타입을 받을 수 있다.
//T 타입은 Fruit 클래스 타입을 상속하고 Eatable을 구현한다.
class FruitBox<T extends Fruit2 & Eatable> extends Box2<T> {
}

class Box2<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
} // end of class Box
