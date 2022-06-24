/*입력한 2차원 좌표의 위치에 X를 표시하는 예제
다양한 크기의 배를 상대방이 알지 못하게 배치한 다음,번갈아가며 좌표를 불러서 상대방의 배의 위치를 알아내는 게임

continue문에 대한 정확한 이해를 점검해야 하는 예제
*/

package Chap05;

import java.util.Scanner;

public class MultiArrEx1 {

    public static void main(String[] args) {
        final int SIZE = 10;
        int x = 0, y = 0;
        char[][] board = new char[SIZE][SIZE];
        byte[][] shipBoard = {
                // 배의 위치는 여기에서 배치
                // 1 2 3 4 5 6 7 8 9
                { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
                { 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
                { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
                { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
                { 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
                { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
                { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
                { 0, 0, 0, 0, 0, 1, 1, 1, 0 }, // 9
        };

        // 1행에 행번호를, 1열에 열번호를 저장한다.
        for (int i = 1; i < SIZE; i++) {
            board[0][i] = board[i][0] = (char) (i + '0');
        } // end of for i

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("좌표를 입력하세요. (종료는 00)>");
            String input = scanner.nextLine();

            // 좌표는 두 글자 입력을 받는다.
            if (input.length() == 2) {
                // 문자 입력을 받은 것을 숫자로 변환
                x = input.charAt(0) - '0';
                y = input.charAt(1) - '0';

                // 입력받은 x와 y가 둘다 0이면 프로그램 종료
                if (x == 0 && y == 0) {
                    break;
                } // end of if x, y

            } // end of if input

            // 입력이 2글자를 넘어가거나, 0보다 작거나, SIZE를 초과하면 에러메시지 발생
            if (input.length() != 2 || x <= 0 || x >= SIZE || y <= 0
                    || y >= SIZE) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                // continue를 만나는 순간, continue 아래에 남은 로직을 더이상 실행하지 않고, 다시 loop문의
                // 시작점으로 돌아간다. 즉, 36번 라인으로 돌아가게 된다.
                continue;
            } // end of if input, x, y

            // shipBoard[x-1][y-1]의 값이 1이면, 'O'을 board[x][y]에 저장한다.
            // 즉, 위의 라인 20번에 정의한 배의 위치와 입력한 숫자값이 같으면 'O'을 저장한다.
            board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X';
            for (int i = 0; i < SIZE; i++) {
                // 1차원 char 배열의 참조변수를 println으로 출력하면, 배열의 모든 요소를 한 줄로 출력한다.
                System.out.println(board[i]);
            } // end of for i
            System.out.println();

        } // end of while true
        scanner.close();
    } // end of main

}
