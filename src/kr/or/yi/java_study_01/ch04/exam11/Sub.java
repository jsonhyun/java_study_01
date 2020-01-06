package kr.or.yi.java_study_01.ch04.exam11;

public class Sub {
	//Field
	private int a;
	private int b;
	
	//Constructor
	
	//Method
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return this.a - this.b;
	}
}
