package com.test.question;

import java.util.Scanner;

public class Q056 {

	public static void main(String[] args) {
		
		/*
			요구사항
			숫자를 2개 입력받아 각각의 약수와 두 숫자의 공약수를 구하시오.
			
			조건..
			공약수: 둘 이상의 정수에 공통된 약수
			
			입력..
			첫번째 숫자: 12 
			두번째 숫자: 8 
			
			출력..
			12의 약수: 1, 2, 3, 4, 6, 12,
			8의 약수: 1, 2, 4, 8,
			12와 8의 공약수: 1, 2, 4,
		 */
		int first = 0;
		int second = 0;
		String txt1 = "";
		String txt2 = "";
		String txt3 = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		first = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		second = scan.nextInt();
		
		for(int i=1; i<=first; i++) {
			
			if(first % i == 0) {
				txt1 += i + ",";
			}
		}
		
		for(int i=1; i<=second; i++) {
			
			if(second % i == 0) {
				txt2 += i + ",";
			}
		}
		
		for(int i=1; i<=((first < second)? first : second); i++) {
			
			if(first % i == 0 && second % i == 0) {
				txt3 += i + ",";
			}
		}
		
		
		
		
		
		System.out.printf("%d의 약수: %s\n",first, txt1);
		System.out.printf("%d의 약수: %s\n",second, txt2);
		System.out.printf("%d와 %d의 공약수: %s\n", first, second, txt3);
	}
}
