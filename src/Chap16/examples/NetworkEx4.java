// 특정 URL에서 소스코드를 가져오는 예제
package Chap16.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkEx4 {

    public static void main(String[] args) {
        URL url = null;
        BufferedReader input = null;
        String address = "http://www.codechobo.com";
        String line = "";
        try {
            url = new URL(address);
            input = new BufferedReader(new InputStreamReader(url.openStream()));

            while ((line = input.readLine()) != null) {
                System.out.println(line);
            } // end of while
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        } // end of try-catch

    }

}
