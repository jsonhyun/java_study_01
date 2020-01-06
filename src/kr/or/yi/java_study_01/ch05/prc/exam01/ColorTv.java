package kr.or.yi.java_study_01.ch05.prc.exam01;

public class ColorTv extends Tv {
	private int color;
	
	public ColorTv(int size, int color) {
		super(size);
		this.color = color;
	}
	
	public void printProperty() {
		System.out.printf("%d인치, %d컬러 %n", getSize(), this.color);
	}
	public int getColor() {
		return color;
	}
	
	
	
	
}
