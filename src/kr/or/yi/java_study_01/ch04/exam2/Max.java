package kr.or.yi.java_study_01.ch04.exam2;

public class Max {
	public static int max(int[] arr) {
		int max = 0;
		if(arr == null) {
			return -999999;
		}
		if(arr.length == 0) {		
			return -999999;
		}
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				max = arr[i];
			}
			else {
				if(max < arr[i]) {
					max = arr[i];
				}
			}
		}
		return max;
	}
}
