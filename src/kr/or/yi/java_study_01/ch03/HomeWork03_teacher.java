package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class HomeWork03_teacher {

	public static void main(String[] args) {
		// 1. 사용자가 입력한 정수의 합을 구하여 출력하는 프로그램을 다음의 3가지 방법으로 작성하여 보자.

		Scanner sc = new Scanner(System.in);
		
//		exam1_a(sc);
//		exam1_b(sc);
//		exam1_c(sc);
		
//		exam2(sc);
//		exam3(sc);
		exam4A();
		exam4B();
		exam4C();
		sc.close();
	}
 
	private static void exam4A() {
		for(int col=0; col<7; col++) {
			for(int row=0; row<7; row++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


	private static void exam4B() {
		for(int col=0; col<7; col++) {
			for(int row=0; row<col+1; row++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}

	private static void exam4C() {
		for(int col=0; col<7; col++) {
			for(int row=col; row<7; row++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}

	
	
	private static void exam3(Scanner sc) {
		/*
		 * 3. 프로그램에서 미리 결정된 정답을 사용자가 알아맞히는 게임을 설계하고 작성하여 보라. 
		 * 	사용자가 하나의 수를 추측하면 프로그램은 그 수가 정답보다 높은지 낮은지 만 알려준다. 
		 * 	정답은 1부터 100사이의 수라고 가정한다. 
		 * 	사용자가 정답을 맞힐 때까지 프로그램은 반복하여 숫자를 입력하라는 메시지를 보낸다. 
		 * 	사용자가 음수를 입력하면 반복이 중단되도록 하라.
		 */
		int correct = (int)(Math.random() * 100) + 1;  // 미리 결정된 정답
		int count = 0; //시도 횟수
		System.out.println("correct = " + correct);
		int res;
		do {
			System.out.print("1~100사이의 정수를 입력하시오 >> ");
			res = sc.nextInt();
			count++;
			if (res > correct) {
				System.out.println("낮음");
			}else if (res == correct) {
				System.out.println("정답");
				break;
			}else {
				System.out.println("높음");
			}
		}while(res > 0);
		System.out.printf("%d번 만에 맞췄음", count);
	}

	private static void exam2(Scanner sc) {
		/*
		2.	사용자가 입력한 특정한 정수의 자리를 반대로 바꾸어 출력하는 프로그램을 작성하라. 
		예를 들어서 사용자가 정수 1206을 입력하였다면 6021이 출력되어야 한다. 
		만약 음수를 입력하면 오류메시지를 출력하라. 
		Do…while문을 사용하여 보라. 
		(힌트 1의 자릿수는 n % 10으로 구할 수 있다. 10의 자릿수는 먼저 n을 10으로 나눈 후에 n % 10하면된다. 
		100의 자릿수는 n을 100으로 나눈 후에 n % 10하면 된다. 한번 반복할 대마다 하나의 자리수가 구해지도록 하라.
		*/
		
		System.out.print("정수 입력 >> ");
		int res = sc.nextInt(); //1206
		do {
			System.out.print(res%10);
			res = res / 10;
		}while(res > 0);
	}

	private static void exam1_c(Scanner sc) {
		// C. 처리된 정수의 개수를 지정하지 않고, 사용자가 0을 입력하면 반복을 중단하고 그 때까지의 합을 출력한다.
		// 입력된 정수가 0이 아니면 합계에 더해진다. 예를 들어서 100 200 300 0 과 같이 입력될 수 있다.
		System.out.print("입력값 ... 입력값 0 >> ");
		int iValue;
		int sum = 0;
		do {
			iValue = sc.nextInt();
			sum += iValue;
		}while(iValue != 0);
		System.out.printf("%d%n", sum);
	}

	private static void exam1_b(Scanner sc) {
		// B. 맨 처음에 입력되는 정수는 앞으로 입력될 정수의 개수를 지정한다. 
		// 즉 3 100 200 300순으로 입력된다면 여기서 3이 앞으로 처리하여 할 정수의 개수이다.
		System.out.print("입력값의 개수 입력값1 입력값2 ... >> ");
		int cnt = sc.nextInt();
		int sum = 0;
		int iValue;
		for(int i=0; i<cnt; i++) {
			iValue = sc.nextInt();
			sum = sum + iValue;
			System.out.printf("%d %s ", iValue, i==cnt-1?" = ": " + ");
		}
		System.out.printf("%d%n", sum);
	}

	private static void exam1_a(Scanner sc) {
		// 1-A.	첫 번째 방법은 더해야 할 정수의 개수가 미리 결정되어 있는 경우이다. 
		//      즉 1부터 100까지의 정수들의 합을 구하는 경우이다.
		System.out.print("시작값 종료값을 입력>>");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int sum = 0;
		
		for(int i=start; i<end+1; i++) {
			sum = sum + i;
		}
		System.out.printf("%d 에서 %d까지의 합은 %d%n", start, end, sum);
	}

}
