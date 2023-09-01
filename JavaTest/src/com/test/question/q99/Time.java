package com.test.question.q99;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
		
	}
	
	public Time (int hour, int minute, int second) {
		
		this.second = second % 60;
		this.minute = (second / 60 + minute) % 60;
		this.hour = (second / 60 + minute) / 60;
		this.hour += hour;
	}
	
	public Time (int minute, int second) {
		
		this(0, minute, second);
	}
	
	public Time(int second) {
		
		this(0, 0, second);
	}
	
	public String info() {
		
		return String.format("%d:%02d:%02d", this.hour, this.minute, this.second);
	}
	
	
	
	
	
	
}
