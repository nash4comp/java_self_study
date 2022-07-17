// 익명 클래스로 변경

package Chap07.Exercise;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//public class Exercise7_28 {
//
//    public static void main(String[] args) {
//        Frame f = new Frame();
//        f.addWindowListener(new EventHandler());
//    } // end of main
//} // end of class
//
//class EventHandler extends WindowAdapter {
//    public void windowClosing(WindowEvent e) {
//        e.getWindow().setVisible(false);
//        e.getWindow().dispose();
//        System.exit(0);
//
//    } // end of windowClosing
//
//} // end of class

public class Exercise7_28 {

    public static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            } // end of windowClosing
        });
    } // end of main
} // end of class

// 1. class의 이름을 지운다.
// 2. "new 이름" 대신에 new 조상(또는 인터페이스)의 이름을 사용한다.
// 3. brace 안에 실제 내용을 넣는다.
