package kr.or.yi.java_study_01.ch03.array;

public class ArrayEx03 {

	public static void main(String[] args) {
		int[] intArr = {4, 3, 5, 2, 1};
		prnArray(intArr);// 5, 4, 3, 2, 1
		sort(intArr); //정렬수행
		prnArray(intArr);// 1, 2, 3, 4, 5
	}

	private static void sort(int[] intArr) {
		for(int p=0; p<intArr.length;p++) {
			int temp;
			for(int i=1; i<intArr.length; i++) {
				if(intArr[i-1]>intArr[i]) {
					temp=intArr[i-1];
					intArr[i-1]=intArr[i];
					intArr[i]=temp;
				}
				else {
					continue;
				}
			}
		}
	}

	private static void prnArray(int[] intArr) {
		for(int i=0; i<intArr.length; i++) {
			System.out.printf("%d ",intArr[i]);
		}
		System.out.println();
	}
}
