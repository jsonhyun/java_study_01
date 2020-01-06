package kr.or.yi.java_study_01.ch05.prc.exam05;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return String.format("%s색의 (%s, %s)의 점", color, getX(), getY());
	}
	
}
