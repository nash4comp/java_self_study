package Chap07;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx7 {

    public static void main(String[] args) {
        Button b = new Button("Start");

        // 버튼 타입의 참조변수 b에 정의된 addActionListener 함수를 호출한다.
        // parameter로는 EventHandler 타입의 참조변수를 생성해서 그 주소값을 넣는다.
        b.addActionListener(new EventHandler());
    }
}

// EventHandler 클래스는 ActionListener를 구현한 것이다.
class EventHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent occurred!!!");
    }
}
