package kr.or.yi.java_study_01.ch04.exam;

public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() {
		int i = this.width * this.height; 
		return i;
	}
	
	public void show() {
		System.out.printf("(%s, %s)에서 크기가 %sx%s인 사각형 %n",this.x,this.y,this.x,this.y);
	}
	
	public boolean contains(Rectangle r) {
		int a = this.x + this.width;
		int b = this.y + this.height;
		int c = r.x + r.width;
		int d = r.y + r.height;
		if((a>c && b > d)&&(this.x < r.x && this.y<r.y)) {
			return true;
		}
		return false;
	}
}
