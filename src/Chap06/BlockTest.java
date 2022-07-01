// 생성자 호출 순서 예제

package Chap06;

public class BlockTest {

    // [클래스 초기화 블럭] 초기화 블럭 앞에 static을 붙여서 클래스 초기화 블럭으로 만든다.
    static {
        System.out.println("static { }");
    }

    // [인스턴스 초기화 블럭] 초기화 블럭 앞에 아무것도 없으면 인스턴스 초기화 블럭이 된다.
    // 인스턴스 블럭은 생성자보다 먼저 수행되며, 생성자들에서 공통되는 부분을 추려서 만든다.
    {
        System.out.println("instance { }");
    }

    public BlockTest() {
        System.out.println("생성자");
    }

    public BlockTest(String str) {
        System.out.println(str + "생성자");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt=new BlockTest();");
        BlockTest bt = new BlockTest();
        System.out.println();

        System.out.println("BlockTest bt2=new BlockTest();");
        BlockTest bt2 = new BlockTest();
        System.out.println();

        System.out.println("BlockTest bt2=new BlockTest();");
        BlockTest bt3 = new BlockTest("String parameter");

    } // end of main

} // end of class BlockTest
