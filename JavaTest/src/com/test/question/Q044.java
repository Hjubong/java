package com.test.question;

import java.util.Scanner;

public class Q044 {

	public static void main(String[] args) {
		/*
			요구사항
			숫자를 N개 입력받아 아래와 같이 출력하시오.
			
			조건..
			누적값이 100을 넘어가는 순간 루프를 종료하시오.
			짝수는 더하고 홀수는 빼시오.
			
			입력..
			숫자: 12 
			숫자: 28 
			숫자: 39 
			숫자: 15 
			숫자: 38 
			숫자: 24 
			숫자: 78 
			
			출력..
			+ 12 + 28 - 39 - 15 + 38 + 24 + 78 = 126
		 */
		int input = 0;
		int sum = 0;
		String txt ="";
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
		
			System.out.print("숫자: ");
			input = scan.nextInt();
			
			if(input % 2 == 0) {
				sum += input;
				txt += " + " + input;
			} else {
				sum -= input;
				txt += " - " + input;
			} 
			
			if(sum>=100) {
				break;
			}
		}
			System.out.printf(txt + " = " + sum);
		
	}
}
