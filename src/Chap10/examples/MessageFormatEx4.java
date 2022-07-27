// file에서 데이터를 읽어와서 추출하기

package Chap10.examples;

import java.io.File;
import java.text.MessageFormat;
import java.util.Scanner;

public class MessageFormatEx4 {

    public static void main(String[] args) throws Exception {
        String tableName = "CUST_INFO";
        String fileName = "D:\\GitHub\\Java_Self_Study\\src\\Chap10\\examples\\data4.txt";
        String msg = "INSERT INTO " + tableName + "VALUES ({0},{1},{2},{3});";
        Scanner s = new Scanner(new File(fileName));
        String pattern = "{0},{1},{2},{3}";
        MessageFormat mf = new MessageFormat(pattern);

        while (s.hasNextLine()) {
            String line = s.nextLine();
            Object[] objs = mf.parse(line);
            System.out.println(MessageFormat.format(msg, objs));
        } // end of while
        s.close();
    }

}
