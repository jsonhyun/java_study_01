package kr.or.yi.java_study_01.ch05.prc.exam01;

public class TvEx {

	public static void main(String[] args) {
		ColorTv myTv = new ColorTv(32, 1024);
		myTv.printProperty();
		
		Iptv iptv = new Iptv("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

}
