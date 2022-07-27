// 시간의 차이를 구하는 예제

package Chap10.examples;

import java.util.Calendar;

public class CalendarEx3 {

    public static void main(String[] args) {
        final int[] TIME_UNIT = { 3600, 60, 1 }; // 큰 단위를 앞에 놓는다.
        final String[] TIME_UNIT_NAME = { "시간 ", "분 ", "초 " };
        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();

        time1.set(Calendar.HOUR_OF_DAY, 10);
        time1.set(Calendar.MINUTE, 20);
        time1.set(Calendar.SECOND, 30);

        time2.set(Calendar.HOUR_OF_DAY, 20);
        time2.set(Calendar.MINUTE, 20);
        time2.set(Calendar.SECOND, 30);

        System.out.println("time1: " + time1.get(Calendar.HOUR_OF_DAY) + "시 "
                + time1.get(Calendar.MINUTE) + "분 " + time1.get(Calendar.SECOND)
                + "초");
        System.out.println("time2: " + time2.get(Calendar.HOUR_OF_DAY) + "시 "
                + time2.get(Calendar.MINUTE) + "분 " + time2.get(Calendar.SECOND)
                + "초");

        long difference = Math
                .abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;
        System.out.println("time1과 time2의 차이는 " + difference + "초 입니다.");
        String tmp = "";

        // iteration을 돌면서 3600, 60, 1로 나눈값에 단위를 붙인다.
        // 동전의 거스름돈 구하는 방식과 유사하다.
        for (int i = 0; i < TIME_UNIT.length; i++) {
            tmp += difference / TIME_UNIT[i] + TIME_UNIT_NAME[i];
            difference %= TIME_UNIT[i];
        } // end of for i
        System.out.println("시분초로 변환하면 " + tmp + "입니다.");

    }

}
