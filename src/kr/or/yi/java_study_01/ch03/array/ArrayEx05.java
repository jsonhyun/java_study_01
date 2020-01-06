package kr.or.yi.java_study_01.ch03.array;

import java.util.Random;

public class ArrayEx05 {

	public static void main(String[] args) {
		// 1. 12명의 국어, 영어, 수학 점수를 담는 2차원 배열 선언
		// 2. 12명의 이름을 담은 배열 선언
		// 3. 60 ~ 100 사이의 랜덤한 값을 국어, 영어, 수학 점수로 입력
		// 4. 이름 국어 영어 수학 총점 평균을 각각 출력
		// 5. 과목별 평균을 출력하시오.
		Random rnd = new Random();
		rnd.setSeed(1234);
		int [][] score = new int [12][3];
		String[] name = {"권수진","정아름","황태원","장현서","현재승","배진우","박인선","이상원","유경진","권태헌","황하나","이동주"};
		
		int student = 0;
		int point = 0;
				
		double avr = 0;
		double kor = 0;
		double eng = 0;
		double math = 0;
		
		int sum = 0;
		double sum1 = 0;
		double avr1 = 0;
		System.out.println("     이름         국어                 영어                수학             총점         평균");
		System.out.println("==================================================");
		for(student=0;student<score.length;student++) {
			sum = 0;
			System.out.printf("%7s ",name[student]);
			for(point=0;point<score[student].length;point++) {
				score[student][point] = (rnd.nextInt(40)+60);
				System.out.printf(" %8d ", score[student][point]);
				sum += score[student][point];
				avr = sum/3.0;
				if(point==0) {
					kor += score[student][point];
				}
				else if(point==1) {
					eng += score[student][point];
				}
				else if(point==2) {
					math += score[student][point];
				}
			}
			System.out.printf("%8d ", sum);
			sum1+=sum;
			System.out.printf("  %5.2f %n",avr);
			avr1 += avr;
		}
		System.out.println("==================================================");
		System.out.printf("과목별 평균   %.2f    %.2f     %.2f   %.2f  %.2f", kor/12, eng/12, math/12, sum1/12, avr1/12);
		
		
//		scoreAverage();
		
	}

	private static void scoreAverage() {
		double score[][]= {
				{3.3, 3.4},
				{3.5, 3.6},
				{3.7, 4.0},
				{4.1, 4.2}};
		double sum = 0;
		double yearSum = 0;
		int year;
		int term;
		for(year = 0; year < score.length; year++) { //학년
			yearSum = 0;
			for(term = 0; term < score[year].length; term++) { //학기
				System.out.print(score[year][term]+" ");
				sum += score[year][term];
				yearSum += score[year][term];
			}
			System.out.printf("%.2f%n", yearSum/2.0);
		}
		int n = score.length;
		int m = score[0].length;
		System.out.println("4년 전체 평점 평균은 "+sum/(n*m));
	}
}
