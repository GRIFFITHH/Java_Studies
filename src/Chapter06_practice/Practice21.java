package Chapter06_practice;

class MyTv {
	boolean isPowerOn; //�⺻�� false!
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	void turnOnOff() {
		isPowerOn = !isPowerOn; //!isPowerOn �� true�̹Ƿ� isPowerOn�� true�� �־��ش�
		if(isPowerOn) 
			System.out.println("tv����");
			else
				System.out.println("tv����");
		
	}

	void volumeUp() {
		if(volume<MAX_VOLUME)
		volume++;
		else
			System.out.println("�ִ뺼���Դϴ�.");
	}

	void volumeDown() {
		if(volume>MIN_VOLUME)
		volume--;
		else
			System.out.println("�ּҺ����Դϴ�.");
	}

	void channelUp() {
		
		if(channel==MAX_CHANNEL)
			channel=MIN_CHANNEL;
		channel++;
	}

	void channelDown() {
		
		if(channel==MIN_CHANNEL)
			channel=MAX_CHANNEL;
		channel--;
	}
} // class MyTv

public class Practice21 {
	public static void main(String args[]) {
		MyTv t = new MyTv();
		
		t.turnOnOff();
		t.turnOnOff();
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
	}
}
