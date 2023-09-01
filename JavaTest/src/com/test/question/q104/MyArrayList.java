package com.test.question.q104;

public class MyArrayList {

	private String[] list;
	private int index;
	
	public MyArrayList() {
		this.list = new String[4];
		this.index = 0;
	}
	
	
	public void add(String value) {
		
		if(checkLength()) {
			doubleList();
		}
			
		this.list[this.index] = value;
		this.index++;
		
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
	
	
	public String get(int index) {
		
			if(index < 0 || index >= this.index) { //없는 방번호를 요청 > IndexOutOfBoundException 발생
				
				throw new IndexOutOfBoundsException();
				
			}
			
			return this.list[index];
		}
		
	
	public int size() {
		
			return this.index;
		}
		

	public void set(int index, String value) {
		
		if(index < 0 || index >= this.index) { //없는 방번호를 요청 > IndexOutOfBoundException 발생
			
			throw new IndexOutOfBoundsException();
		}
		
		this.list[index] = value;
		
		}
		
	
	public String remove(int index) {
				
		//요소 삭제 > 우측의 모든 요소 > 왼쪽으로 1칸 이동 > Left Shift
		for (int i=index; i<this.list.length-1; i++) {
			this.list[i] = this.list[i+1];
		}
		
		this.list[this.list.length-1] = null;
		
		this.index --;
		
		return this.list[index];
		
	}
	
	
	public boolean add(int index, String value) {
		
		if(index < 0 || index >= this.index) { 
			
			throw new IndexOutOfBoundsException();
			
		}
		
		if(checkLength()) {
			doubleList();
		}
		
		//요소 삽입 > 우측의 모든 요소 > 오른쪽으로 1칸 이동 > Right Shift
		for(int i=this.list.length-2; i>=index; i--) {
			this.list[index+1] = this.list[index];
		}
		
		this.list[index] = value;
		this.index++;
		
		return true;
	}
	
	
	public int indexOf(String value) {
		
		for(int i=0; i<list.length; i++) {
			if(this.list[i] != null && this.list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
	
	public int indexOf(String value, int beginIndex) {
		
		for(int i=beginIndex; i<list.length; i++) {
			if(this.list[i] != null && this.list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
	
	public  void clear() {
		
		this.index = 0;
	}
	
	
	public boolean contains(String value) {
		
		for(int i=0; i<this.index; i++) {
			if(this.list[i].equals(value)) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public void trimToSize() {
		
		
	}
}