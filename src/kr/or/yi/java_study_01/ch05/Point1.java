package kr.or.yi.java_study_01.ch05;

public class Point1 {
	private int x;
	private int y;
	public Point1() {
		this.x = 0;
		this.y = 0;
	}
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint1() {
		System.out.println("("+x+","+y+")");
	}
	
}
