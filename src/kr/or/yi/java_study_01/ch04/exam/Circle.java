package kr.or.yi.java_study_01.ch04.exam;

public class Circle {
	private double x;
	private double y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public boolean isBig(Circle c) {//getRadius 값을 가지고 서로 비교해서 true와 false 값을 리턴
		if(this.radius > c.radius) {//if를 사용한다고 굳이 else도 사용한다는 고정관념을 버리자.
			return true;
		}
		return false;
	}

	public void show() {
		System.out.printf("(%.1f, %.1f)%d %n", this.x, this.y, this.radius);
	}
	
}
