package kr.or.yi.java_study_01.ch04;

public class TestMain {

	public static void main(String[] args) {
//		prnTest();
		TestMain tm = new TestMain();
		tm.prnTest();
		
		
	}
	public static void prn() {
		System.out.println("ㅎㅎㅎ");
	}
	public void prnTest() {
		System.out.println("HaHa");
		
		TestMain.prn(); // 객체는 static에 접근할 수 있다.
	}
}
