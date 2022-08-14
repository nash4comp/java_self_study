// Demon thread 사용 예시, Garbage collector, Auto save, Auto refresh 등

package Chap13.examples;

public class ThreadEx10 implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadEx10());
        // Daemon thread는 일반 thread를 실행(start())하기 전에 실행한다.
        t.setDaemon(true);
        t.start();

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            } // end of try-catch
            System.out.println(i);
            if (i == 5)
                autoSave = true;
        } // end of for i
        System.out.println("프로그램을 종료합니다.");
    } // end of main

    @Override
    public void run() {
        // demon thread가 실행된 상태에서
        // 3초마다 autoSave 값을 체크해서 true이면 autoSave 실행
        while (true) {
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
            } // end of try-catch
            if (autoSave) {
                autoSave();
            } // end of autoSave
        } // end of while
    } // end of run

    public void autoSave() {
        System.out.println("작업파일이 자동저장되었습니다.");
    } // end of autoSave

} // end of class
