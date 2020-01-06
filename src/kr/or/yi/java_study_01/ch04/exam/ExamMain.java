package kr.or.yi.java_study_01.ch04.exam;

import java.util.Random;
import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
//		test();
//		1. 학생정보를 관리하는 프로그램을 작성하세요.
//		2. 학생클래스를 정의(번호, 성명, 국어, 영어, 수학) 
//		3. 10개의 학생정보를 담을 수 있는 배열
//		4. 메뉴작성(1. 학생목록, 2. 학생추가, 3. 학생 수정, 4. 학생 삭제, 5. 학생 검색, 6. 종료)
		Student[] stdArr = new Student[15];
		StudentInfo(stdArr);
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("1. 학생목록, 2. 학생추가, 3. 학생 수정, 4. 학생 삭제, 5. 학생 검색, 6. 종료 ");
			System.out.print("메뉴를 선택하세요 >> ");
			num = sc.nextInt();
			switch (num) {
			case 1:
				prnStudentInfo(stdArr);
				break;
			case 2:
				addStudent(stdArr, sc);
				break;
			case 3:
				updateStudent(stdArr, sc);
				break;
			case 4:
				delStudent(stdArr, sc);
				break;
			case 5:
				searchStudent(stdArr, sc);
				break;
			}
		} while (num < 6);
		System.out.println("학생관리 프로그램을 종료합니다.");
		
		sc.close();
	}

	private static void StudentInfo(Student[] arr) {
		Random rnd = new Random();
		String[] names = {"권수진","정아름","장현서","황태원","배진우","현재승"
				, "이동주", "황하나", "유경진", "이상원", "박인선",null,null,null,null};		
		for(int i = 0; i<arr.length; i++) {
			if(names[i] == null) {
				continue;
			}
			else {
				arr[i] = new Student(i+1, names[i], 
						rnd.nextInt(60)+41,
						rnd.nextInt(60)+41, 
						rnd.nextInt(60)+41);
			}
		}
	}
	
	private static void prnStudentInfo(Student[] stdArr) {
		System.out.println("============= 학생 목록 ==============");
		System.out.println("  번호   성명          국어   영어   수학  총점   평균" );
		for (int i = 0; i < stdArr.length; i++) {
			if(stdArr[i] == null) {
				continue;
			}
			System.out.println(stdArr[i]);
		}
	}

	private static void addStudent(Student[] stdArr, Scanner sc) {
		System.out.println("============= 학생 추가 ==============");
		System.out.print("추가할 학생의 정보를 입력해주세요(성명, 국어, 영어, 수학) >> ");
		for (int i = 0; i < stdArr.length; i++) {
			if (stdArr[i] == null) {
				stdArr[i] = new Student(i + 1, sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
				break;
			}
		}
	}
	
	private static void updateStudent(Student[] stdArr, Scanner sc) {
		System.out.println("============= 학생 수정 ==============");
		int i = findStudent(stdArr, sc);
		System.out.print("위 학생의 수정정보를 입력해주세요(성명, 국어, 영어, 수학) >> ");
		stdArr[i].setStdName(sc.next());
		stdArr[i].setKor(sc.nextInt());
		stdArr[i].setEng(sc.nextInt());
		stdArr[i].setMath(sc.nextInt());
		System.out.println("학생의 정보가 " + stdArr[i] + "로 변경되었습니다.");
	}
	
	private static void delStudent(Student[] stdArr, Scanner sc) {
		System.out.println("============= 학생 삭제 ==============");
		int i = findStudent(stdArr, sc);
		System.out.print("위의 학생 정보를 삭제할까요?(네/아니오) >> ");
		sc.nextLine();
		if (sc.nextLine().equals("네")) {
			stdArr[i] = stdArr[i + 1];
			int k = i+1;
			for (int j = i; j < stdArr.length - 1; j++) {
				stdArr[j] = stdArr[j + 1];
				if(stdArr[j] != null) {
					stdArr[j].setStdNo(k);
					k++;
				}
				if (stdArr[j] == stdArr[j + 1]) {
					stdArr[j+1] = null;
				}
			}
			System.out.println("학생의 정보가 삭제되었습니다.");
		}
	}
	
	private static void searchStudent(Student[] stdArr, Scanner sc) {
		int i = findStudent(stdArr, sc);
		if(i == -1) {
			System.out.println("해당 학생이 없습니다.");
		}
	}

	private static int findStudent(Student[] stdArr, Scanner sc) {
		System.out.print("학생의 번호를 입력해주세요 >> ");
		int j = sc.nextInt();
		for(int i = 0;i<stdArr.length; i++) {
			if(stdArr[i] == null) {
				break;
			}
			if(stdArr[i].getStdNo() == j) {
				System.out.println(stdArr[i]);
				return i;
			}
		}
		return -1;
	}

	private static void test() {
		Student std01 = new Student(1,"배진우", 90, 80, 90);
		System.out.println(std01);
		Student std02 = new Student(2,"이동주", 60, 90, 90);
		System.out.println(std02);
		System.out.println();
		Student[] stdArr = {std01, std02};
		for(Student std : stdArr) {
			System.out.println(std);
		}
	}

}