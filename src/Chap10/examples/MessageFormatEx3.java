// 소스에서 원하는 데이터만 뽑아내는 예제

package Chap10.examples;

import java.text.MessageFormat;

public class MessageFormatEx3 {

    public static void main(String[] args) throws Exception {
        String[] data = {
                "INSERT INTO CUST_INFO VALUES ('이자바', '02-123-1234', '27', '07-09');",
                "INSERT INTO CUST_INFO VALUES ('김자바', '02-312-4321', '37', '01-09');", };

        // 뽑아낼 데이터의 패턴을 적어두고, 변수는 index로 뺀다.
        String pattern = "INSERT INTO CUST_INFO VALUES ({0},{1},{2},{3});";
        MessageFormat mf = new MessageFormat(pattern);

        for (int i = 0; i < data.length; i++) {
            // objs에 data 배열의 값을 전부 parse하여 넣는다. 여기서는 4개가 된다.
            Object[] objs = mf.parse(data[i]);
            for (int j = 0; j < objs.length; j++) {
                System.out.print(objs[j] + ",");
            } // end of for j
            System.out.println();
        } // end of for i

    }

}
