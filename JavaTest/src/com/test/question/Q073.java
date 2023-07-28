package com.test.question;

public class Q073 {

	public static void main(String[] args) {
		/*
		 	1	2	3	4	5
			6	7	8	9	0
			10	11	12	0	0
			13	14	0	0	0
			15	0	0	0	0 
		 */
		int n =1;
		int[][] list = new int[5][5];
		
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<=list[0].length-i-1; j++) {
				list[i][j] = n;
				n++;
			}
		}
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[0].length; j++) {
				System.out.printf("%2d\t", list[i][j]);
			}
			System.out.println();
		}
		
	}
}
