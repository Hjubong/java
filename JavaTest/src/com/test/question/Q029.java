package com.test.question;

import java.util.Scanner;

public class Q029 {

	public static void main(String[] args) {
		
		/*
		 	요구사항
			숫자 2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력하시오.
			
			조건..
			정수만 입력하시오.(유효성 검사 필요없음)
			나머지 연산 결과는 소수이하 첫째자리까지 출력 하시오.
			연산자는 산술 연산자(+, -, *, /, %)만 입력하시오. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int first = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		int second = scan.nextInt();
		
		scan.nextLine(); // 왜 코드 넣어야 연산자 입력되는지? -> 이전 int 입력 버퍼를 초기화 시켜야함
		System.out.print("연산자: ");
		String operator = scan.nextLine();
		
		if(operator.equals("+")) {
			System.out.printf("%d %s %d = %d\n"
					
					, first, operator, second, first + second);
			
		} else if(operator.equals("-")) {
			
			System.out.printf("%d %s %d = %d\n"
					
					, first, operator, second, first - second);
			
		} else if(operator.equals("*")) {
			
			System.out.printf("%d %s %d = %d\n"
					
					, first, operator, second, first * second);
			
		} else if(operator.equals("/")) {
			
			System.out.printf("%d %s %d = %.1f\n"
					
					, first, operator, second, (double)first / second);
			
		} else if(operator.equals("%")) {
			
			System.out.printf("%d %s %d = %d\n"
					
					, first, operator, second, first % second);
		} else {
			
			System.out.println("연산이 불가능합니다.");
		}
		
	}//main
}
