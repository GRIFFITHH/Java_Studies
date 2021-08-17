package Practice.Exercise7;

class MyTv2{
    private boolean isPowerOn;
    private int channel; //디폴트값 = 0
    private int preChannel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public int getChannel() {

        return channel;
    }

    public void setChannel(int channel) {
        if(channel>100||channel<1) return;
        preChannel = this.channel; //0이 먼저 저장됨
        this.channel = channel; // int channel이 저장됨
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume>100||volume<0) return;
        this.volume = volume;
    }

    void gotoPrevChannel(){
        setChannel(preChannel);
    }
}

public class Exercise7_10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();
        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());

    }
}

