package com.test.question;

public class Q016 {

	public static void main(String[] args) {
		
		/*
		  	요구사항
			인자로 받은 숫자들의 합을 구하는 메소드를 선언하시오.

			조건..
			void sum(int)
			void sum(int, int)
			void sum(int, int, int)
			void sum(int, int, int, int)
			void sum(int, int, int, int, int)
		 */
		
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(10, 20, 30, 40, 50);
		
	}//main

	private static void sum(int i, int j, int k, int l, int m) {
		
		int sum = i + j + k + l + m;
		
		System.out.printf("%d + %d + %d + %d + %d = %d\n"
							, i, j, k, l, m ,sum);
	}

	private static void sum(int i, int j, int k, int l) {
		
		int sum = i + j + k + l;
		
		System.out.printf("%d + %d + %d + %d = %d\n", i, j, k, l , sum);
	}

	private static void sum(int i, int j, int k) {
		
		int sum = i + j + k;
		
		System.out.printf("%d + %d + %d = %d\n", i, j, k ,sum);
	}

	private static void sum(int i, int j) {
		
		int sum = i + j;
		
		System.out.printf("%d + %d = %d\n", i, j, sum);
	}

	private static void sum(int i) {
		
		int sum = i;
		
		System.out.printf("%d = %d\n", i, sum);
	}
	
	
	
	
}
