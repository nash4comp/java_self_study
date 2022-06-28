package Chap06;

class Tv {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    } // end of power

    void channelUp() {
        ++channel;
    } // end of channelUp

    void channelDown() {
        --channel;
    } // end of channelDown

} // end of class Tv

public class TvTest {

    public static void main(String[] args) {
        // Tv 클래스 타입의 참조변수 t선언
        Tv4 t;
        // Tv 인스턴스를 생성한 후, 생성된 Tv 인스턴스의 주소를 t에 저장
        t = new Tv4();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + " 입니다.");

    }

}
