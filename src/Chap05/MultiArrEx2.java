// 빙고 게임
// 입력한 숫자의 자리를 찾아서 0으로 만든다.

package Chap05;

import java.util.Scanner;

public class MultiArrEx2 {

    public static void main(String[] args) {
        final int SIZE = 5;
        int x = 0, y = 0, num = 0;
        int[][] bingo = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        // 배열의 값을 1부터 25까지 값으로 초기화
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bingo[i][j] = i * SIZE + j + 1;
            } // end of for j
        } // end of for i

        // 배열에 저장된 값을 섞는다.
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                x = (int) (Math.random() * SIZE);
                y = (int) (Math.random() * SIZE);

                int tmp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = tmp;
            }
        } // end of for i;

        do {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.printf("%2d ", bingo[i][j]);
                } // end of for j
                System.out.println();
            } // end of for i
            System.out.println();
            System.out.printf("1~%d의 숫자를 입력하세요. (종료:0)>", SIZE * SIZE);
            // 문자 입력 받기
            String tmp = scanner.nextLine();
            // 받은 문자를 숫자로 변환하기
            num = Integer.parseInt(tmp);

            // outer라는 이름이 붙은 반복문
            // 이 이름으로 break를 하면 전체를 벗어날 수 있다.
            outer: for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    // 해당 배열의 인덱스를 증가시키면서 입력받은 숫자와 비교해서 같으면 0으로 셋팅하고 outer를
                    // 벗어난다.
                    if (bingo[i][j] == num) {
                        bingo[i][j] = 0;
                        break outer; // 라인 58 -> 36으로 간다.
                    } // end of if binge[i][j]
                } // end of for j
            } // end of for i, 이름 붙은 반복문 범위
        } while (num != 0); // end of do loop

        scanner.close();
    } // end of main

}
