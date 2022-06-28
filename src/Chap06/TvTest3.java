package Chap06;

class Tv3 {
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

} // end of class Tv3

public class TvTest3 {

    public static void main(String[] args) {
        Tv4 t1 = new Tv4();
        Tv4 t2 = new Tv4();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        t2 = t1;
        t1.channel = 7;
        System.out.println("t1의 channel값을 7로 변경하였습니다.");
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
    }

}
