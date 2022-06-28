package Chap06;

public class PowerTest {

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long result = 0;
        for (int i = 1; i <= n; i++) {
            result += power(x, i);

        } // end of for i
        System.out.println(result);

    } // end of main

    static long power(int x, int n) {
        if (n == 1)
            return x;
        return x * power(x, n - 1);
    }

} // end of class
