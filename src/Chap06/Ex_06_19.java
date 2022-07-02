// String은 immutable한 성격을 가지고 있어서 어차피 바뀌지 않는다.
// 따라서 String 클래스에서 + 연산을 하면, 주소를 변경하고 새롭게 변경된 주소에 + 연산의 결과를 저장한다. 
// 바꾼 값을 활용하려면 return으로 String을 주는 방법이 있다.

package Chap06;

public class Ex_06_19 {
    static String staticStr = "static";

    public static void change(String str) {
        str += "456";
    }

    public void changeStr(String str) {
        str += "789";
    }

    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change:" + str);
        System.out.println();
        // staticStr은 static variable이라서 따로 선언할 필요가 없다.
        System.out.println(staticStr);

        // changeStr 매서드는 인스턴스 메서드라서 이렇게 선언을 해줘야 한다.
        Ex_06_19 c = new Ex_06_19();
        c.changeStr(staticStr);
        System.out.println("After change:" + staticStr);

    }

}
