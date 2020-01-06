package kr.or.yi.java_study_01.ch04.exam11;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		String opr = sc.next();
		if(opr.equals("+")) {
			add.setValue(a, b);
			result = add.calculate();
			System.out.println(result);
		}
		else if(opr.equals("-")) {
			sub.setValue(a, b);
			result = sub.calculate();
			System.out.println(result);
		}
		else if(opr.equals("*")) {
			mul.setValue(a, b);
			result = mul.calculate();
			System.out.println(result);
		}
		else if(opr.equals("/")) {
			div.setValue(a, b);
			result = div.calculate();
			System.out.println(result);
		}
		sc.close();
	}

}
