package Chap07.Exercise;

class Robot {
}

class DanceRobot extends Robot {
    void dance() {
        System.out.println("춤을 춥니다.");
    } // end of method dance
} // end of class DanceRobot

class SingRobot extends Robot {
    void sing() {
        System.out.println("노래를 합니다.");
    } // end of method sing
} // end of class SingRobot

class DrawRobot extends Robot {
    void draw() {
        System.out.println("그림을 그립니다.");
    } // end of method draw
} // end of class DrawRobot

public class Exercise7_18 {

    static void action(Robot r) {
        if (r instanceof DanceRobot) {
            DanceRobot dr = (DanceRobot) r;
            dr.dance();
//            ((DanceRobot) r).dance();
        } else if (r instanceof SingRobot) {
            SingRobot sr = (SingRobot) r;
            sr.sing();
//            ((SingRobot) r).sing();
        } else if (r instanceof DrawRobot) {
            DrawRobot dr = (DrawRobot) r;
            dr.draw();
//            ((DrawRobot) r).draw();
        }

    } // end of method action

    public static void main(String[] args) {
        Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
        for (int i = 0; i < arr.length; i++) {
            action(arr[i]);
        } // end of for i

    }

}
