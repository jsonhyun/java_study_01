package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		팩토리얼_숫자입력_내림차순계산(sc);
//		팩토리얼_숫자입력_오름차순계산(sc);
//		fac01(10);
//		fac02(10);
		
//		1.피보나치 수열 (0+1+1+2+3+5+8+13+21+34+55)
		pibo(5);
//		pibo(10);
		
		sc.close();
	}

	private static void pibo(int cnt) {
		int pibo1 = 0;
		int pibo2 = 1;
		int pibo3 = 0;
		System.out.printf("피보나치 수열 (%d)는  0 + ",cnt);
		for(int pibo=1;pibo<cnt+1;pibo++) {
			pibo3 = pibo1 + pibo2;
			pibo1 = pibo2;
			pibo2 = pibo3;
			System.out.printf("%d %s ",pibo1, pibo==cnt?" ":"+");
		}
	}

	private static void fac02(int fac) {
//		5! = 5 * 4 * 3 * 2 * 1 = 120
		int res = 1;
		System.out.printf("%d! = ", fac);
		for(int i=fac;i>0;i--) {
			res = res * i;
			System.out.printf(" %d %s",i,i==1?"=":"*");
		}
		System.out.printf(" %d",res);
	}

	private static void fac01(int fac) {
//		5! = 1 * 2 * 3 * 4 * 5 = 120
		int res = 1;
		System.out.printf("%d! = ", fac);
		for(int i=1; i < fac+1 ;i++) {
			res = res * i;
			System.out.printf(" %d %s", i, i==fac?"=":"*");
		}
		System.out.printf(" %d", res);
	}

	private static void 팩토리얼_숫자입력_오름차순계산(Scanner sc) {
		System.out.print("숫자를 입력하세요. >> ");	
		long cnt = sc.nextInt();
		long res = 1;
		System.out.printf("%d! = ", cnt);
		for(long i=1; i<cnt+1 ;i++) {
			res = res * i;
			System.out.printf(" %d %s", i, i==cnt?"=":"*");
		}
		System.out.printf(" %d", res);
	}

	private static void 팩토리얼_숫자입력_내림차순계산(Scanner sc) {
		System.out.print("숫자를 입력하세요. >> ");	
		long cnt = sc.nextInt();
		long res = 1;
		System.out.printf("%d! = ", cnt);
		for(long i=cnt; i>0 ;i--) {
			res = res * i;
			System.out.printf(" %d %s", i, i==1?"=":"*");
		}
		System.out.printf(" %d", res);
	}

}
