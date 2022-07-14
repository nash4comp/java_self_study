package Chap08.examples;

import java.io.File;

public class ExceptionEx15 {

    public static void main(String[] args) {
        File f = createFile(args[0]);
        System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");

    }

    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals("")) {
                throw new Exception("파일 이름이 유효하지 않습니다.");
            } // end of if fileName
        } catch (Exception e) {
            fileName = "제목없음.txt";
        } finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        } // end of try-catch

    } // end of method File

    static void createNewFile(File f) {
        try {
            f.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
        } // end of try-catch

    } // end of createNewFile

}
