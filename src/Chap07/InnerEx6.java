// 익명(anonymous class) 예제
package Chap07;

public class InnerEx6 {
    Object iv = new Object() {
        void method() {
        }
    };

    static Object cv = new Object() {
        void method() {
        }
    };

    void myMethod() {
        Object lv = new Object() {
            void method() {
            }
        };
    }

    public static void main(String[] args) {

    }

}
