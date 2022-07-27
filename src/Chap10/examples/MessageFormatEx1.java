package Chap10.examples;

import java.text.MessageFormat;

public class MessageFormatEx1 {

    public static void main(String[] args) {
        String msg = "Name: {0} \nTel: {1} \nAge: {2} \nBirthday: {3}";
        Object[] arguments1 = { "이자바", "02-123-1234", "27", "07-09" };
        Object[] arguments2 = { "삼자바", "02-321-4321", "37", "01-19" };

        String result1 = MessageFormat.format(msg, arguments1);
        String result2 = MessageFormat.format(msg, arguments2);
        System.out.println(result1);
        System.out.println();
        System.out.println(result2);

    }

}
