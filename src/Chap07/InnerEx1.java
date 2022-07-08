package Chap07;

public class InnerEx1 {
    class InstanceInner {
        int iv = 100;
//        static int cv = 100; // 에러! static 클래스만 static 변수를 선언할 수 있다.
        final static int CONST = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200;
    } // end of class StaticInner

    void myMethod() {
        class LocalInner {
            int iv = 300;
            final static int CONST = 300;
        } // end of class LocalInner
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);

    }

}
