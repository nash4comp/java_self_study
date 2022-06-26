//다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’
//을 찍어서 그래프를 그리는 프로그램이다.

package Chap05;

public class Ex_05_08 {

    public static void main(String[] args) {
        int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2, 1 };
        int[] counter = new int[4]; // 4인 이유는 1의 갯수, 2의 갯수, 3의 갯수, 4의 갯수 이므로

        for (int i = 0; i < answer.length; i++) {
            // answer[i]는 answer[1]=1, answer[2]=4, answer[3]=4 ... 이렇게 간다.
            // answer[i]-1은 answer[0]-1=0, answer[1]-1=3, answer[2]-1=3 ... 이렇게
            // 간다.
            // 즉, counter[answer[0]-1] => counter[0], counter[answer[1]-1] =>
            // counter[3] 이 된다.
            // 여기서 1을 빼는 이유는 counter 배열의 인덱스가 0부터 시작하기 때문이다.
            // 그리고 answer값 자체를 counter의 인덱스 숫자로 할당해서 하나씩 카운트 하는 것이다.
            counter[answer[i] - 1]++;
        } // end of for i

        for (int i = 0; i < counter.length; i++) {
            System.out.print(i + 1 + "의 갯수: ");

            for (int j = 0; j < counter[i]; j++) {
                System.out.print("*");
            } // end of for j

            System.out.println();
        } // end of for i

    } // end of main

} // end of class
