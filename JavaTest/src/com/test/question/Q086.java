package com.test.question;

import java.util.Scanner;

public class Q086 {

	public static void main(String[] args) {
		
		/*
				 요구사항
		숫자를 입력받아 3자리마다 , 를 붙이시오.
		
		조건..
		%,d 사용 금지
		
		입력..
		숫자: 1234 
		
		출력..
		결과: 1,234
		 */
		
		String num = "";
		String result = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		num = scan.nextLine();
		
		while(num.length()>=3) {
			result = "," + num.substring(num.length()-3, num.length()) + result;
			num = num.substring(0, num.length()-3);
		}
		
		System.out.println("결과: " + num + result);
	}
}
