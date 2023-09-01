package com.test.question.q105;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

	private String[] list;
	private int index;

	public MyQueue() {
		this.list = new String[4];
		this.index = 0;
	}

	public boolean add(String value) {
		
		if(checkLength()) {
			doubleList();
		}
		
		this.list[this.index] = value;
		this.index++;

		return true;

	}

	private void doubleList() {
		
		String[] temp = new String[this.list.length * 2];
		
		for(int i=0; i<this.list.length; i++) {//루프 > 짧은 배열 길이
			
			temp[i] = this.list[i];
		}
		
		this.list = temp;
	}
	
	
	private boolean checkLength() {
		
		if(this.list.length == this.index) {
			
			return true;	
		}
		
		return false;
	}
	
	public String poll() {

		String temp = this.list[0];

		for (int i = 0; i < this.list.length - 2; i++) {
			this.list[i] = this.list[i + 1];
		}

		this.index--;
		return temp;
	}

	public int size() {
		return this.index;
	}

	public String peek() {
		return this.list[0];
	}

	public void clear() {
		this.index = 0;
	}

	public void trimToSize() {
		String[] temp = new String[this.index];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = this.list[i];
		}

		this.list = temp;
	}
}
