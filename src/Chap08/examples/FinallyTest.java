package Chap08.examples;

public class FinallyTest {

    public static void main(String[] args) {

        try {
            startInstall();
            copyFiles();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            deleteTempFiles();
        } // end of try-catch

    } // end of main

    static void startInstall() {

    } // end of startInstall

    static void copyFiles() {
    }

    static void deleteTempFiles() {
    }

} // end of class
