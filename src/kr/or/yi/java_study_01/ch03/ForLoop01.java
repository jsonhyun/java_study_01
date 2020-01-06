package kr.or.yi.java_study_01.ch03;

public class ForLoop01 {

	public static void main(String[] args) {
//		hardcoding();
//		for_loop01();
//		2*i=2
//		2*2=4
//		...
//		2*9=18
//		int dan = 2;
//		gugudan_02();
		gugudan_03();
//		1부터 10까지 짝수만 출력하시오.
//		짝수();
//		1부터 10까지 홀수만 출력하시오.		
//		홀수();
		
	}

	private static void 홀수() {
		for(int i=1; i<10; i=i+2) {
			System.out.printf("%d ", i);
		}
		for(int i=1; i<10; i++) {
			if(i%2==1) {
				System.out.printf("%d ", i);
			}
		}
	}

	private static void 짝수() {
		for(int i=1; i<11; i++) {
			if(i%2==0) {
				System.out.printf("%d ",i);
			}
		}
		for(int i=2; i<11; i=i+2) {
			System.out.printf("%d ",i);
		}
	}

	private static void gugudan_03() {
		for(int i=1; i<10; i++) {
			for(int dan=2; dan<10; dan++) {
				System.out.printf("%d * %d = %2d  ", dan, i, dan*i);
			}
			System.out.println();
		}
	}

	private static void gugudan_02() {
		for(int dan=2; dan<10; dan++) {
			System.out.println("====" + dan + "====");
			gugudan(dan);
		}
	}

	private static void gugudan(int dan) {
		for(int i=1; i<10;i++) {
			System.out.printf("%d * %d = %d %n", dan, i, dan*i);
		}
	}

	private static void for_loop01() {
		for(int i=0; i<10; i++) {
			System.out.println("Hello Java" + i);
		}
		System.out.println("done");
	}

	private static void hardcoding() {
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
	}

}
