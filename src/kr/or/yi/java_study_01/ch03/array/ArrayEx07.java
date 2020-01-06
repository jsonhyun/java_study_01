package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;

public class ArrayEx07 {

	public static void main(String[] args) {
		int [] arr01 = {1,2,3,4,5};
		int [] arr02 = new int [5]; // 0 0 0 0 0
		System.out.println(Arrays.toString(arr02));
		
		System.arraycopy(arr01, 0, arr02, 0, arr01.length);
		System.out.println(Arrays.toString(arr02));
	}

}
