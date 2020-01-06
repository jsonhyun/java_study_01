package kr.or.yi.java_study_01.ch05.prc.exam08;

public class PositivePoint extends Point {
	//필드
	//생성자
	public PositivePoint() {
		
	}
	public PositivePoint(int x, int y) {
		move(x, y);
	}
	//메소드

	@Override
	protected void move(int x, int y) {
		if(x < 0 || y < 0) {
		x = getX();
		y = getY();
		super.move(x, y);
		}
		else if(x < 0 && y < 0) {
			super.move(0, 0);
		} 
		else {
			super.move(x, y);
		}
	}
	
	@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ")의 점";
	}
}
