// 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.

package Chap05;

public class Ex_05_03 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = 0;

        // 향상된 for문을 사용했음.
        // 배열 arr의 시작부터 끝까지 iteration을 돌면서 그 값을 value에 저장해라
        // 그리고 sum에 value 값을 더해라.
        for (int value : arr) {
            sum += value;
        }
        System.out.println(sum);
    }
}
