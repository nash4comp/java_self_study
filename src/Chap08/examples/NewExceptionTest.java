// 사용자 정의 예외 만들기 예제

package Chap08.examples;

public class NewExceptionTest {

    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println("에러 메시지: " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
        } catch (MemoryException me) {
            System.out.println("에러 메시지: " + me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("다시 설치를 시도하세요.");
        } finally {
            deleteTempFiles();
        } // end of try-catch
    } // end of main

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족합니다.");
        } // end of if
        if (!enoughMemory()) {
            throw new MemoryException("메모리가 부족합니다.");
        } // end of if
    } // end of method startInstall

    static void copyFiles() {
    }

    static void deleteTempFiles() {
    }

    static boolean enoughSpace() {
        return true; // 설치 공간이 부족하면 false를 return
    }

    static boolean enoughMemory() {
        return false;
    }

} // end of class ExceptionTest

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    } // end of constructor SpaceException
} // end of class SpaceException

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    } // end of constructor MemoryException

} // end of class MemoryException
