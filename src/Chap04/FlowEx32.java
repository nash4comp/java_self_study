package Chap04;

import java.util.Scanner;

public class FlowEx32 {

    public static void main(String[] args) {
        int menu = 0;

        Scanner scanner = new Scanner(System.in);

        // 메뉴를 제대로 선택할 때까지 무한 반복
        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료:0)>");
            
            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);
            
            if (menu == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");

                // continue는 반복문의 끝으로 이동하여 다음 반복으로 넘어간다.
                // 즉, 특정 조건을 만족하는 경우를 제외하고자 할 때 유용하며 break문과 달리 반복문을 벗어나지 않는다.
                continue;
            }
            System.out.println("선택하신 메뉴는 " + menu + "번입니다." );
        }
        scanner.close();
    }
}
