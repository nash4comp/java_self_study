package Chap16.examples;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class NetworkEx5 {

    public static void main(String[] args) {
        URL url = null;
        InputStream in = null;
        FileOutputStream out = null;
        String address = "http://www.codechobo.com/main.html";
        int ch = 0;

        try {
            url = new URL(address);
            in = url.openStream();
            System.out.println("File:" + url.toExternalForm());
            out = new FileOutputStream("javajungsuk3_src.zip");
            while ((ch = in.read()) != -1) {
                out.write(ch);
            } // end of while
            in.close();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        } // end of try-catch
    }
}
