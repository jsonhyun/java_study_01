package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		exam3_while(sc);
		exam3_for(sc);
		
		
		
		
		sc.close();
	}

	private static void exam3_while(Scanner sc) {
//		1. while문을 이용하여 -1이 입력될때까지 정수를 입력받아 합을 구하고 평균을 출력하라.
		System.out.print("정수를 입력해주세요. 마지막에 -1을 입력하세요. >> ");
		int n = sc.nextInt();
		int sum = 0;
		int count = 0;
		
		while(n!=-1) {
			sum = sum + n;
			count++;
			n = sc.nextInt();
		}
		if(count == 0) {
			System.out.print("입력된 수가 없습니다.");
		}
		else {
			System.out.printf("총 %d개 정수의 합은 %d이며, 합의 평균은 %.2f입니다.", count, sum, (double)sum/count);
		}
	}

	private static void exam3_for(Scanner sc) {
		System.out.print("정수를 입력해주세요. 마지막에 -1을 입력하세요. >> ");
		int sum=0;
		int count;
		int n = sc.nextInt();
		for(count = 0;n!=-1;count++) {
			sum = sum + n;
			n = sc.nextInt();
		}
		if(count == 0) {
			System.out.print("입력된 수가 없습니다.");
		}
		else {
			System.out.printf("총 %d개 정수의 합은 %d이며, 합의 평균은 %.2f입니다.", count, sum, (double)sum/count);
		}
		
	}

}
