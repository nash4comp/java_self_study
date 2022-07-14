package Chap07;

abstract class Player {
    boolean pause;
    int currentPosition;

    abstract void play(int position);

    abstract void resume();

    abstract void stop();

    Player() {
        pause = false;
        currentPosition = 0;
    }
}

class AudioPlayer extends Player {
    void play(int position) {
        // 내용 구현
    }

    void resume() {
        // 내용 구현
    }

    void stop() {
        // 내용 구현
    }
}

class DvdPlayer extends Player {
    void play(int position) {
        // 내용 구현
    }

    void resume() {
        // 내용 구현
    }

    void stop() {
        // 내용 구현
    }
}

public class BlogPostingExample01 {

    public static void main(String[] args) {

    } // end of main
} // end of class
