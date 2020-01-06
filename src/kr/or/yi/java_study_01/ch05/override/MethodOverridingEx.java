package kr.or.yi.java_study_01.ch05.override;

public class MethodOverridingEx {

	public static void main(String[] args) {
//		array_to();
		Shape start, last, obj;
		// 링크드 리스트로 도형 생성하여 연결
		start = new Line(); // Line 객체 연결
		last = start;
		obj = new Rect();	// Rect 객체 연결
		last.next = obj;
		last = obj;
		obj = new Line();	// Line 객체 연결
		last.next = obj;
		last = obj;
		obj = new Circle();	// Circle 객체 연결
		last.next = obj;
		// 모든 도형 출력
		Shape p = start;
		while(p!=null) {
			p.draw();
			p = p.next;
		}

	}

	private static void array_to() {
		Line line = new Line();
		
		Shape[] shapes = {line, new Shape(), new Line(),new Rect(), new Circle()};
		for(Shape s : shapes) {
			paint(s);
		}
	}

	static void paint(Shape p) {
		p.draw();
	}

}
