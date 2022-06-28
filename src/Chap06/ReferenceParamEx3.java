package Chap06;

public class ReferenceParamEx3 {

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 1, 6, 5, 4 };
        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum=" + sumArr(arr));

    } // end of main

    static void printArr(int[] arr) {
        System.out.print("[");
        // 배열 arr을 index 0부터 끝까지 돌면서 그 값을 i에 넣는다.
        for (int i : arr) {
            System.out.print(i + ",");
        } // end of for i
        System.out.println("]");
    } // end of printArr

    static int sumArr(int[] arr) {
        int sum = 0;

        for (int i : arr) {
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
            sum += i;
        } // end of for i
        return sum;
    } // end of sumArr

    // sorting 알고리즘
    static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                } // end of if

            } // end of for j
        } // end of for i

    } // end of sortArr

} // end of class
