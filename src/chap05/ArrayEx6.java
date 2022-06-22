// 배열의 최대값, 최소값 정렬하는 로직
// default max, min 값을 0번 인덱스 값으로 기준점을 설정하고 for loop을 돌려서 비교
// 사실 기준점은 어떤 인덱스 값을 하든 상관은 없다.

package chap05;

public class ArrayEx6 {

    public static void main(String[] args) {
        int[] score = { 79, 88, 91, 33, 100, 55, 95 };
        int max = score[0];
        int min = score[0];
        // 배열의 두 번째 요소부터 읽기 위해서 변수 i의 값을 1로 초기화 했음.
        // 처음에 max와 min의 값을 0으로 잡으면, 배열의 인덱스를 0부터 시작해야 하므로 수행시간이 늘어난다.
        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];

                // 여기서 if문으로 분기를 해도 결과는 동일하게 나온다.
                // 하지만, 굳이 else if 문으로 하는 이유는 조건문을 덜 돌리게 되기 때문이다.
                // else if로 할 경우, max는 한번, min은 두번의 조건문만 돌리지만, if로 분기하면 무조건 두번의
                // 조건문이 실행되기 때문
            } else if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }

}
