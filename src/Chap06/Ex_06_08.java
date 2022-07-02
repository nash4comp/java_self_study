package Chap06;

public class Ex_06_08 {
    int kind; // 인스턴스 변수
    int num; // 인스턴스 변수
    static int width; // 클래스 변수, 전체 클래스에 공유되고 클래스가 로딩될때 같이 로딩된다.
    static int height; // 클래스 변수

    // 인스턴스 메서드
    Ex_06_08(int k, int n) {
        kind = k; // k는 지역변수, kind는 인스턴스 변수
        num = n; // n은 지역변수, num은 인스턴스 변수
    }

    public static void main(String args[]) { // args는 지역변수
        Ex_06_08 card = new Ex_06_08(1, 1); // card는 지역변수
    }

}
