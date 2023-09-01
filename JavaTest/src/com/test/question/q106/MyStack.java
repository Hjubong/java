package com.test.question.q106;

public class MyStack {

	private String[] list;
	private int index;

	public MyStack() {
		this.list = new String[5];
		this.index = 0;
	}

	public boolean push(String value) {
		if (this.index < this.list.length) {
			this.list[this.index] = value;
			this.index++;

			return true;
		} else {
			return false;
		}

	}

	public String pop() {
		String last = this.list[this.index - 1];

		this.index--;

		return last;
	}

	public int size() {
		return this.index;
	}

	public String peek() {
		return this.list[this.index - 1];
	}

	public void clear() {
		this.index = 0;
	}

	public void trimToSize() {
		String temp[] = new String[this.index];

		for (int i = 0; i < this.index; i++) {
			temp[i] = this.list[i];
		}
		this.list = temp;
	}
}
