package Chap07.Exercise;

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setChannel(int channel) {
        if (channel <= MAX_VOLUME && channel >= MIN_VOLUME) {
            prevChannel = this.channel;
            this.channel = channel;
        } // end of if channel
    } // end of method setChannel

    public void setVolume(int volume) {
        if (volume <= MAX_VOLUME && volume >= MIN_VOLUME) {
            this.volume = volume;
        } // end of if volume
    } // end of mehtod setVolume

    public int getChannel() {
        return this.channel;
    } // end of method getChannel

    public int getVolume() {
        return this.volume;
    } // end of method getVolume

    public void gotoPrevChannel() {
//        int temp;
//        temp = channel;
//        channel = prevChannel;
//        prevChannel = temp;
        setChannel(prevChannel);
    } // end of method gotoPrevChannel

} // end of class MyTv2

public class Exercise7_10 {

    public static void main(String[] args) {
        MyTv2 t = new MyTv2();
        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setChannel(20);
        System.out.println("CH: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());

    }

}
