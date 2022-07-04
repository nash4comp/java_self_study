// 배열의 최대, 최소값 구하기

package Chap06;

public class ex_06_23 {
    static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -999999;
        } // end of if

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            } // end of if arr

        } // end of for i

        return max;

    } // end of max

    static int min(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -999999;
        } // end of if

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            } // end of if arr

        } // end of for i

        return min;

    } // end of max

    public static void main(String[] args) {
        int[] data = { 3, 2, 9, 4, 7 };
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값: " + max(data));
        System.out.println("최대값: " + max(null));
        System.out.println("최대값: " + max(new int[] {}));
        System.out.println("최소값: " + min(data));
    }

}
