package kr.or.yi.java_study_01.ch03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		exam01(sc);
//		exam02(sc);
		
		try {
			int[] inArr = new int[5];
			System.out.println(5/0);
//			int a = sc.nextInt();
			int c = Integer.parseInt("a");
//			inArr[5] = 10;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생");
		}
		//여러개의 예외처리가 가능함
		catch (ArithmeticException e) {
			System.out.println("주글래");
		}
		catch (InputMismatchException e) {
			System.out.println("숫자만 가능");
		}
		catch (NumberFormatException e) {
			System.out.println("문자화 된 숫자만 가능");
		}
				
//		catch (Exception e) {
//			System.out.println("위의 예외를 제외한 나머지 예외");
//			e.printStackTrace();
//		}
		sc.close();
	}

	private static void exam02(Scanner sc) {
		while(true) {
			System.out.print("나뉨수를 입력하시오:");
			int dividend = sc.nextInt();
			System.out.print("나눗수를 입력하시오:");
			int divisor = sc.nextInt();
				
			try {
				System.out.println(dividend + "를" + divisor + "로 나누면 몫은" + dividend/divisor + "입니다.");
				System.out.println("계산 완료");
				break;
			}
			catch (ArithmeticException e) {
				System.out.printf(" %d / %d 예외 발생 0으로 나눌 수 없음, 다시 입력하세요. %n", dividend, divisor);
			}
		}
	}

	private static void exam01(Scanner sc) {
		int dividend;
		int divisor;
		
		System.out.print("나뉨수를 입력하시오:");
		dividend = sc.nextInt();
		System.out.print("나눗수를 입력하시오:");
		divisor = sc.nextInt();
			
		try {
			System.out.println(dividend + "를" + divisor + "로 나누면 몫은" + dividend/divisor + "입니다.");
			System.out.println("계산 완료");
		}
		catch (ArithmeticException e) {
			System.out.printf(" %d / %d 예외 발생 0으로 나눌 수 없음 %n", dividend, divisor);
		}
		
		System.out.println("main() 수행 완료~~!!");
	}

}
