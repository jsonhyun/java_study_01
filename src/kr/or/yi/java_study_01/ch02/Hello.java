package kr.or.yi.java_study_01.ch02;

/**
 * 소스파일 : Hello.java
 * 작성일 : 2019.11.20
 * 아래 클래스에 대한 설명을 적음.
 * alt + shift + J(문서화 주석 단축키)
 */
public class Hello {
	public static void main(String[] args/*args도 지역변수 */) {
		double PI = 3.141592;
		//지역변수(함수 내 선언된 변수)
		//'='은 할당(배정)연산자  
		int i = 20; // 선언과 초기화
		int s; 		// 정수형 변수 선언
		char a;		// 문자형 변수 선언
		
		/* int class = 10 class는 식별자 사용 불가능*/
		
		s = sum(i,10);
		a = '?';
		
		System.out.println(a + "Hello" + s);
		// 'a' + "Hello" + 30
		// "a"(변경) + "Hello" + 30
		//"aHello"(문자열로 합쳐짐) + 30
		//"aHello" + "30"(문자열 30으로 변경)
		System.out.printf("%c %-10s %d %5.2f %n", a, "Hello", s, 5/3.0);
		System.out.println(a + "Hello" + (s + 10));
		System.out.println("\"java's 어렵다\"");
		
		PI = 3.14;
	}

	private static int sum(int n, int m) {
		return n + m;
	}

}
