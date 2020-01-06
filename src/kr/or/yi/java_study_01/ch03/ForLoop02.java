package kr.or.yi.java_study_01.ch03;

public class ForLoop02 {

	public static void main(String[] args) {
//1부터 100까지의 짝수합과 홀수합, 전체합을 구하는 반복문을 작성하시오.
//		exam01();
//		별찍기01();
//		별찍기02();
//		별찍기03();
		과제1();		
//		과제2();
	}

	private static void 과제2() {
		for(int j=0; j<5; j++) {
			for(int i=1; i<j+1;i++) {
				System.out.print(" ");
			}
			for(int i=0; i<5-j;i++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

	private static void 과제1() {
		for(int j=0; j<5; j++) {
			for(int i=0; i<4-j;i++) {
				System.out.print(" ");
			}
			for(int i=0;i<j+1;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void 별찍기03() {
		for(int j=0; j<5; j++) {
			for(int i=0; i<5-j;i++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	private static void 별찍기02() {
		for(int j=0; j<5; j++) {
			for(int i=0; i<j+1;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void 별찍기01() {
		for(int j=0; j<5; j++) {
			for(int i=0; i<5;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void exam01() {
		int evensum = 0;
		int oddsum = 0;
		for(int i=0; i<101; i++) {
			if(i%2==1) {
				oddsum = oddsum + i;
			}
			else if(i%2==0) {
				evensum = evensum + i;
			}
		}
		System.out.printf("홀수합 : %d, 짝수합 : %d, 전체의합 : %d ", oddsum, evensum, oddsum+evensum);
	}

}
