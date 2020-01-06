package kr.or.yi.java_study_01.ch05;

public class B1 extends A1 {// 부모에 디폴트 생성자가 없다면 오류 발생.
		private int b;
		
		public B1 (int b) {
			this.b = b;
		}
		
		public void prnB() {
			System.out.println("BBB");
		}
		public static void main(String[] args) {
//			A a = new A();
//			B b = (B) a;//DownCasting 실패(B객체가 존재하지 않음)
			
			//Down Casting 성공
			B1 bb = new B1(1);
			A1 ab = bb;
			B1 bbb = (B1) ab;
			
			//UpCasting
			A1 a = new B1(1);
		}
}
