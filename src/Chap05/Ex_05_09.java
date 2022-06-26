// 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.

package Chap05;

public class Ex_05_09 {

    public static void main(String[] args) {
        char[][] star = { { '*', '*', ' ', ' ', ' ' },
                { '*', '*', ' ', ' ', ' ' }, { '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*' } };

        char[][] result = new char[star[0].length][star.length]; // [5],[4]
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            } // end of for j
            System.out.println();
        } // end of for i
        System.out.println();
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                result[j][i] = star[star.length - i - 1][j];
            } // end of for j
        } // end of for i
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            } // end of for j
            System.out.println();

        } // end of for i
    } // end of main

} // end of class
