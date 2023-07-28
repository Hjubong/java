package com.test.question;

public class Q072 {

	public static void main(String[] args) {
		/*
		 	1	6	11	16	21
			2	7	12	17	22
			3	8	13	18	23
			4	9	14	19	24
			5	10	15	20	25
		 */
		int n=1;
		int list [][] = new int [5][5];
		
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[0].length; j++) {
				list[j][i] = n;
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
