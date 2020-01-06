package kr.or.yi.java_study_01.ch05;

public class ColorPoint1 extends Point1 {
	private String color;
	
	public ColorPoint1(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public void showColorPoint1() {
		System.out.print(color);
		showPoint1();
	}
}
