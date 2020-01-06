package kr.or.yi.java_study_01.ch04;

public class ArrayPassingEx {

	public static void main(String[] args) {
//		pencil();
		MethodSample a = new MethodSample();
		int i = a.getSum(1, 2);
		int j = a.getSum(1, 2, 3);
		double k = a.getSum(1.1, 2.2);
		
		
		
	}

	private static void pencil() {
		char [] c = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}

	private static void replaceSpace(char[] a) {
		for(int i = 0;i<a.length; i++) {
			if(a[i] == ' ') {
				a[i] = ',';
			}
		}
	}

	private static void printCharArray(char[] a) {
		for(int i = 0;i<a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}

}
