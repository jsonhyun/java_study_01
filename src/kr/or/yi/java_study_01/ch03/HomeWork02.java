package kr.or.yi.java_study_01.ch03;

import java.util.Random;
import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		문제1(sc);
		문제2();
		sc.close();
	}

	private static void 문제2() {
//		Lotto generator(1~45)
//		중복되지 않는 랜덤한 수 6자리와 보너스 번호 1자리  출력 후 정렬
//		1등 6자리 모두 일치, 2등 5자리와 보너스 번호 일치, 3등 5자리 일치, 4등 4자리 일치, 5등 3자리 일치
		int [] lotto = new int[6];
		int [] bonus = new int[1];
		Random rnd = new Random();	
		rand_num(lotto, rnd);
		System.out.println("이번 주 로또 번호는 다음과 같습니다.!! 축하합니다!!");
		System.out.println("===============================================");
		lotto_sort(lotto);//정렬
		prnarry(lotto);
		bonus[0] = rnd.nextInt(46)+1;
		System.out.printf("보너스 번호는 %d %n", bonus[0]);
		System.out.println("===============================================");
		
		int[] first = new int[6];
		lottoArgo(lotto, bonus, rnd, first);
		int[] second = new int[6];
		lottoArgo(lotto, bonus, rnd, second);
		int[] third = new int[6];
		lottoArgo(lotto, bonus, rnd, third);
		int[] forth = new int[6];
		lottoArgo(lotto, bonus, rnd, forth);
		int[] fifth = new int[6];
		lottoArgo(lotto, bonus, rnd, fifth);
		
	}

	private static void lottoArgo(int[] lotto, int[] bonus, Random rnd, int[] first) {
		rand_num(first, rnd);
		lotto_sort(first);
		prnarry(first);
		int miss = getMissCount(lotto, first);
		result(lotto, bonus, first, miss);
	}

	private static void result(int[] lotto, int[] bonus, int[] first, int miss) {
		if(miss == 0) {
			System.out.printf("1등 6개 %n");
		}
		else if(miss == 1) {
			int bonus01 = 0;
			for(int i = 0; i<lotto.length; i++) {
				for(int j=0; j<lotto.length; j++) {
					if(lotto[i] == first[j]) {
						continue;
					}
					else {
						bonus01=first[j];
					}
				}
			}
			if(bonus[0] == bonus01) {
				System.out.printf("2등 5개 보너스 번호 1개 %n");
			}
			else {
				System.out.printf("3등 5개 %n");
			}
		}
		else if(miss == 2) {
			System.out.printf("4등 4개 %n");
		}
		else if(miss == 3) {
			System.out.printf("5등 3개 %n");
		}
		else if(miss > 3) {
			System.out.printf("꽝! 다음기회에 %n");
		}
	}

	private static int getMissCount(int[] lotto, int[] first) {
		int cnt=0;
		int miss = 0;
		for(int i = 0; i<lotto.length; i++) {
			cnt = 0;
			for(int j=0; j<lotto.length; j++) {
				if(lotto[i] != first[j]) {
					cnt++;
				}
				else {
					continue;
				}
			}
			if(cnt == 6) {
				miss++;
			}
		}
		return miss;
	}

	private static void rand_num(int[] lotto, Random rnd) {
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = rnd.nextInt(45)+1;
			for(int j=0; j<lotto.length; j++) {
				if(i != j && lotto[i] == lotto[j]) {
					lotto[i] = rnd.nextInt(45)+1;
					break;
				}
			}
		}
	}

	private static void prnarry(int[] lotto) {
		for(int i = 0; i<lotto.length;i++) {
			System.out.printf("%2d ",lotto[i]);
		}
	}

	private static void lotto_sort(int[] lotto) {
		for(int p = 0; p<lotto.length; p++) {
			int temp;
			for(int i = 1; i<lotto.length; i++) {
				if(lotto[i-1] > lotto[i]) {
					temp = lotto[i-1];
					lotto[i-1] = lotto[i];
					lotto[i] = temp;
				}
				else {
					continue;
				}
			}
		}
	}


	private static void 문제1(Scanner sc) {
//		10진수를 2진수로 변환하시오.
		System.out.print("10진수를 입력하시오 (2진수로 변환)>> ");
		int sip = sc.nextInt();
		int i;
		int j;
		int res1 = sip / 2;
		for(i = 2; ; i++) {
			if(res1 > 1) {
				res1 /= 2;
			}
			else {
				break;
			}
		}
		System.out.println(i + " ");
		int [] na = new int[i];
		int namer;
		int res2 = sip;
		int res3;
		for(j=0;j<i;j++) {
			if(res2 > 1) {
				res3 = res2 / 2;
				namer = res2 - (res3*2);
				na[j] = namer;
				res2 = res3;
			}
			else if(res2 == 1) {
				na[j] = 1;
			}
			System.out.print(na[j]+" ");	
		}
		System.out.println();
		for(int k=i-1; k>=0;k--) {
			System.out.print(na[k] + " ");
		}
	}
}
