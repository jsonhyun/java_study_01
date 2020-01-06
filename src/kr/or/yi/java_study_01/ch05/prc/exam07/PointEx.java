package kr.or.yi.java_study_01.ch05.prc.exam07;

public class PointEx {

	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString()+"입니다.");
		
		p.moveUp();
		System.out.println(p.toString()+"입니다.");
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString()+"입니다.");
		
		p.move(100, 200, 300);
		System.out.println(p.toString()+"입니다.");

	}

}
