package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;

public class ArrayEx06 {

	public static void main(String[] args) {
		int [][] intArr = new int[4][];
		
		create_array(intArr);
		init_array(intArr);
		prn_array(intArr);
				
	}//end of main

	private static void prn_array(int[][] intArr) {
		for(int i = 0; i< intArr.length; i++) {
			for(int j=0;j<intArr[i].length;j++) {
				System.out.print(intArr[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void init_array(int[][] intArr) {
		for(int i = 0;i<intArr.length;i++) {
			for(int j=0;j<intArr[i].length;j++) {
				intArr[i][j] = (i+1)*10 +j;
			}
		}
	}

	private static void create_array(int[][] intArr) {
		System.out.println(Arrays.deepToString(intArr));
		intArr[0] = new int[3];
		System.out.println(Arrays.deepToString(intArr));
		intArr[1] = new int[2];
		System.out.println(Arrays.deepToString(intArr));
		intArr[2] = new int[3];
		System.out.println(Arrays.deepToString(intArr));
		intArr[3] = new int[2];
		System.out.println(Arrays.deepToString(intArr));
	}

}//end of class
