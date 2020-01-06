package kr.or.yi.java_study_01.ch05.prc.exam11;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> "); // 9 8 +
		int a = sc.nextInt();
		int b = sc.nextInt();
		String oper = sc.next();		
				
		Calc[] calc = {new Mul(), new Add(), new Sub(), new Div()};
		String[] operArr= {"*","+","-","/"};
		
		int findOper = Arrays.binarySearch(operArr, oper);
		calc[findOper].setValue(a, b);
		System.out.println(calc[findOper].calculate());

		sc.close();

	}

}
