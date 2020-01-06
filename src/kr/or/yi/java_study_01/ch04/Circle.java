package kr.or.yi.java_study_01.ch04;

public class Circle extends Object{ // extends Object가 보통 생략되어 있음
	public int radius;
	public String name;
	
	public Circle() {
		super(); //기본적으로 생략되어 있음, 부모 생성자 호출
	}
	
	public Circle(String name) {
		this.name = name;
	}

	public Circle(int radius, String name) {
		super();
		this.radius = radius;
		this.name = name;
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public String toString() {
		return String.format("[%s, %s, %.2f]", radius, name, getArea());
	}
	
	
}
	
