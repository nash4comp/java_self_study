// 다음의 for 문을 while 문으로 변경하시오.

package Chap04;

public class Ex_04_05 {

    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j <= i; j++)
//                System.out.println("*");
//            System.out.println();
//        }
        
        int i = 0;
        while (i < 10) {
            // j의 초기화는 여기에서 이루어져야 한다.
            int j = 0;
            while (j <= i) {
                System.out.println("*");
                j++;
            }
            System.out.println();
            i++;
        }

    }

}
