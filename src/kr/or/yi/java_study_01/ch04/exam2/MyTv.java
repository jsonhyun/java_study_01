package kr.or.yi.java_study_01.ch04.exam2;

public class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOff() {
		//(1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
		if(this.isPowerOn == true) {
			this.isPowerOn = false;
		}
		else {
			this.isPowerOn = true;
		}
	}
	void volumeUp() {
		//(2)volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
		if(this.volume < this.MAX_VOLUME) {
			this.volume += 1; 
		}
	}
	void volumeDown() {
		//(3)volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소 시킨다.
		if(this.volume > this.MIN_VOLUME) {
			this.volume -= 1;
		}
	}
	void channelUp() {
		//(4)channel의 값을 1증가시킨다.
		//만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
		if(this.channel == this.MAX_CHANNEL) {
			this.channel = this.MIN_CHANNEL;
		}
		this.channel += 1;
	}
	void channelDown() {
		//(5)channel의 값을 1감소시킨다.
		//만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
		if(this.channel == this.MIN_CHANNEL) {
			this.channel = this.MAX_CHANNEL;
		}
		this.channel -= 1;
	}
	//getter & setter method
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
