package kr.or.yi.java_study_01.ch05.prc.exam09;

public interface Stack {
	int length();
	int capacity();
	String pop(); //스택의 톱에 저장된 실수 리턴
	boolean push(String val); //스택의 톱에 실수 저장
}
