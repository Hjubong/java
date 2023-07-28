package com.test.question;

public class Q053 {

	public static void main(String[] args) {
		
		/*
		 	조건..
			구구단을 출력하시오.
		 */
		
		for(int i=1; i<=9; i++) {
			
			for(int j=2; j<=5; j++) {
				System.out.printf("%d x %d = %2d\t", j, i, j*i);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			
			for(int j=6; j<=9; j++) {
				System.out.printf("%d x %d = %2d\t", j, i, j*i);
			}
			System.out.println();
		}
		System.out.println();
	}
}
