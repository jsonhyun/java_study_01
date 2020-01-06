package kr.or.yi.java_study_01.ch05.prc.exam12;

public abstract class Shape {
	public Shape next;

	public Shape() {
		next = null;
	}
	
	public void setNext(Shape obj) {
		next = obj;
	}
	
	public Shape getNext() {
		return next;
	}
	
	public abstract void draw();
}
