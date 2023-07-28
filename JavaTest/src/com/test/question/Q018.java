package com.test.question;

public class Q018 {

	public static void main(String[] args) {
		/*
		 	요구사항
			인자로 받은 숫자들 중 양수의 갯수를 반환하는 메소드를 선언하시오.

			조건..
			int positive(int)
			int positive(int, int)
			int positive(int, int, int)
			int positive(int, int, int, int)
			int positive(int, int, int, int, int) 
		 */
		
		int count = 0;
		
		count = positive(10);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20, -30);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20, -30, 40);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20, -30, 40, 50);
		System.out.printf("양수: %d개\n", count);
		
	}//main

	private static int positive(int i, int j, int k, int l, int m) {
		
		int count = 0;
		
		count += (i > 0)? 1 : 0;
		count += (j > 0)? 1 : 0;
		count += (k > 0)? 1 : 0;
		count += (l > 0)? 1 : 0;
		count += (m > 0)? 1 : 0;
		
		return count;
	}

	private static int positive(int i, int j, int k, int l) {
		
		int count = 0;
		
		count += (i > 0)? 1 : 0;
		count += (j > 0)? 1 : 0;
		count += (k > 0)? 1 : 0;
		count += (l > 0)? 1 : 0;
		
		return count;
	}

	private static int positive(int i, int j, int k) {
		
		int count = 0;
		
		count += (i > 0)? 1 : 0;
		count += (j > 0)? 1 : 0;
		count += (k > 0)? 1 : 0;
		
		return count;
	}

	private static int positive(int i, int j) {
		
		int count = 0;
		
		count += (i > 0)? 1 : 0;
		count += (j > 0)? 1 : 0;
		
		return count;
	}

	private static int positive(int i) {
		
		int count = 0;
		
		count += (i > 0)? 1 : 0;
		
		return count;
	}
	
	
		
}
