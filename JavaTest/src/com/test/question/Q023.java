package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {

	public static void main(String[] args) {
		
		/*
		 	요구사항
			아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오. 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아빠 생일(년): ");
		int year = scan.nextInt();
		
		System.out.print("아빠 생일(월): ");
		int month = scan.nextInt();
		
		System.out.print("아빠 생일(일): ");
		int day = scan.nextInt();
		
		System.out.print("딸 생일(년): ");
		int dYear = scan.nextInt();
		
		System.out.print("딸 생일(월): ");
		int dMonth = scan.nextInt();
		
		System.out.print("딸 생일(일): ");
		int dDay = scan.nextInt();
		
		Calendar dad = Calendar.getInstance();
		dad.set(year, month, day);
		
		Calendar daughter = Calendar.getInstance();
		daughter.set(dYear, dMonth, dDay);
		
		long dadTick = dad.getTimeInMillis();
		long daughterTick = daughter.getTimeInMillis();
		
		long gap = daughterTick - dadTick;
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다."
							, gap/ 1000 / 60 / 60 / 24);
	}
}
