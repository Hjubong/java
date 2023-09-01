package com.test.question.q107;

public class MyHashMap {

	private String[] key;
	private String[] value;
	private int index;

	public MyHashMap() {
		this.key = new String[4];
		this.value = new String[4];
		this.index = 0;
	}

	public String put(String key, String value) { // 수정값 출력이 안됨

		this.key[this.index] = key;
		this.value[this.index] = value;
		this.index++;

		return null;
	}

	public String get(String key) {

		for (int i = 0; i < index; i++) {

			if (this.key[i].equals(key)) {

				return this.value[i];
			}
		}
		return null;
	}

	public int size() {
		return this.index;
	}

	public String remove(String key) {
		return key;
		
	}

		


		
	

	
//	boolean containKey(String key)
//	해당 키가 존재하는지 확인한다.
//	key: 확인할 키
//	return: 키의 존재 유무
//			
//	boolean containsValue(String value)
//	해당 값이 존재하는지 확인한다.
//	value: 확인할 값
//	return: 값의 존재 유무
//			
	public void clear() {

		this.index = 0;
	}

	public void trimToSize() {
		String temp[] = new String[this.index];

		for (int i = 0; i < this.index; i++) {
			temp[i] = this.key[i];
		}
	}
}
