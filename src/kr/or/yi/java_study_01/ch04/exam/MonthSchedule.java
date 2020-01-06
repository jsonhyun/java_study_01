package kr.or.yi.java_study_01.ch04.exam;

import java.util.Scanner;

public class MonthSchedule {
	private Scanner sc;
	private Day [] days;
	private int newDay; // 해당 월의 총일수
	
	public MonthSchedule(int newDay) {
		this.newDay = newDay;
		this.days = new Day [newDay]; //일수만큼의 Day 객체를 가지는 배열 생성
		this.sc = new Scanner(System.in);
		for(int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}
		
	}

	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램");
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
			int i = sc.nextInt();
			if(i == 1) {
				input();//함수처럼 사용하면 된다.
			}
			else if(i == 2) {
				view();
			}
			else if(i == 3) {
				finish();
				break;
			}
			else {
				System.out.println("제대로 입력하세요.");
			}
		}
		
	}
	
	public void input() {
		System.out.print("날짜(1~30)? ");
		int day = sc.nextInt()-1; //1일을 입력 -> 배열은 0부터 시작
		System.out.print("할일(빈칸없이 입력) >> ");
		String work = sc.next();
		days[day].set(work);
	}
	
	public void view() {
		System.out.print("날짜(1~30)? ");
		int i = sc.nextInt();
		System.out.printf("%d일의 할일은 ",i);
		days[i-1].show();
		System.out.println();
	}
	
	public void finish() {
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}
	

}
