//주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열
//의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다.
//코드를 완성하시오.
//
//실행 결과
//100 100 100 300
//20 20 20 60
//30 30 30 90
//40 40 40 120
//50 50 50 150
//240 240 240 720

package Chap05;

public class Ex_05_11 {

    public static void main(String[] args) {
        // 2차원 배열 5x3 선언
        int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 },
                { 40, 40, 40 }, { 50, 50, 50 } };
        // 2차원 배열 6x4 선언
        int[][] result = new int[score.length + 1][score[0].length + 1];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {

                // 보다 식을 간단하게 하려면 result.length - 1 = score.length 로 대체 가능
                result[i][j] = score[i][j];
                result[i][result[i].length - 1] += score[i][j];
                result[result.length - 1][j] += score[i][j];
                result[result.length - 1][result[i].length - 1] += score[i][j];
            } // end of for j
        } // end of for i

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.printf("%4d", result[i][j]);
            } // end of for j
            System.out.println();
        } // end of for i

    } // end of main

} // end of class
