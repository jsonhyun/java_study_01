package kr.or.yi.java_study_01.ch05.prc.exam01;

public class Iptv extends ColorTv {
	private String address;

	public Iptv(String address, int size, int color) {
		super(size, color);
		this.address = address;
	}
	
	public void printProperty() {
		System.out.printf("나의 IPTV는 %s주소의 %d인치 %d컬러 %n", this.address, getSize(), getColor());
	}
	
	
	
}
