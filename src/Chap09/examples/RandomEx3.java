// Random을 원하는 범위에서 생성하는 예제

package Chap09.examples;

import java.util.Arrays;

public class RandomEx3 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(getRand(5, 10) + ",");
        } // end of for i
        System.out.println();

        int[] result = fillRand(new int[10], new int[] { 2, 3, 7, 5 });
        System.out.println(Arrays.toString(result));
    }

    // 배열 arr을 from과 to 범위의 값들로 채워서 반환한다.
    public static int[] fillRand(int[] arr, int from, int to) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRand(from, to);
        } // end of for i
        return arr;
    } // end of method fillRand

    // 배열 arr을 배열 data에 있는 값들을 시드로 랜덤으로 채워서 반환한다.
    public static int[] fillRand(int[] arr, int[] data) {
        for (int i = 0; i < arr.length; i++) {
            // data[0] 부터 data[lastIndex]까지의 값을 시드로 사용한다.
            arr[i] = data[getRand(0, data.length - 1)];
        } // end of for i
        return arr;

    } // end of fillRand

    // from과 to범위의 정수(int) random 값을 반환한다. from과 to 모두 범위에 포함된다.
    public static int getRand(int from, int to) {
        // Math.abs(to-from)+1 는 난수의 총 갯수
        // Math.min(from, to) 는 from과 to 중 작은 값
        // 즉, (Math.random() * 총 갯수) + 최소값
        return (int) (Math.random() * (Math.abs(to - from) + 1))
                + Math.min(from, to);
    } // end of getRand

}
