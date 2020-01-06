package kr.or.yi.java_study_01.ch03;

import java.util.Random;
import java.util.Scanner;

public class exam_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 개수를 입력하세요 >> ");
		int jungsu = sc.nextInt();
		System.out.printf("정수는 몇개? %d개 %n", jungsu);
		int [] arr = new int[jungsu];
		Random rnd = new Random();
		int cnt = 0;		

		for(int i=0; i<arr.length; i++) {
			arr[i] = rnd.nextInt(100)+1;
			cnt++;
			for(int j=0; j<arr.length; j++) {
				if(i != j && arr[i] == arr[j]) {
					arr[i] = rnd.nextInt(100)+1;
					break;
				}
			}
			System.out.printf("%3d ",arr[i]);
			if(cnt % 10 == 0) {
				System.out.println();	
			}
		}
		
		sc.close();
	}

}
