package kr.or.yi.java_study_01.ch05.prc.exam03;

import java.util.Scanner;

public class ConverterEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Converter toDollar = new Won2Dollar(1200);
		toDollar.run(sc);
		
		Converter toMile = new Km2Mile(1.6);
		toMile.run(sc);
		sc.close();
	}

}
