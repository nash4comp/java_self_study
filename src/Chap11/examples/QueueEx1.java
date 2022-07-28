package Chap11.examples;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            System.out.println(">>");
            try {
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if ("".equals(input))
                    continue; // continue는 아래의 행을 건너뛰고 다시 iteration의 처음으로 간다.

                if (input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println(" help - 도움말을 보여줍니다.");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println(
                            " history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                } else if (input.equalsIgnoreCase("history")) {
                    int i = 0;
                    save(input);
                    LinkedList tmp = (LinkedList) q;
                    ListIterator it = tmp.listIterator();

                    while (it.hasNext())
                        System.out.println(++i + "." + it.next());
                } else {
                    save(input);
                    System.out.println(input);
                } // end of if
            } catch (Exception e) {
                System.out.println("입력 오류입니다.");
            } // end of try-catch
        } // end of while
    } // end of main

    public static void save(String input) {
        if (!"".equals(input))
            q.offer(input);
        if (q.size() > MAX_SIZE)
            q.remove();
    } // end of save
} // end of class
