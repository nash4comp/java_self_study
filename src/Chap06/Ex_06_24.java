package Chap06;

public class Ex_06_24 {

    static int abs(int value) {
        return value < 0 ? -value : value;

    } // end of abs

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값:" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값:" + abs(value));
    }

}
