package kr.or.yi.java_study_01.ch05.prc.exam09;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int capacity = sc.nextInt();
		Stack ss= new StringStack(capacity);
		String res;
		for(int i = 0; i<capacity+1; i++) {
			System.out.print("문자열 입력 >> ");
			res = sc.next();
			if(res.equals("그만")) {
				break;
			}
			ss.push(res);
		}
		
		System.out.println("스택에 저장된 모든 문자열 팝");
		for(int i=ss.length()-1; i>-1; i--) {
			System.out.print(ss.pop()+" ");
		}
		sc.close();
	}

}
