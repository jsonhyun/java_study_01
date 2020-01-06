package kr.or.yi.java_study_01.ch05;

public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point();
		p.setXY(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.setXY(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}

}
