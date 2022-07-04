// shuffle로 배열의 값을 섞기

package Chap06;

public class Ex_06_20 {

    static int[] shuffle(int[] arr) {
        // 유효성 체크는 반드시 하고 넘어가야 한다.
        // 여기서 유효성 체크는 배열의 길이가 된다.
        if (arr == null || arr.length == 0)
            return arr;

        for (int i = 0; i < arr.length; i++) {
            int j = (int) (Math.random() * arr.length);
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;

        } // end of for i

        return arr;
    } // end of class shuffle

    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println((java.util.Arrays.toString(original)));

        int[] result = shuffle(original);
        System.out.println((java.util.Arrays.toString(result)));

    } // end of main

} // end of class
