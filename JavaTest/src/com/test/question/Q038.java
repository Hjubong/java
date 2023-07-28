package com.test.question;

import java.util.Scanner;

public class Q038 {

	public static void main(String[] args) {
		/*
			요구사항
			입력 횟수(N)와 숫자 N개를 입력받아 짝수의 합과 홀수의 합을 각각 출력하시오.
			
			입력..
			입력 횟수: 10 
			숫자: 5 
			숫자: 2 
			숫자: 12 
			숫자: 3 
			숫자: 11 
			숫자: 8 
			숫자: 1 
			숫자: 7 
			숫자: 23 
			숫자: 10 
			
			출력..
			짝수 4개의 합: 32
			홀수 6개의 합: 50 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int count = 0;
		int even = 0;
		int odd = 0;
		int evensum = 0;
		int oddsum = 0;
		
		
		System.out.printf("입력 횟수: ");
		count = scan.nextInt();
		
		for(int i=1; i<=count; i++) {
			
			System.out.print("숫자: ");
			num = scan.nextInt();
		 
		if (num % 2 == 0) {
			even++;
			evensum += num;
		} else {
			odd++;
			oddsum += num;
		}
	}
		
		System.out.printf("짝수 %d개의 합: %d\n", even, evensum);
		System.out.printf("홀수 %d개의 합: %d\n", odd, oddsum);
		
	}
}
