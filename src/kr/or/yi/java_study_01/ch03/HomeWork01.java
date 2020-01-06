package kr.or.yi.java_study_01.ch03;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		문제1
//		while_test();
//		for_test();
//		do_while_test();
//		문제2();
//		문제3(sc);
//		문제4(sc);
//		문제5(sc);
//		문제6(sc);
//		문제7();
//		문제8(sc);
//		문제9();
//		문제10();
//		문제14(sc);
//		문제15(sc);
		문제16(sc);
		
		
		sc.close();
	}//end of main

	private static void 문제16(Scanner sc) {
//		컴퓨터와 독자 사이의 가위 바위 보 게임을 만들어보자.
//		독자가 가위 바위 보 중 하나를 입력하고 <Enter>키를 치면,
//		프로그램은 가위 바위 보 중에서 랜덤하게 하나를 선택하고 컴퓨터가 낸것으로 한다.
//		독자가 입력한 값과 랜덤하게 선택한 값을 비교 하여 누가 이겼는지 판단한다.
//		'그만'을 입력하면 프로그램을 종료한다.
		Random rnd = new Random();
		String str[] = {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		for(int i = 0; i<3 ; i++) {
			System.out.print("가위 바위 보!>> ");
			String person = sc.nextLine();
			if(person.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			if(person.equals("가위")) {
				int n = rnd.nextInt(3);
				if(str[n].equals("가위")) {
					System.out.printf("사용자  = 가위, 컴퓨터 = 가위, 비겼습니다. %n");
				}
				else if(str[n].equals("바위")) {
					System.out.printf("사용자  = 가위, 컴퓨터 = 바위, 사용자가 졌습니다. %n");
				}
				else if(str[n].equals("보")) {
					System.out.printf("사용자  = 가위, 컴퓨터 = 보, 사용자가 이겼습니다. %n");
				}
				i--;
			}
			else if(person.equals("바위")) {
				int n = rnd.nextInt(3);
				if(str[n].equals("가위")) {
					System.out.printf("사용자  = 바위, 컴퓨터 = 가위, 사용자가 이겼습니다. %n");
				}
				else if(str[n].equals("바위")) {
					System.out.printf("사용자  = 바위, 컴퓨터 = 바위, 비겼습니다. %n");
				}
				else if(str[n].equals("보")) {
					System.out.printf("사용자  = 바위, 컴퓨터 = 보, 사용자가 졌습니다. %n");
				}
				i--;
			}
			else if(person.equals("보")) {
				int n = rnd.nextInt(3);
				if(str[n].equals("가위")) {
					System.out.printf("사용자  = 보, 컴퓨터 = 가위, 사용자가 졌습니다. %n");
				}
				else if(str[n].equals("바위")) {
					System.out.printf("사용자  = 보, 컴퓨터 = 바위, 사용자가 이겼습니다. %n");
				}
				else if(str[n].equals("보")) {
					System.out.printf("사용자  = 보, 컴퓨터 = 보, 비겼습니다. %n");
				}
				i--;
			}
			else {
				System.out.println("제대로 게임에 임해주세요!!");
				i--;
			}
		}
		
	}

	private static void 문제15(Scanner sc) {
//		2개의 정수를 입력받아 곱을 구하는 프로그램을 작성하라.
//		실수가 입력되면 정수를 다시 입력하도록 하여 예외없이 정상적으로 처리되도록
//		예외 처리 코드를 삽입하여라.
		for(int i = 0; i<2; i++) {
			System.out.print("곱하고자 하는 두 수 입력 >>");
			try{
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.printf("%d x %d = %d", n, m, n*m);
				break;
			}
			catch(InputMismatchException e){
				System.out.printf("실수는 입력하면 안됩니다.%n");
				sc.nextLine();
				i--;
//				continue;
			}
		}
	}
		

	private static void 문제14(Scanner sc) {
//		과목과 점수가 짝을 이루도록 2개의 배열을 작성하라.
//		과목이름을 입력 받아 점수를 출력하는 프로그램을 작성하라.
//		해당 과목이 없으면 '없는 과목입니다.'라고 출력하라.
//		'그만'을 입력받으면 종료한다.
		String course [] = {"Java", "C++", "HTML5", "컴퓨터 구조", "안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		for(int i = 0; ;i++) {
			System.out.print("과목의 이름을 입력하세요 >> ");
			String name = sc.nextLine();
			if(name.equals("그만")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			else {
				for(int j = 0;j<course.length; j++) {
					if(course[j].equals(name)) {
						System.out.printf("%s의 점수는 %d점 입니다. %n", name, score[j]);
						break;
					}
					if(j == 4) {
						System.out.println("없는 과목입니다.");
					}
				}
			}
		}		
	}

	private static void 문제10() {
//		4*4의 2차원 배열을 만들고 이 곳에 1에서 10까지 범위의 정수를 10개만 랜덤하게 생성하라.
//		임의의 위치에 삽입하라. 동일한 정수가 있어도 상관없다. 나머지 숫자는 모두 0이다.
		int [][] intArr = new int [4][4];
		for(int[]arr : intArr) {
			System.out.println(Arrays.toString(arr));
		}
		Random rnd = new Random();
		int row;
		int col;
		int count = 0;
		
		for(int i =0; count < 10; i++) {
			row = rnd.nextInt(4);
			col = rnd.nextInt(4);
			if(intArr[row][col] != 0) {
				continue;
			}
			else {
				intArr[row][col] = rnd.nextInt(10)+1;
				count++;
			}
		}
		System.out.println("count = " + count);
		for(int[]arr : intArr) {
			System.out.println(Arrays.toString(arr));
		}
	}

	private static void 문제9() {
//		4*4의 2차원 배열을 만들고 이 곳에 1에서 10까지 범위의 정수를 랜덤하게 생성하여 정수 16개를 배열에 저장하라
//		2차원 배열을 화면에 출력하라
		int [][] arr = new int [4][4];
		for(int i=0;i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				int r = (int)(Math.random()*10+1);
				arr[i][j] = r;
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
	}

	private static void 문제8(Scanner sc) {
//		정수를 몇개 저장할지 키보드로 개수를 입력받아(100보다 작은 개수) 정수 배열을 생성하라
//		이곳에 1에서 100까지 범위의 정수를 랜덤하게 삽입하라.
//		배열에는 같은 수가 없도록 하고 배열을 출력하라.
		System.out.print("배열의 개수를 입력하세요 >> ");
		int jungsu = sc.nextInt();
		System.out.printf("정수는 몇개? %d개 %n", jungsu);
		int [] arr = new int[jungsu];
		int cnt = 0;		
		for(int i = 0; i<arr.length; i++) {
			int r = (int)(Math.random()*100+1);
			arr[i] = r;
//			System.out.print(arr[i] + " ");
		}
//		System.out.println();
		for(int j = 0; j<arr.length; j++) {
			cnt++;
			for(int k = 0; k<arr.length;k++) {
				if(j == k) {
					continue;
				}
				else if(arr[j] == arr[k]) {
					for(;;) {
						if(arr[j] == (int)(Math.random()*100+1)) {
							continue;
						}
						else {
							arr[j] = (int)(Math.random()*100+1);
							break;
						}
					}
				}
				else {
					continue;
				}
			}
			System.out.printf("%3d ",arr[j]);
			if(cnt % 10 == 0) {
				System.out.println();	
			}
		}
	}
	private static void 문제7() {
//		정수를 10개 저장하는 배열을 만들어라.
//		1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라.
//		배열에 든 숫자들과 평균을 출력하라
		int[]jungsu = new int [10];
		System.out.print("랜덤한 정수들 : ");
		double sum = 0;
		for(int i=0;i<10;i++) {
			int j = (int)(Math.random()*10+1);
			jungsu[i]=j;
			System.out.printf("%d ",jungsu[i]);
			sum += jungsu[i]; 
		}
		System.out.println();
		System.out.printf("평균은 %.1f",sum/10);
	}

	private static void 문제6(Scanner sc) {
//		정수로 된 돈의 액수를 입력받아라
//		오만원권, 만원권, 천원권, 500원 동전, 100원 동전, 50원 동전, 10원 동전,
//		1원 동전이 몇개로 변환되는지 출력하라.
		System.out.print("금액을 입력하시오 >> ");
		int money = sc.nextInt();
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		for(int i=0;i<unit.length;i++) {
			if(money > unit[i]) {
				int minus = money/unit[i];
				System.out.printf("%d원짜리 : %d개%n", unit[i], minus);
				money = money - unit[i]*minus;
			}
			else {
				continue;
			}
		}
	}

	private static void 문제5(Scanner sc) {
//		양의 정수를 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하라
//		1 5 99 22 345 154 2346 55 32 85
		int[]plus = new int[10];
		System.out.printf("양의 정수를 %d개 입력하시오 >> ", plus.length);
		int cnt = 0;
		for(int i=0;i<plus.length;i++) {
			plus[i] = sc.nextInt();
			if(i==0) {
				System.out.print("3의 배수는 ");
			}
			if(plus[i] % 3 == 0) {
				cnt++;
				System.out.print(plus[i] + " ");
			}
		}
		if(cnt == 0) {
			System.out.print("없습니다.");
		}
		else {
			System.out.printf("%d개 입니다.", cnt);
		}
	}

	private static void 문제4(Scanner sc) {
//		Scanner를 이용하여 소문자 알파벳을 하나 입력받고 다음과 같이 출력하는 프로그램을 작성하라.
		System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
		String str = sc.next();
		char cha = str.charAt(0);
		int alpha_num = cha-96;
		int[][] alpha = new int[alpha_num][];
		
		for(int i=0;i<alpha.length;i++) {
			for(int j=0;j<alpha.length-i;j++) {
				System.out.printf("%c ",97+j);
			}
			System.out.println();
		}
	}

	private static void 문제3(Scanner sc) {
//		Scanner를 이용하여 정수를 입력받아라.
//		정수에 따라 *을 출력하는 프로그램을 작성하라
		System.out.print("정수를 입력하시오. >> ");
		int jungsu = sc.nextInt();
		int [][] star = new int[jungsu][];
		
		for(int i =0; i<star.length; i++) {
			for(int j=0;j<star.length-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void 문제2() {
//		2차원 배열을 출력하는 프로그램을 작성하라.
		int[][] arr = new int[5][];
		arr[0] = new int[1];
		arr[1] = new int[3];
		arr[2] = new int[1];
		arr[3] = new int[4];
		arr[4] = new int[2];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = j+1;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void do_while_test() {
		int i = 0, sum = 0;
		do {
			sum = sum + i;
			i+=2;
		}
		while(i<100);
		System.out.println(sum);
	}

	private static void for_test() {
		int sum = 0;
		for(int i=0;i<100;i+=2) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	private static void while_test() {
		int sum=0, i=0;
		while(i<100) {
			sum = sum + i;
			i += 2;
		}
		System.out.println(sum);
	}

}
