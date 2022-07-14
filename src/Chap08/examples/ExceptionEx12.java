package Chap08.examples;

public class ExceptionEx12 {

    public static void main(String[] args) throws Exception {
        method1();
    } // end of main

    static void method1() throws Exception {
        method2();
    } // end of method1

    static void method2() throws Exception {
        throw new Exception();
    } // end of method2

} // end of class ExceptionEx12
