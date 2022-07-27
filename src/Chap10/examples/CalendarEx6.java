// 사용자 입력에 따른 달력 출력

package Chap10.examples;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx6 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int year = 0;
        int mon = 0;
        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        Calendar sDay = Calendar.getInstance();
        Calendar eDay = Calendar.getInstance();

        while (true) {
            System.out.println("원하는 달을 입력하세요.");
            System.out.println("예시: 2015 9");

            // nextLine()은 한줄을 통채로 읽는다.
            // 하지만, enter까지 읽기 때문에 사용전에 버퍼를 비워줘야 한다.
            String input = myScanner.nextLine();
            String[] str = input.split(" ");
            if (str.length != 2) {
                System.out.println("형식에 맞게 입력해 주세요.\n");
            } else {
                year = Integer.parseInt(str[0]);
                mon = Integer.parseInt(str[1]);
                break;
            }

        } // end of while

        // 월의 경우 0부터 11까지의 값을 가지므로 1을 빼주어야 한다.
        // 예를 들어, 2015년 11월 1일은 sDay.set(2015, 10, 1); 과 같이 해줘야 한다.
        sDay.set(year, mon - 1, 1);
        eDay.set(year, mon, 1);

        // 다음달의 첫날에서 하루를 빼면 현재달의 마지막 날이 된다.
        // 12월 1일에서 하루를 빼면 11월 30일이 된다.
        eDay.add(Calendar.DATE, -1);

        // 첫 번째 요일이 무슨 요일인지 알아낸다.
        // 0 1 2 3 4 5 6
        // { "1일", "2월", "3화", "4수", "5목", "6금", "7토" };
        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);

        // eDay에 지정된 날짜를 얻어온다.
        END_DAY = eDay.get(Calendar.DATE);
        System.out.println("    " + year + "년 " + mon + "월");
        System.out.println(" SU MO TU WE TH FR SA");

        // 해당 월의 1일이 어느 요일인지에 따라서 공백을 출력한다.
        // 만일 1일이 수요일(4)이라면 공백을 세 번 찍는다. (일요일부터 시작)
        for (int i = 1; i < START_DAY_OF_WEEK; i++) {
            System.out.print("   ");

        } // end of for i

        // 위의 공백을 찍은 자리 이후부터 진행된다.
        // 첫 번째 요일이 일요일이면 i와 같이 1부터 시작한다.
        for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
            // 10보다 작으면 한칸, 이상이면 두칸을 띄운다.
            System.out.print((i < 10) ? "  " + i : " " + i);
            // 첫 번째 요일은 무조건 일요일이 1로 할당되어서 7번째가 되면 라인을 바꾼다.
            if (n % 7 == 0)
                System.out.println();

        } // end of for i

        myScanner.close();
    } // end of main

}
