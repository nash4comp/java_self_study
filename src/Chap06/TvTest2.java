package Chap06;

class Tv2 {
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

public class TvTest2 {

    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        t1.channel = 7;
        System.out.println("t1의 channel값을 7로 변경하였습니다.");
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

    }

}
