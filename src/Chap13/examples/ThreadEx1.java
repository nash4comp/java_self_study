package Chap13.examples;

public class ThreadEx1 {

    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    } // end of main
} // end of class

class ThreadEx1_1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
        } // end of for i
    } // end of run
} // end of class ThreadEx1_1

class ThreadEx1_2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        } // end of for i
    } // end of run
} // end of ThreadEx1_2
