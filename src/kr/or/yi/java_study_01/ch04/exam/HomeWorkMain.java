package kr.or.yi.java_study_01.ch04.exam;

import java.awt.Menu;
import java.util.Scanner;

public class HomeWorkMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		문제1();
//		문제2(sc);
//		문제3();
//		문제4();
//		문제5(sc);
//		문제6(sc);
//		문제7();
		문제8(sc);
		
		sc.close();
	}

	private static void 문제8(Scanner sc) {
//		이름(name), 전화번호(tel) 필드와 생성자 등을 가진 Phone 클래스를 작성하고, 실행 예시와
//		같이 작동하는 PhoneBook 클래스를 작성하라.
		PhoneBook number = new PhoneBook();
		number.run();
		
	}

	private static void 문제7() {
//		하루의 할일을 표현하는 클래스 Day는 다음과 같다. 한달의 할 일을 표현하는 MonthSchedule 클래스를 작성하라.
//		MonthSchedule 클래스에는 Day 객체 배열과 적절한 필드, 메소드를 작성하고, 실행 예시처럼
//		입력, 보기, 끝내기 등의 3개의 기능을 작성하라.
		MonthSchedule schedule = new MonthSchedule(30);
		schedule.run();		
	}

	private static void 문제6(Scanner sc) {
//		문제 5의 정답을 참고하여 Circle 클래스와 main 클래스를 수정하여 다음 실행 결과처럼 되게하라.
		Circle [] c = new Circle[3];
		Circle [] big = new Circle[1];
		for(int i = 0; i <c.length ; i++) {
			System.out.print("x, y, radius >> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x, y, radius);
			if(i > 0) {
				big[0] = c[i].getRadius()>c[i-1].getRadius()?c[i]:c[i-1];
				//1번 방법 : radius 값을 가져와서 대소의 크기 비교 후 삼항연산자를 이용해서 판단
				//big[0] = c[i].isBig(c[i-1])?c[i]:c[i-1];
				//2번 방법 : 클래스의 메서드를 이용해서 값을 비교 true와 false를 리턴 받아 삼항연산자로 판단
			}
			
		}
		for(int i = 0; i<c.length; i++) {
			c[i].show();
		}
		System.out.print("가장 면적이 큰 원은 ");
		big[0].show();
	}

	private static void 문제5(Scanner sc) {
//		3개의 Circle 객체 배열을 만들고 x,y,radius 값을 읽어 3개의 Circle 객체를 만들고
//		show()를 이용하여 이들을 모두 출력한다.
		Circle [] c = new Circle[3];
		for(int i = 0; i <c.length ; i++) {
			System.out.print("x, y, radius >> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		for(int i = 0; i<c.length; i++) {
			c[i].show();
		}		
	}

	private static void 문제4() {
//		4.Rectangle 클래스를 작성하라
//		int 타입의 x,y,width,height 필드 : 사각형을 구성하는 점과 크기 정보
//		x,t,width,height 값을 매개변수로 받아 필드를 초기화하는 생성자
//		int square() : 사각형 넓이 리턴
//		void show() : 사각형의 좌표와 넓이를 화면에 출력
//		boolean contains(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
//		main() 메소드의 코드와 실행결과는 책을 참고하라.
//		
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s의 면적은 "+ s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	}

	private static void 문제3() {
//		3. 노래 한 곡을 나타내는 Song 클래스를 작성하라.
//		필드는 노래 제목을 나타내는 title, 가수를 나타내는 artist,
//		노래가 발표된 연도를 나타내는 year, 국적을 나타내는 country
//		Song 클래스에는 생성자 2개(기본생성자와 매개변수로 모든 필드를 초기화하는 생성자),
//		노래정보를 출력하는 show()메소드, main()메소드에서 1978년, 스웨덴 국적의 ABBA가 부른 
//		"Dancing Queen"을 Song 객체로 생성하고 show()를 이용하여 노래의 정보를 다음과 같이 출력하라.
		Song information = new Song("Dancing Queen","ABBA",1978,"스웨덴");
		System.out.println(information);
		
	}

	private static void 문제2(Scanner sc) {
//		2. Grade 클래스를 작성해보자. 3 과목의 점수를 입력 받아 Grade 객체를 생성하고 성적 평균을 출력하라.
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.printf("평균은 %.1f점입니다.", me.average());
	}

	private static void 문제1() {
//		1. TV클래스를 작성하라.
		TV myTV = new TV("LG", 2017, 32);
		System.out.println(myTV);
	}

}
