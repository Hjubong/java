package com.test.java;

import java.util.Scanner;

public class Ex30_for {

	public static void main(String[] args) {
		
		//Ex30_for.java
		
		//m1();
		m2();
		//m3();
		//m4();
		//m5();
		
		//q42();
		//q48();
		
		//다중 반복문 > 단일 반복문
	}

	private static void m5() {
		
		//별찍기(5x5)
		
		//int n = 1;
		
		for(int i=0; i<5; i++) { //행 만들기
			for (int j=0; j<5; j++) {//열 만들기
				
				System.out.print("*");
				//System.out.printf("%3d", n);
				//n++;
			}
			System.out.println();
		}
		System.out.println();
	

	
			for(int i=0; i<5; i++) { 
				for (int j=i; j<5; j++) {
					
					System.out.print("*");
					
				}
				System.out.println();
			}
			System.out.println();
		
	
			
			for(int i=0; i< 5; i++) { 
				
				for (int j=0; j < 5 -i; j++) {
					System.out.println();
				}
				for (int j=0; j< i; j++) {
					
					System.out.print("*");
					
				}
				System.out.println();
			}
			System.out.println();
			
			
}
	private static void q48() {

		Scanner scan = new Scanner(System.in);
		
//		System.out.print("숫자 입력: ");
//		int num = scan.nextInt();
		
		int sum = 0;
		int oddSum = 0, evenSum = 0;
		int num = 234981;
		
		for(;;) {
			
			System.out.println(num % 10);
			
			if(num % 10 % 2 == 0) {
				evenSum += num % 10;
			} else {
				oddSum += num % 10;
			}
			
			sum += num % 10;
			num = num / 10;
			
			if(num == 0) {
				break;	
			}
			
		}
		
		System.out.println(oddSum);
		System.out.println(evenSum);
		System.out.println(sum);
		
	}

	
	
	private static void q42() {
		
		int year = 2023;
		int month = 7;
		int date = 25;
		
		int sum = 0; //누적 변수(총 며칠째)
		String day = ""; //요일
		
		//1. 1년 1월 1일 ~ 2022년 12월 31일
		for (int i=1; i<year; i++) {
			
			sum += 365;
			
			if(isLeafYear(i)) {
				sum++; //366
			}
		}
		
		
		//2. 2023년 1월 1일 ~ 2023년 6월 30일
		for(int i=1; i<month; i++) {
			
			sum+= getMaxDate(year, i);
		}
		
		//3. 2023 7월 1일 ~ 2023년 7월 25일
		sum += date;
		
		//4. 검증 및 요일 구하기
		day = getDay(sum);
		
		System.out.printf("2023년 7월 25일은 %,d일째 되는 날이고 %s요일입니다.\n", sum, day);
	}
	
	private static String getDay(int sum) {
		
		if(sum % 7 == 1) {
			return "월";
		} else if (sum % 7 == 2) {
			return "화";
		} else if (sum % 7 == 3) {
			return "수";
		} else if (sum % 7 == 4) {
			return "목";
		} else if (sum % 7 == 5) {
			return "금";
		} else if (sum % 7 == 6) {
			return "토";
		} else if (sum % 7 == 0) {
			return "일";
		} 
		
		return null;
	}

	private static int getMaxDate(int year, int month) {
		
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
			case 4: case 6: case 9: case 11:
				return 10;
			case 2:
				return isLeafYear(year) ? 29 : 28;
		}
		
		return 0;
	}

	//메소드 이름 패턴
	//1. setXXX
	//2. getXXX
	//3. isXXX
	private static boolean isLeafYear(int year) {
		
		if(year % 4 == 0 ) {
			
			if(year % 100 == 0) {
				
				if(year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			}else {
				return true;
			}
		}else {
			return false;
		}
	}

	
	
	private static void m4() {

		//루프 > 분기문 개입 (break, continue)
		for (int i=0; i<10; i++) {
			
			for (int j=0; j<10; j++) {
				
				//if (i == 5) {
				//if (j ==5 ) {
				//if (i == 5 && j == 5) {
				if (i == 5 || j == 5) {
				
					break; //자신이 포함된 제어문을 탈출한다
				}
				
				System.out.printf("i: %d, j: %d\n,", i ,j);
				
			}
		}
		
	}

	
	
	private static void m3() {

		//쌍용 교육 센터
		//강의실(1강의실 ~ 6강의실)
		//학생들(30명)
		
		for (int i=1; i<=6; i++) {//강의실
			
			for (int j=1; j<=30; j++) {//학생
				
				System.out.printf("%d강의실 %d번 학생\n", i, j);
				
			}
			
		}
		
	}

	
	
	private static void m2() {
		
		//구구단(2단~9단)
		
		for (int j=2; j<=9; j++) {
			
			System.out.println("==========");
			System.out.printf("    %d단\n", j);
			System.out.println("==========");
		
			for (int i=1; i<=9; i++) {
				
				System.out.printf("%d x %d = %2d\n", j, i, j * i);
				
			}
		
		}
	}

	//K&R 스타일
	public static void test() {
		
	}
	
	//Allman 스타일
	public static void test2()
	{
		
	}
	
	
	
	private static void m1() {

		//모든 제어문끼리는 중첩이 가능하다
		
		//중첩된 반복문
		//2중 for문
		
		//루프 변수 > i
		//Ctrl + Shift + F(format)
		/*
		for(int i=0; i<10; i++) {
		
			for(int j=0; j<10; j++) {
				
				//System.out.println("실행문"); //10회 실행
				System.out.printf("i: %d, j: %d\n", i, j);
				
			}
		}	
		*/
		
		//3중 for문
		for (int i=0; i<24; i++) { //대회전(시침)
			
			for (int j=0; j<60; j++) { //중회전(분침)
				
				for (int k=0; k<60; k++) { //소회전(초침)
					
					//System.out.println("실행문");
					
					System.out.printf("i: %d, j: %d, k: %d\n", i, j, k);
					
				}
			}
		}
	}
}
