package kr.or.yi.java_study_01.ch05.prc.exam10;

import java.util.Arrays;

public class Dictionary extends PairMap {
	private int length;
	private int size;
	
	public Dictionary(int size) {
		this.size = size;
		this.keyArray = new String[size];
		this.valueArray = new String[size];
	}

	private int findKeyIndex(String key) {
		for(int i =0; i<keyArray.length && keyArray[i]!= null; i++) {
			if (keyArray[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	void put(String key, String value) {
		int putIdx = findKeyIndex(key);
		
		if (putIdx==-1) {
			this.keyArray[length] = key;
			this.valueArray[length] = value;
			length = length + 1;
		}else {
			this.valueArray[putIdx] = value;
		}
		
	}
	
	
	@Override
	String get(String key) {
		int getIdx = findKeyIndex(key);
		if (getIdx == -1) {
			return null;
		}
		return this.valueArray[getIdx];
	}


	@Override
	String delete(String key) {
		int delIdx = findKeyIndex(key);
		if (delIdx == -1) {
			System.out.println("삭제할 키가 존재하지 않음");
			return null;
		}
		String value = this.valueArray[delIdx];
		
		//삭제 전
		System.out.println(Arrays.toString(keyArray));
		System.out.println(Arrays.toString(valueArray));
		
		this.keyArray = reOrder(delIdx, keyArray);
		this.valueArray = reOrder(delIdx, valueArray);
		
		//삭제 후
		System.out.println(Arrays.toString(keyArray));
		System.out.println(Arrays.toString(valueArray));
		
		return value;
	}

	private String[] reOrder(int delIdx, String[] targetArray) {
		String[] tempArray = new String[size];
		System.arraycopy(targetArray, 0, tempArray, 0, delIdx);
		System.arraycopy(targetArray, delIdx+1, tempArray, delIdx, valueArray.length-delIdx-1);
		return tempArray;
	}

	@Override
	int length() {
		return length;
	}

}
