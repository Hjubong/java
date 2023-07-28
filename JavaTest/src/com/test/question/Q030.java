package com.test.question;

import java.util.Scanner;

public class Q030 {

	public static void main(String[] args) {
		
		/*
		 	요구사항
			영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오.
			
			조건..
			유효성 검사를 하시오.(영문자만 입력 가능)
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자: ");
		char input = scan.nextLine().charAt(0); // 
		
		if (input >= 'A' && input <= 'Z') {
			
			System.out.printf("'%c'의 소문자는 '%c'입니다."
					
					, input, input + 32);
			
		} else if (input >= 'a' && input <= 'z') {
			
			System.out.printf("'%c'의 대문자는 '%c'입니다."
					
					, input, input - 32);
			
		} else {
			
			System.out.print("영문자만 입력하시오.");
			
		}
		
		
	}//main
}
