package com.test.question.q108;

import java.util.HashSet;

public class MySet {

	private String[] list = new String[4];
	private int index = 0;
	private int sindex = 0;

	public boolean add(String value) {

		if (isDuplicate(value)) {
			return false;
		}

		if (checkLength()) {
			doubleList();
		}

		this.list[this.index] = value;
		this.index++;

		return false;
	}

	private boolean isDuplicate(String value) {

		for (int i = 0; i < this.index; i++) {
			if (this.list[i].equals(value)) {
				return true;
			}
		}
		return false;
	}

	private void doubleList() {

		String[] temp = new String[this.list.length * 2];

		for (int i = 0; i < this.list.length; i++) {// 루프 > 짧은 배열 길이

			temp[i] = this.list[i];
		}

		this.list = temp;
	}

	private boolean checkLength() {

		if (this.list.length == this.index) {

			return true;
		}

		return false;
	}

	public int size() {
		return this.index;
	}

	public boolean remove(String value) {

		int index = -1;

		for (int i = 0; i < this.index; i++) {
			if (this.list[i].equals(value)) {
				index = i; //동일한 값을 찾으면 index에 해당 인덱스값을 저장함
				break;
			}
		}
		
		if(index == -1) {
			return false;
		}

		for (int i = index; i < this.list.length - 1; i++) { //위 동일한 값인 해당 인덱스부터 리스트끝까지 left Shift 과정
			this.list[i] = this.list[i + 1];
		}

		this.index--;

		return true;

	}

	public void clear() {
		this.index = 0;
	}

	public boolean hasNext() { //이해필요
		if(this.sindex < this.index) {
			return true;
		}
		
		return false;
	}
			
	public String next() {//이해필요
		
		String temp = this.list[this.sindex];
		
		this.sindex++;
		
		return temp;
	}
}
