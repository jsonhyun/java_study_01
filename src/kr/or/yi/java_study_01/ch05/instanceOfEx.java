package kr.or.yi.java_study_01.ch05;

class A{
	void prnA() {
		System.out.println("a");
	}
}
class B extends A{
	void prnB() {
		System.out.println("b");
	}
}
class C extends B{
	void prnC() {
		System.out.println("c");
	}
}

public class instanceOfEx {

	public static void main(String[] args) {
//		instanceOfEx01();
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		prnObj(a);
		prnObj(b);
		prnObj(c);

	}

	

	private static void prnObj(A a) {
		if(a instanceof C) {
			C cc = (C) a;
			cc.prnC();
		}else if(a instanceof B) {
			B bb = (B) a;
			bb.prnB();
		}else if(a instanceof A) {
			a.prnA();
		}
		
	}



	private static void instanceOfEx01() {
		A a = new C();
//		A a = new B();
//		A a = new A();
		
		if(a instanceof C) {
			System.out.println("a는 C의 객체를 가지고 있음");
		}
		else if(a instanceof B) {
			System.out.println("a는 B의 객체를 가지고 있음");
		}
		else if(a instanceof A) {
			System.out.println("a는 A의 객체를 가지고 있음");
		}
	}

}
