package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		multipletree(sc);
//		ternaryTree(sc);
//		grade(sc);
//		nestedIf(sc);
		nestedIfTeacher(sc);
		sc.close();
		

	}

	private static void nestedIfTeacher(Scanner sc) {
		/*
		 * 점수와 학년을 입력 받아 60점 이상이면 합격, 미만이면 불합격을 출력한다. 4학년의 경우 70점 이상이어야 합격이다.
		 */
		/*
		1. 점수와 학년을 입력받기
		2. 점수가 60점 이상이면 합격
		3. 점수가 60점 미만이면 불합격
		4. 합격자 중에서 4학년일경우 70점이상이면 합격
		*/
		
		System.out.printf("점수를 입력(0~100)\n학년을 입력하세요(1~4) 예 90 3 >>");
		int jumsu = sc.nextInt();
		int year = sc.nextInt();
//		System.out.println(jumsu + " : " + year);
		if (jumsu >= 60) {
			if (year == 4) {	//4학년일 경우
				if (jumsu >= 70) {
					System.out.println("합격");
				}else {
					System.out.println("불합격");
				}
			}else {				//그외 학년일 경우
				System.out.println("합격");
			}
			
			if (year != 4) {
				System.out.println("합격");//1~3학년
			}else if(jumsu >= 70) {
				System.out.println("합격");//4학년
			}else {
				System.out.println("불합격");
			}
		}else {
			System.out.println("불합격");
		}
	}

	private static void nestedIf(Scanner sc) {
		System.out.println("점수를 입력하세요(0~100): ");
		int score = sc.nextInt();
		
		System.out.println("학년을 입력하세요(1~4): ");
		int year = sc.nextInt();
		
		if(score >= 60) {
			if(year != 4) {
				System.out.println("합격!");
			}else if (score >= 70) {
				System.out.println("합격!");
			}else {
				System.out.println("불합격!");
			}
		}else {
			System.out.println("불합격!");
		}
	}

	private static void grade(Scanner sc) {
		char grade;
		System.out.println("점수를 입력하세요(0~100): ");
		int score = sc.nextInt();
		if(score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}System.out.println("학점은" + grade + "입니다.");
			
	}

	private static void ternaryTree(Scanner sc) {
		System.out.printf("수를 입력하시오: ");
		int number = sc.nextInt();
		String res = number % 3==0?"3의 배수입니다.":"3의 배수가 아닙니다.";
		System.out.println(res);
		
	}

	private static void multipletree(Scanner sc) {
		System.out.printf("수를 입력하시오: ");
		int number = sc.nextInt();
		
		if (number % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
	}

}
