package kr.or.yi.java_study_01.ch01;

class Test{
	
}

public class HelloJava {
	// 들여쓰기
	public static void main(String[] args) {
//		함수내에서 선언된 변수는 지역변수 주석 //이후의 문자들을 주석처리
		String name = "이상원1"; // 변수지정      1개의 라인주석 지정 (ctrl + /) 해제 (ctrl + /)
		System.out.print("Hello Java");
		/* 문자열 + 변수 => 문자열 + 문자열 ->      블럭주석 (ctrl + shift + /)
		 * 하나의 문자열로 결합(문자열 결합연산자(+))   블럭해제 (ctrl + shift + \) */
		System.out.print("힘들지" + name);

	}

}
