package Chap07;

class A2 {
    void methodA() {
        // 제 3의 클래스의 메서드를 통해서 인터페이스 I를 구현한 클래스의 인스턴스를 얻어온다.
        // 이렇게 하면, 나중에 다른 클래스의 인스턴스로 변경되어도 A2 클래스의 변경없이
        // getInstance()만 변경하면 된다는 장점이 생긴다.
        I2 i = InstanceManager.getInstance();
        i.methodB();

        // i로 Object의 메서드 호출 가능
        System.out.println(i.toString());
    }
}

interface I2 {
    public abstract void methodB();
}

class B2 implements I2 {
    public void methodB() {
        System.out.println("methodB in B class");
    }

    public String toString() {
        return "class B";
    }
}

class InstanceManager {
    public static I2 getInstance() {
        return new B2();
    }
}

public class InterfaceTest3 {

    public static void main(String[] args) {
        A2 a = new A2();
        a.methodA();
    }

}
