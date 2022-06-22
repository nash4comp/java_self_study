// 버블정렬(bubble sort) 알고리즘
// 비효율적이지만, 간단하다.

package chap05;

public class ArrayEx10 {

    public static void main(String[] args) {
        int[] numArr = new int[10];
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random() * 10));
        } // end of for i

        System.out.println();
        // j를 통해서 자리 바꿈을 했지만, 이를 i를 통해 (배열의 길이 - 1) 번만큼 반복해줘야 한다.
        for (int i = 0; i < numArr.length - 1; i++) {
            // 자리바꿈이 발생했는지 체크하기 위한 변수
            // j의 증가에 의해 자리바꿈이 일어나면, 여기서 다시 초기화를 한다.
            boolean changed = false;
            // 가장 큰 수를 오른쪽으로 밀어넣고, 전체 인덱스 크기를 하나씩 줄여가면서 비교를 반복한다.
            for (int j = 0; j < numArr.length - 1 - i; j++) {
                // 옆의 값이 작으면 서로 바꾼다.
                if (numArr[j] > numArr[j + 1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp;
                    // 자리바꿈이 발생하면 changed를 true로 변경해준다.
                    changed = true;
                } // end of if

            } // end of for j
              // 자리바꿈이 없으면 반복문을 벗어난다.
            if (!changed)
                break;
            for (int k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k]);
            } // end of for k
            System.out.println();
        } // end of for i
    } // end of main

}
