package Chap08.examples;

public class ExceptionEx17 {

    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception e) {
            System.out.println("main 메서드에서 예외가 처리되었습니다.");
        } // end of try-catch
    } // end of main

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1 메서드에서 예외가 처리되었습니다.");
            throw e;
        } // end of try-catch

    } // end of method1

} // end of class ExceptionEx17
