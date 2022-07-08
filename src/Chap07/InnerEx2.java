package Chap07;

public class InnerEx2 {
    class InstanceInner {
    }

    static class StaticInner {
    }

    InstanceInner iv = new InstanceInner();
    static StaticInner cv = new StaticInner();

    static void staticMethod() {

        // staticMethod는 static 메서드이므로 static 클래스에 접근 불가
        // 왜냐하면 static이 먼저 메모리에 생성되기 때문이다.
//        InstanceInner obj1=new InstanceInner();
        StaticInner obj2 = new StaticInner();

        // 굳이 접근을 하려면 아래와 같이 객체를 생성해야 한다.
        // 인스턴스 클래스는 외부 클래스를 먼저 생성해야만 생성할 수 있다.
        InnerEx2 outer = new InnerEx2();
        InstanceInner obj1 = outer.new InstanceInner();

    } // end of method staticMethod

    void instanceMethod() {
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

    }

    public static void main(String[] args) {

        class LocalInner {
        }
        LocalInner lv = new LocalInner();
    }

}
