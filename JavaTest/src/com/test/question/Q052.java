package com.test.question;

import java.util.Scanner;

public class Q052 {

	public static void main(String[] args) {
		
		/*
			요구사항
			아래와 같이 출력하시오.
			
			조건..
			행의 갯수를 입력받으시오.
			입력..
			행: 5 
			
			출력..
			    aa
			   abba
			  abccba
			 abcddbca
			abcdeedcba 
		 */
		
		int input= 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("행: ");
		int line = scan.nextInt();
				
		for(int i=1; i<=line; i++) {
			
			for(int j=0; j<=line -i; j++ ) {
				System.out.print(" ");
			}
			char c = 'a';
			
			for(int j=0; j<i; j++) {
				System.out.print(c);
				c++;
			}
			for(int j=0; j<i; j++) {
				c--;
				System.out.print(c);
				
			}
			System.out.println();
		}
		
	}
}
