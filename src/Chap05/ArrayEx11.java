// 배열에서 특정 값의 빈도수 구하기
// 배열의 특징이 순차적인 인덱스로 구성이 되어있다는 것을 활용한 예제

package Chap05;

public class ArrayEx11 {

    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
            System.out.print(numArr[i]);
        } // end of for i
        System.out.println();

        for (int i = 0; i < numArr.length; i++) {
            // numArr[i]는 랜덤으로 넣어진 배열이고, counter는 0으로 초기화된 배열이다.
            // 예를 들어, numArr[0] = 1일때, counter[numArr[0]] = counter[1]이 되므로
            // numArr[i]의 값은 인덱스의 번호와 일치한다. 따라서 counter[index]를 하나 증가시키면 빈도수
            // 카운트가 된다.
            counter[numArr[i]]++;
        } // end of for i

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(i + "의 개수: " + counter[i]);
        } // end of for i

    } // end of main

}
