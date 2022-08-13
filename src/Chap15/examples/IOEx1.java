package Chap15.examples;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx1 {

    public static void main(String[] args) {
        byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        byte[] outSrc = null;
        // 메모리(바이트 배열)에 데이터를 입출력하는데 사용되는 스트림
        // 주로 다른 곳에 입출력하기 전에 데이터를 임시로 담아서 변환 작업을 하는데 사용됨
        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;
        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        int data = 0;
        // 1 byte를 읽어온다. 더 이상 읽어올 데이터가 없으면 -1을 return한다.
        while ((data = input.read()) != -1) {
            output.write(data);
        } // end of while
        outSrc = output.toByteArray();
        System.out.println("Input Source:" + Arrays.toString(inSrc));
        System.out.println("Output Source:" + Arrays.toString(outSrc));
    }

}
