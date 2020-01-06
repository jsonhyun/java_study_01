package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx04 {

	public static void main(String[] args) {
		Random rnd = new Random(1234567);
		int[] arr = new int[6];
		System.out.println(Arrays.toString(arr));
		init_Lotto(rnd, arr);
		
		//간단한 배열 출력
		System.out.println(Arrays.toString(arr));		
		
		bubble_sort(arr);
		
		System.out.println(Arrays.toString(arr)); //15, 17, 27, 33, 36, 43
		
		
		int searchKey = 15;
		int findIdx = findSearch(arr, searchKey); // Linear Search -> 비교횟수를 줄이는 방법 : Binary Search
		System.out.printf("%s 배열에서 %d 의 위치는 %d 입니다.%n", Arrays.toString(arr), searchKey, findIdx);
				
		findIdx = binarySearch(arr, searchKey); // Binary Search(이분 검색의 전제 조건 : 배열이 정렬되어 있어야 함.)
		System.out.printf("%s 배열에서 %d 의 위치는 %d 입니다.", Arrays.toString(arr), searchKey, findIdx);
	}

	private static int binarySearch(int[] arr, int searchKey) {
		int left = 0;
		int right = arr.length - 1;
		while(left<=right){ //반복의 조건은 항상 left 값은 right값보다 작거나 같아야 하고 이 범위에 한정해야지만 바이너리 서치가 가능
			int mid = (left + right)/2;
			if(arr[mid] > searchKey) {
				right = mid - 1;
			}
			else if(arr[mid]<searchKey) {
				left = mid + 1;
			}
			else if(arr[mid]==searchKey){
				return mid;
			}
		}
		return -1;
	}
//		for(;left<=right;) { 
//			int mid = (left + right)/2;
//			if(arr[mid] > searchKey) {
//				right = mid -1;
//			}
//			else if(arr[mid]<searchKey) {
//				left = mid + 1;
//			}
//			else if(arr[mid]==searchKey){
//				return mid;
//			}
//		}


	private static int findSearch(int[] arr, int searchKey) {
		//arr배열에서 searchKey가 존재하면 존재하는 위치(index) 리턴, 만약 존재하지 않을 경우 -1을 리턴
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==searchKey) {
				return i; // 해당되는 값을 구해서 메인 함수로 반환한다.
			}
		}
		return -1; // 해당되는 값이 없다면 -1을 메인 함수로 반환한다.
	}

	private static void bubble_sort(int[] arr) {
		int temp;
		for(int p=0; p<arr.length; p++) {
			for(int i=1; i<arr.length; i++) {
				if(arr[i-1]>arr[i]) {
					temp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = temp;
				}			
			}
			System.out.println((p+1) +"회 => "+Arrays.toString(arr));
		}
	}

	private static void init_Lotto(Random rnd, int[] arr) {
		for (int i=0; i<arr.length; i++) {
			arr[i] = rnd.nextInt(46)+1;
		}
	}

	private static void generate_number() {
		Random rnd = new Random();
		rnd.setSeed(1234);
		for(int i = 0; i<6; i++) {
			System.out.print(rnd.nextInt(45) + 1 + " "); //0 <= rnd.nextInt(45) < 45
		}
	}

}
