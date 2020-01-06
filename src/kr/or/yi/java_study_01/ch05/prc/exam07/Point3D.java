package kr.or.yi.java_study_01.ch05.prc.exam07;

public class Point3D extends Point {
	//필드
	private int z;
	//생성자
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	//메소드
	public void moveUp() {
		this.z += 1;
	}
	
	public void moveDown() {
		this.z -= 1;
	}
	
	public void move(int x, int y) {
		super.move(x, y);
	}
	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	@Override
	public String toString() {
		return String.format("(%s,%s,%s)의 점", getX(), getY(), z);
	}
	
}
