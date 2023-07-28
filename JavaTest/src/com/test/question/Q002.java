package com.test.question;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {
		
		/*
		 	요구사항
			-숫자 2개를 입력받아 아래의 연산식을 출력하시오.
			
			조건
			- 출력 숫자에 천단위 표기 하시오.
			- 결과값은 소수 이하 1자리까지 표기 하시오.
			
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자: ");
		int a = scan.nextInt();
		
		System.out.println("두번째 숫자: ");
		int b = scan.nextInt();
		
		System.out.printf("%,d + %,d = %,d\n"
							, a, b, a + b);
		
		System.out.printf("%,d - %,d = %,d\n"
							, a, b, a - b);
		
		System.out.printf("%,d * %,d = %,d\n"
							, a, b, a * b); 
		
		System.out.printf("%,d / %,d = %,.1f\n"
							, a, b, (double)a / b); 
		
		System.out.printf("%,d %% %,d = %,d\n"
							, a, b, a % b);
		
	}
	
}
