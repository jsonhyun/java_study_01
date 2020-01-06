package kr.or.yi.java_study_01.ch03;

public class Gugudan {

	public static void main(String[] args) {
//		Gugudan(3);
//		Gugudan_full();
//		Gugudan_full_land();
//		factorial(5);
//		fibonacii(10);
		
		
		
		
		
		
		
		
		
		
	}

	private static void fibonacii(int fibonacii) {
		int fibo1 = 0;
		int fibo2 = 1;
		int fibo3 = 0;
		int i = 1;
		System.out.printf("피보나치 수열 (%d)은", fibonacii);
		while(i < fibonacii + 1) {
			fibo3 = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibo3;
			System.out.printf(" %d %s", fibo2, i==fibonacii?" ":"+");
			i++;
		}
	}

	private static void factorial(int fac) {
		int i = 1;
		int res = 1;
		System.out.printf("%d! = ", fac);
		while( i < fac + 1) {
			res = res * i;
			System.out.printf("%d %s ", i, i==fac?"=":"*");
			i++;
		}
		System.out.printf(" %d",res);
	}

	private static void Gugudan_full_land() {
		int i = 1;
		while(i < 10) {
			int dan = 2;
			while( dan < 10) {
				System.out.printf(" %d * %d=%2d ", dan, i, dan*i);
				dan++;
			}
			System.out.println();
			i++;
		}
	}

	private static void Gugudan_full() {
		int i = 1;
		while(i < 10) {
			int dan = 2;
			while( dan < 10) {
				System.out.printf(" %d*%d=%d %n", dan, i, dan*i);
				dan++;
			}
			i++;
		}
	}

	private static void Gugudan(int dan) {
		int i = 1;
		while(i < 10) {
			System.out.printf("%d*%d=%d ", dan, i, dan*i);
			i++;
		}
	}	

}
