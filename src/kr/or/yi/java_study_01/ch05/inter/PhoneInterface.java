package kr.or.yi.java_study_01.ch05.inter;

public interface PhoneInterface {
	// 상수, 추상메소드, default 메소드
	/* public static final 생략가능 */ int TIMEOUT = 1000;// 상수

	/* public abstract 생략가능 */ void sendCall(); // 추상메소드

	void receiveCall(); // 추상메소드

	default void prnLogo() {
		System.out.println("** phone **");
	}
}
