package kr.or.yi.java_study_01.ch04.exam2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
//		testTv();
		int[] data = {3,2,9,4,7};
		System.out.println(Arrays.toString(data));
		System.out.printf("최대값: %d%n",Max.max(data));
		System.out.printf("최대값: %d%n",Max.max(null));
		System.out.printf("최대값: %d%n",Max.max(new int[] {}));
	}

	private static void testTv() {
		MyTv t = new MyTv();
		t.setChannel(100);
		t.setVolume(0);
		System.out.printf("CH: %d, VOL: %d%n",t.getChannel(),t.getVolume());
		
		t.channelDown();
		t.volumeDown();
		System.out.printf("CH: %d, VOL: %d%n",t.getChannel(),t.getVolume());
		
		t.setVolume(100);
		t.channelUp();
		t.volumeUp();
		System.out.printf("CH: %d, VOL: %d%n",t.getChannel(),t.getVolume());
	}

}
