package kr.or.yi.java_study_01.ch05.prc.exam06;

public class ColorPoint extends Point {
	//필드
	private String color = "BLACK";
	//생성자
	public ColorPoint(){
		
	}
	public ColorPoint(int x, int y){
		super(x, y);
	}
	//메소드
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
