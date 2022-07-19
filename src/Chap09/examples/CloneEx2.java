// clone()을 이용한 배열 복사

package Chap09.examples;

import java.util.Arrays;

public class CloneEx2 {

    public static void main(String[] args) {
        // 배열도 객체이므로 Object 클래스를 상속받으며, 동시에 Cloneable 인터페이스와 Serializable 인터페이스가
        // 구현됨
        // Object 클래스에는 protected로 정의되어있는 clone()을 배열에서는 public으로 오버라이딩 함.
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arrClone = arr.clone();

//        아래 코드와 동일
//        int[] arrClone = new int[arr.length];
//        System.arraycopy(arr, 0, arrClone, 0, arr.length);

        arrClone[0] = 6;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
    }
}
