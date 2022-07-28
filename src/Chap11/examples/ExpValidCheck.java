// 괄호 일치여부를 판별하는 예제
package Chap11.examples;

import java.util.EmptyStackException;
import java.util.Stack;

public class ExpValidCheck {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ExpValidCheck \"EXPRESSION\"");
            System.out.println("Example: java ExpValidCheck \"((2+3)*1+3\"");
            System.exit(0);
        } // end of if

        Stack st = new Stack();
        String expression = args[0];

        System.out.println("expression:" + expression);

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);
                if (ch == '(') {
                    st.push(ch + "");
                } else if (ch == ')') {
                    st.pop();
                } // end of if ch
            } // end of for i

            if (st.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");

            } // end of if st
        } catch (EmptyStackException e) {  // 만약 )를 먼저 만나서 pop을 시도하려고 하면, exception이 발생한다.
            System.out.println("괄호가 일치하지 않습니다.");
        } // end of try-catch

    } // end of main

}
