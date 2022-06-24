// 향상된 for문과 다차원 배열의 결합(중요)
// 단, 향상된 for문은 배열의 각 요소에 저장된 값들을 순차적으로 읽어올 수는 있지만, 배열에 저장된 값을 변경할 수는 없다. 

package Chap05;

public class ArrayEx18 {

    public static void main(String[] args) {
        int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 },
                { 40, 40, 40 } };
        int sum = 0;
        for (int i = 0; i < score[i].length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
            }
        } // end of for i

        /*
         * 배열 타입의 score를 시작부터 끝까지 loop를 돌면서 그 값을 int 배열 타입의 tmp에 넣는 향상된 for문
         * 여기서는 score의 1차원 배열의 길이만큼만 loop를 돈다. 즉, score[0], score[1], score[2]
         * 즉, tmp[0] ~ tmp[2]까지 loop를 돈다.
         */
        for (int[] tmp : score) {
            /*
             * 배열 타입의 tmp를 시작부터 끝까지 loop를 돌면서 그 값을 int 타입의 i에 넣는 향상된 for문 즉,
             * tmp에는 score[0], score[1], score[2]이 저장되고, tmp[0] = score[0][0],
             * tmp[1] = score[0][1], tmp[2] = score[0][2] 이렇게 저장이 된다. 아래의 for문은
             * tmp[0][0] ~ tmp[0][2]로 loop를 돈다.
             */

            for (int i : tmp) {
                sum += i;
            } // end of for i
        } // end of for tmp
        System.out.println("sum=" + sum);
    } // end of main

}
