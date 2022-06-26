/*다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프
로그램이다. (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.*/

package Chap05;

public class Ex_05_05 {

    public static void main(String[] args) {
        int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] ball3 = new int[3];

        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
        for (int i = 0; i < ballArr.length; i++) {
            int j = (int) (Math.random() * ballArr.length);
            int tmp = 0;

            // 코드 삽입
            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;

        } // end of for i

        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.

//        for (int i = 0; i < ball3.length; i++) {
//            ball3[i] = ballArr[i];
//        }

//      arraycopyu(원본, 원본의 시작 인덱스, 사본, 사본의 시작 인덱스, 복사할 길이)
        System.arraycopy(ballArr, 0, ball3, 0, 3);

        // 여기서는 for문 보다는 System.arraycopy()를 이용해서 복사하는 것이 좋다. (p.194)
        // for문은 배열의 요소 하나하나에 접근해서 복사하지만, arraycopy()는 지정된 범위의 값들을 한 번에 통채로
        // 복사한다. 각 요소들이 연속적으로 저장되어 있다는 배열의 특성 때문에 이렇게 처리하는것이 가능하다.

        for (int i = 0; i < ball3.length; i++) {
            System.out.println(ball3[i]);
        }

    } // end of main

} // end of class
