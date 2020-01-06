package kr.or.yi.java_study_01.ch03;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		문제1_A(sc);
//		문제1_B(sc);
//		문제1_C(sc);
//		문제2(sc);
		문제3(sc);
//		문제4(sc);
		
		sc.close();
	}

	private static void 문제4(Scanner sc) {
//		반복루프를 사용하여 다음과 같은 패턴을 출력하는 프로그램을 작성하라.
		System.out.print("찍고 싶은 별의 갯수를 입력하세요. >> ");
		int user = sc.nextInt();
		for(int i = 0; i < user; i++) {
			for(int j = 0; j<user; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i < user; i++) {
			for(int j = 0; j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i < user; i++) {
			for(int j = 0; j<user-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void 문제3(Scanner sc) {
//		프로그램에서 미리 결정된 정답을 사용자가 알아맞히는 게임을 설계하고 작성하라.
//		사용자가 하나의 수를 추측하면 프로그램은 그 수가 정답보다 높은지 낮은지만 알려준다.
//		정답은 1부터 100사이의 수라고 가정한다. 사용자가 정답을 맞힐 때까지 프로그램은 반복하여 숫자를 입력하라는 메시지를 보낸다.
//		사용자가 음수를 입력하면 반복이 중단되도록 하라.
		System.out.print("지옥의 마왕 : 지금부터 게임을 시작하지...<Enter>");
		sc.nextLine();
		System.out.print("지옥의 마왕 : 내가 생각하고 있는 숫자를 맞춘다면 목숨만은 살려주겠다.<Enter>");
		sc.nextLine();
		System.out.print("지옥의 마왕 : 힌트가 없다면 너무 정이 없을 테니 힌트를 알려주지.<Enter>");
		sc.nextLine();
		System.out.print("지옥의 마왕 : 첫번째 힌트~정답은 1부터 100까지 숫자중에 있다.<Enter>");
		sc.nextLine();
		System.out.print("지옥의 마왕 : 두번째 힌트~니가 부른 숫자에 대해서 높은지 낮은지에 대해서 알려주마.<Enter>");
		sc.nextLine();
		System.out.printf("지옥의 마왕 : 힌트를 두개나 줬으니 답할 수 있는 기회도 정해야겠지? 기회는 단 6번이다. 하지만 음수를 사용할 경우 바로 지옥행이다! 어디 도전해봐! <Enter> %n");
		Random rnd = new Random();
		int hell = rnd.nextInt(100)+1;
//		System.out.println(hell);
		System.out.print("안내인 : 정답을 입력해주세요. >> ");
		int user = sc.nextInt();
		System.out.printf("전설의 기사 : 정답은 %d이다!! <Enter> %n", user);
		sc.nextLine();
		for(int i = 1; i<7; i++) {
			if(i == 6 || user < 0) {
				if(hell != user) {
					System.out.printf("지옥의 마왕 : 크하하하!! 기회를 모두 잃었구나! 정답은 %d이었다. 지옥에서 나의 노예로 평생 살아보거라~크하하하하!! %n", hell);
					System.out.println("YOU DIED!");
					break;
				}
				else if(hell == user) {
					System.out.println("지옥의 마왕 : 과연 전설의 기사 답게 대단하구나. 이번에는 물러가지만 다음에는 용서 없다.");
					System.out.println("지옥의 마왕을 이기셨습니다!! 축하합니다!!");
					break;
				}
			}
			if(hell > user) {
				System.out.printf("지옥의 마왕 : 이거 어쩌지? 니가 부른 숫자보다 높은걸? 기회는 이제 %d번 남았다. %n", 6-i);
				System.out.print("안내인 : 정답을 다시 입력해주세요. >> ");
				user = sc.nextInt();
				System.out.printf("전설의 기사 : 정답은 %d이다!! <Enter> %n", user);
				continue;
			}
			else if(hell < user) {
				System.out.printf("지옥의 마왕 : 귀여운 꼬마녀석~숫자를 조금만 더 낮게 불러보는게 어때? 기회는 이제 %d번 남았다. %n", 6-i);
				System.out.print("안내인 : 정답을 다시 입력해주세요. >> ");
				user = sc.nextInt();
				System.out.printf("전설의 기사 : 정답은 %d이다!! <Enter> %n", user);
				continue;
			}
			else {
				System.out.println("지옥의 마왕 : 과연 전설의 기사 답게 대단하구나. 이번에는 물러가지만 다음에는 용서 없다.");
				System.out.println("지옥의 마왕을 이기셨습니다!! 축하합니다!!");
				break;
			}
		}
	}

	private static void 문제2(Scanner sc) {
//		사용자가 입력한 특정한 정수의 자리를 반대로 바꾸어 출력하는 프로그램을 작성하라.
//		예를 들어 사용자가 정수 1206을 입력하였다면 6021이 출력되어야 한다.
//		음수를 입력하면 오류 메시지를 출력하라. do_while문을 사용하라.
		System.out.print("정수(양수)를 입력하시오 >> ");
		int num = 0;
		while(true) {
			num = sc.nextInt();
			if(num < 0) {
				System.out.print("음수가 아닌 양수를 다시 입력해주세요. >> ");
				continue;
			}
			else {
				break;
			}
		}
		int cnt = 0;
		int sum = num;
		while(true) {
			sum /= 10;
			if(sum == 0) {
				break;
			}
			if(sum == 1) {
				cnt++;
				break;
			}
			else {
				cnt++;
				continue;
			}
		}
//		System.out.println(cnt+1);
		int [] arr = new int[cnt+1];
		int i = 0;
		int j = 1;
		do {
			arr[i] = (num/j) % 10;
			i++;
			j*=10;
		}while(i<arr.length);
		System.out.print("입력한 정수의 자리를 반대로 출력한 결과값은 ");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.print("입니다.");
	}

	private static void 문제1_C(Scanner sc) {
//		처리된 정수의 개수를 지정하지 않고, 사용자가 0을 입력하면 반복을 중단하고, 그때까지의 합을 출력한다.
//		입력된 정수가 0이 아니면 합계에 더해진다.
		System.out.print("더할 정수를 입력하세요. 0을 입력하면 입력은 중지되고 결과가 나옵니다. >> ");
		int sum = 0;
		while(true) {
			int num = sc.nextInt();
			sum += num;
			if(num == 0) {
				System.out.printf("정수의 총 합은 %d입니다.",sum);
				break;
			}
		}
	}

	private static void 문제1_B(Scanner sc) {
//		맨 처음에 입력되는 정수는 앞으로 입력될 정수의 개수를 지정한다.
//		3 100 200 300 순으로 입력된다면 여기서 3이 앞으로 처리하여할 정수의 개수이다.
		while(true){
			System.out.print("더할 정수의 개수와 정수의 값을 입력하세요(ex:3(개수) 100 200 300) >> ");
			try {
				int wholeNumber = sc.nextInt();
				int [] arr = new int[wholeNumber];
				for(int i = 0; i < arr.length ; i++) {
					arr[i] = sc.nextInt();
				}
				int sum = 0;
				for(int j = 0; j < arr.length ; j++) {
					sum += arr[j];
				}
				System.out.printf("정수의 개수는 %d개이며, 총 합은 %d입니다.%n", wholeNumber, sum);
			}
			catch (InputMismatchException e) {
				System.out.printf("정수를 입력하세요. %n");
				sc.nextLine();
				continue;
			}
		}		
	}

	private static void 문제1_A(Scanner sc) {
//		더해야 할 정수의 개수가 미리 결정되어 있는 경우이다
//		1부터 100까지의 정수들의 합을 구하라.
		while(true) {
			System.out.print("1부터 더할 숫자를 입력하세요. >> ");
			try {
				int num = sc.nextInt();
				if(num > 0) {
					int sum= 0;
					for(int j = 0; j<num+1;j++) {
						sum += j;
					}
					System.out.printf("1부터 %d까지의 합은 %d입니다. %n", num, sum);
					continue;
				}
			}
			catch (InputMismatchException e) {
				System.out.println("정수를 입력하세요.");
				sc.nextLine();
				continue;
			}
		}
	}
}
