package Chap10.examples;

import java.text.MessageFormat;

public class MessageFormatEx2 {

    public static void main(String[] args) {
        String tableName = "CUST_INFO";
        String msg = "INSERT INTO " + tableName
                + " VALUES (''{0}'',''{1}'',{2},''{3}'');";
        Object[][] arguments = { { "이자바", "02-123-1234", "27", "07-09" },
                { "삼자바", "02-321-4321", "37", "01-19" }, };

        for (int i = 0; i < arguments.length; i++) {
            String result = MessageFormat.format(msg, arguments[i]);
            System.out.println(result);

        } // end of for i

    }

}
