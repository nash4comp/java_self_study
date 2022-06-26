// 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.

package Chap05;

public class Ex_05_04 {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum = 0;
        float avg = 0.0f;
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                cnt++;
            } // end of j
        } // end of for i

        avg = sum / (float) cnt;
        System.out.println("sum: " + sum + ", avg: " + avg);

    } // end of main

}
