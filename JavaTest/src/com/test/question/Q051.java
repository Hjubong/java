package com.test.question;

import java.util.Scanner;

public class Q051 {

	public static void main(String[] args) {
		
		/*
			요구사항
			아래와 같이 출력하시오.
			
			조건..
			행의 갯수를 입력받으시오.
			
			입력..
			행: 5 
			
			출력..
			    *
			   ***
			  *****
			 *******
			********* 
		 */
		int input = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("행: ");
		input=scan.nextInt();
		
		for(int i=1; i <= input*2 ; i+=2) {
			
			for(int j = input*2 -1; j>i; j-=2) {
				System.out.print(" ");
			} 
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
