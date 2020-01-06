package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class HomeWork02_p110_112 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		문제1(sc);
		문제2(sc);
		문제3(sc);
		문제4(sc);
		문제5(sc);
		문제6(sc);
		문제7(sc);
		문제8(sc);
		문제9(sc);
		문제10(sc);
		문제11_IfElse(sc);
		문제11_Switch(sc);
		문제12_IfElse(sc);
		문제12_Switch(sc);
		
		sc.close();
	}

	private static void 문제12_Switch(Scanner sc) {
//		1.사칙연산을 입력받아 계산하는 프로그램을 작성
//		2.연산자는 +, =, *, /의 네 가지로 한다.
//		3.피연산자는 모두 실수로 한다.
//		4.피연산자와 연산자는 빈 칸으로 분리하여 입력한다.
//		5.0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료한다.
//		6.switch문을 이용하라	
		double res;
		System.out.printf("연산 >> ");
		double x = sc.nextDouble();
		String opr = sc.next();
		double y = sc.nextDouble();
		
		switch(opr) {
			case "+" : 
				res = x + y;
				System.out.printf("%.2f %s %.2f의 계산 결과는 %.2f%n", x, opr, y, res);
				break;
			case "-" :
				res = x - y;
				System.out.printf("%.2f %s %.2f의 계산 결과는 %.2f%n", x, opr, y, res);
				break;
			case "*" :
				res = x * y;
				System.out.printf("%.2f %s %.2f의 계산 결과는 %.2f%n", x, opr, y, res);
				break;
			case "/" :
				if(y != 0) {
					res = x / y;
					System.out.printf("%.2f %s %.2f의 계산 결과는 %.2f%n", x, opr, y, res);
				}
				else {
					System.out.printf("0으로 나눌 수 없습니다.%n");
				}
				break;
		}
		
	}

	private static void 문제12_IfElse(Scanner sc) {
//		1.사칙연산을 입력받아 계산하는 프로그램을 작성
//		2.연산자는 +, =, *, /의 네 가지로 한다.
//		3.피연산자는 모두 실수로 한다.
//		4.피연산자와 연산자는 빈 칸으로 분리하여 입력한다.
//		5.0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료한다.
//		6.if-else문을 이용하라
		double res;
		System.out.printf("연산 >> ");
		double x = sc.nextDouble();
		String opr = sc.next();
		double y = sc.nextDouble();
		
		
		if(opr.equals("+")) {
			res = x + y;
			System.out.printf("%.2f %s %.2f의 계산 결과는 %.2f%n",x, opr, y, res);
		}
		else if(opr.equals("-")){
			res = x - y;
			System.out.printf("%.2f %s %.2f의 계산 결과는 %.2f%n",x, opr, y, res);
		}
		else if(opr.equals("*")){
			res = x * y;
			System.out.printf("%.2f %s %.2f의 계산 결과는 %.2f%n",x, opr, y, res);
		}
		else if(opr.equals("/")){
			if (y == 0) {
				System.out.printf("%.2f로 나눌 수 없습니다.%n", y);
			}
			else {
				res = x / y;
				System.out.printf("%.2f %s %.2f의 계산 결과는 %.2f%n",x, opr, y, res);
			}
		}
				
	}

	private static void 문제11_Switch(Scanner sc) {
//		1.숫자를 입력받아 3~5는 "봄", 6~8은 "여름", 9~10은 "가을", 12,1,2는 "겨울"을 출력하라.
//		2.그 외의 숫자를 입력하면 "잘못입력"을 출력하라
//		3.switch 문을 이용하여 작성하라.
		String season;
		System.out.print("달을 입력하세요(1~12) >> ");
		int month = sc.nextInt();
				
		switch(month){
			case 12:
				season = "겨울";
				break;
			case 11:
			case 10:
			case 9:
				season = "가을";
				break;
			case 8:
			case 7:
			case 6:
				season = "여름";
				break;
			case 5:
			case 4:
			case 3:
				season = "봄";
				break;
			case 2:
			case 1:
				season = "겨울";
				break;
			default:
				season = "잘못입력";				
		}
		System.out.printf("%s%n",season);
		
	}

	private static void 문제11_IfElse(Scanner sc) {
//		1.숫자를 입력받아 3~5는 "봄", 6~8은 "여름", 9~10은 "가을", 12,1,2는 "겨울"을 출력하라.
//		2.그 외의 숫자를 입력하면 "잘못입력"을 출력하라
//		3.if-else 문을 이용하여 작성하라.
		System.out.print("달을 입력하세요(1~12) >> ");
		int month = sc.nextInt();
		
		if(1 <= month && 12 >= month ) {
			if(3 <= month && 5 >= month) {
				System.out.printf("봄%n");
			}
			else if(6 <= month && 8 >= month) {
				System.out.printf("여름%n");
			}
			else if(9 <= month && 11 >= month) {
				System.out.printf("가을%n");
			}
			else {
				System.out.printf("겨울%n");
			}
		}
		else {
			System.out.printf("잘못입력%n");
		}
	}

	private static void 문제10(Scanner sc) {
//		1.두개의 원의 중심과 반지름을 각각 입력받아라.
//		2.두개의 원이 겹치는지 판별하라.
		System.out.print("첫번째 원의 중심과 반지름 입력 >> ");
		double circle1x = sc.nextFloat();
		double circle1y = sc.nextFloat();
		double radius1 = sc.nextFloat();
		
		System.out.print("두번째 원의 중심과 반지름 입력 >> ");
		double circle2x = sc.nextFloat();
		double circle2y = sc.nextFloat();
		double radius2 = sc.nextFloat();
		
		double sumrad = radius1 + radius2;
		double AB = Math.sqrt(Math.pow((circle2x-circle1x), 2)+Math.pow((circle2y-circle1y), 2));
		
		if(AB < sumrad) {
			System.out.printf("두 원은 서로 겹친다.%n");
		}
		else {
			System.out.printf("두원은 서로 겹치지 않는다.%n");
		}
	}

	private static void 문제9(Scanner sc) {
//		1.원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받아라.
//		2.실수 값으로 다른 점(x, y)를 입력받아 원의 내부에 있는지 판별하라.
		
		System.out.print("원의 중심과 반지름 입력 >> ");
		double circlex = sc.nextFloat();
		double circley = sc.nextFloat();
		double radius = sc.nextFloat();
		
		System.out.print("점 입력 >> ");
		double x = sc.nextFloat();
		double y = sc.nextFloat();
		
		double AB = Math.sqrt(Math.pow((x-circlex),2)+Math.pow((y-circley),2));
		
		if (AB <= radius) {
			System.out.printf("점(%.2f,%.2f)는 원안에 있다.%n", x, y);
		}
		else {
			System.out.printf("점(%.2f,%.2f)는 원안에 없다.%n", x, y);
		}
	}

	private static void 문제8(Scanner sc) {
//		1.(x1, y1)값과 (x2, y2)값을 입력받아라.
//		2.(100, 100)과 (200, 200)의 직사각형과 충돌하는지 판별하라.
		System.out.print("점 (x1, y1)의 좌표를 입력하시오 >> ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.print("점 (x2, y2)의 좌표를 입력하시오 >> ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		if(x1<100) {
			if(y1<100) {
				if(y2<100) {
					System.out.printf("(%d,%d),(%d,%d)사각형은 (100,100),(200,200) 사각형과 충돌하지 않습니다.%n",x1, y1, x2, y2);
				}
				else if (x2 >= 100 && 100 <= y2) {
					System.out.printf("(%d,%d),(%d,%d)사각형은 (100,100),(200,200) 사각형과 충돌합니다.%n",x1, y1, x2, y2);
				}
			}
			else if(100<=y1 && y1<=200) {
				if(x2<100) {
					System.out.printf("(%d,%d),(%d,%d)사각형은 (100,100),(200,200) 사각형과 충돌하지 않습니다.%n",x1, y1, x2, y2);
				}
				else if(x2>=100) {
					System.out.printf("(%d,%d),(%d,%d)사각형은 (100,100),(200,200) 사각형과 충돌합니다.%n",x1, y1, x2, y2);
				}
			}
			else if(200<y1) {
				System.out.printf("(%d,%d),(%d,%d)사각형은 (100,100),(200,200) 사각형과 충돌하지 않습니다.%n",x1, y1, x2, y2);
			}
		}
		else if(100<=x1 && x1<=200) {
			if((y1<100 || y1 > 200) && (y2 < 100 || y2 > 200)) {
				System.out.printf("(%d,%d),(%d,%d)사각형은 (100,100),(200,200) 사각형과 충돌하지 않습니다.%n",x1, y1, x2, y2);
			}
			else if(x2>=100 && y2 >= 100) {
				System.out.printf("(%d,%d),(%d,%d)사각형은 (100,100),(200,200) 사각형과 충돌합니다.%n",x1, y1, x2, y2);
			}
		}
		else if(x1>200) {
			System.out.printf("(%d,%d),(%d,%d)사각형은 (100,100),(200,200) 사각형과 충돌하지 않습니다.%n",x1, y1, x2, y2);
		}
		else if(y1>200) {
			System.out.printf("(%d,%d),(%d,%d)사각형은 (100,100),(200,200) 사각형과 충돌하지 않습니다.%n",x1, y1, x2, y2);
		}
	}

	private static void 문제7(Scanner sc) {
//		1.2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리의 두점으로 표현
//		2.(100,100),(200,200)의 두 점으로 이루어진 사각형이 있다.
//		3.정수 x와 y값을 입력 받아라.
//		4.이 직사각형에 있는 지 판별하는 프로그램을 작성하라.
		
		System.out.print("점 (x, y)의 좌표를 입력하시오 >> ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(((100<=x)&&(x<=200))&&((100<=y)&&(y<=200))) {
			System.out.printf("(%d,%d)는 사각형 안에 있습니다.%n", x, y);
		}
		else {
			System.out.printf("(%d,%d)는 사각형 안에 없습니다.%n", x, y);
		}
	}

	private static void 문제6(Scanner sc) {
//		1.1~99까지의 정수를 입력받아라.
//		2.정수에 3, 6, 9중 하나가 있는 경우 "박수짝"을 출력하고
//		3.두개가 있는 경우 "박수짝짝"을 출력하라
//		4.예)13 : "박수짝", 36 : "박수짝짝"
		System.out.print("1~99 사이의 정수를 입력하시오 >> ");
		int jungsu = sc.nextInt();
		if((jungsu < 30)&&((jungsu % 10 == 3)||(jungsu % 10 == 6)||(jungsu % 10 == 9))) {
			System.out.printf("박수짝%n");
		}
		else if((jungsu >= 30)&&(jungsu<40)) {
			if((jungsu % 10 == 3)||(jungsu % 10 == 6)||(jungsu % 10 == 9)) {
				System.out.printf("박수짝짝%n");
			}
			else {
				System.out.printf("박수짝%n");
			}	
		}
		else if(((jungsu >= 40)&&(jungsu < 60))&&((jungsu % 10 == 3)||(jungsu % 10 == 6)||(jungsu % 10 == 9))) {
			System.out.printf("박수짝%n");
		} 
		else if((jungsu >= 60)&&(jungsu<70)) {
			if((jungsu % 10 == 3)||(jungsu % 10 == 6)||(jungsu % 10 == 9)) {
				System.out.printf("박수짝짝%n");
			}
			else {
				System.out.printf("박수짝%n");
			}	
		}
		else if(((jungsu >= 70)&&(jungsu < 90))&&((jungsu % 10 == 3)||(jungsu % 10 == 6)||(jungsu % 10 == 9))) {
			System.out.printf("박수짝%n");
		}
		else if((jungsu >= 90)&&(jungsu<100)) {
			if((jungsu % 10 == 3)||(jungsu % 10 == 6)||(jungsu % 10 == 9)) {
				System.out.printf("박수짝짝%n");
			}
			else {
				System.out.printf("박수짝%n");
			}	
		}
		else {
			System.out.printf("쉿!%n");
		}
	}

	private static void 문제5(Scanner sc) {
//		1.삼각형 변의 길이를 나타내는 정수 3개를 입력받아라.
//		2.이 3개의 수로 삼각형을 만들 수 있는 지 판별하라.
//		3.삼각형이 되려면 두변의 합이 다른 한변의 길이보다 커야한다.
		
		System.out.print("정수 3개를 입력하시오 >> ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		
		if((first + second) > third ) {
			if(first == 0) {
				System.out.printf("삼각형이 아닙니다.%n");
			}
			else if(second == 0) {
				System.out.printf("삼각형이 아닙니다.%n");
			}
			else if(third == 0) {
				System.out.printf("삼각형이 아닙니다.%n");
			}
			else {
				System.out.printf("삼각형이 됩니다.%n");
			}
		}
		else if((first + third) > second) {
			if(first == 0) {
				System.out.printf("삼각형이 아닙니다.%n");
			}
			else if(second == 0) {
				System.out.printf("삼각형이 아닙니다.%n");
			}
			else if(third == 0) {
				System.out.printf("삼각형이 아닙니다.%n");
			}
			else {
				System.out.printf("삼각형이 됩니다.%n");
			}
		}
		else if((second + third) > first) {
			if(first == 0) {
				System.out.printf("삼각형이 아닙니다.%n");
			}
			else if(second == 0) {
				System.out.printf("삼각형이 아닙니다.%n");
			}
			else if(third == 0) {
				System.out.printf("삼각형이 아닙니다.%n");
			}
			else {
				System.out.printf("삼각형이 됩니다.%n");
			}
		}
		else {
			System.out.printf("삼각형이 아닙니다.%n");
		}
	}

	private static void 문제4(Scanner sc) {
//		1.정수 3개를 입력받아라.
//		2.3개의 숫자 중 중간 크기의 수를 출력하라.
//		3.단 평균값을 구하는 것이 아니다.
		
		System.out.print("정수 3개 입력 >> ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		
		if((first > second) && (second > third)&& (first > third)) {
			System.out.printf("중간값은 %d입니다.%n", second);
		}
		else if((first > second) && (second < third) && (first > third)) {
			System.out.printf("중간값은 %d입니다.%n", third);
		}
		else if((first < second) && (second > third) && (first > third)) {
			System.out.printf("중간값은 %d입니다.%n", first);
		}
		else if((first > second) && (second < third) && (first < third)) {
			System.out.printf("중간값은 %d입니다.%n", first);
		}
		else if((first < second) && (second > third) && (first < third)) {
			System.out.printf("중간값은 %d입니다.%n", third);
		}
		else {
			System.out.printf("중간값은 %d입니다.%n", second);
		}
	}

	private static void 문제3(Scanner sc) {
//		1.정수로 된 돈의 액수를 입력받아라.
//		2.오만원, 만원, 오천원, 천원, 오백원, 백원, 십원, 1원 각 몇개로 반환되는지 출력하라.
		
		System.out.print("금액의 입력하시오 >> ");
		long money = sc.nextInt();
		long oman =  money / 50000;
		long man = ((money - (oman * 50000))/10000);
		long ochen = ((money-(oman * 50000 + man * 10000))/5000);
		long chen = ((money-(oman * 50000 + man * 10000 + ochen * 5000))/1000);
		long obaek = ((money-(oman * 50000 + man * 10000 + ochen * 5000 + chen * 1000))/500);
		long baek = ((money-(oman * 50000 + man * 10000 + ochen * 5000 + chen * 1000 + obaek * 500))/100);
		long osip = ((money-(oman * 50000 + man * 10000 + ochen * 5000 + chen * 1000 + obaek * 500 + baek * 100))/50);
		long sip = ((money-(oman * 50000 + man * 10000 + ochen * 5000 + chen * 1000+ obaek * 500 + baek * 100 + osip * 50))/10);
		long yil = ((money-(oman * 50000 + man * 10000 + ochen * 5000 + chen * 1000+ obaek * 500 + baek * 100 + osip * 50 + sip * 10))/1);
		System.out.printf("오만원권은 %d장, 만원권은 %d장, 오천원권은 %d장, 천원권은 %d장, 오백원은 %d개, 백원은 %d개, 오십원은 %d개, 십원은 %d개, 1원은 %d개입니다.%n",oman,man,ochen,chen,obaek, baek, osip, sip, yil);
	}

	private static void 문제2(Scanner sc) {
//		1. 2자리수 정수를 입력받아라.
//		2. /, %연산을 활용해서 10의자리와 1의 자리가 같은 수를 구별하라.
		
		System.out.print("2자리수 정수 입력(10~99) >> ");
		int jungsu = sc.nextInt();
		if(jungsu % 11 == 0) {
			System.out.printf("Yes! 10의 자리와 1의 자리가 같습니다.%n");
		}
		else {
			System.out.printf("No! 10의 자리와 1의 자리가 다릅니다.%n");
		}
	}

	private static void 문제1(Scanner sc) {
//		1.원화를 입력하면 계산되어 달러로 전환되도록 만드시오.
//		2.$1.0=1100원으로 계산하라
		
		System.out.print("원화를 입력하세요(단위 원) >> ");
		long won = sc.nextLong();
		float dollar = won / 1100;
		System.out.printf("%d원은  $%.1f입니다.%n", won, dollar);
	}


}
