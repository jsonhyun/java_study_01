package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class HomeWork01_p106 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		가위바위보(sc);
		
		sc.close();
		
	}

	private static void 가위바위보(Scanner sc) {
		System.out.printf("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.%n");
		System.out.print("철수 >> ");
		String var1 = sc.nextLine();
		System.out.print("영희 >> ");
		String var2 = sc.nextLine();
		
		if (var1.equals("가위")) {
			if(var2.equals("가위")) {
				System.out.println("비겼습니다.");
			}
			else if(var2.equals("바위")) {
				System.out.println("철수가 졌습니다.");
			}
			else {
				System.out.println("철수가 이겼습니다.");
			}
		}
		else if(var1.equals("바위")) {
			if(var2.equals("바위")) {
				System.out.println("비겼습니다.");
			}
			else if(var2.equals("보")) {
				System.out.println("철수가 졌습니다.");
			}
			else {
				System.out.println("철수가 이겼습니다.");
			}
		}
		else if(var1.equals("보")) {
			if(var2.equals("보")) {
				System.out.println("비겼습니다.");
			}
			else if(var2.equals("가위")) {
				System.out.println("철수가 졌습니다.");
			}
			else {
				System.out.println("철수가 이겼습니다.");
			}
		}
	}

}
