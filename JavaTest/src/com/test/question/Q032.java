package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q032 {

	public static void main(String[] args) {
		
		/*
		 	요구사항
			주차 요금을 계산하시오.
			
			조건..
			무료 주차: 30분
			초과 10분당: 2,000원
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("[들어온 시간]\n");
		
		System.out.print("시: ");
		
		int inHour = scan.nextInt();
		
		System.out.print("분: ");
		
		int inMinute = scan.nextInt();
		
		
		System.out.print("[나간 시간]\n");
		
		System.out.print("시: ");
		
		int outHour = scan.nextInt();
		
		System.out.print("분: ");
		
		int outMinute = scan.nextInt();
		
		Calendar in = Calendar.getInstance();
		
		in.set(Calendar.HOUR_OF_DAY, inHour);
		in.set(Calendar.MINUTE, inMinute);
		
		Calendar out = Calendar.getInstance();
		
		out.set(Calendar.HOUR_OF_DAY, outHour);
		out.set(Calendar.MINUTE, outMinute);
		
		long gap = out.getTimeInMillis() - in.getTimeInMillis();
		long fee = (((gap / 1000 / 60 ) - 30 ) / 10 ) * 2000;
		
		System.out.printf("주차 요금은 %d원입니다.", fee);
		
		//캘린더말고 분으로 환산해서 계산가능
		
		
	}//main
}
