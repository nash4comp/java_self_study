package Chap06;

class Tv4 {
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

} // end of class Tv4

public class TvTest4 {

    public static void main(String[] args) {
        Tv4[] tvArr = new Tv4[3];
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv4();
            tvArr[i].channel = i + 10;
        } // end of for i
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
        } // end of for i
    } // end of main

} // end of class TvTest4
