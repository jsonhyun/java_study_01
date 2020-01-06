package kr.or.yi.java_study_01.ch05.prc.exam12;

import java.util.Scanner;

public class GraphicEditor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("그래픽 에디터 Beauty을 실행합니다.");
		int res;
		ShapeMgn shapeMgn = new ShapeMgn();
		
		do {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
			res = sc.nextInt();
			
			switch(res) {
			case 1:
				doInsert(sc, shapeMgn);
				break;
			case 2:
				doDelete(sc, shapeMgn);
				break;
			case 3:
				prnShapes(shapeMgn.getStart());
				break;
			}		
		}while(res < 4);
		System.out.println("그래픽 에디터 Beauty을 종료합니다.");
		sc.close();

	}

	private static void doDelete(Scanner sc, ShapeMgn shapeMgn) {
		System.out.print("삭제할 도형의 위치 >> ");
		int delIdx = sc.nextInt();
		/*
		 * 1. 빈리스트인 경우 return;
		 * 
		 */
		if(shapeMgn.isEmpty()) {
			System.out.println("도형을 삭제할 수 없습니다.");
			return;
		}
			
		
		Shape prev;//삭제되는 도형의 앞 도형
		Shape cur;//삭제하는 도형
		cur = prev = shapeMgn.getStart();
		int count = 0;
		for(int i = 0; i<delIdx; i++) {
			prev = cur;
			cur = cur.getNext();
			count++;
//			System.out.println(i);
//			prev.draw();
//			cur.draw();
		}
		
		if(prev == cur) {//첫번째 노드를 삭제하는 경우
			shapeMgn.setStart(prev.getNext());	
			return;
		}
		
		//삭제할 노드가 마지막 노드라면
		if(cur.getNext() == null) {
			prev.setNext(null);
			shapeMgn.setEnd(prev);
			return;
		}
		
		//삭제할 인덱스가 범위를 초과한 경우
		if(delIdx > count) {
			System.out.println("도형을 삭제할 수 없습니다.");
			return;
		}
		
		prev.setNext(cur.getNext());
		
	}

	private static void prnShapes(Shape p) {
		while(p != null) {
			p.draw();
			p = p.getNext();
		}
	}

	private static void doInsert(Scanner sc, ShapeMgn mgn) {
		System.out.print("Line(1), Rect(2), Circle(3) >> ");
		int res = sc.nextInt();
		Shape temp = createShape(res);
		if(mgn.getStart() == null) {//리스트가 비었을 경우
			mgn.setStart(temp);
			mgn.setEnd(temp);
		}else {//마지막 리스트노드에 추가
			mgn.getEnd().setNext(temp);
			mgn.setEnd(temp);
		}
	}

	private static Shape createShape(int res) {
		if(res == 1) {
			return new Line();
		}
		if(res == 2) {
			return new Rect();
		}
		if(res == 3) {
			return new Circle();
		}
		return null;
	}

}





