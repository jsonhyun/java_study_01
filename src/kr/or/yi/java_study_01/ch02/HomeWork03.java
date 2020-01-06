package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		문제1(sc);
//		문제2(sc);
//		문제3(sc);
		문제4(sc);
//		문제5(sc);
		sc.close();
	}

	private static void 문제5(Scanner sc) {
//		1.사용자로부터 3개의 정수를 읽어들인 후에 가장 작은 값을 결정하는 프로그램을 작성하라.
		System.out.print("3개의 정수를 입력하시오 >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b) {
			if(b>c && a>c) {
				System.out.printf("%d이 가장 작은 값입니다.",c);
			}
			else if(b<c && a>c) {
				System.out.printf("%d이 가장 작은 값입니다.",b);
			}
			else if(b<c && c>a) {
				System.out.printf("%d이 가장 작은 값입니다.",b);
			}
		}
		else if(b>a) {
			if(a>c && b>c) {
				System.out.printf("%d이 가장 작은 값입니다.",c);
			}
			else if(a<c && b>c) {
				System.out.printf("%d이 가장 작은 값입니다.",a);
			}
			else if(a<c && b<c) {
				System.out.printf("%d이 가장 작은 값입니다.",a);
			}
		}
	}

	private static void 문제4(Scanner sc) {
//		1.비만도 측정 : 카우프 지수 공식(체중(kg)/키(m^2))
//		              저체중       표준체중          과체중          비만 
//		20대   17.9이하   18 ~ 23   24~30   30초과 
//		30대   18.4이하   18.5~24   25~30   30초과
		
		System.out.print("나이를 입력하세요.(20 ~ 39세 범위) >> ");
		int 나이 = sc.nextInt();
		if(나이 < 20 || 나이 > 39) {
			System.out.println("입력하신 나이는 계산할 수 없습니다.");
		}
		else {
			System.out.print("체중을 입력하세요.(kg단위) >> ");
			int 체중 = sc.nextInt();
			System.out.print("키를 입력하세요.(m단위) >>");
			double 키 = sc.nextDouble();
			
			double 지수 = 체중 / (Math.pow(키, 2));
			
			if(나이 > 19 && 나이 < 30) {
				if(지수 < 18) {
					System.out.printf("체질량 지수 : %.2f로 저체중입니다.",지수);
				}
				else if(지수 > 17.9 && 지수 < 24) {
					System.out.printf("체질량 지수 : %.2f로 표준체중입니다.",지수);
				}
				else if(지수 > 23.9 && 지수 < 31) {
					System.out.printf("체질량 지수 : %.2f로 과체중입니다.",지수);
				}
				else {
					System.out.printf("체질량 지수 : %.2f로 비만입니다.",지수);
				}
			}
			else if(나이 > 29 && 나이 < 40) {
				if(지수 < 18.5) {
					System.out.printf("체질량 지수 : %.2f로 저체중입니다.",지수);
				}
				else if(지수 > 18.4 && 지수 < 25) {
					System.out.printf("체질량 지수 : %.2f로 표준체중입니다.",지수);
				}
				else if(지수 > 24.9 && 지수 < 31) {
					System.out.printf("체질량 지수 : %.2f로 과체중입니다.",지수);
				}
				else {
					System.out.printf("체질량 지수 : %.2f로 비만입니다.",지수);
				}
			}
		}
		
	}

	private static void 문제3(Scanner sc) {
//		1.사용자에게 자유이용권인지 입장권인지 질문하라.
//		2.사용자의 나이, 현재 시각을 입력 받아서 지불하여야 하는 금액을 표시하라.
//		3.자유이용권 주간                  대인:34,000원, 소인(3~12세/65세이상):25,000원
//		4.       야간(5시이후) 대인:29,000원, 소인(3~12세/65세이상):21,000원
//		3.입장권 주간                  대인:27,000원, 소인(3~12세/65세이상):20,000원
//		4.     야간(5시이후) 대인:23,000원, 소인(3~12세/65세이상):17,000원
		
		System.out.print("권종을 선택하십시오(자유이용권, 입장권) >> ");
		String 권종 = sc.nextLine();
		System.out.print("나이와 시각을 입력하십시오 >> ");
		int 나이 = sc.nextInt();
		int 시각 = sc.nextInt();
		
		if(권종.equals("자유이용권")) {
			if(시각 < 17) {
				if(나이 > 64 | (나이 > 2 && 나이 < 13)) {
					System.out.print("자유이용권, 주간, 소인권 25,000원입니다.");
				}
				else if(나이 < 3) {
					System.out.print("3세 미만의 아동은 무료이용이 가능합니다.");
				}
				else {
					System.out.print("자유이용권, 주간, 대인권 34,000원입니다.");
				}
			}
			else {
				if(나이 > 64 | (나이 > 2 && 나이 < 13)) {
					System.out.print("자유이용권, 야간, 소인권 21,000원입니다.");
				}
				else if(나이 < 3) {
					System.out.print("3세 미만의 아동은 무료이용이 가능합니다.");
				}
				else {
					System.out.print("자유이용권, 야간, 대인권 29,000원입니다.");
				}
			}
		}
		else if(권종.equals("입장권")) {
			if(시각 < 17) {
				if(나이 > 64 | (나이 > 2 && 나이 < 13)) {
					System.out.print("입장권, 주간, 소인권 20,000원입니다.");
				}
				else if(나이 < 3) {
					System.out.print("3세 미만의 아이는 무료이용이 가능합니다.");
				}
				else {
					System.out.print("입장권, 주간, 대인권 27,000원입니다.");
				}
			}
			else {
				if(나이 > 64 | (나이 > 2 && 나이 < 13)) {
					System.out.print("입장권, 야간, 소인권 17,000원입니다.");
				}
				else if(나이 < 3) {
					System.out.print("3세 미만의 아이는 무료이용이 가능합니다.");
				}
				else {
					System.out.print("입장권, 야간, 대인권 23,000원입니다.");
				}
			}
		}
	}

	private static void 문제2(Scanner sc) {
//		1.사용자로부터 하나의 문자를 받는다.
//		2.받은 문자가 대문자이면 소문자로 변환한다.
//		3.만약 소문자이면 대문자를 입력하라는 메시지를 출력한다.
//		4.대문자에서 'A'를 빼고 'a'를 더해주면 소문자로 변환된다.
//		5.문자를 숫자로 변환, 숫자를 다시 문자로 변환하여 출력
		System.out.print("하나의 문자를 입력하세요.>> ");
		char a = sc.nextLine().charAt(0);
		int b = a;
				
		if(b>64 && b<96) {
			int res = (b - 65) + 97;
			System.out.printf("%c",res);
		}
		else {
			System.out.print("대문자를 입력하시오");
		}
	}

	private static void 문제1(Scanner sc) {
//		1.1개에 100원인 물건을 판매하고 있다.
//		2.10개 이상 구매시 10%할인, 20개 이상 구매시 15%할인, 100개 이상은 20%할인 한다.
		System.out.print("몇 개의 물건을 구매하실건가요?(1개에 100원) ");
		int a = sc.nextInt();
		int pay = 100;
		int res = a * pay;
		
		if(a < 10) {
			System.out.printf("%d개에 %d원입니다.", a, res);
		}
		else {
			if(a<20){
				System.out.printf("%d개에 %.0f원입니다.", a, (double)(res * 0.9));
			}
			else if(a<100) {
				System.out.printf("%d개에 %.0f원입니다.", a, (double)(res * 0.85));
			}
			else {
			System.out.printf("%d개에 %.0f원입니다.", a, (double)(res * 0.8));
			}
		}
	}
}
