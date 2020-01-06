package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호를 입력하세요 1.for문 2.while 3.종료 >>");
		int res = sc.nextInt();
		while(res<3) {
			if (res==1) {
				System.out.println("for");
				ex_for(sc);
			}else {
				System.out.println("while");
				ex_while(sc);
			}
			System.out.print("번호를 입력하세요 1.for문 2.while 3.종료 >>");
			res = sc.nextInt();
		}           
		System.out.println("프로그램 종료.");
		
		sc.close();
	}

	private static void ex_while(Scanner sc) {
		int res=1;
		while(res!=4) {
			System.out.print("번호를 입력하세요 1. gugudan 2. factorial 3.fibonacci 4.종료 >>");
			res = sc.nextInt();
			switch(res) {
			case 1: 
				gugudan_while(); 
				break;
			case 2: 
				System.out.print("검색하고자 하는 factorial의 수를 입력하세요 >> ");
				factorial_while(sc);
				break;
			case 3 :
				System.out.print("검색하고자 하는 fibonacii수열의 수를 입력하세요 >> ");
				fibonacii_while(sc);
				break;
			default :System.out.println("while 문 종료");
			}
		}
		//while문과 switch문을 이용하여 1. gugudan 2. factorial 3.fibonacci 4.종료 구현
	}

	private static void fibonacii_while(Scanner sc) {
		int fibo = sc.nextInt();
		System.out.printf("fibonacii 수열(%d)은 ",fibo);
		int fibo1 = 0;
		int fibo2 = 1;
		int fibo3 = 0;
		int i = 1;
		while(i < fibo + 1) {
			fibo3 = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibo3;
			System.out.printf("%d %s ",fibo2, i==fibo?"입니다.":"+");
			i++;
		}
		System.out.printf("%n");
	}

	private static void factorial_while(Scanner sc) {
		int fac = sc.nextInt();
		System.out.printf("%d! = ", fac);
		int i = 1;
		int res = 1;
		while(i<fac+1) {
			res = res * i;
			System.out.printf("%d %s ",i,i==fac?"=":"*");
			i++;
		}
		System.out.printf("%d %n", res);
	}

	private static void gugudan_while() {
		int i = 1;
		while(i < 10) {
			int dan = 2;
			while(dan < 10) {
				System.out.printf("  %d * %d = %2d", dan, i, dan*i);
				dan++;
			}
			i++;
			System.out.println();
		}
	}

	private static void ex_for(Scanner sc) {
		int res=1;
		for(int i=0;res!=4;i++) {
			System.out.print("번호를 입력하세요 1. gugudan 2. factorial 3.fibonacci 4.종료 >>");
			res = sc.nextInt();
			switch(res) {
			case 1: 
				gugudan_for(); 
				break;
			case 2: 
				System.out.print("검색하고자 하는 factorial의 수를 입력하세요 >> ");
				factorial_for(sc);
				break;
			case 3 :
				System.out.print("검색하고자 하는 fibonacii수열의 수를 입력하세요 >> ");
				fibonacii_for(sc);
				break;
			default :System.out.println("for 문 종료");
			}
		}
		//for문과 switch문을 이용하여 1. gugudan 2. factorial 3.fibonacci 4.종료 구현
	}

	private static void fibonacii_for(Scanner sc) {
		int fibo = sc.nextInt();
		System.out.printf("fibonacii 수열(%d)은 ",fibo);
		int fibo1 = 0;
		int fibo2 = 1;
		int fibo3 = 0;
		for(int i = 1;i < fibo+1;i++) {
			fibo3 = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibo3;
			System.out.printf("%d %s ", fibo2, i==fibo?"입니다.":"+");
		}
		System.out.printf("%n");
	}

	private static void factorial_for(Scanner sc) {
		int fac = sc.nextInt();
		int res = 1;
		System.out.printf("%d! = ", fac);
		for(int i = 1;i<fac+1;i++) {
			res = res * i;
			System.out.printf("%d %s ", i, i==fac?"=":"*");
		}
		System.out.printf("%d %n", res);
				
	}

	private static void gugudan_for() {
		int dan;
		int i;
		for(i=1;i<10;i++) {
			for(dan=2;dan<10;dan++) {
				System.out.printf("%d * %d = %2d ", dan, i, dan * i);
			}
			System.out.println();
		}		
	}

}
