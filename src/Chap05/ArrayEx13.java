// 16진수로 변환하는 예제
package Chap05;

public class ArrayEx13 {

    public static void main(String[] args) {
        char[] hex = { 'C', 'A', 'F', 'E' };
        String[] binary = { "0000", "0001", "0010", "0011", "0100", "0101",
                "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101",
                "1110", "1111" };
        String result = "";
        for (int i = 0; i < hex.length; i++) {
            /*
             * '0'의 값은 48이고, '9'의 값은 57이다. 즉, hex의 값이 숫자이면 숫자를 result에 넣게된다.
             */
            if (hex[i] >= '0' && hex[i] <= '9') {
                result += binary[hex[i] - '0'];
                /*
                 * 'A'의 값은 65이기 때문에 여기서 빼주고 A는 16진수로 10이므로 10을 더해준다. 이렇게 해서
                 * 16진수로 변환하게 된다.
                 */
            } else {
                result += binary[hex[i] - 'A' + 10];
            }
        }
        System.out.println("hex:" + new String(hex));
        System.out.println("binary:" + result);
    }

}
