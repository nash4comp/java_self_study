package Chap12.examples;

import java.util.ArrayList;

class Fruit3 implements Eatable {
    public String toString() {
        return "Fruit";
    }
}

class Apple3 extends Fruit3 {
    public String toString() {
        return "Apple";
    }
}

class Grape3 extends Fruit3 {
    public String toString() {
        return "Grape";
    }
}

class Juice {
    String name;

    Juice(String name) {
        this.name = name + "Juice";
    } // end of constructor

    public String toString() {
        return name;
    } // end of toString
} // end of class Juice

class Juicer {
    // Juice 클래스 타입의 MakeJuice method를 static으로 선언한다.
    // 여기에 들어올 수 있는 parameter는 FruitBox3 클래스 타입인데,
    // 이것은 Fruit3 타입을 상속받는 모든 타입의 객체를 담을 수 있다.
    static Juice makeJuice(FruitBox3<? extends Fruit3> box) {
        String tmp = "";
        for (Fruit3 f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);
    } // end of makeJuice
} // end of class Juicer

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox3<Fruit3> fruitBox = new FruitBox3<Fruit3>();
        FruitBox3<Apple3> appleBox = new FruitBox3<Apple3>();

        fruitBox.add(new Apple3());
        fruitBox.add(new Grape3());
        appleBox.add(new Apple3());
        appleBox.add(new Apple3());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));

    } // end of main

} // end of class

class FruitBox3<T extends Fruit3> extends Box3<T> {
}

class Box3<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    ArrayList<T> getList() {
        return list;
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
} // end of class Box
