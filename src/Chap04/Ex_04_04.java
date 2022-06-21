// 1 + (-2) + 3 + (-4)... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.

package Chap04;

public class Ex_04_04 {

    public static void main(String[] args) {
        // 변수를 1씩 증가시키며, 짝수가 되었을 때는 마이너스를 곱하고 더하는 loop 작성한다.
        // 더해진 값이 100보다 커지는 순간 마지막 더하는 수를 구한다.
        int sum = 0;
        int i = 1;
        // 값의 부호를 바꿔주는데 사용하는 변수
        int s = 1;

        // while 대신에 무한루프가 되는 for문을 써도 된다.
        // for (int i = 1; true; i++, s=-s)
        // 여기서 s를 +와 -로 계속 바꿔주는 것이 하나의 팁이다.
        while (sum < 100) {
            if ((i % 2) == 0) {
                sum += -i;
            } else {
                sum += i;
            }
            i++;
        }
        System.out.println(--i);

    }

}
