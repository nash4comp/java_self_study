// 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.

package Chap04;

public class Ex_04_06 {

    public static void main(String[] args) {

        // 주사위의 범위는 1~6
        // 주사위는 2개이므로 변수는 2개를 선언하되, loop 및 sub loop로 돌려서 모든 경우의 수를 산출
        // 여기서 합이 6이 되는 경우만 프린트

        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                if ((i + j)  == 6) {
                    System.out.println(i + " " + j);
                } else {
                    continue;
                }
            }
        }
    }

}
