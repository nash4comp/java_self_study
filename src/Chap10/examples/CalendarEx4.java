package Chap10.examples;

import java.util.Calendar;

public class CalendarEx4 {

    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2015, 7, 31);

        System.out.println(toString(date));
        System.out.println("= 1일 후 =");
        date.add(Calendar.DATE, 1);
        System.out.println(toString(date));

        System.out.println("= 6달 전 =");
        date.add(Calendar.MONTH, -6);
        System.out.println(toString(date));

        // date.roll로 증가시키면 월은 안바뀌고 일만 바뀐다.
        System.out.println("= 31일 후(roll) =");
        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date));

        System.out.println("= 31일 후(add) =");
        date.add(Calendar.DATE, 31);
        System.out.println(toString(date));
    } // end of main

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1)
                + "월 " + date.get(Calendar.DATE) + "일";
    }

}
