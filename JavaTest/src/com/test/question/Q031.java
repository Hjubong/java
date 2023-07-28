package com.test.question;

import java.util.Scanner;

public class Q031 {

	public static void main(String[] args) {
			
		/*
		 	요구사항
			숫자 5개를 입력받아 짝수와 홀수의 개수를 출력하시오.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int even = 0;
		int odd = 0;
		
		System.out.print("숫자 입력: ");
		// num의 값을 even odd 로 지정하지 않아도 출력가능
		num = scan.nextInt();
		
		if(num % 2 == 0) {
			 even++;
		} else {
			 odd++;
		}
		System.out.print("숫자 입력: ");
		
		num = scan.nextInt();
		
		if(num % 2 == 0) {
			num = even++;
		} else {
			num = odd++;
		}
		System.out.print("숫자 입력: ");
		
		num = scan.nextInt();
		
		if(num % 2 == 0) {
			num = even++;
		} else {
			num = odd++;
		}
		System.out.print("숫자 입력: ");
		
		num = scan.nextInt();
		
		if(num % 2 == 0) {
			num = even++;
		} else {
			num = odd++;
		}
		System.out.print("숫자 입력: ");
		
		num = scan.nextInt();
		
		if(num % 2 == 0) {
			num = even++;
		} else {
			num = odd++;
			
		} System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다."
						, even, odd);
		System.out.printf("홀수가 짝수보다 %d개 더 많습니다."
				, odd - even);
		//if문으로 짝수가 많을 경우 작성
		
	}//main
}
