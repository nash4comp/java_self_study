package Chap04;

public class FlowEx33 {

    public static void main(String[] args) {

        // 반복문에 이름을 붙여줄 수 있다.
        Loop1: for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5)

                    // 이렇게 지정할 경우, 반복문을 두개이상 벗어날 수 있다.
                    // 원래의 의도는 j가 5가 되면 종료되는 것이다.
                    break Loop1;

                // 여기서 그냥 break를 하면, 반복문을 하나만 벗어나서 i가 9까지 카운트된다.
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }

    }

}
