package Chap08.examples;

public class ExceptionEx7 {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) {
                System.out.println("true");
            } // end of if ae
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");

        } // end of try-catch
        System.out.println(6);

    }

}
