package kr.or.yi.java_study_01.ch03;

public class DoWhileLoop {

	public static void main(String[] args) {
		int c = 'a';
		
		do {
			System.out.print(c);
			c = (int)(c + 1);
		}while(c <= 'z');
	}

}
