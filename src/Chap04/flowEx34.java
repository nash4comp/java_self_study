package Chap04;

import java.util.Scanner;

public class flowEx34 {

    public static void main(String[] args) {
        int menu = 0, num = 0;
        Scanner scanner = new Scanner(System.in);

        // outer로 반복문에 이름을 붙여주었다.
        // 이름은 for, while에 붙여줄 수 있다.
        outer: while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료:0)>");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");

                // continue는 반복문의 끝으로 이동하여 다음 반복으로 넘어간다.
                // 즉, 특정 조건을 만족하는 경우를 제외하고자 할 때 유용하며 break문과 달리 반복문을 벗어나지 않는다.
                continue;
            }

            // 무한 반복문으로 아래와 같이 while (true)로 써도 된다.
            for (;;) {
//            while (true) {
                System.out.println("계산할 값을 입력하세요. (계산 종료:0, 전체 종료:99)>");
                tmp = scanner.nextLine();
                num = Integer.parseInt(tmp);

                if (num == 0)
                    break;
                if (num == 99)

                    // 여기가 핵심 포인트이다.
                    // outer는 while과 for 전체를 아우르는 이름이므로, 이렇게 빠져나가면 된다.
                    break outer;
                switch (menu) {
                case 1:
                    System.out.println("result=" + num * num);
                    break;
                case 2:
                    System.out.println("result=" + Math.sqrt(num));
                    break;
                case 3:
                    System.out.println("result=" + Math.log(num));
                    break;
                }
            }
        }
        scanner.close();
    }

}
