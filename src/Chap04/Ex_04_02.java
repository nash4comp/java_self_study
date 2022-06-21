// 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오

package Chap04;

public class Ex_04_02 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 21; i++) {
            if (((i % 2) == 0) || ((i % 3) == 0)) {
                // 조건식이 참이면 continue를 만나고, continue는 반복문의 끝으로 이동하여 다음 반복으로 넘어간다.
                // page 176
                // continue는 특정 조건을 만족하는 경우를 제외하고자 할 때 사용한다.
                continue;
            } else {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
