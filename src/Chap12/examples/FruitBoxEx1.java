package Chap12.examples;

import java.util.ArrayList;

class Fruit {
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}

class Gala extends Apple {
    public String toString() {
        return "Gala";
    }
}

class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
}

class Toy {
    public String toString() {
        return "Toy";
    }
}

public class FruitBoxEx1 {
    public static void main(String[] args) {
        // Fruit 타입의 변수만 허용하는 Box 클래스 타입의 참조변수 fruitBox를 선언하되,
        // Fruit 타입의 변수만 허용하는 Box 클래스의 인스턴스를 생성하고
        // 그 주소값을 fruitBox에 대입한다.
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<Toy>();

        // Grape 타입의 변수만 허용하는 Box 클래스 타입의 참조변수 grapeBox를 선언하되,
        // Apple 타입의 변수만 허용하는 Box 클래스의 인스턴스를 생성하고
        // 그 주소값을 grapeBox에 대입하는 것은 불가능하다.
        // 타입이 불일치 하기 때문.
//      Box<Grape> grapeBox = new Box<Apple>();

        // Fruit 인스턴스를 생성하고, 그것을 Fruit 타입의 변수만 허용하는 Box클래스 타입의 참조변수 fruitBox에
        // 추가한다.
        fruitBox.add(new Fruit());

        // Apple 인스턴스를 생성하고, 그것을 Fruit 타입의 변수만 허용하는 Box클래스 타입의 참조변수 fruitBox에
        // 추가한다.
        // 가능하다. 왜냐하면, Apple은 Fruit을 상속하기 때문. = void add(Fruit item)
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Gala());

        // Toy 인스턴스를 생성하고, 그것을 Fruit 타입의 변수만 허용하는 Box클래스 타입의 참조변수 fruitBox에
        // 추가한다.
        // 에러. Box<Apple>에는 Apple과 Apple을 상속하는 클래스 타입만 담을 수 있음.
//      appleBox.add(new Toy());

        toyBox.add(new Toy());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    } // end of main
} // end of class

class Box<T> {
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
