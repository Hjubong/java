package com.test.question;

import java.util.Scanner;

public class Q082 {

	public static void main(String[] args) {
		/*
			요구사항
			숫자를 입력받아 각 자릿수의 수의 합을 구하시오.
			
			입력..
			숫자: 314 
			
			출력..
			결과: 3 + 1 + 4 = 8
 
		 */
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int input = scan.nextInt();
		
		String num = Integer.toString(input);
		
		for(int i=0; i< num.length(); i++) {
				
				char charnum = num.charAt(i);
			
			 int digit = Character.getNumericValue(charnum);
	         sum += digit;
	         
	         System.out.print(num.charAt(i) + " + " );
		}
		
		System.out.println("=" + sum);
		
	}
}
