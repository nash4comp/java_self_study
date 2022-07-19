// 0 ~ 9 사이의 난수를 100개 발생시키고 각 숫자의 빈도를 세어 그래프로 그리기

package Chap09.examples;

import java.util.Random;

public class RandomEx2 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] number = new int[100];
        int[] counter = new int[10];

        for (int i = 0; i < number.length; i++) {
            // 0 <= x < 10 범위의 정수 x를 반환한다.
            System.out.print(number[i] = rand.nextInt(10));
        } // end of for i

        System.out.println();

        for (int i = 0; i < number.length; i++) {
            // 인덱스를 활용해서 카운팅을 하는 방법
            counter[number[i]]++;
        } // end of for i

        for (int i = 0; i < counter.length; i++) {
            System.out.println(i + "의 개수: " + printGraph('#', counter[i]) + " "
                    + counter[i]);
        } // end of for i

    } // end of main

    public static String printGraph(char ch, int value) {
        char[] bar = new char[value];
        for (int i = 0; i < bar.length; i++) {
            bar[i] = ch;
        } // end of for i
        return new String(bar);
    } // end of method

} // end of class
