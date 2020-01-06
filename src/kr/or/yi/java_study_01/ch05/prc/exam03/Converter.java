package kr.or.yi.java_study_01.ch05.prc.exam03;

import java.util.Scanner;

abstract class Converter {
	protected double ratio;
	
	protected abstract double convert(double src);
	protected abstract String getSrcString();
	protected abstract String getDestString();
	
	public void run(Scanner sc) {
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요 >> ");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다.");
	}
}
