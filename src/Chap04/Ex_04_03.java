// 1 + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+ .. +10)의 결과를 계산하시오.

package Chap04;

public class Ex_04_03 {

    public static void main(String[] args) {
// 1씩 증가하는 변수를 만든다.
// 그 변수를 더하는 loop를 sub loop로 만든다.

        
        // 내가 생각한 로직: NUM을 동적으로 구성한다.
        // (1*10) + (2*9) + (3*8) + .. 이므로 i를 이용해서 이렇게 계산을 한다.        
        final int NUM = 10;
        int sum = 0;
        int totalSum = 0;

        for (int i = 1; i < NUM + 1; i++) {
//            sum += (i * (NUM + 1 - i));
            sum += i;
            totalSum += sum;
        }
//        System.out.println(sum);
        System.out.println(totalSum);

    }

}
