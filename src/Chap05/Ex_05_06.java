// 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변
// 수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하
// 라. 단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다.

// 추가 연습: 동전의 단위가 랜덤으로 주어졌다면?

package Chap05;

import java.util.Arrays;
import java.util.Collections;

public class Ex_05_06 {

    public static void main(String[] args) {
        Integer[] coinUnit = { 100, 50, 500, 10 };
        int money = 2680;
        int tmp = 0;
        System.out.println("money=" + money);

        // 동전의 단위를 큰 숫자부터 정렬한다. 즉, 내림차순으로 정렬
        // java.util.Arrays 클래스의 sort() 메서드를 사용하여 정렬이 가능하다.
        // Arrays 클래스는 배열의 복사, 정렬, 검색등 배열의 조작 기능을 가지고 있다.
        // 오름차순은 기본형 타입의 배열로 Array.sort(arr)하면 되나,
        // 내림차순으로 정렬할 때는 Collections 클래스의 reverseOrder()를 사용해야 한다.
        // 이때 배열은 wrapper 클래스로 만들어야 한다. 왜냐하면, 그래야 배열의 값들이 참조값을 가지고 넘겨줄 수 있기
        // 때문이다.
        Arrays.sort(coinUnit, Collections.reverseOrder());

        for (int i = 0; i < coinUnit.length; i++) {
            tmp = money / coinUnit[i];
            money = money % coinUnit[i];
            System.out.println(coinUnit[i] + "원: " + tmp + "개");
        } // end of for i

    } // end of main

} // end of class
