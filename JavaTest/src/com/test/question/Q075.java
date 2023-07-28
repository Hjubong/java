package com.test.question;

public class Q075 {

	public static void main(String[] args) {
		
		/*
		 	1	2	3	4	10
			5	6	7	8	26
			9	10	11	12	42
			13	14	15	16	58
			28	32	26	40	136
 
		 */
		
		int[][] list = new int [5][5];
		int n = 1;
		
		for(int i=0; i<list.length-1; i++) {
			for(int j=0; j<list.length-1; j++) {
				
				list[i][j] = n;
				list[i][4] += n;
				list[4][j] += n;
				list[4][4] += n;
				
				n++;
			}
		}
		
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[0].length; j++) {
				System.out.printf("%3d\t", list[i][j]);
			}
			System.out.println();
		}
		
	}
}
