package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class Continue_Break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
//		continue01();
//		break01();
//		break02();
		
//		하나의 루프에 1~100까지 합, 짝수합, 홀수합, 3의배수 합을 구하라.
//		forsum();
//		whilesum();
//		dowhilesum();
		
		
		sc.close();
	}

	private static void dowhilesum() {
		int tsum = 0;
		int sum = 0;
		int oddsum = 0;
		int evensum = 0;
		int i = 0;
		do {
			sum = sum + i;
			if(i%3==0) {
				tsum = tsum + i;
			}
			if(i%2==0) {
				evensum = evensum + i;
			}
			else {
				oddsum = oddsum + i;
			}
			i++;
		}
		while(i<101);
		System.out.printf("1~100까지의 합은 %d, 짝수합은 %d, 홀수합은 %d, 3배수의 합은 %d이다.", sum, evensum, oddsum, tsum);
	}

	private static void whilesum() {
		int tsum = 0;
		int sum = 0;
		int oddsum = 0;
		int evensum = 0;
		int i = 0;
		while(i<101) {
			sum = sum + i;
			if(i%3==0) {
				tsum = tsum + i;
			}
			if(i%2==0) {
				evensum = evensum + i;
			}
			else {
				oddsum = oddsum + i;
			}
			i++;
		}
		System.out.printf("1~100까지의 합은 %d, 짝수합은 %d, 홀수합은 %d, 3배수의 합은 %d이다.", sum, evensum, oddsum, tsum);
	}

	private static void forsum() {
		int tsum = 0;
		int sum = 0;
		int oddsum = 0;
		int evensum = 0;
		for(int i = 0;i<101;i++) {
			sum = sum + i;
			if(i%3 == 0) {
				tsum = tsum + i;
			}
			if(i%2 == 0) {
				evensum = evensum + i;
			}
			else {
				oddsum = oddsum + i;
			}
			
		}
		System.out.printf("1~100까지의 합은 %d, 짝수합은 %d, 홀수합은 %d, 3배수의 합은 %d이다.", sum, evensum, oddsum, tsum);
	}

	private static void break02() {
		for(int i=1; i<10; i++) {
			if(i>5) {
				break;
			}
			else {
				for(int dan=2;dan<10;dan++) {
					if(dan>5) {
						break;
					}
					else {
						System.out.printf("%d * %d = %2d ", dan, i, dan*i);
					}
				}
			}
			System.out.println();
		}
	}

	private static void break01() {
		for(int i=1; i<10; i++) {
			if(i>5) {
				break;
			}
			else {
				for(int dan=2;dan<10;dan++) {
					System.out.printf("%d * %d = %2d ", dan, i, dan*i);
				}
			}
			System.out.println();
		}
	}

	private static void continue01() {
		for(int i=1; i<10; i++) {
			if(i==5) {
				System.out.printf("================================ (단 * 5)는 출력되지 않습니다. ================================%n");
				continue;
			}
			else {
				for(int dan=2;dan<10;dan++) {
					System.out.printf("%d * %d = %2d ", dan, i, dan*i);
				}
			}
			System.out.println();
		}
	}
}
