package kr.or.yi.java_study_01.ch04.exam;

public class Grade {
	private int math;
	private int science;
	private int english;
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public double average() {
		return (math+science+english)/3;
	}
	
}
