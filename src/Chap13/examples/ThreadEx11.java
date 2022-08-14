package Chap13.examples;

import java.util.Iterator;
import java.util.Map;

public class ThreadEx11 {

    public static void main(String[] args) {
        ThreadEx11_1 t1 = new ThreadEx11_1("Thread1");
        ThreadEx11_2 t2 = new ThreadEx11_2("Thread2");
        t1.start();
        t2.start();
    } // end of main
} // end of class

class ThreadEx11_1 extends Thread {
    ThreadEx11_1(String name) {
        super(name);
    } // end of constructor

    public void run() {
        try {
            sleep(5 * 1000);
        } catch (InterruptedException e) {
        } // end of try-catch
    } // end of method run()
} // end of class

class ThreadEx11_2 extends Thread {
    ThreadEx11_2(String name) {
        super(name);
    } // end of constructor

    public void run() {
        Map map = getAllStackTraces();
        Iterator it = map.keySet().iterator();

        int x = 0;
        while (it.hasNext()) {
            Object obj = it.next();
            Thread t = (Thread) obj;
            StackTraceElement[] ste = (StackTraceElement[]) (map.get(obj));
            System.out.println("[" + ++x + "] name: " + t.getName()
                    + ", group: " + t.getThreadGroup().getName() + ", daemon: "
                    + t.isDaemon());
            for (int i = 0; i < ste.length; i++) {
                System.out.println(ste[i]);
            } // end of for i
        } // end of while

    } // end of method run()
} // end of class
