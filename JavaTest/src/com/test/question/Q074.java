package com.test.question;

public class Q074 {

	public static void main(String[] args) {
		
		/*
		 	0	0	1	0	0
			0	2	3	4	0
			5	6	7	8	9
			0	10	11	12	0
			0	0	13	0	0
 
		 */
		int n =1;
		int [][] list = new int [5][5];
		
		for(int i=0; i<list.length/2+1; i++) {
			for(int j=2-i; j<=2+i; j++) {
				list[i][j] = n;
				n++;
			}
		}
		
		for(int i=list.length/2+1; i<list.length; i++) {
			for(int j=i-2; j<=6-i; j++) {
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
