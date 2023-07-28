package com.test.question;

public class Q071 {

	public static void main(String[] args) {
		
		/*
		 	25	24	23	22	21
			20	19	18	17	16
			15	14	13	12	11
			10	9	8	7	6
			5	4	3	2	1
		 */
		
		int list [][] = new int [5][5];
		int n = 1;
		
		for(int i=list.length-1; i>=0; i--) {
			for(int j=list.length-1; j>=0; j--) {
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
